//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String firstString="Hello World";
        String secondString="World";
        System.out.println("Second String is part of First string ?"+firstString.contains(secondString));
        System.out.println(firstString.indexOf(secondString));

        // Heap Operations
        String catString="cat";
        String secondCatString="cat";
        String thirdCatString=new String("Cat");
        System.out.println(catString==secondCatString);
        System.out.println(thirdCatString==secondCatString);
        System.out.println(thirdCatString.equalsIgnoreCase(secondCatString));

    }
}