import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class WordsChecker {

    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String str) {
        HashSet<String> hashSet = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
        if (hashSet.contains(str)) {
            return true;
        }
        return false;
    }

    public String getText() {
        return text;
    }

}
