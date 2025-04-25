import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        Date utilDate=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Time is "+sdf.format(utilDate));

        java.sql.Date sqlDate=new java.sql.Date(utilDate.getTime());
        System.out.println(sqlDate);
        String parseDate="2024-24-04";
        System.out.println(sdf.format(sdf.parse(parseDate)));
    }
}
