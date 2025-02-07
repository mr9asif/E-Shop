import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("WellCome to E-Shop");
        System.out.println("1.Wallet \n2.Shop");
        System.out.println("Enter your Choise: ");
        int ch = in.nextInt();

        if(ch==1){
            System.out.println("Welcome your Wallet");
            System.out.println("1.Balance \n2.Deposite \n3.Withdrew \n4.Main Menu");
            System.out.println("Enter your Choise: ");
            int wal = in.nextInt();
            if(wal == 1){
                System.out.println("your Balance: ");
                System.out.println("enter your choise:");
            }if(wal == 2){
                System.out.println("Deposite Cash your wallet");
                System.out.println("Enter amount: ");
                System.out.println("Enter your choise: ");
            }
        }else if(ch == 2){

        }else{
            System.out.println("enter valid choise!");
        }

    }
}