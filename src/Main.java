public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Jane", "Jane@gmail.com", 1000.00);

        System.out.println("Customer Name: " + customer.getName() + "; Email: " + customer.getEmailAddress() + "; Credit Limit: $" + customer.getCreditLimit());

        Customer bob = new Customer("Bob", "bob@gmail.com");

        System.out.println("Customer Name: " + bob.getName() + "; Credit Limit: $" + bob.getCreditLimit());

        Customer default1 = new Customer();

        System.out.println("Customer Name: " + default1.getName() + "; Email: " + default1.getEmailAddress() + "; Credit Limit: $" + default1.getCreditLimit());


    }
}