public class Main {
    public static void main(String[] args) {
        Customer customer1=new Customer
                .Builder("Semih")
                .setEmail("semihtr13@gmail.com")
                .setAge("25")
                .buid();

        System.out.println(customer1);

        Customer customer2=new Customer.Builder()
                .setName("Orhan")
                .setAge("21")
                .buid();


        System.out.println(customer2);
    }
}
