import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {

            } else if (command == 2) {

            } else if (command == 3) {

            } else if (command == 4) {
                break;
            } else if (command == 5) {


            } else {
                System.out.println("Введена неверная команда");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Конвертировать валюту");
        System.out.println("2 - Получить совет");
        System.out.println("3 - Ввести трату");
        System.out.println("4 - Показать траты по категориям");
    }
}