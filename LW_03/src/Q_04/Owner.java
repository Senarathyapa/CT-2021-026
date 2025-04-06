package Q_04;

public class Owner {
    //Data Member
    private String ownerName;
    private String phoneNo;

    //Constructor: Initializes the data member
    public Owner(String ownerName, String phoneNo) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String name) {
        ownerName = name;
    }
    public String getPhoneNo() {
        return phoneNo;
    }

   public void setownerName(String ownerName){
        this.ownerName=ownerName;
   }

    public void setPhoneNo(String num) {
        phoneNo =phoneNo;
    }
}
