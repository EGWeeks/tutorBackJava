package dao;

import exc.DaoException;
import model.Post;

import java.util.List;

/**
 * Created by Weeks on 5/27/16.
 */
public interface PostDao {
    void add(Post post) throws DaoException;

    List<Post> findAll();

    List<Post> findByUserId(int userId);
}
