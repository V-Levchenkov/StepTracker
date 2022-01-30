import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Введите необходимый день");
                int day = scanner.nextInt();
                System.out.println("Выберете месяц");
                int month = scanner.nextInt();
//Ввести количество шагов за определённый день;
            } else if (command == 2) {
//Напечатать статистику за определённый месяц;
            } else if (command == 3) {
//Изменить цель по количеству шагов в день;
            } else if (command == 4) {
       //Выйти из приложения.
                break;
            }  else {
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