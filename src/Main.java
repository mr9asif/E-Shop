import java.util.Scanner;

public class Main {

    public static void walletMenu() {
        System.out.println("\nWelcome to your Wallet");
        System.out.println("1. Balance \n2. Deposit \n3. Withdraw \n4. Main Menu \n5. Exit");
    }

    public static void mainMenu() {
        System.out.println("\nWelcome to E-Shop");
        System.out.println("1. Wallet \n2. Shop \n3. Exit");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean systm = true;  // ✅ Initialize correctly

            mainMenu();
        while (systm) {  // ✅ Use `systm` directly instead of `systm = true`
            System.out.println("Enter your choice:");
            int mch = in.nextInt();
               if(mch ==1 ){

                   walletMenu();
                   System.out.println("Enter your Choise");
                   int ch = in.nextInt();
                   if (ch == 1) {
                       System.out.println("Your Balance: "  );
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
                   }else if(ch == 3){
                       System.out.println("1. Withdraw your wallet \n2. Wallet");
                       System.out.println("Enter your Choise: ");
                       int wt = in.nextInt();
                       if(wt == 1){
                           System.out.println("Enter Withdraw Amount: ");
                           int am = in.nextInt();
                           System.out.println("Successfully Withdraw Amount" + am);
                       }else if(wt == 2){

                           walletMenu();
                       }else{
                           systm=false;
                           System.out.println("Invalid Choise!");
                       }
                   }else if(ch == 4){
                       mainMenu();
                   }else if(ch == 5){
                       break;
                   }else{
                       systm=false;
                       System.out.println("Invalid Choise!");
                   }
               }



        }

        in.close();  // ✅ Close scanner to avoid resource leak
    }
}
