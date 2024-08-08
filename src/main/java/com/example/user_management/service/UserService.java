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

    // Retourne un utlisateur par l'id
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
