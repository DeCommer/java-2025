import java.util.Scanner;

public class N2025 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello, " + name);

        in.close();
    }
} 
