package lessalopards.littlesister.DAO;

import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import lessalopards.littlesister.Model.Position;
import lessalopards.littlesister.Model.User;

public class DAO {

    private static PreparedStatement preparedStatement = null;
    private static Statement statement = null;
    private static ResultSet resultSet = null;
    private static Connection connection;


    public List<User> getAllUsers() {
        List<User> userList = null;
        try {

            String SQL = "select * from dbo.User";
            connection = DatabaseConnection.getInstance().getConnection();

            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL);

            while (resultSet.next()) {
                userList.add(new User(
                        resultSet.getString("id"),
                        resultSet.getString("email"),
                        resultSet.getString("name"),
                        resultSet.getBoolean("ghostmode"),
                        resultSet.getInt("lastPosition"),
                        resultSet.getInt("lastPositionTime")
                ));
            }
            close();
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("SQL User", e.getMessage());
        }

        return userList;
    }

    public List<Position> getAllPositions() {
        return null;
    }

    public static void close() {
        try {
            connection.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
