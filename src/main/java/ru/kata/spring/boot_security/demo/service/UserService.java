package ru.kata.spring.boot_security.demo.service;




import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> listUsers();

    void add(String username, Integer age, String city);

    void updateUser(String username, Integer age, String city, Long id);

    void delete(Long id);
}
