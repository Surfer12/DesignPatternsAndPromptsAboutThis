package Patterns;

// Usage
public class SingletonDemo {
    public static void main(String[] args) {
        DatabaseConnection.INSTANCE.executeQuery("SELECT * FROM users");
    }
}