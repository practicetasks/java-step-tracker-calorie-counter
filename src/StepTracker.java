import java.util.Scanner;

public class StepTracker {

    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    Converter converter = new Converter();

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Номер вводимого месяца должен быть от 1 до 12");
            return;
        }

        System.out.println("Введите день от 1 до 30 (включительно)");
        int day = scanner.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Номер вводимого дня должен быть от 1 до 30 включительно");
            return;
        }

        System.out.println("Введите количество шагов");
        int step = scanner.nextInt();
        if (step <= 0) {
            System.out.println("Количество шагов должно быть положительным числом");
            return;
        }

        MonthData monthData = monthToData[month - 1];
        monthData.days[day - 1] += step;
    }

    int goalByStepsPerDay = 10000;

    void changeStepGoal() {
        System.out.println("Введите новую цель по количеству шагов в день");
        int newStepGoal = scanner.nextInt();
        if (newStepGoal <= 0) {
            System.out.println("Количество шагов должно быть положительным числом");
            return;
        }
        System.out.println("Новая цель по количеству шагов в день: " + newStepGoal);
        goalByStepsPerDay = newStepGoal;


    }

    void printStatistic() {
        System.out.println("Введите число месяца");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Номер вводимого месяца должен быть от 1 до 12");
            return;
        }

        MonthData monthData = monthToData[month - 1];
        int sumSteps = monthData.sumStepsFromMonth();
        System.out.println("Общее количество шагов за месяц: " + sumSteps);
        System.out.println("Максимальное пройденное количество шагов: " + monthData.maxSteps());
        int averageSteps = sumSteps / monthData.days.length;
        System.out.println("Среднее количество шагов: " + averageSteps);
        System.out.println("Пройденная дистанция (в км): " + converter.convertToKm(sumSteps));
        System.out.println("Количество сожжённых килокалорий: " + converter.convertStepsToKilocalories(sumSteps));
        System.out.println("Лучшая серия: " + monthData.bestSeries(goalByStepsPerDay));

        // вывод суммы шагов за месяц
                // вывод максимального пройденного количества шагов за месяц
                // вывод среднего пройденного количества шагов за месяц
                // вывод пройденной за месяц дистанции в км
                // вывод количества сожжённых килокалорий за месяц
                System.out.println(); //дополнительный перенос строки
    }

}

