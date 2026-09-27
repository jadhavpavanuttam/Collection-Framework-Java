import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

//import static sun.jvm.hotspot.oops.CellTypeState.value;

public class MapExample {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(7,8,9,9,98,9898,9890);
        Map<Integer,String> map=new IdentityHashMap<>();
        map.put(1,"amol");
        map.put(2,"Jagdhish");
        map.put(4,"Akshay");
        map.put(2,"Bhushan"); //override to jagdhish
        System.out.println(map.get(2));
        System.out.println(map.size());
        System.out.println(  map.equals(list));
        map.forEach((key,value)-> System.out.println(key+"    "+value));
        System.out.println("Boolean Result is : "+map.containsValue("AMOL".equalsIgnoreCase(map.get(1))));
    }
}
