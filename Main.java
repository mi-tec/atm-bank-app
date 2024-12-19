import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nStep 1: Starting process...");
            System.out.println("Press 'c' to cancel or any other key to continue");
            
            String input = scanner.nextLine().trim().toLowerCase();
            
            if (input.equals("c")) {
                System.out.println("Canceling... Returning to Step 1");
                continue;
            }
            
            // Continue with other steps
            System.out.println("Proceeding to next step...");
            // Add your additional code here
        }
    }
}
