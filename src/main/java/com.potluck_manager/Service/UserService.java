package com.potluck_manager.Service;


import com.potluck_manager.DAO.FakeUserDao;
import com.potluck_manager.DAO.UserDao;
import com.potluck_manager.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

// Change the value of Qualifier to Database I want to use
    @Autowired
    @Qualifier("postgres")
    private UserDao UserDao;

    public Collection<User> getAllUsers(){
        return this.UserDao.getAllUsers();
    }

    public User getUserById(int id){
        return this.UserDao.getUserById(id);
    }

    public void removeUserbyId(int id) {
        this.UserDao.removeUserById(id);
    }

    public void updateUser(User user){
        this.UserDao.updateUser(user);
    }

    public void insertUser(User user) {
        this.UserDao.insertUserToDb(user);
    }
}
