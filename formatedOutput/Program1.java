import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class Program1 {
    public static void main(String args[])
        throws ParseException
    {
        // Formatting as per given pattern in the argument
        SimpleDateFormat ft
            = new SimpleDateFormat("dd-MM-yyyy");
        String str = ft.format(new Date());
        System.out.println("Formatted Date : " + str);
 
        // parsing a given String
        str = "08/01/1999";
        ft = new SimpleDateFormat("MM/dd/yyyy");
        Date date = ft.parse(str);
 
        // this will print the date as per parsed string
        System.out.println("Parsed Date : " + date);
    }
}
