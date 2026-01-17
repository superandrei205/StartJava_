public class BooleanMethods {
    public boolean isProgramContinuing() {
        System.out.print(getCurrentMethodName() +
                "() -> программа выполняется далее или завершается? ");
        return false;
    }

    public boolean hasUniqueDigit() {
        System.out.print(getCurrentMethodName() +
                "() -> последовательность содержит уникальную цифру? ");
        return true;
    }

    public boolean isInputLetter() {
        System.out.print(getCurrentMethodName() +
                "() -> пользователь ввел букву или что-то другое? ");
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.print(getCurrentMethodName() +
                "() -> в проверяемых числах, есть равные цифры? ");
        return true;
    }

    public boolean hasMarioLives() {
        System.out.print(getCurrentMethodName() +
                "() -> в игре \"Марио\" остались попытки? ");
        return false;
    }

    public boolean isEmptyOrSpaces() {
        System.out.print(getCurrentMethodName() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return true;
    }

    public boolean isDiceEven() {
        System.out.print(getCurrentMethodName() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return false;
    }

    public boolean isFilePathValid() {
        System.out.print(getCurrentMethodName() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return true;
    }

    public boolean isFileExists() {
        System.out.print(getCurrentMethodName() +
                "() -> файл по указанному адресу существует? ");
        return false;
    }

    private static String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}