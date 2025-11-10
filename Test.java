import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/sanidhyagupta/IdeaProjects/cf/src/sample.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] str = line.split(",");
                for (String s : str) {
                    s = s.trim(); // remove spaces
                    map.put(s, map.getOrDefault(s, 0) + 1);
                }
            }

            map.entrySet().stream()
                    .sorted((a, b) -> b.getValue().compareTo(a.getValue())) // sort by value descending
                    .limit(3)
                    .forEach(e -> System.out.println(e.getKey()));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
