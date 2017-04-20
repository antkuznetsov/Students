package main.services;

import main.model.dao.UserDao;
import main.model.entity.User;
import main.model.impl.UserDaoImpl;
import org.apache.log4j.Logger;

/**
 * Created by Kuznetsov on 20/04/2017.
 */

public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = Logger.getLogger(UserServiceImpl.class);

    private static UserDao userDao = new UserDaoImpl();

    @Override
    public User auth(String login, String password) {
        User user = userDao.findUserByLoginAndPassword(login, password);

        LOGGER.debug("user: " + user);

        if (user != null && user.isBlocked()) {
            return null;
        }
        LOGGER.debug("user not blocked");

        return user;
    }
}