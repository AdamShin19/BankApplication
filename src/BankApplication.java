import java.util.Scanner;

public class BankApplication {


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your 'Name' and 'CustomerId' to access your Bank account:");
            String customerName=sc.nextLine();
            String customerId=sc.nextLine();
            BankAccount obj1=new BankAccount(customerName,customerId);
            obj1.menu();
        }
    }
}