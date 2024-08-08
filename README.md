# User Management Application

Ce projet est une application simple de gestion des utilisateurs développée avec Spring Boot. Il utilise Spring Data JPA pour l'accès aux données, Thymeleaf pour le rendu des vues, et MySQL comme base de données.

## Table des matières

1. [Introduction](#introduction)
2. [Prérequis](#prérequis)
3. [Installation](#installation)
4. [Structure du projet](#structure-du-projet)
5. [Fonctionnalités](#fonctionnalités)
6. [Utilisation](#utilisattion)
7. [Contributeur](#contributeur)
8. [Licence](#licence)

## Introduction
Ce projet est une application web simple de gestion des utilisateurs. Il permet de créer, lire, mettre à jour et supprimer des utilisateurs. L'application utilise Spring Boot pour la gestion des dépendances et la configuration, Spring Data JPA pour l'accès aux données, et Thymeleaf pour le rendu des vues. Un dossier `Doc` est mis à disposition pour plus de détails sur l'application.

## Prérequis

Pour exécuter ce projet, vous aurez besoin des éléments suivants :

    - Java Development kit (JDK) 22
    - Apache Maven
    - MySQL

## Installation

1. **Cloner le dépôt**:

```sh
git clone https://github.com/ByessLB/user-management.git
cd user-management
```

2. **Configurer la base de données** :

    - Créez une base de données MySQL nommé `users`.
    - Configurez les informations de connexion à la base de données dans le fichier `application.properties`.

3. **Construire et exécuter l'application** :

```sh
mvn clean install
mvn spring-boot:run
```

4. **Accéder à l'application** :

Ouvrez votre navigateur et allez à l'adresse `http://localhost:8080`.

## Structure du projet

Le projet est structuré de la manière suivante :

```sh
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── user_management/
│   │               ├── controller/
│   │               ├── entity/
│   │               ├── repository/
│   │               └── service/
│   └── resources/
│       ├── application.properties
│       └── templates/
│           ├── index.html
│           ├── users.html
│           └── user-form.html
```

### Controllers

    - **HomeController** : Gère la page d'accueil.
    - **UserController** : Gère les opérations CRUD pour les utilisateurs.

### Entities

    - **User** : Représente l'entité utilisateur avec des champs comme `id`, `lastName`, `firstName`, `age`, `genre`, `address`, `state`, `email` et `password`.

### Repositories

    - **UserRepository** : Interface de repository pour opération CRUD sur l'entité `User`.

### Services

    - UserService : Contient la logique métier pour les opérations CRUD sur les utilisateurs.

### Templates

    - **index.html** : Page d'accueil avec un lien vers la liste des utilisateurs.
    - **users.html** : Liste des utilisateurs avec des liens pour voir, éditer et supprimer chaque utilisateur.
    - **user-form.html** : Formulaire pour ajouter ou editer un utilisateur.

## Fonctionnalités

    - **Afficher la liste des utilisateurs** : La page `users.html` affiche une liste de tous les utilisateurs avec des liens pour voir, éditer et supprimer chaque utilisateur.
    - **Ajouter un utilisateur** : La page `user-form.html` permet d'ajouter un nouvel utilisateur.
    - **Modifier un utilisateur** : La page `user-form.html` permet également de modifier les informations d'un utilisateur existant.
    - **Supprimer un utilisateur** : Un utilisateru peut être supprimé en cliquant sur le lien de suppression dans la liste des utilisateurs.

## Utilisation

1. **Accéder à la page d'accueil** :

    - Ouvrez votre navigateur web et accédez à l'URL `http://localhost:8080`.

2. **Afficher la liste des utilisateurs** :

    - Cliquez sur le lien "View Users" sur la page d'accueil.

3. **Ajouter un utilisateur** :

    - Cliquez sur le lien "Add User" sur la page des utilisateurs.
    - Remplissez le formulaire et cliquez sur "Submit".

4. **Modifier un utilisateur** :

    - Cliquez sur le lien "Edit" à côté de l'utilisateur que vous souaitez modifier.
    - Modifier les informations dans le formulaire et cliquez sur "Submit".

5. **Supprimer un utilisateur** :

    - Cliquez sur le line "Delete" à côté de l'utilisateur que vous souhaitez supprimer.

## Contributeur

    - ByessLB

## Licence

Ce projet est sous licence **MIT**."# Beginning-Spring-Boot-simple-user-management" 
