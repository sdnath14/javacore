import java.util.Scanner;

class dem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        
        userlogin(username, password);
    }
    
    public static void userlogin(String username, String password) {
        switch(username) {
            case "ankan", "souparna" -> {
                switch(password) {
                    case "madhu", "trisha" -> System.out.println("login successful");
                    default -> System.out.println("incorrect password");
                }
            }
            default -> System.out.println("incorrect username and password");
        }
    }
}
