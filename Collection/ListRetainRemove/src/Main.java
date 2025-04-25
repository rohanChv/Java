import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    List<Integer> firstList=new ArrayList<>();
    firstList.add(1);
    firstList.add(2);
    firstList.add(3);
    firstList.add(4);
    List<Integer>secondList=new ArrayList<>();
    secondList.add(23);
    secondList.add(24);
    secondList.add(1);
    secondList.add(2);
    secondList.add(4);
        System.out.println("First List ->"+firstList);
        System.out.println("Second List ->"+secondList);
        secondList.retainAll(firstList);
        System.out.println("Retained List->"+secondList);
    }
}