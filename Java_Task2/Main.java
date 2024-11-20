public class Main {
    public static void main(String[] args) {
        // Create an Admin and a User
        Admin admin = new Admin(1, "Admin1", "securePass123");
        User user = new User(2, "User1");

        // Create DataSource instances for different operations
        DataSource update = new Update();
        DataSource view = new View();
        DataSource delete = new Delete();

        // Perform different operations for Admin and User
        System.out.println("Admin performing operations:");
        admin.performOperation(update);
        admin.performOperation(view);

        System.out.println("\nUser performing operations:");
        user.performOperation(view);
        user.performOperation(delete);
    }
}
