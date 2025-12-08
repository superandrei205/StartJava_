import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class VariablesTheme {
    public static void main(String[] args) {
        long startNano = System.nanoTime();
        LocalTime startTime = LocalTime.now();

        System.out.println("1. ВЫВОД ASCII-ГРАФИКИ");
        System.out.println();

        System.out.println(
                "                     /\\\n" +
                        "   J    a  v     v  /  \\\n" +
                        "   J   a a  v   v  /_( )\\\n" +
                        "J  J  aaaaa  V V  /      \\\n" +
                        " JJ  a     a  V  /___/\\___\\"
        );
        System.out.println();

        System.out.println("""
                 /\\
           J    /  \\  v     v  a
           J   /_( )\\  v   v  a a
        J  J  /      \\  V V  aaaaa
         JJ  /___/\\___\\  V  a     a""");
        System.out.println();

        System.out.println("2. РАСЧЕТ СТОИМОСТИ ТОВАРА");
        System.out.println();

        float penCost = 105.5f;
        float bookCost = 235.23f;
        float totalBeforeDiscount = penCost + bookCost;
        float discount = totalBeforeDiscount * 0.11f;
        float totalAfterDiscount = totalBeforeDiscount - discount;

        System.out.println("Стоимость без скидки: " + totalBeforeDiscount + " руб.");
        System.out.println("Сумма скидки: " + discount + " руб.");
        System.out.println("Стоимость со скидкой: " + totalAfterDiscount + " руб.");
        System.out.println();

        BigDecimal penCostBd = BigDecimal.valueOf(10550, 2);
        BigDecimal bookCostBd = BigDecimal.valueOf(23523, 2);
        BigDecimal totalBeforeDiscountBd = penCostBd.add(bookCostBd);
        BigDecimal discountRate = BigDecimal.valueOf(11, 2);
        BigDecimal discountBd = totalBeforeDiscountBd.multiply(discountRate)
                .divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
        BigDecimal totalAfterDiscountBd = totalBeforeDiscountBd.subtract(discountBd);

        System.out.println("Стоимость без скидки (Bd): " + totalBeforeDiscountBd + " руб.");
        System.out.println("Сумма скидки (Bd): " + discountBd + " руб.");
        System.out.println("Стоимость со скидкой (Bd): " + totalAfterDiscountBd + " руб.");
        System.out.println();

        System.out.println("3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");
        System.out.println();

        int a1 = 2;
        int b1 = 5;
        System.out.println("Исходные значения: A1 = " + a1 + ", B1 = " + b1);
        System.out.println();

        System.out.println("Метод: с третьей переменной");
        int temp = a1;
        a1 = b1;
        b1 = temp;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);
        System.out.println();

        System.out.println("Метод: арифметические операции");
        a1 += b1;
        b1 = a1 - b1;
        a1 = a1 - b1;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);
        System.out.println();

        System.out.println("Метод: побитовый XOR");
        a1 ^= b1;
        b1 ^= a1;
        a1 ^= b1;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1);
        System.out.println();

        System.out.println("4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");
        System.out.println();

        int c1 = 1055;
        int c2 = 1088;
        int c3 = 1080;
        int c4 = 1074;
        int c5 = 1077;
        int c6 = 1090;

        System.out.printf("%6d%6d%6d%6d%6d%6d%n", c1, c2, c3, c4, c5, c6);
        System.out.printf("%6c%6c%6c%6c%6c%6c%n", (char) c1, (char) c2, (char) c3,
                (char) c4, (char) c5, (char) c6);
        System.out.println();

        System.out.println("5. АНАЛИЗ КОДА ТОВАРА");
        System.out.println();

        int code = 123;
        int category = code / 100;
        int subcategory = (code / 10) % 10;
        int packageType = code % 10;
        int checksum = category + subcategory + packageType;
        int verifyCode = category * subcategory * packageType;

        System.out.printf(
                """
                Код товара: %d
                  категория товара - %d
                  подкатегория - %d
                  тип упаковки - %d
                Контрольная сумма = %d
                Проверочный код = %d""",
                code, category, subcategory, packageType, checksum, verifyCode);
        System.out.println();

        System.out.println("6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");
        System.out.println();

        byte temperature = Byte.MAX_VALUE;
        System.out.printf("""
                [Температура, °C]:
                  Исходное: %d
                  +1: %d
                  -1: %d""",
                temperature,
                (byte) (temperature + 1),
                (byte) (temperature - 1));
        System.out.println();

        short pressure = Short.MAX_VALUE;
        System.out.println(String.format("""
                [Давление, Па]:
                  Исходное: %d
                  +1: %d
                  -1: %d""",
                pressure,
                (short) (pressure + 1),
                (short) (pressure - 1)));
        System.out.println();

        char systemStatus = Character.MAX_VALUE;
        System.out.println(String.format("""
                [Код состояния системы]:
                  Исходное: %d
                  +1: %d
                  -1: %d""",
                (int) systemStatus,
                (int) ((char) (systemStatus + 1)),
                (int) ((char) (systemStatus - 1))));
        System.out.println();

        int distance = Integer.MAX_VALUE;
        System.out.println(String.format("""
                [Пройденное расстояние, м]:
                  Исходное: %d
                  +1: %d
                  -1: %d""",
                distance,
                distance + 1,
                distance - 1));
        System.out.println();

        long flightTime = Long.MAX_VALUE;
        System.out.println(String.format("""
                [Время с момента старта, нс]:
                  Исходное: %d
                  +1: %d
                  -1: %d""",
                flightTime,
                flightTime + 1,
                flightTime - 1));
        System.out.println();

        System.out.println("7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");
        System.out.println();

        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;
        long maxMemory = runtime.maxMemory();

        double totalMb = totalMemory / (1024.0 * 1024.0);
        double freeMb = freeMemory / (1024.0 * 1024.0);
        double usedMb = usedMemory / (1024.0 * 1024.0);
        double maxMb = maxMemory / (1024.0 * 1024.0);

        String userHome = System.getProperty("user.home");
        String systemDisk = userHome != null && userHome.length() > 0 ? userHome.substring(0, 1) : "?";
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String pathSeparator = System.getProperty("file.separator");

        System.out.println("""
                Характеристики JVM:""");
        System.out.printf("  Доступных ядер: %d%n", runtime.availableProcessors());
        System.out.printf(Locale.US, "  Выделенная память: %.1f МБ%n", totalMb);
        System.out.printf(Locale.US, "  Свободная память: %.1f МБ%n", freeMb);
        System.out.printf(Locale.US, "  Используемая память: %.1f МБ%n", usedMb);
        System.out.printf(Locale.US, "  Макс. доступная память: %.1f МБ%n", maxMb);
        System.out.println();
        System.out.println("""
                Параметры ОС:""");
        System.out.println("  Системный диск: " + systemDisk);
        System.out.println("  Версия ОС: " + osVersion);
        System.out.println("  Версия Java: " + javaVersion);
        System.out.println("  Сепаратор пути: " + pathSeparator);
        System.out.println();

        System.out.println("8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");
        System.out.println();

        long endNano = System.nanoTime();
        LocalTime endTime = LocalTime.now();
        double durationSec = (endNano - startNano) / 1_000_000_000.0;
        String durationStr = String.format(Locale.US, "%.3f", durationSec).replace('.', ',');

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        String startStr = startTime.format(dtf);
        String endStr = endTime.format(dtf);

        System.out.printf("""
                        | Старт проверки | %s |
                        +----------------+--------------+
                        | Финиш проверки | %s |
                        +----------------+--------------+
                        | Время работы   | %s сек    |%n""",
                startStr, endStr, durationStr);
    }
}
