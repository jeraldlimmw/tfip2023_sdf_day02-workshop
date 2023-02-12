package bankaccount;

public class FixedDepositAccount extends BankAccount {

    private Float interest;
    private boolean interestChanged = false;
    private Integer durationInMonths;
    private boolean durationChanged = false;

    // calling the FixedDepositAccount constructor with interest fixed at 3.0 and duration at 6
    public FixedDepositAccount(String name, Float balance) {
        this(name, balance, 3f);
    }

    // calling the FixedDepositAccount constructor duration fixed at 6
    public FixedDepositAccount (String name, Float balance, Float interest) {
        this(name, balance, interest, 6);
    }

    public FixedDepositAccount (String name, Float balance, Float interest, Integer duration) {
        super(name, balance); // calling the super class constructor
        this.interest = interest;
        this.durationInMonths = duration;
    }

    public Float getInterest() { return interest; }
    public void setInterest(Float interest) { this.interest = interest; }

    public Integer getDurationInMonths() { return durationInMonths; }
    public void setDurationInMonths(Integer durationInMonths) { this.durationInMonths = durationInMonths; }

    public boolean isDurationChanged() { return durationChanged; }

    
    public void changeInterest(float newInterest) {
        if (interestChanged) {
            throw new IllegalArgumentException("Unable to change interest more than once");
        }
        interest = newInterest;
        interestChanged = true;
    }
    
    public void changeDuration(int newDuration) {
        if (durationChanged) {
            throw new IllegalArgumentException("Unable to change duration more than once");
        }
        durationInMonths = newDuration;
        durationChanged = true;
    }

    @Override
    public void setAccountBalance(float accountBalance) {
        System.out.println("Fixed deposit account balance cannot be changed");
        return;
    }

    @Override
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
