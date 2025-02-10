import java.util.Scanner;

public class WalletOperation implements WalletInterface{
     Wallet obj = new Wallet();
     Scanner in = new Scanner(System.in);


//     shop

    public  void books(){
        System.out.println("1. Programming --- $25  \n2. Life of Millionear --- $15 ");
    } public  void foods(){
        System.out.println("1.banana --- $5  \n2. Apple --- $10 ");
    } public  void clothes(){
        System.out.println("1.T-shirt --- $15  \n2. Pants --- $25  ");
    }
    public  void mobiles(){
        System.out.println("1.Symphony --- $150  \n2. Iphone12 --- $700 ");
    }





//    shop

    public  void walletMenu() {
        WalletInterface obj = new WalletOperation();
        System.out.println("\nWelcome to your Wallet");

        System.out.println("1. Balance \n2. Deposit \n3. Withdraw \n4. Main Menu \n5. Exit");
    }

    public  void mainMenu() {
        System.out.println("\nWelcome to E-Shop");
        System.out.println(viewBalance());
        System.out.println("1. Wallet \n2. Shop \n3. Exit");
    }


// view balance
    public  int viewBalance(){
       return obj.getBalance();
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

public int bl(){
    return  obj.getBalance();
}

//    shop
public  void shopMenu(){
    System.out.println("Wellcome Shop Menu!");
    System.out.println("Your Balance: $" + obj.getBalance());
    System.out.println("1. Foods \n2. Clothes \n3. Books \n4. Mobiles");
    System.out.println("Enter your Choise: ");
    int ch = in.nextInt();
    if(ch == 1){
        foods();
        int fd = in.nextInt();
        if(fd == 1){
            System.out.println("Banana ----------- $5");
            int bl = obj.getBalance();
            System.out.println("Your Balance: " + bl);
            int bln = bl - 5;
            if(bln >= 0){
                System.out.println("Your Balance now: " + bln);
            }else{
                System.out.println("Insufficiant Balance!");

            }
            mainMenu();

        }else if( fd == 2){
            System.out.println("Apple ----------- $10");
            int bl = obj.getBalance();
            System.out.println("Your Balance: " + bl);
            int bln = bl - 10;
            if(bln >= 0){
                System.out.println("Your Balance now: " + bln);
            }else{
                System.out.println("Insufficiant Balance!");
                mainMenu();
            }
        }
    }else if(ch ==2){
        clothes();
        int cl = in.nextInt();
        if(cl == 1){
            System.out.println("T-shirt ----------- $15");
            int bl = obj.getBalance();
            System.out.println("Your Balance: " + bl);
            int bln = bl - 15;
            if(bln >= 0){
                System.out.println("Your Balance now: " + bln);
            }else{
                System.out.println("Insufficiant Balance!");
                mainMenu();
            }
        }else if(cl == 2){
            System.out.println("Pants ----------- $25");
            int bl = obj.getBalance();
            System.out.println("Your Balance: " + bl);
            int bln = bl - 25;
            if(bln >= 0){
                System.out.println("Your Balance now: " + bln);
            }else{
                System.out.println("Insufficiant Balance!");
                mainMenu();
            }
        }else{
            System.out.println("Incorrect Choise!");
            mainMenu();
        }


    }else if(ch == 3){
        books();
        int b = in.nextInt();
        if(b == 1){
            System.out.println("Programming ----------- $25");
            int bl = obj.getBalance();
            System.out.println("Your Balance: " + bl);
            int bln = bl - 25;
            if(bln >= 0){
                System.out.println("Your Balance now: " + bln);
            }else{
                System.out.println("Insufficiant Balance!");
                mainMenu();
            }
        }else if(b == 2){
            System.out.println("Life of Millionear ----------- $15");
            int bl = obj.getBalance();
            System.out.println("Your Balance: " + bl);
            int bln = bl - 15;
            if(bln >= 0){
                System.out.println("Your Balance now: " + bln);
            }else{
                System.out.println("Insufficiant Balance!");
                mainMenu();
            }
        }else{
            System.out.println("InCorrect Choise!");
            mainMenu();
        }

    }else if(ch == 4){
        mobiles();
        int mb = in.nextInt();
        if(mb == 1){
            System.out.println("Symphony ----------- $150");
            int bl = obj.getBalance();
            System.out.println("Your Balance: " + bl);
            int bln = bl - 150;
            if(bln >= 0){
                System.out.println("Your Balance now: " + bln);
            }else{
                System.out.println("Insufficiant Balance!");

            }
        }else if(mb == 2){
            System.out.println("Iphone12 ----------- $700");
            int bl = obj.getBalance();
            System.out.println("Your Balance: " + bl);
            int bln = bl - 700;
            if(bln >= 0){
                System.out.println("Your Balance now: " + bln);
            }else{
                System.out.println("Insufficiant Balance!");
                mainMenu();
            }
        }else{
            System.out.println("Incorrect Choise!");
            mainMenu();
        }

    }else{
        System.out.println("InCorrect Choise!");
        mainMenu();
    }
}
}
