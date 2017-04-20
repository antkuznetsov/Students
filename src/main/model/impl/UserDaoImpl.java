package main.model.impl;

import main.model.MyConnection;
import main.model.dao.UserDao;
import main.model.entity.User;
import org.apache.log4j.Logger;

import java.sql.*;

/**
 * Created by Kuznetsov on 20/04/2017.
 */

public class UserDaoImpl implements UserDao {

    private static final Logger LOGGER = Logger.getLogger(UserDaoImpl.class);

    @Override
    public User findUserByLoginAndPassword(String login, String password) {
        User user = null;

        Connection connection = MyConnection.connect();

        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM users WHERE login = ? AND password = ?"
            );

            statement.setString(1, login);
            statement.setString(2, password);

            ResultSet result = statement.executeQuery();

            if (result.next()) {
                user = new User(
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getBoolean(4)
                );
            }
            LOGGER.debug(user);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}