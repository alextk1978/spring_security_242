package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List getAllUsers();

    User getUserById(Long id);

    void saveUser(User user);

    void deleteUserById(Long id);

    void updateUser(User user, long id);

    User findUserByUsername(String username);
}
