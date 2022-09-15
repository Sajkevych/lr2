package main;
import customers.Customers;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Customers[] CUST=new Customers[5];
        CUST[0]=new Customers(123,"Sajkevych","Bohdan","Volodymyrovych","Vusoka 42",123456789,1000000);
        CUST[1]=new Customers(242,"Kosiv","Bohdan","Romanovych","Topolna 1a",167823492,-1247.156);
        CUST[2]=new Customers(653,"Levtiuh","Roman","Ostapovych","Chuprynky 5",625417485,164168.566);
        for (int i = 0; i < 3; i++)
                System.out.println(CUST[i].toString());
        System.out.println("After entering a number from 1 to 3, choose which data you want to display:");
        System.out.println("""
                1-List of customers, with the specified name.
                2-List of customers whose credit card number is in the specified range.
                3-The number and list of customers who are in debt (negative balance on the card).""");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextLine()) {
            case "1" -> {
                System.out.println("Enter name:");
                String name=scan.nextLine();
                Names(name,CUST);
            }
            case "2" -> {
                System.out.println("Enter first value:");
                long value1 = scan.nextLong();
                System.out.println("Enter last value:");
                long value2 = scan.nextLong();
                Cards(value1,value2,CUST);
            }
            case "3" -> Debts(CUST);
            default -> System.out.println("There are no such variant!!!!");
        }
    }
    private static void Names(String name,Customers[] CUST) {
        System.out.println("Enter name:");
        int counter1 = 0;
        for (int i = 0; i < 3; i++) {
            if (CUST[i].getFirstName().equals(name)) {
                System.out.println(CUST[i].toString());
                counter1++;
            }
        }
        if (counter1 == 0)
            System.out.println("There are no customers with this name!!!");
    }
    private static void Cards(long value1,long value2,Customers[] CUST){
        int counter2=0;
        for (int i = 0; i < 3; i++) {
            if (CUST[i].getCardNumber() > value1 && CUST[i].getCardNumber() < value2){
                System.out.println(CUST[i].toString());
                counter2++;
            }
        }
        if (counter2 == 0)
            System.out.println("There are no such CardNumber!!!");
    }
    private static void Debts(Customers[] CUST) {
        int counter3 = 0;
        for (int i = 0; i < 3; i++) {
            if (CUST[i].getBalance() < 0) {
                counter3++;
                System.out.println(CUST[i].toString());
            }
        }
        System.out.println("There are " + counter3 + " customers that have debts.");
    }

}
