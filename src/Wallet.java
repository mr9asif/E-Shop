public class Wallet {
    private int balance;
    private int deposite;
    private int withdraw;

//    getter
    public int getBalance(){
        return  balance;
    }
    public  int getDeposite(){
        return deposite;
    }
    public int getWithdraw(){
        return withdraw;
    }

//    setter
    public int setBalance(int balance){
        return this.balance=balance;
    }
    public int setDeposite(int deposite){
        return this.deposite=deposite;
    }
    public int setWithdraw(int withdraw){
        return this.withdraw=withdraw;
    }



}
