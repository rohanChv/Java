import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String myString="Harry,marry,kerry,perry,mathew,Champak,Jetha,Tarak,Anjali";
        String[] myArray=myString.split(",");
        for(String x:myArray){
            System.out.print(x);
        }
        ArrayList<String> newArray=new ArrayList<>(Arrays.asList(myArray));
        List updatedList=newArray.stream().map(x->{
            x=x.substring(0,1).toUpperCase().concat(x.substring(1,x.length()));
            return x;
        }).collect(Collectors.toList());
        System.out.println(updatedList);
        //Space Delimter
        String spaceString="Hello there My name is rohan";
        String[] spaceArray=spaceString.split("\\s+");
        for(String x:spaceArray){
            System.out.print(x);
        }

        // . Split

        String DotString="123.123.123.12.34.55657.6787.HC234.4CFG.FRF.454t";
        String[] dotArray=DotString.split("\\.");
        for(String x:dotArray){
            System.out.print(x+",");
        }
    }
}