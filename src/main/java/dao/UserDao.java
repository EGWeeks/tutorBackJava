package dao;

import exc.DaoException;
import model.User;

import java.util.List;

/**
 * Created by Weeks on 5/27/16.
 */

public interface UserDao {
    void add(User user) throws DaoException;

    List<User> findAll();
}
