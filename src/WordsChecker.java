import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private Set<String> set;
    public WordsChecker(String text) {
        set = new HashSet<>();
        String[] lString = text.split("\\P{IsAlphabetic}+");
        Collections.addAll(set, lString);
    }

    public boolean hasWord(String word) {
        return set.contains(word);
    }
}
