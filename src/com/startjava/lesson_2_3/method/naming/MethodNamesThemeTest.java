package com.startjava.lesson_2_3.method.naming;

public class MethodNamesThemeTest {
    public static void main(String[] args) {
        doNonBooleanMethods();
        System.out.println();
        doBooleanMethods();
    }

    private static void doNonBooleanMethods() {
        NonBooleanMethods nbm = new NonBooleanMethods();
        nbm.findLongestWord();
        nbm.selectMenuItem();
        nbm.calculateAverageGrades();
        nbm.countUniqueWords();
        nbm.printErrorMessage();
        nbm.syncCloudData();
        nbm.restoreBackup();
        nbm.pauseDownload();
        nbm.resetVacuumSettings();
        nbm.writeToFile();
        nbm.convertCelsiusToFahrenheit();
        nbm.enterMathExpression();
        nbm.determineRacingWinner();
        nbm.findBookByAuthor();
    }

    private static void doBooleanMethods() {
        BooleanMethods bm = new BooleanMethods();
        System.out.println(bm.isContinueProgram());
        System.out.println(bm.hasUniqueDigit());
        System.out.println(bm.isLetterInput());
        System.out.println(bm.hasEqualDigits());
        System.out.println(bm.hasAttemptsLeft());
        System.out.println(bm.isEmptyOrSpaces());
        System.out.println(bm.isRollEven());
        System.out.println(bm.isValidFilePath());
        System.out.println(bm.isExistsFile());
    }
}