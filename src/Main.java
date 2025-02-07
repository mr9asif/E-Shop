import java.util.Scanner;

public class Main {

    public static void mainMenu() {
        System.out.println("\nWelcome to your Wallet");
        System.out.println("1. Balance \n2. Deposit \n3. Withdraw \n4. Main Menu");
    }

    public static void walletMenu() {
        System.out.println("\nWelcome to E-Shop");
        System.out.println("1. Wallet \n2. Shop \n3. Exit");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean systm = true;  // ✅ Initialize correctly

        while (systm) {  // ✅ Use `systm` directly instead of `systm = true`
            mainMenu();
            System.out.println("Enter your choice:");
            int ch = in.nextInt();

            if (ch == 1) {
                System.out.println("Your Balance: 1000  \n1. Wallet");
                System.out.println("Enter your choice: ");
                int bl = in.nextInt();

                if (bl == 1) {
                    walletMenu();
                } else {
                    systm = false;  // ✅ Now correctly stops the loop
                    System.out.println("Invalid choice! Exiting...");
                }
            }else if(ch == 2){
                System.out.println("1. Deposite your wallet \n2. Wallet");
                System.out.println("Enter your Choise: ");
                int dp = in.nextInt();
                if(dp == 1){
                    System.out.println("Enter Deposite Amount: ");
                    int am = in.nextInt();
                    System.out.println("successfully Deposite amount" + am);
                }else if(dp == 2){

                    walletMenu();
                }else{
                    systm=false;
                    System.out.println("Invalid Choise!");
                }
            }


        }

        in.close();  // ✅ Close scanner to avoid resource leak
    }
}
