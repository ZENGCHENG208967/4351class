package Classes;

/**
 *
 * @author new
 */
public class Passenger {
    private Name fullName;
    private Address homeAddress;
    private String telNum;

    public Passenger() {

        fullName = new Name();
        homeAddress = new Address();
        this.telNum = "";
    }

    public Passenger(Name fullName, Address homeAddress, String telNum) {
        this.fullName = fullName;
        this.homeAddress = homeAddress;
        this.telNum = telNum;
    }

    public void setName(Name fullName) {
        this.fullName = fullName;
    }

    public void setAddress(Address homeAddress) {
        this.homwAddress = homeAddress;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public Name getName() {
        return  FullName;
    }

    public Address getAddress() {
        return homeAddress;
    }
    
    public String getTelNum() {
        return telNum;
    }

    @Override
    public String toString() {
        return name + "@" + homeAddress + "@" + telNum;
    }


}
