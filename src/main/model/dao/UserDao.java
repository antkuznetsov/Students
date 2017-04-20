package main.model.dao;

import main.model.entity.User;

/**
 * Created by Kuznetsov on 20/04/2017.
 */

public interface UserDao {
    User findUserByLoginAndPassword(String login, String password);
}
