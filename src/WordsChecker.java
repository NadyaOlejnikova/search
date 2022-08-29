import java.util.*;

public class WordsChecker {

    protected Set<String> world;

    public WordsChecker(String text) {
        this.world = new HashSet<>(Arrays.asList(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String worlds) {
        return world.contains(worlds);
    }


}
