package Model;

public class Student {
    private String Name;
    private String Address;

    private Subject subject;

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", subject=" + subject +
                '}';
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Student(){;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Student(String Name , String Address){

    }

}
