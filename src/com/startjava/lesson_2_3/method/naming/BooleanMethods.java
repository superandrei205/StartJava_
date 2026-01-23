package com.startjava.lesson_2_3.method.naming;

public class BooleanMethods {
    public boolean isContinueProgram() {
        System.out.print(CurrentMethodNameUntil.getCurrentMethodName() +
                "() -> программа выполняется далее или завершается? ");
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.print(CurrentMethodNameUntil.getCurrentMethodName() +
                "() -> последовательность содержит уникальную цифру? ");
        return false;
    }

    public boolean isLetterInput() {
        System.out.print(CurrentMethodNameUntil.getCurrentMethodName() +
                "() -> пользователь ввел букву или что-то другое? ");
        return true;
    }

    public boolean hasEqualDigits() {
        System.out.print(CurrentMethodNameUntil.getCurrentMethodName() +
                "() -> в проверяемых числах, есть равные цифры? ");
        return false;
    }

    public boolean hasAttemptsLeft() {
        System.out.print(CurrentMethodNameUntil.getCurrentMethodName() +
                "() -> в игре \"Марио\" остались попытки? ");
        return true;
    }

    public boolean isEmptyOrSpaces() {
        System.out.print(CurrentMethodNameUntil.getCurrentMethodName() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return false;
    }

    public boolean isRollEven() {
        System.out.print(CurrentMethodNameUntil.getCurrentMethodName() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return true;
    }

    public boolean isValidFilePath() {
        System.out.print(CurrentMethodNameUntil.getCurrentMethodName() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return false;
    }

    public boolean isExistsFile() {
        System.out.print(CurrentMethodNameUntil.getCurrentMethodName() +
                "() -> файл по указанному адресу существует? ");
        return true;
    }
}
