public class Customer {
    private String name;
    private String email;
    private String age;

    public Customer(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }

    public static class Builder {
        private String name;
        private String email;
        private String age;


        public Builder() {

        }

        /**
         * @param name Required field
         */
        public Builder(String name) {
            this.name = name;
        }

        /**
         * @param name Required field
         */
        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        /**
         * @param name Optional Field
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * @param email Optional field
         */
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        /**
         * @param age Optional Field
         */
        public Builder setAge(String age) {
            this.age = age;
            return this;
        }

        public Customer buid() {
            return new Customer(this);
        }

    }

    @Override
    public String toString() {
        return String.format("Customer { Name : %s , Email: %s , Age: %s }",this.name,this.email,this.age);
    }
}
