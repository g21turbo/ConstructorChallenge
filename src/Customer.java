public class Customer {

    private String Name;
    private String emailAddress;
    private double creditLimit;

    public String getName() {
        return Name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public Customer(String name, String emailAddress, double creditLimit) {
        Name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public Customer() {
        this("Default Name", "Default Email", 0.00);
    }

    public Customer(String name, String emailAddress) {
        this();
        Name = name;
        this.emailAddress = emailAddress;
    }
}
