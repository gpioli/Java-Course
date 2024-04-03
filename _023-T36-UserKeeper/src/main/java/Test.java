import model.User;
import repository.UserRepositoryImpl;

public class Test {

    public static void main(String[] args) {

        User user = new User(1, "gpioli", "123456", "gpioli@gmail.com");
        User user2 = new User(1, "analucia", "123456", "analucia@gmail.com");
        System.out.println(user);

        UserRepositoryImpl repository = new UserRepositoryImpl();

        // Insert
        System.out.println("Inserting new cases...");
        repository.addNew(user);
        repository.addNew(user2);

        // List / findAll
        System.out.println("Listing all cases: \n");
        repository.findAll().forEach(System.out::println);

        // Delete user 1
        System.out.println("Deleting user...");
        repository.delete(1);
        System.out.println("User succesfully deleted...");

        // List / findAll
        System.out.println("Listing all cases: \n");
        repository.findAll().forEach(System.out::println);

        // Updating case
        System.out.println("Listing all cases: \n");
        User user_mod = new User();
        user_mod.setId(2);
        user_mod.setUsername("hernandez");
        user_mod.setPassword("3818182");
        user_mod.setEmail("hernandez@gmail.com");
        repository.update(user_mod);

        // List / findAll
        System.out.println("Listing all cases: \n");
        repository.findAll().forEach(System.out::println);

    }

}
