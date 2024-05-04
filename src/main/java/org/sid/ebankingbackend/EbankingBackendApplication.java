package org.sid.ebankingbackend;

import jakarta.transaction.Transactional;
import org.sid.ebankingbackend.entities.*;
import org.sid.ebankingbackend.enums.AccountStatus;
import org.sid.ebankingbackend.enums.OperationType;
import org.sid.ebankingbackend.repositories.AccountOperationRepository;
import org.sid.ebankingbackend.repositories.BankAccountRepository;
import org.sid.ebankingbackend.repositories.CustomerRepository;
import org.sid.ebankingbackend.services.BankService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class EbankingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbankingBackendApplication.class, args);
	}

	@Bean
	@Transactional
	CommandLineRunner commandLineRunner(BankService bankService) {
		return args -> {
			bankService.consulter();


		};
	}


			//@Bean
			CommandLineRunner start (CustomerRepository customerRepository,
					BankAccountRepository bankAccountRepository,
					AccountOperationRepository accountOperationRepository){
				return args -> {
					Stream.of("Hassan", "yassine", "Aicha").forEach(name -> {
						Customer customer = new Customer();
						customer.setName(name);
						customer.setEmail(name + "@gmail.com");
						customerRepository.save(customer);

					});
					customerRepository.findAll().forEach(cust -> {
						CurrentAccount currentAccount = new CurrentAccount();
						currentAccount.setId(UUID.randomUUID().toString());
						currentAccount.setBalance(Math.random() * 90000);
						currentAccount.setCreatedAt(new Date());
						currentAccount.setStatus(AccountStatus.CREATED);
						currentAccount.setCustomer(cust);
						currentAccount.setOverDraft(9000);
						bankAccountRepository.save(currentAccount);

						SavingAccount savingAccount = new SavingAccount();
						savingAccount.setId(UUID.randomUUID().toString());
						savingAccount.setBalance(Math.random() * 90000);
						savingAccount.setCreatedAt(new Date());
						savingAccount.setStatus(AccountStatus.CREATED);
						savingAccount.setCustomer(cust);
						savingAccount.setInterestRate(5.5);
						bankAccountRepository.save(savingAccount);
					});
					bankAccountRepository.findAll().forEach(acc -> {
						for (int i = 0; i < 10; i++) {
							AccountOperation accountOperation = new AccountOperation();
							accountOperation.setOperationDate(new Date());
							accountOperation.setAmount(Math.random() * 12000);
							accountOperation.setType(Math.random() > 0.5 ? OperationType.DEBIT : OperationType.CREDIT);
							accountOperation.setBankAccount(acc);
							accountOperationRepository.save(accountOperation);
						}


					});


				};


		};
	}



