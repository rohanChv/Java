import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        String startDate="2024-04-01";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        DateFormat japaneseFormat=DateFormat.getDateInstance(DateFormat.FULL, Locale.JAPANESE);
        System.out.println(japaneseFormat.format(sdf.parse(startDate)));
        DateFormat chineseFormat=DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINESE);
        System.out.println(chineseFormat.format(sdf.parse(startDate)));
        LocalDate d1=LocalDate.parse(startDate);
    }
}