import static org.junit.Assert.*;

import dao.Sql2oUserDao;
import org.junit.After;
import org.junit.Before;
import org.sql2o.Sql2o;
import org.sql2o.Connection;

import model.User;

/**
 * Created by Weeks on 5/29/16.
 */
public class Sql2oUserDaoTest {

    private Sql2oUserDao dao;
    private Connection conn;

    @Before
    public void setUp() throws Exception {

        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from classpath:db/init.sql";

        Sql2o sql2o = new Sql2o(connectionString, "", "");

        dao = new Sql2oUserDao(sql2o);
        //keep connection open through test
        conn = sql2o.open();

    }

    @After
    public void tearDown() throws Exception {
        conn.close();
    }

    public void addingCourseSetsId() throws Exception {

        User user = new User("fName", "lName", "fl@email.com", "shhhh", "bio", "New York", "05021", "123.456", "678.123", "image url");
        int originalUserId = user.getUserId();
        dao.add(user);

        assertNotEquals(originalUserId, user.getUserId());
    }

}