import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
    String firstDate="2024-04-14";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date newDate=sdf.parse(firstDate);
        Calendar c1=Calendar.getInstance();
        c1.setTime(newDate);
        c1.add(Calendar.YEAR,1);
        Date endDate=c1.getTime();
    }
}