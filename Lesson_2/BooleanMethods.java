public class BooleanMethods {
    public boolean isContinueProgram() {
        System.out.println(Methods.getCurrentMethodName() +
                "() -> программа выполняется далее или завершается? ");
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.println(Methods.getCurrentMethodName() +
                "() -> последовательность содержит уникальную цифру? ");
        return false;
    }

    public boolean isLetterInput() {
        System.out.println(Methods.getCurrentMethodName() +
                "() -> пользователь ввел букву или что-то другое? ");
        return true;
    }

    public boolean hasEqualDigits() {
        System.out.println(Methods.getCurrentMethodName() +
                "() -> в проверяемых числах, есть равные цифры? ");
        return false;
    }

    public boolean hasMarioAttemptsLeft() {
        System.out.println(Methods.getCurrentMethodName() +
                "() -> в игре \"Марио\" остались попытки? ");
        return true;
    }

    public boolean isEmptyOrSpaces() {
        System.out.println(Methods.getCurrentMethodName() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return false;
    }

    public boolean isValidFilePath() {
        System.out.println(Methods.getCurrentMethodName() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return true;
    }

    public boolean isValidSsdFilePath() {
        System.out.println(Methods.getCurrentMethodName() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return false;
    }

    public boolean isExistsFile() {
        System.out.println(Methods.getCurrentMethodName() +
                "() -> файл по указанному адресу существует? ");
        return true;
    }
}
