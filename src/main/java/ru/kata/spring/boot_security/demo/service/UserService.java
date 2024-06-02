package ru.kata.spring.boot_security.demo.service;




import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> listUsers();

    void add(User user);

    void updateUser(String username, Integer age, String city, Long id,String password);

    void delete(Long id);
    User findByUsername(String username);
}
