public class Customer {
    private String name;
    private String contactInfo;
    //constructor//
    public Customer(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getName() { return name; }
    public String getContactInfo() { return contactInfo; }
}
