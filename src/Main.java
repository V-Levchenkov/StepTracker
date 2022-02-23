import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Выберете месяц");
                int month = scanner.nextInt();
                System.out.println("Введите необходимый день");
                int day = scanner.nextInt();
                System.out.println("Введите количество шагов");
                int steps;
                steps = scanner.nextInt();
                stepTracker.addStepsPerDay(month, day, steps);
                // Ввести количество шагов за определённый день;
            } else if (command == 2) {
                System.out.println("Виберите требуемый месяц : 1 - январь, 12 - декабрь");
                int monthCheck = scanner.nextInt();
                stepTracker.printAllSteps(monthCheck);
                //Напечатать статистику за определённый месяц;
            } else if (command == 3) {
                System.out.println("Введите новую цель по шагам в день(число не должно быть отрицательным)");
                int target = scanner.nextInt();
                stepTracker.setTargetSteps(target);
                System.out.println("Новая цель: " + stepTracker.getTargetSteps());
                //Изменить цель по количеству шагов в день;
            } else if (command == 4) {
                //Выйти из приложения.
                break;
            } else {
                System.out.println("Введена неверная команда");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Выберите действие :");
        System.out.println("1 - Внести количество шагов за определенный день");
        System.out.println("2 - Напечатать статистику за определенный месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("4 - Выйти из приложения     ");
    }
}