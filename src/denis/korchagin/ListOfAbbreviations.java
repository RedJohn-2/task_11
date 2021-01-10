package denis.korchagin;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ListOfAbbreviations {
    static List<String> createListWithAbbreviations(String inputFile) throws FileNotFoundException {
        List<String> abbreviations = new ArrayList<String>() {};
        for (int i = 0; i < ArrayUtils.splitToWords(inputFile).length; i++) {
            for (int j = 0; j < ArrayUtils.splitToWords(inputFile)[i].length; j++) {
                if (isAbbreviations(ArrayUtils.splitToWords(inputFile)[i][j])) {
                    abbreviations.add(ArrayUtils.splitToWords(inputFile)[i][j]);
                }
            }
        }
        return abbreviations;
    }

    static boolean isAbbreviations(String word) {
        char[] letters = word.toCharArray();
        return isCorrectWordLength(letters) && isWordWithCapitalLetters(letters);
    }

    static boolean isCorrectWordLength(char[] letters) {
        return letters.length >= 2 && letters.length <= 6;
    }

    static boolean isWordWithCapitalLetters(char[] letters) {
        for (char l:letters) {
            if (Character.isLowerCase(l) || Character.isDigit(l)) {
                return false;
            }
        }
        return true;
    }
}
