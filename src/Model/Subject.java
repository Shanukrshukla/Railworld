package Model;

import java.util.PrimitiveIterator;

public class Subject {
    private String maths;
    private String science;
    private String commerce;

    public Subject(String maths ,String science,String commerce){
        this.maths= maths;
        this.science = science;
        this.commerce = commerce;

    }
    public Subject(){
    }

    public String getMaths() {
        return maths;
    }

    public void setMaths(String maths) {
        this.maths = maths;
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }

    public String getCommerce() {
        return commerce;
    }

    public void setCommerce(String commerce) {
        this.commerce = commerce;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "maths='" + maths + '\'' +
                ", science='" + science + '\'' +
                ", commerce='" + commerce + '\'' +
                '}';
    }
}
