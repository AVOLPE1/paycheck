import java.util.Scanner;

public class paycheck {
    public static void main(String[] args) {
        Scanner payrollScanner = new Scanner(System.in);
        System.out.print ("Enter first name: ");
        String firstname = payrollScanner.nextLine();
        System.out.print ("Enter last name ");
         String lastname = payrollScanner.nextLine();
        
        System.out.print("Hourly pay rate:");
        int hourlyrate = payrollScanner.nextInt();
        System.out.print("Total hours");
        double totalhours = payrollScanner.nextDouble();
        
        System.out.print("You will make ");
        System.out.print(totalhours*hourlyrate );
        System.out.println("$ this paycheck!");
        System.out.println( );
        System.out.println("Thank you!!");
    }
}