import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.FileSystems;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        long startNano = System.nanoTime();
        LocalTime startTime = LocalTime.now();

        System.out.println("\n1. ВЫВОД ASCII-ГРАФИКИ");

        System.out.println(String.join("\n",
                "            /\\",
                "      J    /  \\  v     v  a",
                "      J   /_( )\\  v   v  a a",
                "   J  J  /      \\  V V  aaaaa",
                "    JJ  /___/\\___\\  V  a     a"
        ));
        System.out.println();

        System.out.println("""
                         /\\
                   J    /  \\  v     v  a
                   J   /_( )\\  v   v  a a
                J  J  /      \\  V V  aaaaa
                 JJ  /___/\\___\\  V  a     a""");

        System.out.println("\n2. РАСЧЕТ СТОИМОСТИ ТОВАРА\n");

        float penCost = 105.5f;
        float bookCost = 235.23f;
        float basePrice = penCost + bookCost;
        float discount = basePrice * 0.11f;
        float discountPrice = basePrice - discount;

        System.out.println("Стоимость без скидки: " + basePrice + " руб.");
        System.out.println("Сумма скидки: " + discount + " руб.");
        System.out.println("Стоимость со скидкой: " + discountPrice + " руб.\n");

        BigDecimal penCostBd = BigDecimal.valueOf(105.5);
        BigDecimal bookCostBd = BigDecimal.valueOf(235.23);
        BigDecimal totalBeforeDiscountBd = penCostBd.add(bookCostBd);
        BigDecimal discountRate = BigDecimal.valueOf(0.11);
        BigDecimal discountBd = totalBeforeDiscountBd.multiply(discountRate)
                .divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
        BigDecimal discountPriceBd = totalBeforeDiscountBd.subtract(discountBd);

        System.out.println("Стоимость без скидки (Bd): " + totalBeforeDiscountBd + " руб.");
        System.out.println("Сумма скидки (Bd): " + discountBd + " руб.");
        System.out.println("Стоимость со скидкой (Bd): " + discountPriceBd + " руб.");

        System.out.println("\n3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ\n");

        int a1 = 2;
        int b1 = 5;
        System.out.println("Исходные значения: A1 = " + a1 + ", B1 = " + b1);

        System.out.println("\nМетод: с третьей переменной");
        int temp = a1;
        a1 = b1;
        b1 = temp;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);

        System.out.println("\nМетод: арифметические операции");
        a1 += b1;
        b1 = a1 - b1;
        a1 -= b1;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);

        System.out.println("\nМетод: побитовый XOR");
        a1 ^= b1;
        b1 ^= a1;
        a1 ^= b1;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);

        System.out.println("\n4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ\n");

        int c1 = 1055;
        int c2 = 1088;
        int c3 = 1080;
        int c4 = 1074;
        int c5 = 1077;
        int c6 = 1090;

        System.out.printf("%6d%6d%6d%6d%6d%6d%n", c1, c2, c3, c4, c5, c6);
        System.out.printf("%6c%6c%6c%6c%6c%6c%n", c1, c2, c3, c4, c5, c6);

        System.out.println("\n5. АНАЛИЗ КОДА ТОВАРА\n");

        int code = 123;
        int category = code / 100;
        int subcategory = (code / 10) % 10;
        int packageType = code % 10;
        int checksum = category + subcategory + packageType;
        int verifyCode = category * subcategory * packageType;

        System.out.printf("""
                Код товара: %d
                  категория товара - %d
                  подкатегория - %d
                  тип упаковки - %d
                Контрольная сумма = %d
                Проверочный код = %d
                """,
                code, category, subcategory, packageType, checksum, verifyCode);

        System.out.println("\n6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ\n");

        byte temperature = Byte.MAX_VALUE;
        System.out.printf("""
                [Температура, °C]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """,
                temperature,
                ++temperature,
                --temperature);
        System.out.println();

        short pressure = Short.MAX_VALUE;
        System.out.printf("""
                [Давление, Па]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """,
                pressure,
                ++pressure,
                --pressure);
        System.out.println();

        char systemStatus = Character.MAX_VALUE;
        System.out.printf("""
                [Код состояния системы]:
                  Исходное: %d
                   +1: %d
                  -1: %d%n
                """, (int) systemStatus, (int) ++systemStatus, (int) --systemStatus);

        int distance = Integer.MAX_VALUE;
        System.out.printf("""
                [Пройденное расстояние, м]:
                  Исходное: %d
                  +1: %d
                  -1: %d%n
                """,
                distance,
                ++distance,
                --distance);

        long flightTime = Long.MAX_VALUE;
        System.out.printf("""
                [Время с момента старта, нс]:
                  Исходное: %d
                  +1: %d
                  -1: %d
                """,
                flightTime,
                ++flightTime,
                --flightTime);

        System.out.println("\n7. ВЫВОД ПАРАМЕТРОВ JVM И ОС\n");

        Runtime rt = Runtime.getRuntime();
        float toMb = 1024 * 1024;
        float totalMemory = rt.totalMemory() / toMb;
        float freeMemory = rt.freeMemory() / toMb;
        float usedMemory = totalMemory - freeMemory;
        float maxMemory = rt.maxMemory() / toMb;

        char systemDisk = System.getProperty("user.home").charAt(0);
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String pathSeparator = FileSystems.getDefault().getSeparator();

        System.out.printf("""
                Характеристики JVM:
                  Доступных ядер: %d
                  Выделенная память: %.1f МБ
                  Свободная память: %.1f МБ
                  Используемая память: %.1f МБ
                  Макс. доступная память: %.1f МБ
                
                Параметры ОС:
                  Системный диск: %s
                  Версия ОС: %s
                  Версия Java: %s
                  Сепаратор пути: %s
                    """,
                rt.availableProcessors(),
                totalMemory,
                freeMemory,
                usedMemory,
                maxMemory,
                systemDisk,
                osVersion,
                javaVersion,
                pathSeparator);

        System.out.println("\n8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА\n");

        long endNano = System.nanoTime();
        LocalTime endTime = LocalTime.now();
        double durationSec = (endNano - startNano) / 1e9;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        String startStr = startTime.format(dtf);
        String endStr = endTime.format(dtf);

        System.out.printf("""
                | Старт проверки | %s |
                +----------------+--------------+
                | Финиш проверки | %s |
                +----------------+--------------+
                | Время работы   | %.3f сек    |%n""",
                startStr, endStr, durationSec);
    }
}
