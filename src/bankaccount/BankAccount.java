package bankaccount;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BankAccount {
    
    private String accountHolderName;
    private String accountNo;
    private Float accountBalance;
    private List<String> transactions;
    private boolean closed = false;
    private Date dateCreated;
    private Date dateClosed;
    Date currDate;

    public BankAccount(String name) {
        this.accountHolderName = name;
        this.accountNo = accountNoGenerator();
        this.accountBalance = 0f;
        this.transactions = new LinkedList<>();
        this.dateCreated = setDateTime();
    }

    public BankAccount(String name, Float balance) {
        this(name); // calling constructor
        this.accountBalance = balance;
    }

    // Account holder name and account number are read only. Cannot have setter.
    public String getAccountHolderName() { return accountHolderName; }
    public String getAccountNo() { return accountNo; }

    public float getAccountBalance() { return accountBalance; }
    public void setAccountBalance(float accountBalance) { this.accountBalance = accountBalance; }

    public List<String> getTransactions() { return transactions; }
    public void setTransactions(List<String> transactions) { this.transactions = transactions; }

    public boolean isClosed() { return closed; }
    public void setClosed() { this.closed = true; }

    public Date getDateCreated() { return dateCreated; }
    public void setDateCreated(Date dateCreated) { this.dateCreated = dateCreated; }

    public Date getDateClosed() { return dateClosed; }
    public void setDateClosed(Date dateClosed) { this.dateClosed = dateClosed; }

    public String accountNoGenerator() {
        Random rand = new Random();
        int n = rand.nextInt(100000000);
        return Integer.toString(n);
    }
    
    public Date setDateTime() {
        currDate = new Date();
        return currDate;
    }

    public void deposit(float amount) {
        if (amount < 0 || isClosed()) {
            throw new IllegalArgumentException();
        }
        accountBalance += amount;
        transactions.add("deposit $" + amount + " at <" + setDateTime() + ">");
    }

    public void withdraw(float amount) {
        if (amount < 0 || isClosed()) {
            throw new IllegalArgumentException();
        }
        accountBalance -= amount;
        transactions.add("withdraw $" + amount + " at <" + setDateTime() + ">");
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); 
        
        if (!isClosed()){
            String strDateCreated = dateFormat.format(dateCreated);
            return "BankAccount [accountHolderName=" + accountHolderName + ", accountNo=" + accountNo + ", accountBalance="
                    + accountBalance + ", transactions=" + transactions + ", dateCreated="
                    + strDateCreated + "]";
        } else {
            String strDateClosed = dateFormat.format(dateClosed);
            return "Bank Account closed on " + strDateClosed;
        }
    }

    
}
