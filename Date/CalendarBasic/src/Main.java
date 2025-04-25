import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        Calendar today=Calendar.getInstance();
        System.out.println("Enter Date in yyyy-mm-dd format");
        Scanner sc=new Scanner(System.in);
        String inputDate=new String();
        inputDate=sc.nextLine();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

        today.setTime(sdf.parse(inputDate));
        int daysRemaining=(today.getActualMaximum(Calendar.DAY_OF_MONTH)-today.get(Calendar.DAY_OF_MONTH));
        System.out.println("Remaining days are => "+daysRemaining);
    }
}