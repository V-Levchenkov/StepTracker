
public class Converter {
    private double distance;
    private double call;


    public double getDistance() {
        return distance;
    }

    public void setDistance(int Sum) {
        distance = (Sum * 0.075) / 1000;
    }

    public double getCall() {
        return call;
    }

    public void setCall(float Step) {
        call = (Step * 50) / 1000;
    }

}
