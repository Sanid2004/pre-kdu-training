import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<10;i++){
            String str = sc.next();
            list.add(str);
            set.add(str);
            map.put(str,map.getOrDefault(str,0)+1);
        }

        System.out.println();
        // Iterating the list
        System.out.println("List Contains : ");
        for(String s : list){
            System.out.println(s);
        }

        System.out.println();
        // Iterating the set
        System.out.println("Set Contains : ");
        for(String s : set){
            System.out.println(s);
        }

        System.out.println();
        // Iterating the map
        System.out.println("Frequency of the words : ");
        Set<String> key = map.keySet();
        for(String s : key){
            System.out.println("Word : "+s+", frequency : "+map.get(s));
        }
    }
}
