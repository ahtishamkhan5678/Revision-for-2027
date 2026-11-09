public class Bank {
    // these are the variable for the bank system;
    private  String accountHolderName;
    private int accountNumber;
    private double balance;
    private String bankName;
    static int totalBalanceInBank = 0;

    void createAccount(String userName, int accno, double bal, String bName){
        accountHolderName = userName;
        accountNumber = accno;
        balance = bal;
        bankName = bName;
        totalBalanceInBank += balance;
    }

    static void totalBalanceInBank() {
        System.out.println("Total Bank Balance : " + totalBalanceInBank);
    }


    void displayAccountDetails(){

        System.out.println("Name : " + accountHolderName);
        System.out.println("Account No : " + accountNumber);
        System.out.println("Balance : " + balance);
        System.out.println("Bank Name : " + bankName);

    }

    public static void main(String[] args){
        // creating two object below here;
        Bank sbiBank = new Bank();
        Bank hdfcBank = new Bank();

        // give the value to all variable of the bank
        sbiBank.createAccount("Ahtisham", 49, 1200.00, "StateBank" );
        hdfcBank.createAccount("Arif", 50, 800.00, "HDFC");

        //display the account Details below here;
        System.out.println("--------------------");
        sbiBank.displayAccountDetails();
        System.out.println("=================");
        hdfcBank.displayAccountDetails();
        System.out.println("--------------------");

        // display all the total balance in bank
        System.out.println("*******************");
        totalBalanceInBank();
    }
}
