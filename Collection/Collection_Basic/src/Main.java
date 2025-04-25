import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Peach");
        fruits.add("Dragon Fruit");
        for(int i=0;i<4;i++){
            if(fruits.get(i).equalsIgnoreCase("Dragon Fruit")){
                fruits.remove(i);
            }
        }
        System.out.println(fruits);
        Iterator<String> fit= fruits.iterator();
        while(fit.hasNext()){
            System.out.println(fit.next());
        }
        fruits.add("Water Melon");
        fruits.add("Grapes");
        fruits.add("Strawberry");
        fruits.removeIf(fruit->fruit.equalsIgnoreCase("Water Melon"));
        System.out.println(fruits);
    }
}