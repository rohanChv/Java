import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Map<Integer,String> mapFirst=new HashMap<>();
    mapFirst.put(1,"Sam");
    mapFirst.put(2,"Goat");

    mapFirst.computeIfAbsent(3,(k)->mapFirst.get(2)+3);
        Iterator<Map.Entry<Integer,String>> mit=mapFirst.entrySet().iterator();
        while (mit.hasNext()){
            System.out.println(mit.next());
        }
        mapFirst.forEach((K,v)-> System.out.println(K+":"+v));
        System.out.println(mapFirst.get(1));
    }
}