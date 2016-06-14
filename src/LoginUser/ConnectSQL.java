package LoginUser;

import java.sql.Connection;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

public class ConnectSQL {

    private final String HOST = "jdbc:mysql://timeke00.mysql.ukraine.com.ua/timeke00_java";
    private final String USER = "timeke00_java";
    private final String PASS = "zaqxsw123qaz";

    private Connection connection = getConnection(HOST, USER, PASS);


    public ConnectSQL() throws SQLException {
    }
}
