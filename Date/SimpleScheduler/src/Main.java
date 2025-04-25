import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        String startDate;
        String endDate;
        Integer Amount;
        System.out.println("Enter Start Date");
        startDate=sc.nextLine();
        System.out.println("Enter End Date");
        endDate=sc.nextLine();
        System.out.println("Enter Amount");
        Amount=sc.nextInt();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Calendar scheduleStartDate=Calendar.getInstance();
        scheduleStartDate.setTime(sdf.parse(startDate));
        Calendar scheduleEndDate=Calendar.getInstance();
        scheduleEndDate.setTime(sdf.parse(endDate));
        System.out.println("Total Duration :");
        long days=((scheduleEndDate.getTimeInMillis()-scheduleStartDate.getTimeInMillis())/1000)/86400;
        System.out.println(days + "Days");
        double amountPerDay=Amount/days;
        Date sqlDate=new Date(scheduleStartDate.getTimeInMillis());
    }
}