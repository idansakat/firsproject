import java.util.Scanner;

public class Javafirstproject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         System.out.println("press 1 to convert shekels to dollars");
         System.out.println("press 2 to convert dollars to shekels");
         System.out.println("press 3 to convert euro to shekels");
         System.out.println("press 4 to convert shekels to euros");
         System.out.println("press 0 to exit from exchange");
         int number =scanner.nextInt();
         while (number !=0 ){
             System.out.println("how mach money to convert?");
             double price = scanner.nextDouble();
             switch (number){
                 case 1 -> System.out.println(price + " shekels is " + price * 3.53 + " dollars ");
                 case 2 -> System.out.println(price / 3.53 + " shekels " );
                 case 3 -> System.out.println(price / 3.68 + " shekels ");
                 case 4 -> System.out.println(price * 3.68 + " euros ");
             }
             System.out.println();
             System.out.println("press 1 to convert shekels to dollars");
             System.out.println("press 2 to convert dollars to shekels");
             System.out.println("press 3 to convert euro to shekels");
             System.out.println("press 4 to convert shekels to euros");
             System.out.println("press 0 to exit from exchange");
             number = scanner.nextInt();
         }
        System.out.println("thank you good bye");

    }
}
