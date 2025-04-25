import com.sun.xml.internal.ws.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<String> fruitSet=new HashSet<>(Arrays.asList(new String[]{"Jamie", "Suman","Suman","Haiwan"}));
        Iterator<String>fit= fruitSet.iterator();
        fruitSet=fruitSet.stream().map(String::toUpperCase).collect(Collectors.toSet());
        System.out.println(fruitSet);
    }
}