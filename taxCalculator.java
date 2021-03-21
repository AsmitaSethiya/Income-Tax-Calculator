import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here
        System.out.println("TAX CALCULATOR APP");
        System.out.println("-----WELCOME-----");

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total person count: ");

        int n = scanner.nextInt();

        String[] names = new String[n];

        long[] incomes = new long[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name " + (i + 1) + ":");
            names[i] = scanner.next();

            System.out.println("Enter" + names[i] + "'s Annual income: ");

            incomes[i] = scanner.nextLong();

            System.out.println();

        }

        scanner.close();

        System.out.println(" Names with liable taxes");
        System.out.println("------------------------");

        for (int i = 0; i < n; i++) {
            calculateTax(names[i], incomes[i]);
        }
    }

    private static void calculateTax(String name, long income) {
        long tax;

        if (income >= 300000) {
            tax = income * 20 / 100;
        } else if (income >= 100000) {
            tax = income * 10 / 100;
        } else {
            tax = 0;
        }

            System.out.println(" " + name + " : " + '\u20B9' + " " + tax);
        }
    }
