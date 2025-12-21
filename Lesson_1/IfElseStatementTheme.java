import java.math.BigDecimal;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA");

        boolean maleGender = false;

        if (!maleGender) {
            System.out.println("Пол: женский.");
        } else {
            System.out.println("Пол: мужской.");
        }

        int age = 25;

        if (age > 18) {
            System.out.println("Возраст: " + age + " лет. Достиг совершеннолетия.");
        } else {
            System.out.println("Возраст: " + age + " лет. Не достиг совершеннолетия.");
        }

        float height = 1.75f;

        if (height < 1.8f) {
            System.out.println("Рост: " + height + " м. Ниже 1.8 м.");
        } else {
            System.out.println("Рост: " + height + " м. Не ниже 1.8 м.");
        }

        System.out.println("\n2. ПОИСК БОЛЬШЕГО ЧИСЛА ШАГОВ");

        int stepsYesterday = 8500;
        int stepsToday = 10200;

        System.out.println("Вчера: " + stepsYesterday + " шагов.");
        System.out.println("Сегодня: " + stepsToday + " шагов.");

        if (stepsToday > stepsYesterday) {
            System.out.println("Сегодня шагов сделано больше.");
        } else if (stepsToday < stepsYesterday) {
            System.out.println("Вчера шагов сделано больше.");
        } else {
            System.out.println("Количество шагов одинаковое.");
        }

        double averageSteps = (stepsYesterday + stepsToday) / 2.0;
        System.out.println("Среднее: " + averageSteps + " шагов.");

        System.out.println("\n3. ПРОВЕРКА КОЛИЧЕСТВА ГОСТЕЙ");

        int guestCount = 11;

        if (guestCount == 0) {
            System.out.println("Пока никто не записался на мероприятие!");
        } else if (guestCount < 0) {
            System.out.println("Ошибка: количество гостей не может быть отрицательным.");
        } else {
            String startMessage = "Записалось " + guestCount + " гостей. ";
            if (guestCount % 2 == 0) {
                System.out.println(startMessage + "Можно формировать пары для конкурсов.");
            } else {
                System.out.println(startMessage + "Нужны индивидуальные задания.");
            }
        }

        System.out.println("\n4. ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА");

        String nickname = "Andrei";

        char firstChar = nickname.charAt(0);

        // Способ 1: с помощью диапазонов символов
        System.out.println("Способ 1 (через диапазоны):");
        System.out.print("Имя " + nickname + " начинается с");
        if (firstChar >= 'a' && firstChar <= 'z') {
            System.out.println("маленькой буквы '" + firstChar + "'");
        } else if (firstChar >= 'A' && firstChar <= 'Z') {
            System.out.println("большой буквы '" + firstChar + "'");
        } else if (firstChar >= '0' && firstChar <= '9') {
            System.out.println("цифры '" + firstChar + "'");
        } else {
            System.out.println("с символа '" + firstChar + "'");
        }

        System.out.println("Способ 2 (через Character.is...):");
        System.out.print("Имя " + nickname + " начинается с");
        if (Character.isLowerCase(firstChar)) {
            System.out.println("маленькой буквы '" + firstChar + "'");
        } else if (Character.isUpperCase(firstChar)) {
            System.out.println("большой буквы '" + firstChar + "'");
        } else if (Character.isDigit(firstChar)) {
            System.out.println("цифры '" + firstChar + "'");
        } else {
            System.out.println("символа '" + firstChar + "'\n");
        }

        System.out.println("\n5. ИНВЕНТАРИЗАЦИЯ");

        int snFromDb = 200;
        int snOnDevice = 201;

        if (snFromDb == snOnDevice) {
            System.out.println("[№" + snFromDb + "]: компьютер на 3-м этаже в кабинете 2");
        } else {
            boolean isEqualOnes = (snFromDb % 10) == (snOnDevice % 10);
            boolean isEqualTens = (snFromDb / 10 % 10) == (snOnDevice / 10 % 10);
            boolean isEqualHundreds = (snFromDb / 100 ) == (snOnDevice / 100);

            if (!isEqualHundreds && !isEqualTens && !isEqualOnes) {
                System.out.println("[№" + snOnDevice + "]: оборудование не идентифицировано");
            } else {
                System.out.printf("""
                        Нет полного совпадения:
                        База данных: [№%d]
                        Фактический: [№%s%s%s]""", snFromDb,
                        isEqualHundreds ? snOnDevice / 100 : "_",
                        isEqualTens ? snOnDevice / 10 % 10 : "_",
                        isEqualOnes ? snOnDevice % 10 : "_");
            }
        }

        System.out.println("\n\n6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");

        // Способ 1: float
        float deposit = 321123.79f;
        float rate = 0.1f;
        if (deposit < 100000) {
            rate = 0.05f;
        } else if (deposit <= 300000) {
            rate = 0.07f;
        }
        float interest = deposit * rate;
        float total = deposit + interest;

        System.out.printf("""
                    Способ 1 (float):
                    Сумма вклада: %.2f руб.
                    Начисленные %%: %.2f руб.
                    Итого: %.2f руб.
                    """, deposit, interest, total);

        // Способ 2: BigDecimal
        BigDecimal depositBd = new BigDecimal("321123.79");
        BigDecimal rateBd = new BigDecimal("0.10");
        if (depositBd.compareTo(new BigDecimal("100000")) < 0) {
            rateBd = new BigDecimal("0.05");
        } else if (depositBd.compareTo(new BigDecimal("300000")) <= 0) {
            rateBd = new BigDecimal("0.07");
        }

        BigDecimal interestBd =
                depositBd.multiply(rateBd).setScale(2, java.math.RoundingMode.HALF_UP);
        BigDecimal totalBd = depositBd.add(interestBd).setScale(2, java.math.RoundingMode.HALF_UP);

        System.out.printf("""
                Способ 2 (BigDecimal):
                Сумма вклада: %s руб.
                Начисленные %%: %s руб.
                Итого: %s руб.
                """, depositBd, interestBd, totalBd);

        System.out.println("\n7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ");

        double historyPercent = 59.0;
        int historyGrade = 2;

        if (historyPercent > 91) {
            historyGrade = 5;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        }

        double programmingPercent = 92.0;
        int programmingGrade = 2;

        if (programmingPercent > 91) {
            programmingGrade = 5;
        } else if (programmingPercent > 73) {
            programmingGrade = 4;
        } else if (programmingPercent > 60) {
            programmingGrade = 3;
        }

        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + programmingGrade);

        double averageGrade = (historyGrade + programmingGrade) / 2.0;
        double averagePercent = (historyPercent + programmingPercent) / 2.0;

        System.out.println("Средний балл: " + averageGrade);
        System.out.println("Средний %: " + averagePercent + "%");

        System.out.println("\n8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");

        BigDecimal monthlyRevenue = new BigDecimal("13025.233");
        BigDecimal monthlyRent = new BigDecimal("5123.018");
        BigDecimal monthlyCost = new BigDecimal("9001.729");

        BigDecimal yearlyProfit = monthlyRevenue
                .subtract(monthlyRent)
                .subtract(monthlyCost)
                .multiply(BigDecimal.valueOf(12))
                .setScale(2, java.math.RoundingMode.HALF_UP);

        String sign = yearlyProfit.compareTo(java.math.BigDecimal.ZERO) > 0 ? "+" : "";

        System.out.println("Прибыль за год: " + sign + yearlyProfit + " руб.");
    }
}
