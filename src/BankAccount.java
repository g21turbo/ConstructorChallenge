public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public BankAccount() {
        this("987654321", 700.00, "Default Name", "Default Email", "Default Phone Number");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String customerEmail, String phoneNumber) {
        this("999999", 200.50, customerName, customerEmail, phoneNumber);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String customerEmail, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        setAccountBalance(getAccountBalance() + amount);
        System.out.println("$" + amount + " has been deposited. Your new balance is $" + getAccountBalance());
    }

    public void withdrawalFunds(double amount) {
        if (getAccountBalance() - amount < 0) {
            System.out.println("Unable to withdrawal $" + amount + ". Insufficient Funds");
        } else {
            setAccountBalance(getAccountBalance() - amount);
            System.out.println("$" + amount + " has been withdrawn. Your new balance is $" + getAccountBalance());
        }

    }

}
