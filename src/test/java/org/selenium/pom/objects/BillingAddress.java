package org.selenium.pom.objects;

public class BillingAddress {

    private String firstName;
    private String lastName;
    private String countryName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String emailId;

    public BillingAddress() {}

//    public BillingAddress(String firstName, String lastName, String countryName, String streetAddress, String city,
//                          String state, String zipCode, String emailId)
//    {
//
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.countryName = countryName;
//        this.streetAddress = streetAddress;
//        this.city = city;
//        this.state= state;
//        this.zipCode = zipCode;
//        this.emailId= emailId;
//    }

    public String getFirstName() {
        return firstName;
    }

    public BillingAddress setFirstName(String firstName) {
        this.firstName = firstName;
        return this;

    }

    public String getLastName() {
        return lastName;
    }

    public BillingAddress setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getCountryName() {
        return countryName;
    }

    public BillingAddress setCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public BillingAddress setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }

    public String getCity() {
        return city;
    }

    public BillingAddress setCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public BillingAddress setState(String state) {
        this.state = state;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public BillingAddress setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public String getEmailId() {
        return emailId;
    }

    public BillingAddress setEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

}
