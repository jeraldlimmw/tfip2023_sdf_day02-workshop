package bankaccount;

public class Main {
    
    public static void main (String[] args) {
        BankAccount a = new BankAccount("Alex", 500f);
        check(a);

        a.deposit(300f);
        check(a);

        a.withdraw(100f);
        check(a);

        FixedDepositAccount b = new FixedDepositAccount("Betsy", 10000f, 4f, 6);
        check(b);
        
        b.deposit(500f);
        check(b);

        b.withdraw(500f);
        check(b);

        b.changeDuration();
        check(b);

        b.changeDuration();
        check(b);
    }

    public static void check(BankAccount acc) {
        System.out.println(acc);
        System.out.println();
    }
}

