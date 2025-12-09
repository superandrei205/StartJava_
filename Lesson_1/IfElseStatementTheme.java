import java.math.BigDecimal;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        // Задание 1: ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA
        System.out.println("1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA");

        boolean maleGender = false;
        int age = 25;
        double height = 1.75;

        if (!maleGender) {
            System.out.println("Пол: женский.");
        } else {
            System.out.println("Пол: мужской.");
        }

        if (age > 18) {
            System.out.println("Возраст: " + age + " лет. Достиг совершеннолетия.");
        } else {
            System.out.println("Возраст: " + age + " лет. Не достиг совершеннолетия.");
        }

        if (height < 1.8) {
            System.out.println("Рост: " + height + " м. Ниже 1.8 м.");
        } else {
            System.out.println("Рост: " + height + " м. Не ниже 1.8 м.");
        }

        System.out.println();

        // Задание 2: ПОИСК БОЛЬШЕГО ЧИСЛА ШАГОВ
        System.out.println("2. ПОИСК БОЛЬШЕГО ЧИСЛА ШАГОВ");

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

        System.out.println();

        // Задание 3: ПРОВЕРКА КОЛИЧЕСТВА ГОСТЕЙ
        System.out.println("3. ПРОВЕРКА КОЛИЧЕСТВА ГОСТЕЙ");

        int guests = 11;

        if (guests == 0) {
            System.out.println("Пока никто не записался на мероприятие!");
        } else if (guests < 0) {
            System.out.println("Ошибка: количество гостей не может быть отрицательным.");
        } else if (guests % 2 == 0) {
            System.out.println("Записалось " + guests + " гостей. Можно формировать пары для конкурсов.");
        } else {
            System.out.println("Записалось " + guests + " гостей. Нужны индивидуальные задания.");
        }

        System.out.println();

        // Задание 4: ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА
        System.out.println("4. ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА");

        String nickname = "Andrei";

        char firstChar = nickname.charAt(0);

        // Способ 1: с помощью диапазонов символов
        System.out.println("Способ 1 (через диапазоны):");
        if (firstChar >= 'a' && firstChar <= 'z') {
            System.out.println("Имя " + nickname + " начинается с маленькой буквы '" + firstChar + "'");
        } else if (firstChar >= 'A' && firstChar <= 'Z') {
            System.out.println("Имя " + nickname + " начинается с большой буквы '" + firstChar + "'");
        } else if (firstChar >= '0' && firstChar <= '9') {
            System.out.println("Имя " + nickname + " начинается с цифры '" + firstChar + "'");
        } else {
            System.out.println("Имя " + nickname + " начинается с символа '" + firstChar + "'");
        }

        // Способ 2: с помощью Character.is...
        System.out.println("Способ 2 (через Character.is...):");
        if (Character.isLowerCase(firstChar)) {
            System.out.println("Имя " + nickname + " начинается с маленькой буквы '" + firstChar + "'");
        } else if (Character.isUpperCase(firstChar)) {
            System.out.println("Имя " + nickname + " начинается с большой буквы '" + firstChar + "'");
        } else if (Character.isDigit(firstChar)) {
            System.out.println("Имя " + nickname + " начинается с цифры '" + firstChar + "'");
        } else {
            System.out.println("Имя " + nickname + " начинается с символа '" + firstChar + "'");
        }

        System.out.println();

        // Задание 5: ИНВЕНТАРИЗАЦИЯ
        System.out.println("5. ИНВЕНТАРИЗАЦИЯ");

        int serialFromDb = 567;
        int serialOnDevice = 567;

        if (serialFromDb == serialOnDevice) {
            System.out.println("[№" + serialFromDb + "]: компьютер на 3-м этаже в кабинете 2");
        } else {
            // Поразрядная проверка
            int hundredsMatch = (serialFromDb / 100 == serialOnDevice / 100) ? 1 : 0;
            int tensMatch = ((serialFromDb / 10) % 10 == (serialOnDevice / 10) % 10) ? 1 : 0;
            int unitsMatch = (serialFromDb % 10 == serialOnDevice % 10) ? 1 : 0;

            int matches = hundredsMatch + tensMatch + unitsMatch;

            if (matches == 0) {
                System.out.println("[№" + serialOnDevice + "]: оборудование не идентифицировано");
            } else {
                String details = """
                        [№%d]: частичное совпадение — %d цифры(ра) совпадает(ют)
                        Совпадение сотен: %s
                        Совпадение десятков: %s
                        Совпадение единиц: %s
                        """.formatted(
                        serialOnDevice,
                        matches,
                        hundredsMatch == 1 ? "да" : "нет",
                        tensMatch == 1 ? "да" : "нет",
                        unitsMatch == 1 ? "да" : "нет"
                );
                System.out.print(details);
            }
        }

        System.out.println();

        // Задание 6: ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %
        System.out.println("6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");

        // Способ 1: float
        float deposit = 321123.79f;
        float rate;
        if (deposit < 100000) {
            rate = 0.05f;
        } else if (deposit <= 300000) {
            rate = 0.07f;
        } else {
            rate = 0.10f;
        }
        float interest = deposit * rate;
        float total = deposit + interest;

        System.out.println("Способ 1 (float):");
        System.out.println("Сумма вклада: " + deposit + " руб.");
        System.out.println("Начисленные %: " + interest + " руб.");
        System.out.println("Итого: " + total + " руб.");

        // Способ 2: BigDecimal
        BigDecimal depositBd = new BigDecimal("321123.79");
        BigDecimal rateBd;
        if (depositBd.compareTo(new java.math.BigDecimal("100000")) < 0) {
            rateBd = new java.math.BigDecimal("0.05");
        } else if (depositBd.compareTo(new java.math.BigDecimal("300000")) <= 0) {
            rateBd = new java.math.BigDecimal("0.07");
        } else {
            rateBd = new java.math.BigDecimal("0.10");
        }

        java.math.BigDecimal interestBd =
                depositBd.multiply(rateBd).setScale(2, java.math.RoundingMode.HALF_UP);
        java.math.BigDecimal totalBd = depositBd.add(interestBd).setScale(2, java.math.RoundingMode.HALF_UP);

        System.out.println("Способ 2 (BigDecimal):");
        System.out.println("Сумма вклада: " + depositBd + " руб.");
        System.out.println("Начисленные %: " + interestBd + " руб.");
        System.out.println("Итого: " + totalBd + " руб.");

        System.out.println();

        // Задание 7: ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ
        System.out.println("7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ");

        double historyPercent = 59.0;
        double programmingPercent = 92.0;

        int historyGrade;
        if (historyPercent > 91) {
            historyGrade = 5;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        } else {
            historyGrade = 2;
        }

        int programmingGrade;
        if (programmingPercent > 91) {
            programmingGrade = 5;
        } else if (programmingPercent > 73) {
            programmingGrade = 4;
        } else if (programmingPercent > 60) {
            programmingGrade = 3;
        } else {
            programmingGrade = 2;
        }

        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + programmingGrade);

        double averageGrade = (historyGrade + programmingGrade) / 2.0;
        double averagePercent = (historyPercent + programmingPercent) / 2.0;

        System.out.println("Средний балл: " + averageGrade);
        System.out.println("Средний %: " + averagePercent + "%");

        System.out.println();

        // Задание 8: РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ
        System.out.println("8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");

        BigDecimal monthlyRevenue = new BigDecimal("13025.233");
        BigDecimal monthlyRent = new BigDecimal("5123.018");
        BigDecimal monthlyCost = new BigDecimal("9001.729");

        java.math.BigDecimal monthlyProfit = monthlyRevenue
                .subtract(monthlyRent)
                .subtract(monthlyCost);

        java.math.BigDecimal yearlyProfit = monthlyProfit.multiply(java.math.BigDecimal.valueOf(12))
                .setScale(2, java.math.RoundingMode.HALF_UP);

        String sign = yearlyProfit.compareTo(java.math.BigDecimal.ZERO) > 0 ? "+" : "";

        System.out.println("Прибыль за год: " + sign + yearlyProfit + " руб.");
    }
}