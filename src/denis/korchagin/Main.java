package denis.korchagin;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> abbreviations = ListOfAbbreviations.createListWithAbbreviations(args[0]);
        ListUtils.printStringList(abbreviations);
    }
}
