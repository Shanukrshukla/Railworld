package Model;
public class Employee {
    private String Name;
    private Address address;

    public Employee(){

    }

    public String getName() {
        return Name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", address=" + address +
                '}';
    }

    public Employee (String Name, Address address){
        this.Name = Name;
        this.address = address;
    }
}