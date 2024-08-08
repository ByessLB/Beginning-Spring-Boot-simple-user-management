# Description du service `UserService`

## Qu'est-ce qu'un service ?

Dans le contexte de Spring Boot, un service est une classe qui contient la logique métier de l'application. Il s'agit d'une couche intermédiaire entre les contrôleurs (qui gèrent les requêtes HTTP) et les repositories (qui gèrent les accès aux données). Le service encapsule les règles métier et les opérations complexes, ce qui permet de maintenir une séparation claire des responsabilités.

## Définition du service `UserService`

Le service `UserService` est défini dans le package `com.example.user_management.service` et utilise le repository `UserRepository` pour effectuer des opérations CRUD sur les utilisateurs. Voici le code du service `UserService` :

```java
package com.example.user_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user_management.entity.User;
import com.example.user_management.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Retourne les utilisateurs
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Retourne un utilisateur par l'id
    public User getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    // Retourne un utilisateur par l'email
    public User getUserByEmail(String email) {
        return userRepository.findByEmailIgnoreCase(email);
    }

    // Créer un utilisateur
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Modifier un utilisateur
    public User updateUser(Integer id, User user) {
        User existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setLastName(user.getLastName());
            existingUser.setFirstName(user.getFirstName());
            existingUser.setAge(user.getAge());
            existingUser.setGenre(user.getGenre());
            existingUser.setAddress(user.getAddress());
            existingUser.setState(user.getState());
            existingUser.setEmail(user.getEmail());
            existingUser.setPassword(user.getPassword());

            return userRepository.save(existingUser);
        }
        return null;
    }

    // Supprimer un utilisateur
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
```

## Annotations utilisées

1. `@Service` : Indique que cette classe est un service Spring. Cela permet à Spring de gérer cette classe comme un bean et de l'injecter dans d'autres composants.
2. `@Autowired` : Utilisé pour injecter une dépendance. Dans le cas, `UserRepository` est injecté dans `UserService`.

## Méthodes du service `USerService`

1. `getAllUsers()` :
    - **Description** : Retourne une liste de tous les utilisateurs.
    - **Implémentation** : Utilise la méthode `findAll()` du repository pour récupérer tous les utilisateurs.

2. `getUserById(Integer id)` :
    - **Description** : Retourne un utilisateur par son ID.
    - **Implémentation** : Utilise la méthode `findById(id)` du repository pour rechercher un utilisateur par son ID. Si l'utilisateur est trouvé, il est retourné; sinon, `null` est retourné.

3. `getUserByEmail(String email)` :
    - **Description** : retourne un utiliateur par son email, en ignorant la casse.
    - **Implémentation** : Utilise la méthode `findByEmailIgnoreCase(email)` du repository pour rechercher un utilisateur par son email.

4. `createUser(User user)` :
    - **Description** : Crée un nouvel utilisateur.
    - **Implémentation** : Utilise la méthode `save(user)` du repository pour enregistrer le nouvel utilisateur dans la base de données.

4. `updateUser(Integer id, User user)` :
    - **Description** : Met à jour un utilisateur existant.
    - **Implémentation** : Recherche l'utilisateur existant par son Id en utilisant `findById(id)`. Si l'utilisateur est trouvé, ses informaitons sont mises à jour avec les nouvelles valeurs fournies, puis l'utilisateur mis à jour est enregistré dans la base de données en utilisant `save(existingUser)`.

6. `deleteUser(Integer id)` :
    - **Description** : Supprime un utilisateur par son ID.
    - **Implémentation** : Utilise la méthode `deleteById(id)` du repository pour supprimer l'utilisateur de la base de données.

## Utilisation du service `UserService`

Le service `UserService` est utilisé par les contrôleurs pour gérer les requêtes HTTP et interagir avec la base de données via le repository.

## Conclusion

Le service `UserService` est un composant clé de l'application Spring Boot. Il encapsule la logique métier pour les opération CRUD sur les utilisateurs et utilise le repository `UserRepository` pour interagir avec la base de données. Grâce à ce service, nous pouvons gérer les utilisateurs de manière efficace et offrir des fonctionnalités utiles à nos utilisateurs et aux administrateurs de l'application.