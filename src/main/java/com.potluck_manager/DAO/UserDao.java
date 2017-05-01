package com.potluck_manager.DAO;

import com.potluck_manager.model.User;

import java.util.Collection;

/**
 * Created by Wipf on 4/5/17.
 */
public interface UserDao {
    Collection<User> getAllUsers();

    User getUserById(int id);

    void removeUserById(int id);

    void updateUser(User user);

    void insertUserToDb(User user);
}
