import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Maths");
        map.put(2,"Chemistry");
        map.put(3,"Physics");
        //getOrDefault
        System.out.println(map.getOrDefault(1,"Maths is default"));
        //forEach
        map.forEach((K,V)-> System.out.println(K+":"+V));
        //replace all
        //replace if key is present
        map.replaceAll((k,v)->v.toUpperCase());
        System.out.println("Upper case after Replace All");
        map.forEach((K,V)-> System.out.println(K+":"+V));
        //put if absent
        map.putIfAbsent(4,"Biology");
        System.out.println("Put if absent");
        map.forEach((K,V)-> System.out.println(K+":"+V));
        //remove
        map.remove(4,"BIO");//Remove with value only works when Value matches
        map.forEach((K,V)-> System.out.println(K+":"+V));
        map.remove(4);
        map.forEach((K,V)-> System.out.println(K+":"+V));
        map.merge()


    }
}