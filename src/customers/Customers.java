package customers;

public class Customers {
    private int id;
    private String LastName;
    private String FirstName;
    private String SurName;
    private String Address;
    private long CardNumber;
    private double Balance;

    public Customers(int id, String lastName, String firstName, String surName, String address, long cardNumber, double balance) {
        this.id = id;
        this.LastName = lastName;
        this.FirstName = firstName;
        this.SurName = surName;
        this.Address = address;
        this.CardNumber = cardNumber;
        this.Balance = balance;
    }
    public int getId() {
        return id;
    }
    public String getLastName() {
        return LastName;
    }
    public String getFirstName() {
        return FirstName;
    }
    public String getSurName() {
        return SurName;
    }
    public String getAddress() {
        return Address;
    }
    public long getCardNumber() {
        return CardNumber;
    }
    public double getBalance() {
        return Balance;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public void setSurName(String surName) {
        SurName = surName;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public void setCardNumber(long cardNumber) {
        CardNumber = cardNumber;
    }
    public void setBalance(double balance) {
        Balance = balance;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", LastName='" + LastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", SurName='" + SurName + '\'' +
                ", Address='" + Address + '\'' +
                ", CardNumber=" + CardNumber +
                ", Balance=" + Balance +
                '}';
    }
}
