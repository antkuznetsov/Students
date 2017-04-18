package models.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Kuznetsov on 18/04/2017.
 */

public class Connect {
    private final String DBNAME = "lsp-1";
    private final String DBLOGIN = "postgres";
    private final String DBPASSWORD = "656450";

    /**
     * Возвращает соединение с БД
     * @return Connection
     */
    public java.sql.Connection initConnection() {

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