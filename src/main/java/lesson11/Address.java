package lesson11;

public class Address {
    private String address1;
    private String city;
    private String zip;
    private State state;




    public Address(String address1, String city, String zip, State state) {
        this.address1 = address1;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }



    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString(){
        return "Address: "+address1+", "+city+", "+state+", "+zip;
    }
}
