import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        WalletInterface obj = new WalletOperation();
        WalletOperation obj2 = new WalletOperation();
        Scanner in = new Scanner(System.in);
        boolean systm = true;  // ✅ Initialize correctly

           obj2.mainMenu();
        while (systm) {  // ✅ Use `systm` directly instead of `systm = true`
            System.out.println("Enter your choice:");
            int mch = in.nextInt();
               if(mch ==1 ){

                   obj2.walletMenu();
                   System.out.println("Enter your Choise");
                   int ch = in.nextInt();
                   if (ch == 1) {
                       obj.balance();
                   }else if(ch == 2){
                         obj.diposite();


                   }else if(ch == 3){
                        obj.withdraw();

                   }else if(ch == 4){
                       obj2.mainMenu();
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
