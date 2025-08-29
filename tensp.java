import java.util.Scanner;

public class tensp {
    public static void main(String[] args) {  
        try (Scanner sc = new Scanner(System.in)) 
        {  
            System.out.println("Enter a number:");
            float a = sc.nextFloat();
            System.out.printf("%10.2f%n", a);  
        }  
    }
}
