package repository;

import model.User;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements Repository<User> {

    private Connection getConnection() throws SQLException {
        Connection connection = DBConnection.getInstance();
        return connection;
    }

    public void closeConnection() throws SQLException {
        DBConnection.closeInstance();
    }

    @Override
    public void update(User user) {
        try (PreparedStatement pstmt = getConnection().prepareStatement(
                "UPDATE usuarios SET username=?, password=?, email=? WHERE id=? ")) {

            pstmt.setString(1,user.getUsername());
            pstmt.setString(2,user.getPassword());
            pstmt.setString(3,user.getEmail());
            pstmt.setInt(4, user.getId());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try (PreparedStatement pstmt = getConnection().prepareStatement("DELETE FROM usuarios WHERE id = ?")
        ) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addNew(User user) {
        try (PreparedStatement stmt = getConnection().prepareStatement(
                "INSERT INTO usuarios(username, password, email) VALUES(?, ?, ?)");) {

            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getEmail());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> findAll() {

        List<User> users = new ArrayList<>();

        try (Statement stmt = getConnection().createStatement();
             ResultSet resultSet = stmt.executeQuery("SELECT * FROM usuarios;")
        ) {

            while (resultSet.next()) {
                User user = createUser(resultSet);
                users.add(user);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return users;
    }

    public User byId(int id) throws SQLException {
        User user = null;
        String query =  "SELECT * FROM usuarios WHERE id = ?";
        try (PreparedStatement pstmt = getConnection().prepareStatement("SELECT * FROM usuarios WHERE id = ?") ) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                user = createUser(rs);
            }
        }
        return user;
    }

    private User createUser(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt(1));
        user.setUsername(resultSet.getString(2));
        user.setPassword(resultSet.getString(3));
        user.setEmail(resultSet.getString(4));
        return user;
    }
}
