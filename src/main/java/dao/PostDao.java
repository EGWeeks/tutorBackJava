package dao;

import exc.DaoException;
import model.Post;

/**
 * Created by Weeks on 5/27/16.
 */
public interface PostDao {
    void add(Post post) throws DaoException;

    List<post> findAll();

    List<post> findByUserId(int userId);
}
