import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class WordsChecker {

    private String text;
    private HashSet<String> hashSet;

    public WordsChecker(String text) {
        this.text = text;
        this.hashSet = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String str) {
        if (hashSet.contains(str)) {
            return true;
        }
        return false;
    }

    public String getText() {
        return text;
    }

    public HashSet<String> getHashSet() {
        return hashSet;
    }
}
