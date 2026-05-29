import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();

            int command = scanner.nextInt();

            if (command == 1) {
                // здесь будет логика команды 1
            } else if (command == 2) {
                // здесь будет логика команды 2
            } else if (command == 3) {
                // здесь будет логика команды 3
            } else if (command == 4) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        // ввод и проверка номера месяца

        System.out.println("Введите день от 1 до 30 (включительно)");
        // ввод и проверка дня

        System.out.println("Введите количество шагов");
        // ввод и проверка количества шагов

        // Получение соответствующего объекта MonthData из массива
        MonthData monthData = ...
        // Сохранение полученных данных
        monthData.days[...] = ...
    }

    static void printMenu () {
        System.out.println("\n==== МЕНЮ ====");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Изменить цель по количеству шагов в день");
        System.out.println("3 - Напечатать статистику за определённый месяц");
        System.out.println("0 - Выйти из приложения");
    }

}