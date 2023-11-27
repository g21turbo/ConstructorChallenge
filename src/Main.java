public class Main {
    public static void main(String[] args) {

        Customer bob = new Customer("Bob", "bob@gmail.com");

        System.out.println("Customer Name: " + bob.getName() + "; Credit Limit: $" + bob.getCreditLimit());

        Customer default1 = new Customer();

        System.out.println("Customer Name: " + default1.getName() + "; Email: " + default1.getEmailAddress() + "; Credit Limit: $" + default1.getCreditLimit());


    }
}