// overloading-compile time polymorphism

class ATM{
    void withdraw(int amount){
        System.out.println("Withdrawn:" + amount  +  "using ATM Card");
    }
    void withdraw(int amount,String accountType){
        System.out.println("Withdrawn:" + amount  +   "from" + accountType + "account");
    }
    void withdraw(int amount,String accountType,boolean isInternationalCard){
        System.out.println("Withdrawn:" + amount +  "from" +accountType + (isInternationalCard? "with International Card ":""));
    }
}
    public class Overloading{
        public static void main(String[] args) {
            ATM a=new ATM();
            a.withdraw(500);
            a.withdraw(10000, "Savings");
            a.withdraw(12000, "Savings", true);

        }

    }
