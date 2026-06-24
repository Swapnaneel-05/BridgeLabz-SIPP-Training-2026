class BankAccount {
    int accountNumber;
    String holder;
    double balance;
    static int accounts=0;

    BankAccount(int accountNumber,String holder,double balance){
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        accounts++;
    }

    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount Deposited: "+amount);
            System.out.println("Balance: "+balance);
        }
        else{
            System.out.println("Invalid Input");
        }
    }

    void withdrawl(double amount){
        if(amount > 0 && amount < balance){
            balance -= amount;
            System.out.println("Amount Withdrawn: "+amount);
            System.out.println("Balance: "+balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    void displayInformation(){
        System.out.println("\n----- Account Statement -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Balance        : $" + balance);
    }
    
    static int getAccounts(){
        return accounts;
    }
}

public class BankTrial{
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "asdfghj", 12345);
        BankAccount acc2 = new BankAccount(102, "Swap", 56789);
        BankAccount acc3 = new BankAccount(103, "qwerty", 987458);

        acc1.deposit(2000);
        acc1.withdrawl(1500);
        acc1.deposit(1000);
        acc1.withdrawl(5000);
        acc1.withdrawl(7000);


        acc2.deposit(3000);
        acc2.withdrawl(4000);
        acc2.deposit(2500);
        acc2.withdrawl(10000);
        acc2.withdrawl(8000);


        acc3.deposit(5000);
        acc3.withdrawl(2000);
        acc3.deposit(1500);
        acc3.withdrawl(10000);
        acc3.withdrawl(20000);

        
        acc1.displayInformation();
        acc2.displayInformation();
        acc3.displayInformation();
        
        System.out.println("Total Accounts: "+ BankAccount.getAccounts());
    }
}
