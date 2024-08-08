# Description de l'entité `User`

## Qu'est-ce qu'une entité ?

Dans le contexte de Spring Data JPA, une entité est une classe Java qui représente une table dans une base de données relationnelle; Elle est annotée avec `@Entity` et contient des annotations supplémentaires pour mapper les champs de la classe aux colonnes de la table.

## Définition de l'entité `User`

L'entité `User` est définie dans le package `com.example.user_management.entity` et représente une table `user` dans la base de données. Voici le code de l'entité `User` : 

```java
package com.example.user_management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "genre")
    private String genre;

    @Column(name = "address")
    private String address;

    @Column(name = "state")
    private String state;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    // Getters & Setters
    ...
```

## Annotations utilisées

1. **`@Entity`** : Indique que cette classe est une entité JPA.

2. **`@Table(name = "user, uniqueConstraints = @uniqueConstraint(ColumnNames = "email"))`** : Spécifie le nom de la table dans la base de données et ajoute une contrainte d'unicité sur la colonne `email`.

3. **`@Id`** : Indique que le champ `id` est la clé primaire de la table.

4. **`@GeneratedValue(strategy = GenerationType.IDENTITY)`** : Spécifie que la valeur de la clé primaire est générée automatiquement par la base de données.

5. **`@Column(name = "nom_de_la_colonne", nullable = false)`** : Mappe les champs de la classe aux colonnes de la table et spécifie si la colonne peut être nulle.

## Champs de l'entité `User`

1. `id` : Clé primaire de l'entité, générée automatiquement.
2. `lastName` : Nom de famille de l'utilisateur, non nul.
3. `firstName` : Prénom de l'utilisateur, non null.
4. `age` : Âge de l'utilisateur.
5. `genre` : Genre de l'utilisateur.
6. `address` : Adresse de l'utilisateur.
7. `state` : État de l'utilisateur.
8. `email` : Adresse e-mail de l'utilisateur, unique.
9. `password` : Mot de passe de l'utilisateur.

## Méthodes de l'entité `User`

- **Getters et Setters** : Méthodes pour accéder et modifier les valeurs des champs.
- **`hashCode` et `equals`** : Méthodes pour comparer les objets `User`.

## Utilisation de l'entité `User`

L'entité `User` est utilisée dans les couches de service et de repository pour effectuer des opérations CRUD sur les utilisateurs.

## Conclusion

L'entité `User` est une composante essentielle de notre application Spring Boot. Elle définit la structure des données des utilisateurs et permet d'interagir avec la base de données via les couches de service et de repository. Grâce à cette entité, nous pouvons gérer les utilisateurs de manière efficace et offrir des fonctionnalités utiles à nos utilisateurs et aux administrateurs de l'application.