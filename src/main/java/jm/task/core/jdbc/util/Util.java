package jm.task.core.jdbc.util;

import java.sql.*;
import java.sql.Driver;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/mysql";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "171521RFk.";
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            conn = DriverManager.getConnection(URL,USERNAME, PASSWORD);
                System.out.println("Соединение установлено");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Драйвер не зарегестрирован");
        }
        return conn;
    }
}
