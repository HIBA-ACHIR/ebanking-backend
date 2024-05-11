# Application de gestion des comptes bancaires

Ce projet met en place une application de gestion des comptes bancaires utilisant Spring Boot, Angular, Spring Security. L'application permet aux utilisateurs de gérer leurs comptes, d'effectuer des opérations de débit et de crédit, le tout de manière sécurisée.

On souhaite créer une application qui permet de gérer des comptes bancaires : 
1) chaque compte appartient à un client. <br>
2) un compte peut subir plusieurs opérations de type DEBIT ou CREDIT. <br>
3) Il existe deux types de comptes : Comptes courants et comptes épargnes. 

## Travail à faire:
#### Partie 1 : Couche DAO 
1. Créer un projet Spring Boot
2. Créer les entités JPA : Customer, BankAccount, Saving Account, CurrentAccount, AccountOperation
3. Créer les interfaces JPA Repository basées sur Spring Data
4. Tester la couche DAO
#### Partie 2 : Couche services, DTO et mappers
#### Partie 3 : Couche Web (RestControllers)
#### Partie 4 : Frontend Angular
#### Partie 5 : Sécurité avec Spring Security et JWT

## Installation

Suivez ces étapes pour exécuter l'application localement :

### Clonage du projet

```
git clone https://github.com/HIBA-ACHIR/ebanking-backend.git
```

### Configuration de la base de données

Assurez-vous d'avoir une base de données compatible (MySQL, PostgreSQL, etc.) en cours d'exécution. Dans le fichier "application.properties", configurez les informations de connexion à la base de données.

### Compilation et exécution du backend

1. Naviguez vers le dossier racine du projet backend.
2. Exécutez la commande suivante :

```bash
mvn spring-boot:run
```

3. Le backend sera accessible à l'adresse : http://localhost:8085

### Installation des dépendances frontend

1. Naviguez vers le dossier racine du projet frontend.
2. Exécutez la commande suivante :

```bash
npm install
```

### Compilation et exécution du frontend

1. Exécutez la commande suivante :

```bash
ng serve
```

2. L'application frontend sera accessible à l'adresse : http://localhost:4200

## Architecture

L'application suit une architecture client-serveur, avec une séparation claire entre le backend et le frontend.

- **Backend** : développé avec Spring Boot et Spring Data JPA. Les entités JPA représentent les données du système, et les contrôleurs REST exposent les points de terminaison pour les opérations bancaires. La sécurité est gérée par Spring Security et JWT.

- **Frontend** : développé avec Angular, il offre une interface utilisateur conviviale pour interagir avec les comptes bancaires. Il communique avec le backend via des appels REST.

## Sécurité

La sécurité de l'application est gérée par Spring Security et JWT. Un jeton JWT est généré lors de l'authentification et doit être inclus dans les en-têtes de chaque demande ultérieure pour accéder aux ressources protégées.

## Demo
https://github.com/HIBA-ACHIR/ebanking-backend
<div align="center">
       <p>
       <sup>  <strong>Vidéo - </strong>Digital Banking</sup>
       </p>
</div>

## Conclusion

Ce projet de gestion des comptes bancaires est une application complète et sécurisée. Elle offre une expérience utilisateur fluide et permet aux utilisateurs de gérer leurs comptes et d'effectuer des opérations bancaires en toute simplicité. Les technologies utilisées, comme Spring Boot, Angular, Spring Security et JWT, garantissent un développement efficace et robuste des applications web.


