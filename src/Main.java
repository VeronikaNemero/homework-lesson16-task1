import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] array = {"a", "a", "e", "c", "c", "d", "b"};
        Map<String, Boolean> result = WordMultiple.search(array);

        System.out.println(result);
    }
}