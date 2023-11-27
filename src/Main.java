public class Main {
    public static void main(String[] args) {

        Customer bob = new Customer("Bob", "bob@gmail.com");

        System.out.println("Customer Name: " + bob.getName() + "; Credit Limit: $" + bob.getCreditLimit());

    }
}