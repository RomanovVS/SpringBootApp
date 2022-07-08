package ru.romanov.springbootapp.controller.DAO;


import ru.romanov.springbootapp.model.User;

import java.util.List;

public interface UserDAO {
    void saveUser(User user);
    void deleteUser(Long id);
    List<User> showAllUsers();
    void editUser(Long id, User user);
    User getUserById(Long id);
}
