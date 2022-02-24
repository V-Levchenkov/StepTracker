import java.util.HashMap;

public class StepTracker {
    private int targetSteps = 10000;
    protected HashMap<Integer, MonthData> monthToData = new HashMap<>();
    Converter converter = new Converter();

    public StepTracker() {
        for (int i = 1; i < 13; i++)
            monthToData.put(i, new MonthData());
    }

    public void addStepsPerDay(int month, int data, int steps) {
        monthToData.get(month).addData(data, steps);
    }

    public int getTargetSteps() {
        return targetSteps;
    }

    public void setTargetSteps(int targetStep) {
        targetSteps = targetStep;
    }

    public static class MonthData {
        int[] monthSteps;

        public MonthData() {
            monthSteps = new int[30];
        }

        public void addData(int data, int steps) {
            monthSteps[data - 1] = steps;
        }
    }

    public int maxSteps(int month) {
        MonthData monthData = monthToData.get(month);
        int maxSteps = 0;
        for (int i = 0; i < monthData.monthSteps.length; i++) {
            if (monthData.monthSteps[i] > maxSteps) {
                maxSteps = monthData.monthSteps[i];
            }
        }
        return maxSteps;
    }

    public void printAllSteps(int month) {
        MonthData monthData = monthToData.get(month);
        for (int i = 0; i < monthData.monthSteps.length; i++) {
            System.out.print((i + 1) + " день: " + monthData.monthSteps[i] + ", ");
        }
        System.out.println(" ");
        int sumSteps = 0;
        for (int i = 0; i < monthData.monthSteps.length; i++) {
            sumSteps = sumSteps + monthData.monthSteps[i];
        }
        int goal = 1;
        int maxGoal = 0;
        for (int i = 0; i < monthData.monthSteps.length; i++) {
            if ((monthData.monthSteps[i] >= targetSteps) && (monthData.monthSteps[i + 1] >= targetSteps)) {
                goal++;
                if (goal > maxGoal) {
                    maxGoal = goal;
                } else goal = 0;
            }
        }

        converter.setDistance(sumSteps);
        converter.setCall(sumSteps);
        System.out.println("Общее количество шагов за месяц: " + sumSteps);
        System.out.println("Максимальное пройденое количество шагов в месяце : " + maxSteps(month));
        System.out.println("Среднее количество шагов за месяц: " + (sumSteps / monthData.monthSteps.length));
        System.out.println("Пройденная дистанция в км : " + converter.getDistance());
        System.out.println("Количество сожженых Ккаллорий : " + converter.getCall());
        System.out.println("Лучшая серия по выполнению цели: " + maxGoal + " дня");
    }
}
