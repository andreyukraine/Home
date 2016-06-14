package test;

import java.sql.*;
import java.util.Scanner;

public class SQL {

    public static void main(String[] args) {

        //Class.forName("com.mysql.jdbc.Driver").newInstance();
        //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name", "root", "");
        Scanner qname = new Scanner(System.in);
        String namea = qname.nextLine();
        //String[] a = {"Ben","Senia","Ivan"};
        String Host = "jdbc:mysql://timeke00.mysql.ukraine.com.ua/timeke00_java";
        String User = "timeke00_java";
        String Pass = "zaqxsw123qaz";


        String userss = "SELECT * FROM User";
        String add_users = "INSERT INTO User (name) VALUES ('" + namea + "')";

        try {
            Connection connection = DriverManager.getConnection(Host, User, Pass);
            Statement statement = connection.createStatement();


//            for (int i = 0; i < a.length ; i++) {
//
//               String arr = "INSERT INTO User (name) VALUES ('"+a[i]+"')";
//               statement.execute(arr);
//            }


            statement.execute(add_users);

            ResultSet resultSet = statement.executeQuery(userss);
            while (resultSet.next()) {

                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
