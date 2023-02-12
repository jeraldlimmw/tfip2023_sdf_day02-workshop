package bankaccount;

public class FixedDepositAccount extends BankAccount {

    private Float interest;
    private Integer durationInMonths;
    private boolean durationChanged;

    public FixedDepositAccount(String name, Float balance) {
        super(name, balance); // calling the super class constructor
        this.interest = null;
        this.durationInMonths = null;
        this. durationChanged = false;
    }

    // calling the FixedDepositAccount constructor and then changing interest
    public FixedDepositAccount (String name, Float balance, Float interest) {
        this(name, balance); 
        this.interest = interest;
    }

    // calling the FixedDepositAccount constructor and then changing interest and duration
    public FixedDepositAccount (String name, Float balance, Float interest, Integer duration) {
        this(name, balance); 
        this.interest = interest;
        this.durationInMonths = duration;
    }

    public void changeDuration() {
        if (durationChanged) {
            throw new IllegalArgumentException("Unable to change duration more than once");
        }
        if (durationInMonths == 3) {
            durationInMonths = 6;
            System.out.println("Fixed deposit duration changed from 3 months to 6 months");
        }
        if (durationInMonths == 6) {
            durationInMonths = 3;
            System.out.println("Fixed deposit duration changed from 6 months to 3 months");
        }
        durationChanged = true;
    }

    public float getAccountBalance() {
        return super.getAccountBalance() * (1f + (interest/100));
    }

    @Override
    public void deposit(float amount){
        System.out.println("Fixed deposit accounts cannot accept deposits");
        return;
    }

    @Override
    public void withdraw(float amount){
        System.out.println("Fixed deposit accounts cannot allow withdrawals");
        return;
    }
}
