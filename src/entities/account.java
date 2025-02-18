package entities;

public class account {

    private int accountNumber;
    private String accountName;
    public double withdrawAmount;
    public double depositAmount;
    private double transferAmount;
    public double balance;

    public account(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(double transferAmount) {
        this.transferAmount = transferAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdrawAmount(double withdrawAmount) {
        this.balance = this.balance - withdrawAmount;
    }

    public void depositAmount(double depositAmount) {
        this.balance = this.balance + depositAmount;
    }

    public void transferAmount(double transferAmount) {
        //transferAmount = this.transferAmount + this.balance(accountNumber);
        this.balance = this.balance - transferAmount;

    }

    public String toString() {
        return "Account " + accountName + ", Account Number: " + accountNumber + ", Balance: " + balance;
    }

}

