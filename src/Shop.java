import java.util.Scanner;

public class Shop {
    WalletOperation obj = new WalletOperation();
    Wallet obj2 = new Wallet();
    Scanner in = new Scanner(System.in);
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


    public  void shopMenu(){
        System.out.println("Wellcome Shop Menu!");
        System.out.println("Your Balance: $" + obj.viewBalance());
        System.out.println("1. Foods \n2. Clothes \n3. Books \n4. Mobiles");
        System.out.println("Enter your Choise: ");
        int ch = in.nextInt();
        if(ch == 1){
         foods();
         int fd = in.nextInt();
         if(fd == 1){
             System.out.println("Banana ----------- $5");
             int bl = obj.viewBalance();
             System.out.println("Your Balance: " + bl);
             int bln = bl - 5;
             if(bln >= 0){
                 System.out.println("Your Balance now: " + bln);
             }else{
                 System.out.println("Insufficiant Balance!");

             }
             obj.mainMenu();

         }else if( fd == 2){
             System.out.println("Apple ----------- $10");
             int bl = obj2.getBalance();
             System.out.println("Your Balance: " + bl);
             int bln = bl - 10;
             if(bln >= 0){
                 System.out.println("Your Balance now: " + bln);
             }else{
                 System.out.println("Insufficiant Balance!");
                 obj.mainMenu();
             }
         }
        }else if(ch ==2){
             clothes();
             int cl = in.nextInt();
             if(cl == 1){
                 System.out.println("T-shirt ----------- $15");
                 int bl = obj2.getBalance();
                 System.out.println("Your Balance: " + bl);
                 int bln = bl - 15;
                 if(bln >= 0){
                     System.out.println("Your Balance now: " + bln);
                 }else{
                     System.out.println("Insufficiant Balance!");
                     obj.mainMenu();
                 }
             }else if(cl == 2){
                 System.out.println("Pants ----------- $25");
                 int bl = obj2.getBalance();
                 System.out.println("Your Balance: " + bl);
                 int bln = bl - 25;
                 if(bln >= 0){
                     System.out.println("Your Balance now: " + bln);
                 }else{
                     System.out.println("Insufficiant Balance!");
                     obj.mainMenu();
                 }
             }else{
                 System.out.println("Incorrect Choise!");
                 obj.mainMenu();
             }


        }else if(ch == 3){
            books();
            int b = in.nextInt();
            if(b == 1){
                System.out.println("Programming ----------- $25");
                int bl = obj2.getBalance();
                System.out.println("Your Balance: " + bl);
                int bln = bl - 25;
                if(bln >= 0){
                    System.out.println("Your Balance now: " + bln);
                }else{
                    System.out.println("Insufficiant Balance!");
                    obj.mainMenu();
                }
            }else if(b == 2){
                System.out.println("Life of Millionear ----------- $15");
                int bl = obj2.getBalance();
                System.out.println("Your Balance: " + bl);
                int bln = bl - 15;
                if(bln >= 0){
                    System.out.println("Your Balance now: " + bln);
                }else{
                    System.out.println("Insufficiant Balance!");
                    obj.mainMenu();
                }
            }else{
                System.out.println("InCorrect Choise!");
                obj.mainMenu();
            }

        }else if(ch == 4){
        mobiles();
        int mb = in.nextInt();
        if(mb == 1){
            System.out.println("Symphony ----------- $150");
            int bl = obj2.getBalance();
            System.out.println("Your Balance: " + bl);
            int bln = bl - 150;
            if(bln >= 0){
                System.out.println("Your Balance now: " + bln);
            }else{
                System.out.println("Insufficiant Balance!");

            }
        }else if(mb == 2){
            System.out.println("Iphone12 ----------- $700");
            int bl = obj2.getBalance();
            System.out.println("Your Balance: " + bl);
            int bln = bl - 700;
            if(bln >= 0){
                System.out.println("Your Balance now: " + bln);
            }else{
                System.out.println("Insufficiant Balance!");
                obj.mainMenu();
            }
        }else{
            System.out.println("Incorrect Choise!");
            obj.mainMenu();
        }

        }else{
            System.out.println("InCorrect Choise!");
            obj.mainMenu();
        }
    }
}
