import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        BigDecimal numberOne=new BigDecimal(1.3435);
        System.out.println(numberOne.setScale(2, RoundingMode.UP));
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

        DateFormat df=DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.JAPAN);
        System.out.println(df.parse("2025/04/08"));
    }
}