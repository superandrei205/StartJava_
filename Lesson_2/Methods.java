public class Methods {
    public void callNonBooleanMethods(NonBooleanMethods nbm) {
        nbm.findLongestWord();
        nbm.selectMenuItem();
        nbm.calculateAverageGrade();
        nbm.countUniqueWords();
        nbm.printErrorMessage();
        nbm.syncCloudData();
        nbm.restoreBackup();
        nbm.pauseMp3Download();
        nbm.resetVacuumSettings();
        nbm.writeToFile();
        nbm.convertCelsiusToFahrenheit();
        nbm.enterMathExpression();
        nbm.determineRacingWinner();
        nbm.findBookByAuthor();
    }

    public void callBooleanMethods(BooleanMethods bm) {
        System.out.println(bm.isProgramContinuing());
        System.out.println(bm.hasUniqueDigit());
        System.out.println(bm.isInputLetter());
        System.out.println(bm.hasEqualDigits());
        System.out.println(bm.hasMarioLives());
        System.out.println(bm.isEmptyOrSpaces());
        System.out.println(bm.isDiceEven());
        System.out.println(bm.isFilePathValid());
        System.out.println(bm.isFileExists());
    }
}