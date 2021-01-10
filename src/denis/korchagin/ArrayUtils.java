package denis.korchagin;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class ArrayUtils {

        static String[] readLinesFromFile(String fileName) throws FileNotFoundException {
            List<String> lines;
            try (Scanner scanner = new Scanner(new File(fileName), "UTF-8")) {
                lines = new ArrayList<>();
                while (scanner.hasNext()) {
                    lines.add(scanner.nextLine());
                }
            }
            return lines.toArray(new String[0]);
        }

        static String[][] splitToWords(String fileName) throws FileNotFoundException {
            String[][] words = new String[readLinesFromFile(fileName).length][];
            for (int i = 0; i < readLinesFromFile(fileName).length; i++) {
                words[i] = readLinesFromFile(fileName)[i].split("(\\s|[,;.!?:()-])+");
            }
            return words;
        }

}

