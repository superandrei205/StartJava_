package com.startjava.lesson_2_3_4.array;

public class ThresholdFilter {
    private static final int FIRST_LINE_COUNT = 8;

    public static void main(String[] args) {
        double[] original = generateRandomDoubles(15);

        process(original, -1);
        process(original, 15);
        process(original, 0);
        process(original, 14);
    }

    public static double[] generateRandomDoubles(int size) {
        double[] random = new double[size];
        for (int i = 0; i < size; i++) {
            random[i] = Math.random();
        }
        return random;
    }

    public static void process(double[] source, int index) {
        int length = source.length;
        if (!(index >= 0 && index < length)) {
            System.out.printf("""
                Ошибка: недопустимый индекс %d. Допустимый диапазон индексов: [%d, %d].
                %n""", index, 0, length - 1);
            return;
        }

        double[] original = copyArray(source);
        double threshold = original[index];
        double[] filtered = applyThresholdFilter(original, threshold);

        printFilterReport(original, filtered, threshold, index);
    }

    public static double[] copyArray(double[] source) {
        int length = source.length;
        double[] copy = new double[length];
        for (int i = 0; i < length; i++) {
            copy[i] = source[i];
        }
        return copy;
    }

    public static double[] applyThresholdFilter(double[] array, double threshold) {
        int length = array.length;
        double[] filtered = new double[length];
        for (int i = 0; i < length; i++) {
            filtered[i] = array[i] > threshold ? 0.0 : array[i];
        }
        return filtered;
    }

    public static String formatDoubles(double[] array) {
        int length = array.length;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < FIRST_LINE_COUNT; i++) {
            builder.append(String.format("%.3f", array[i]));
            if (i < FIRST_LINE_COUNT - 1) {
                builder.append(" ");
            }
        }
        builder.append("\n");

        for (int i = FIRST_LINE_COUNT; i < length; i++) {
            builder.append(String.format("%.3f", array[i]));
            if (i < length - 1) {
                builder.append(" ");
            }
        }

        return builder.toString();
    }

    public static void printFilterReport(double[] original, double[] filtered, double threshold, int index) {
        System.out.println("Исходный массив:");
        System.out.println(formatDoubles(original));
        System.out.printf("Пороговое значение (индекс %d): %.3f%n", index, threshold);
        System.out.println("Изменённый массив:");
        System.out.println(formatDoubles(filtered));
    }
}