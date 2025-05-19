package JDBC;

import java.sql.*;

public class Jdbc {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:sqlserver://10.225.238.30:1433;databaseName=TalentPact";
        String userName = "WebuserS";
        String password = "W3bU5eRatS0hUm";


        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        Driver driver = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(jdbcUrl, userName, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM TalentPact.dbo.HrEmployee where EmployeeID = 4556 ");

            while(resultSet.next()){
                int id = resultSet.getInt("EmployeeID");
                String name = resultSet.getString("OfficialEmailAddress");
                System.out.println(id + " " + name);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if(resultSet!=null)resultSet.close();
                if(connection != null) connection.close();
                if(statement != null) statement.close();
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
    }
}
