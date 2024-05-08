package Model;

public class Address {
    private String Street;
    private String state;
    private String city;
    private long pin;


    public Address(String Street, String city, String state, long pin){
        this.Street = Street;
        this.state = state;
        this.city = city;
        this.pin = pin;
    }
    public Address(){
    }
    public long getPin() {
        return pin;
    }
    public void setPin(long pin) {
        this.pin = pin;
    }
    public void setStreet(String street) {
        Street = street;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return Street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Street='" + Street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

}
