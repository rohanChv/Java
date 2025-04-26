import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<Integer,String> mapFirst=new HashMap<Integer,String>();
        mapFirst.put(1,"Ramesh");
        mapFirst.put(2,"Suresh");
        mapFirst.put(3,"Rajesh");
        mapFirst.put(4, "Samba");
        System.out.println(mapFirst.containsKey(4)?mapFirst.get(4):"Nikal");
        //Same implementation for value. Contains Key, Contains Value
        //Iteration using entry set
        Iterator<Map.Entry<Integer,String>> mapIt=mapFirst.entrySet().iterator();
        System.out.println("Iteration Using Iterator");
        while (mapIt.hasNext()){
            System.out.println(mapIt.next());
        }
        // For Loop
        System.out.println("\nUsing For Loop");
        for(Map.Entry<Integer,String>pair : mapFirst.entrySet()){
            System.out.println(pair.getKey()+":"+pair.getValue());
        }
        //for Each
        System.out.println("For Each Loop");
        mapFirst.forEach((K,V)-> System.out.println(K+":"+V));
        //Stream
        System.out.println("Stream ");
        Map<Integer,String> mapUpper=new HashMap<Integer,String>();
        mapUpper=mapFirst.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e->e.getValue().toUpperCase()));
        mapUpper.forEach((k,v)-> System.out.println(k+":"+v));
    }
}