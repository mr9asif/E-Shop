import java.util.Scanner;

public class WalletOperation implements WalletInterface{
     Wallet obj = new Wallet();
     Scanner in = new Scanner(System.in);


    public  void walletMenu() {
        WalletInterface obj = new WalletOperation();
        System.out.println("\nWelcome to your Wallet");
        System.out.println("1. Balance \n2. Deposit \n3. Withdraw \n4. Main Menu \n5. Exit");
    }

    public  void mainMenu() {
        System.out.println("\nWelcome to E-Shop");
        System.out.println("1. Wallet \n2. Shop \n3. Exit");
    }



   boolean systm = true;
     @Override
     public void  balance(){
         System.out.println("Your Balance: " + obj.getBalance());




mainMenu();


     }

     @Override
    public void diposite(){
         System.out.println("Enter Deposite Amount: ");
         int dep = in.nextInt();
         int blNow = dep+ obj.getBalance();
         int bl = obj.setBalance(blNow);
         System.out.println("Deposite Successfull!" );
         System.out.println("Your Balance Now: " + bl);
         mainMenu();

    }

    @Override
    public void withdraw(){
        System.out.println("Enter Withdraw Amount: ");
        int wth= in.nextInt();
        int tb = obj.getBalance() - wth;
        if(tb >= 0){
            int nb =obj.setBalance(tb);
            System.out.println("Withdraw Successfull!");
            System.out.println("Your balance now:" + nb);
            mainMenu();
        }else{
            System.out.println("Insufficiant Amount!");
          mainMenu();
        }
    }
}
