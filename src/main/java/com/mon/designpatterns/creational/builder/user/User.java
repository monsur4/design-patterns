package com.mon.designpatterns.creational.builder.user;

/**
 * Mutable builder using the static mutable Builder inner class
 */
public class User {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;
    private final String address;

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public String email() {
        return email;
    }

    public String phone() {
        return phone;
    }

    public String address() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    private User(String firstName, String lastName, String email, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private String email;
        private String phone;
        private String address;

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public User build(){
            return new User(firstName, lastName, email, phone, address);
        }
    }
}
