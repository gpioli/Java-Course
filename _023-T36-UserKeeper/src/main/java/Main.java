import model.User;
import repository.UserRepositoryImpl;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws SQLException {

        UserRepositoryImpl userRepository = new UserRepositoryImpl();

        int opcionIndice = 0;

        while (opcionIndice != 5) {
            Map<String, Integer> operaciones = new HashMap();
            operaciones.put("Update", 1);
            operaciones.put("Delete", 2);
            operaciones.put("Add new", 3);
            operaciones.put("List all", 4);
            operaciones.put("Exit", 5);

            Object[] opArreglo = operaciones.keySet().toArray();

            Object option = JOptionPane.showInputDialog(null,
                    "Please, choose an option",
                    "User administrator",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[1]);

            if (option == null) {
                System.exit(0);
            } else {
                opcionIndice = operaciones.get(option.toString());

                User user = new User();
                int userId;
                String userName;
                String userPassword;
                String userEmail;
                switch (opcionIndice) {

                    case 1: // update
                        userId = Integer.valueOf(JOptionPane.showInputDialog("Please enter user id to update: "));
                        if (userRepository.byId(userId) != null) {
                            userName = JOptionPane.showInputDialog("Please enter new user name: ");
                            userPassword = JOptionPane.showInputDialog("Please enter new user password: ");
                            userEmail = JOptionPane.showInputDialog("Please enter new user email: ");
                            user = new User(userId, userName, userPassword, userEmail);
                            userRepository.update(user);
                            JOptionPane.showMessageDialog(null, user, "User successfully updated:", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Wrong UserId to update", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        break;
                    case 2: // delete
                        userId = Integer.valueOf(JOptionPane.showInputDialog("Please enter user id to delete "));
                        if (userRepository.byId(userId) != null) {
                            userRepository.delete(userId);
                            JOptionPane.showMessageDialog(null, "id: " + userId, "User successfully deleted:", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Wrong UserId", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case 3: // New User
                        userId = 1;
                        userName = JOptionPane.showInputDialog("Please enter new user name: ");
                        userPassword = JOptionPane.showInputDialog("Please enter new user password: ");
                        userEmail = JOptionPane.showInputDialog("Please enter new user email: ");
                        user = new User(userId, userName, userPassword, userEmail);
                        userRepository.addNew(user);
                        JOptionPane.showMessageDialog(null, user.toString(), "Usuario successfully created:", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 4: // List all
                        JScrollPane scrollPane = new JScrollPane();
                        List<User> users = userRepository.findAll();
                        JList<User> usersj = new JList(users.toArray());
                        scrollPane = new JScrollPane(usersj);

                        scrollPane.getViewport().add(usersj);
                        JOptionPane.showMessageDialog(null, scrollPane);
                        break;
                    case 5:
                        try {
                            userRepository.closeConnection();
                        } catch (SQLException e) {
                            throw new RuntimeException(e);
                        }
                        System.exit(0);
                }


            }
        }



    }
}
