import java.lang.reflect.Method;
import java.lang.reflect.Type;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat myCat=new Cat("Stella");
        if(myCat.getClass().isAnnotationPresent(VeryImportant.class)){
            VeryImportant annotation=myCat.getClass().getAnnotation(VeryImportant.class);
            for(int i=0;i< annotation.times();i++){
                System.out.println(myCat.name+" Says "+ annotation.Voice());
            }
        }
    }
}