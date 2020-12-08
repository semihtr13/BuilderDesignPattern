public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer
                .Builder("Semih")
                .setEmail("semihtr13@gmail.com")
                .setAge("25")
                .buid();
        System.out.printf("Name : %s , Email: %s , Age: %s",customer.getName(),customer.getEmail(),customer.getAge());
    }
}
