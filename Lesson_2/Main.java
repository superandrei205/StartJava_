public class Main {
    public static void main(String[] args) {
        NonBooleanMethods nbm = new NonBooleanMethods();
        BooleanMethods bm = new BooleanMethods();

        callNonBooleanMethods(nbm);

        System.out.println();

        callBooleanMethods(bm);
    }

    public static void callNonBooleanMethods(NonBooleanMethods methods) {
        methods.findLongestWord();
        methods.selectMenuItem();
        methods.calculateAverageGrades();
        methods.countUniqueWords();
        methods.printErrorMessage();
        methods.syncCloudData();
        methods.restoreBackup();
        methods.pauseMp3Download();
        methods.resetVacuumSettings();
        methods.writeToFile();
        methods.convertCelsiusToFahrenheit();
        methods.enterMathExpression();
        methods.determineRacingWinner();
        methods.findBookByAuthor();
    }

    public static void callBooleanMethods(BooleanMethods methods) {
        System.out.println(methods.isContinueProgram());
        System.out.println(methods.hasUniqueDigit());
        System.out.println(methods.isLetterInput());
        System.out.println(methods.hasEqualDigits());
        System.out.println(methods.hasMarioAttemptsLeft());
        System.out.println(methods.isEmptyOrSpaces());
        System.out.println(methods.isValidFilePath());
        System.out.println(methods.isValidSsdFilePath());
        System.out.println(methods.isExistsFile());
    }
}
