package Q_04;

public class Main {
    public static void main(String[] args) {
        Owner yapa=new Owner("yapa","0770088734");
        Bicycle tomahawk=new Bicycle(yapa);

        System.out.println("Owner Name: "+tomahawk.getBicycleOwner().getOwnerName());
        System.out.println("Owner Telephone-No: "+tomahawk.getBicycleOwner().getPhoneNo());
    }
}
