package dao;

import exc.DaoException;
import model.User;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

/**
 * Created by Weeks on 5/27/16.
 */

public class Sql2oUserDao implements UserDao {

    private final Sql2o sql2o;

    public Sql2oUserDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(User user) throws DaoException {

        String sql = "INSERT INTO users(first_name, last_name, email, bio, location, zip, lat, lng, password, img) " +
                "VALUES (:firstName, :lastName, :email, :bio, :location, :zip, :lat, :lng, :password, img";

        try (Connection con = sql2o.open()) {

           int id = (int) con.createQuery(sql)
                    .bind(user)
                    .executeUpdate()
                    .getKey();

            user.setId(id);

        } catch (Sql2oException ex) {
            throw new DaoException(ex, "Problem adding User");
        }
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
