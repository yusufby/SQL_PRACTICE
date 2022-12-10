
import java.sql.*;

public class Driver {
    public static void main(String[] args) {
        Connection connection;

            //get a connection to database
            String url = "jdbc:mysql://localhost:3306/techproed";
            String username="root";
            String password="45774657";
            try {
                connection = DriverManager.getConnection(url, username, password);
                //create a statement
                Statement statement=connection.createStatement();
                //execute sql query

                ResultSet myResultSet=statement.executeQuery("select * from employees");
                //process the result set
                while (myResultSet.next()){
                    System.out.println(myResultSet.
                            getString("lastname"  +
                                    myResultSet.getString("first_name")));
                }

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();

            }

    }
}