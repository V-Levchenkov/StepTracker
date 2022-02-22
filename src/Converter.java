
public class Converter {
    private double Distance;
    private double Call;


    public double getDistance() {
        return Distance;
    }

    public void setDistance(int Sum) {
        Distance = (Sum * 0.075) / 1000;
    }

    public double getCall() {
        return Call;
    }

    public void setCall(float Step) {
        Call = (Step * 50) / 1000;
    }

    public int MaxSteps(int month) {
        StepTracker.MonthToData.get(month);
        int maxSteps = 0;
        for (int i = 0; i < StepTracker.MonthData.MonthSteps.length; i++) {
            if (StepTracker.MonthData.MonthSteps[i] > maxSteps) {
                maxSteps = StepTracker.MonthData.MonthSteps[i];
            }
        }
        return maxSteps;
    }
}
