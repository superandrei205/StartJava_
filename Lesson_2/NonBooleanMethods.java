public class NonBooleanMethods {
    public void findLongestWord() {
        System.out.println(getCurrentMethodName() +
                "() -> найти самое длинное слово в предложении из книги по Java");
    }

    public void selectMenuItem() {
        System.out.println(getCurrentMethodName() +
                "() -> выбрать пункт меню в текстовом редакторе на macOS");
    }

    public void calculateAverageGrade() {
        System.out.println(getCurrentMethodName() +
                "() -> вычислить среднее значение оценок в школе №1234");
    }

    public void countUniqueWords() {
        System.out.println(getCurrentMethodName() +
                "() -> подсчитать количество уникальных слов в \"Война и Мир\"");
    }

    public void printErrorMessage() {
        System.out.println(getCurrentMethodName() +
                "() -> вывести сообщение об ошибке");
    }

    public void syncCloudData() {
        System.out.println(getCurrentMethodName() +
                "() -> синхронизировать данные с облачным хранилищем");
    }

    public void restoreBackup() {
        System.out.println(getCurrentMethodName() +
                "() -> восстановить данные из резервной копии от 11.03.2024");
    }

    public void pauseMp3Download() {
        System.out.println(getCurrentMethodName() +
                "() -> приостановить загрузку mp3-файла группы \"Ария\"");
    }

    public void resetVacuumSettings() {
        System.out.println(getCurrentMethodName() +
                "() -> сбросить настройки до заводских для пылесоса Mi");
    }

    public void writeToFile() {
        System.out.println(getCurrentMethodName() +
                "() -> записать содержимое в файл по указанному пути на флешку");
    }

    public void convertCelsiusToFahrenheit() {
        System.out.println(getCurrentMethodName() +
                "() -> преобразовать температуру из Цельсия в Фаренгейт");
    }

    public void enterMathExpression() {
        System.out.println(getCurrentMethodName() +
                "() -> ввести математическое выражение с тремя аргументами");
    }

    public void determineRacingWinner() {
        System.out.println(getCurrentMethodName() +
                "() -> выявить победителя среди гонщиков игры \"Need For Speed\"");
    }

    public void findBookByAuthor() {
        System.out.println(getCurrentMethodName() +
                "() -> найти книгу по имени писателя");
    }

    private static String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}