import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String firstString="Taki";
        String secondString="TAKI";
        System.out.println("String 1 is equal to  string 2 " + secondString.equalsIgnoreCase(firstString) );
        Locale turkishString=Locale.forLanguageTag("tr-TR");
        System.out.println("String 1 is equal to  string 2 " + secondString.toLowerCase(turkishString).equals(firstString.toLowerCase(turkishString)) );
        Locale england=Locale.UK;
        String color="color";
        String colour="colour";

        System.out.println("color is equal to  colour " + color.equals(colour.toLowerCase(england)));


    }
}