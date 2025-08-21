import java.text.NumberFormat;
import java.util.Locale;

public class Format {
    public static void main(String[] args) {
        NumberFormat currency= NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("New Salary is:" + currency.format(123456.78)); //format has multiple overloads, can take double, int, long, etc.
        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println("Interest Rate is:" + percent.format(0.75654455));
    }
}

//Locale is a class in Java that represents a specific geographical, political, or cultural region. It is used to customize the presentation of information such as numbers, dates, and currency for different regions.
