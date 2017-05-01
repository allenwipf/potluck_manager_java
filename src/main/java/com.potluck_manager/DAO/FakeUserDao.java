package com.potluck_manager.DAO;


import com.potluck_manager.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("FakeData")
public class FakeUserDao implements UserDao {

    private static Map<Integer, User> users;

    static {

        users = new HashMap<Integer, User>(){

            {
                put(1, new User(1, "Allen Wipf", "allen@email.com", "password"));
                put(2, new User(2, "Lydia Wipf", "lydia@email.com", "password"));
                put(3, new User(3, "Lawson Wipf", "lawson@email.com", "password"));

            }


        };

    }

    @Override
    public Collection<User> getAllUsers(){
        return this.users.values();
    }

    @Override
    public User getUserById(int id){
        return this.users.get(id);
    }

    @Override
    public void removeUserById(int id) {
        this.users.remove(id);
    }

    @Override
    public void updateUser(User user){
        User current_user = users.get(user.getId());
        current_user.setEmail(user.getEmail());
        current_user.setPassword(user.getPassword());
        users.put(user.getId(), user);
    }

    @Override
    public void insertUserToDb(User user) {
        this.users.put(user.getId(), user);
    }
}
