package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    void saveUser(User user);

    void deleteUserById(Long id);

    void updateUser(User user, long id);

    User findUserByUsername(String username);
}
