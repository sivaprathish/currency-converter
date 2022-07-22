import java.util.*;

public class currency_convertor {
    public static void main(String[] args) {
        double amount;
        double rupee, dollar, pound, euro;
        int choice;
        int choices;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the currency you want to convert: ");
        System.out.println("Enter 1: Rupee\nEnter 2: Dollar\nEnter 3: Pound\nEnter 4: Euro");
        System.out.print("Choose from above options: ");
        choice = sc.nextInt();

        System.out.println("\nEnter the amount you want to convert:");
        amount = sc.nextFloat();

        switch (choice) {
            case 1: // Ruppe Conversion
                System.out.println("\nEnter the currency you want to converted into: ");
                System.out.println("Enter 1: dollar\nEnter 2: pound\nEnter 3: euro ");
                System.out.print("Choose from above options: ");
                choices = sc.nextInt();

                if (choices == 1) {
                    dollar = amount / 70;
                    System.out.println(amount + " Rupee = " + dollar + " Dollar");
                } else if (choices == 2) {
                    pound = amount / 88;
                    System.out.println(amount + " Rupee = " + pound + " Pound");
                } else if (choices == 3) {
                    euro = amount / 80;
                    System.out.println(amount + " Rupee = " + euro + " Euro");
                } else {
                    System.out.println("Invalid Input");
                }

                break;

            case 2: // Dollar Conversion
                System.out.println("\nEnter the currency you want to converted into: ");
                System.out.println("Enter 1: Rupee\nEnter 2: Pound\nEnter 3: Euro");
                System.out.print("Choose from above options: ");
                choices = sc.nextInt();

                if (choices == 1) {
                    rupee = amount * 70;
                    System.out.println(amount + " Dollar = " + (rupee) + " Ruppes");
                } else if (choices == 2) {
                    pound = amount * 0.78;
                    System.out.println(amount + " Dollar = " + (pound) + " Pound");
                } else if (choices == 3) {
                    euro = amount * 0.87;
                    System.out.println(amount + " Dollar = " + (euro) + " Euro");
                } else {
                    System.out.println("Invalid Input");
                }

                break;

            case 3: // Pound Conversion
                System.out.println("\nEnter the currency you want to converted into: ");
                System.out.println("Enter 1: Rupee\nEnter 2: Dollar\nEnter 3: Euro");
                System.out.print("Choose from above options: ");
                choices = sc.nextInt();

                if (choices == 1) {
                    rupee = amount * 88;
                    System.out.println(amount + " pound = " + (rupee) + " Ruppes");
                } else if (choices == 2) {
                    dollar = amount * 1.26;
                    System.out.println(amount + " pound = " + (dollar) + " Dollar");
                } else if (choices == 3) {
                    euro = amount * 1.10;
                    System.out.println(amount + " pound = " + (euro) + " Euro");
                } else {
                    System.out.println("Invalid Input");
                }

                break;

            case 4: // Euro Conversion
                System.out.println("\nEnter the currency you want to converted into: ");
                System.out.println("Enter 1: Rupee\nEnter 2: Dollar\nEnter 3: Pound");
                System.out.print("Choose from above options: ");
                choices = sc.nextInt();

                if (choice == 1) {
                    rupee = amount * 80;
                    System.out.println(amount + " euro = " + (rupee) + " Ruppes");
                } else if (choices == 2) {
                    dollar = amount * 1.14;
                    System.out.println(amount + " euro = " + (dollar) + " Dollar");
                } else if (choices == 3) {
                    pound = amount * 0.90;
                    System.out.println(amount + " euro = " + (pound) + " Pound");
                } else {
                    System.out.println("Invalid Input");
                }

                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}