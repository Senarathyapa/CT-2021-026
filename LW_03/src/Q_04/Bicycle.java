package Q_04;

public class Bicycle {
    Owner bicycleOwner;

    public Bicycle(Owner bicycleOwner) {
        this.bicycleOwner = bicycleOwner;
    }

    public Owner getBicycleOwner() {
        return bicycleOwner;
    }

    public void setBicycleOwner(Owner bicycleOwner) {
        this.bicycleOwner = bicycleOwner;
    }
}
