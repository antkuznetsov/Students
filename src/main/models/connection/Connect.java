package main.models.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Kuznetsov on 18/04/2017.
 */

public class Connect {
    private final String DBNAME = "students";
    private final String DBLOGIN = "postgres";
    private final String DBPASSWORD = "656450";

    /**
     * Возвращает соединение с БД
     * @return Connection
     */
    public Connection initConnection() {

        java.sql.Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            //LOGGER.debug("Проблема с драйвером");
        }
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/" + DBNAME, DBLOGIN, DBPASSWORD);
        } catch (SQLException e) {
            //LOGGER.debug("Проблема с соединением");
        }

        return connection;
    }
}