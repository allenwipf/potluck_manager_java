package com.potluck_manager.DAO;


import com.mysql.cj.api.result.Row;
import com.potluck_manager.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

@Repository("postgres")
public class UserPostgresDao implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static class UserRowMapper implements RowMapper<User>{
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setEmail(rs.getString("email"));
            user.setPassword(rs.getString("password"));
            return user;
        }
    }

    @Override
    public Collection<User> getAllUsers() {
        final String sql = "SELECT id, name, email, password FROM users";
        List <User> users = jdbcTemplate.query(sql, new UserRowMapper());
        return users;
    }

    @Override
    public User getUserById(int id) {
        final String sql = "SELECT id, name, email, password FROM users where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new UserRowMapper(), id);
        return user;
    }


    @Override
    public void removeUserById(int id) {
        final String sql = "DELETE from users WHERE id = ?";
        jdbcTemplate.update(sql, id );

    }

    @Override
    public void updateUser(User user) {
        final String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        final int id = user.getId();
        final String name = user.getName();
        final String email = user.getEmail();
        jdbcTemplate.update(sql, new Object[]{name, email, id});
    }

    @Override
    public void insertUserToDb(User user) {
        final int id = user.getId();
        final String name = user.getName();
        final String email = user.getEmail();
        final String password = user.getPassword();
        final String sql = "INSERT INTO user (name, email, password) VALUES (?, ? ,?)";
        jdbcTemplate.update(sql, new Object[] {name, email, password});

    }
}
