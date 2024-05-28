package ru.kata.spring.boot_security.demo.dao;





import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
    List<User> listUsers();

    void add(User user);

    User find(Long id);

    void updateUser(User user);

    void delete(Long id);
}
