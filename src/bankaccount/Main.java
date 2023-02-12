package bankaccount;

public class Main {
    
    public static void main (String[] args) {
        // create new Bank Account
        BankAccount a = new BankAccount("Alex", 500f);
        check(a);

        a.deposit(300f);
        check(a);

        a.withdraw(100f);
        check(a);

        // create new Fixed Deposit Account
        FixedDepositAccount b = new FixedDepositAccount("Betsy", 10000f);
        System.out.println(b.getAccountBalance());
        check(b);
        
        b.deposit(500f);
        check(b);

        b.withdraw(500f);
        check(b);

        b.changeDuration(12);
        check(b);

        b.changeInterest(4f);
        check(b);

        b.changeInterest(6f);
        check(b);
    }

    public static void check(BankAccount acc) {
        System.out.println(acc);
        System.out.println();
    }
}

