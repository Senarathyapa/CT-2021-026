package Q_03;

public class Circle {
    private double r;

    public Circle(){

    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double computeArea(){
        return Math.PI*r*r;
    }

    public double computeCircumference(){
        return 2*Math.PI*r;
    }

}
