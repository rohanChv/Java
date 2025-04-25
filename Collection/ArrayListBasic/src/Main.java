import java.util.*;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    String[] fruitColection={"Melon","Beetroot","Apple","Mango","Banana"};
    List<String> fruits=new ArrayList<String>(Arrays.asList(fruitColection));
    fruits.forEach(x-> System.out.println(x.toUpperCase()));
    }
}