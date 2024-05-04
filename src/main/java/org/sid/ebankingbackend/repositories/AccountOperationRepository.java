package org.sid.ebankingbackend.repositories;

import org.sid.ebankingbackend.entities.AccountOperation;
import org.sid.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {
}
