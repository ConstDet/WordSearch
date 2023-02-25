import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private String text;
    private Set<String> set;
    public WordsChecker(String text) {
        this.text = text;
        this.set = new HashSet<>();
        String[] lString = text.split("\\P{IsAlphabetic}+");
        for (String s : lString) {
            set.add(s);
        }
    }

    public boolean hasWord(String word) {
        if (set.contains(word)) {
            return true;
        } else return false;
    }
}
