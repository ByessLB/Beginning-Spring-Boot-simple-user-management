# Description du contrôleur `UserController`

## Qu'est-ce qu'un contrôleur ?

Dans le contexte de Spring Boot, un contrôleur est une classe qui gère les requêtes HTTP entrantes. Il s'agit d'une couche intermédiaire entre les requêtes HTTP et la logique métier de l'application. le contrôleur traite les requêtes, interagit avec les services pour effectuer les opérations nécessaires, et renvoie les réponses appropriées.

## Définition du contrôleur `UserController`

Le contrôleur `UserController` est défini dans le package `com.example.user_management.controller` et utilise le service `UserService` pour effectuer des opération CRUD sur les utilisateurs. Voici le code du contrôleur `UserController` :

```java
package com.example.user_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.user_management.entity.User;
import com.example.user_management.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getAllUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Integer id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "user-form";
    }

    @GetMapping("/add")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "user-form";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute User user) {
        if (user.getId() == null) {
            userService.createUser(user);
        } else {
            userService.updateUser(user.getId(), user);
        }
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }

    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable Integer id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "user-form";
    }
}
```

## Annotations utilisées

1. `@Controller` : Indique que cette classe est un contrôleur Spring. Cela permet à Spring de gérer cette classe comme un bean et de l'utiliser pour traiter les requêtes HTTP.

2. `@RequestMapping("/users")` : Indique que ce contrôleur gère les requêtes HTTP pour le chemin `/users`.

3. `@Autowired` : Utilisé pour injecter une dépendance. Dans ce cas, `UserService` est injecté dans `UserController`.

4. `@GetMapping` : Utilisé pour mapper les requêtes HTTP GET à des méthodes spécifiques.

5. `@PostMapping` : Utilisé pour mapper les requêtes HTTP POST à des méthodes spécifiques.

6. `@PathVariable` : Utilisé pour extraire des valeurs de l'URL et les passer en tant que paramètres de méthode.

7. `@ModelAttribute` : Utilisé pour lier les données de formulaire à un objet Java.

## Méthodes du contrôleur `UserController`

1. `getAllUsers(Model model)` :
    - **Descripiton** : Récupère et affiche la liste de tous les utilisateurs.
    - **Implémentation** : Utilise la méthode `getAllUsers()` du service pour récupérer tous les utilisateurs et les ajoute au modèle pour les afficher dans la vue `users`.

2. `getUserById(@PathVariable Integer id, Model model)` :
    - **Description** : Récupère et affiche les détails d'un utilisateur par son ID.
    - **Implémentation** : Utilise la méthode `getUserById()` du service pour récupérer l'utilisateur par son ID et l'ajoute au modèle pour l'afficer dans la vue `user-form`.

3. `addUser(Model model)` :
    - **Description** : Affiche le formulaire pour ajouter un nouvel utilisateur.
    - **Implémentation** : Ajoute un objet `User` au modèle pour l'afficher dans la vue `user-form`.

4. `saveUser(@ModelAttribute User user)`:
    - **Description** : Enregistre un nouvel utilisateur ou met à jour un utilisateur existant.
    - **Implémentation** : Vérifie si l'ID de l'utilisateur est `null`. Si c'est le cas, un nouvel utilisateur est créé en utilisant la méthode `createUser(user)` du service. Sinon, l'utilisateur existant est mis à jour en utilisant la méthode `updateUser(user.getId(), user)` du service. Redirige vers la liste des utilisateurs.

5. `deleteUser(@PathVariable Integer id)` :
    - **Description** : Supprime un utilisateur par son ID.
    - **Implémentation** : Utilise la méthode `deleteUser(id)` du service pour supprimer l'utilisateur par son ID et redirige vers la liste des utilisateurs.

6. `editUser(@PathVariable Integer id, Model model)`:
    - **Description** : Affiche le formulaire poru modifier un utilisateur existant.
    - **Implémentation** : Utilise la méthode `getUserById(id)` du service pour récupérer l'utilisateur par son ID et l'ajoute au modèle pour l'afficher dans la vue `user-form`.

## Utilisation du contrôleur `UserController`

Le contrôleur `UserController` est utilisé poru gérer les requêtes HTTP et interagir avec le service `UserService` pour effectuer des opérations CRUD sur les utilisateurs. PAr exemple, lorsqu'un utilisateur accède à l'URL `/users`, le contrôleur récupère la liste des utilisateurs et les affiche dans la vue `users`.

## Conclusion

Le contrôleur `UserController` est un composant essentielle de notre application Spring Boot. Il gère les requêtes HTTP et utilise le service `UserService` poru effectuer des opérations CRUD sur les utilisateurs. Grâce à ce contrôleur, nous pouvons offrir une interface utilisateur conviviale pour gérer les utilisateurs de manière efficace.