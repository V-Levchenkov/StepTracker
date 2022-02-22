import java.util.HashMap;

public class StepTracker {
    private int TargetSteps = 10000;
    protected static HashMap<Integer, MonthData> MonthToData = new HashMap<>();
    Converter converter = new Converter();

    public StepTracker() {
        for (int i = 1; i < 13; i++)
            MonthToData.put(i, new MonthData());
    }

    public static void addStepsPerDay(int month, int data, int steps) {
        MonthToData.get(month).addData(data, steps);
    }

    public int getTargetSteps() {
        return TargetSteps;
    }

    public void setTargetSteps(int targetSteps) {
        TargetSteps = targetSteps;
    }

    protected static class MonthData {
        static int[] MonthSteps;

        public MonthData() {
            MonthSteps = new int[30];
        }

        public void addData(int data, int steps) {
            MonthSteps[data - 1] = steps;
        }
    }

    public void PrintAllSteps(int month) {
        MonthToData.get(month);
        for (int i = 0; i < MonthData.MonthSteps.length; i++) {
            System.out.print((i + 1) + " день: " + MonthData.MonthSteps[i] + ", ");
        }
        System.out.println(" ");
        int SumSteps = 0;
        for (int i = 0; i < MonthData.MonthSteps.length; i++) {
            SumSteps = SumSteps + MonthData.MonthSteps[i];
        }
        int goal = 1;
        int MaxGoal = 0;
        for (int i = 0; i < MonthData.MonthSteps.length; i++) {
            if ((MonthData.MonthSteps[i] >= TargetSteps) && (MonthData.MonthSteps[i + 1] >= TargetSteps)) {
                goal++;
                if (goal > MaxGoal) {
                    MaxGoal = goal;
                } else goal = 0;
            }
        }
        converter.setDistance(SumSteps);
        converter.setCall(SumSteps);
        System.out.println("Общее количество шагов за месяц: " + SumSteps);
        System.out.println("Максимальное пройденое количество шагов в месяце : " + converter.MaxSteps(month));
        System.out.println("Среднее количество шагов за месяц: " + (SumSteps / MonthData.MonthSteps.length));
        System.out.println("Пройденная дистанция в км : " + converter.getDistance());
        System.out.println("Количество сожженых Ккаллорий : " + converter.getCall());
        System.out.println("Лучшая серия по выполнению цели: " + MaxGoal + " дня");
    }


}
