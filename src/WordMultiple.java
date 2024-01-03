import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public static Map<String, Boolean> search(String[] words) {
        Map<String, Integer> countingMap = new HashMap<>();

        Map<String, Boolean> stringBooleanMap = new HashMap<>();

        int a = 0;

        int s = 0;

        for (String word : words) {
            if(countingMap.containsKey(word)){
                a = countingMap.get(word);
                s = a++;
                countingMap.put(word, s);
            } else {
                countingMap.put(word, 1);
            }

        }
        for (Map.Entry<String, Integer> entry : countingMap.entrySet()){
            if(s >= 2){
                stringBooleanMap.put(entry.getKey(), true);
            } else {
                stringBooleanMap.put(entry.getKey(), false);
            }
        }
        return stringBooleanMap;
    }
}
