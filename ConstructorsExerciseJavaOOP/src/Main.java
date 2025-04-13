public class Main {

    public static void main(String[] args) {

        //testing constructor with only 2 args
        Customer customer1 = new Customer("Test",  "test@gmail.com");

        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmailAdress());

        //testing constructor with 0 args
        Customer customer2 = new Customer();

        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAdress());

        //testing constructor with 3 args
        Customer customer3 = new Customer("John", 1600700, "john@gmail.com");

        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmailAdress());
    }
}
