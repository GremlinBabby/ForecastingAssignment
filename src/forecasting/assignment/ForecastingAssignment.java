package forecasting.assignment;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Camilla
 */
public class ForecastingAssignment {

    
    public static void main(String[] args) {
        
        Forecast forecast = new Forecast();
        Scanner scan = new Scanner(System.in);

        Calendar cal = new GregorianCalendar();
        cal.add(Calendar.DAY_OF_MONTH, -7);
        Date weekAgo = cal.getTime();
        
        Double alpha = 0.3;
        Double calculation;
        
        System.out.println("Enter Product Code");
        String productCode = scan.next();
        System.out.println("Enter Outlet Code");
        String outletCode = scan.next();
        
        
           
        
        
        calculation = forecast.getForecast(weekAgo, productCode, outletCode, 
                alpha);
        System.out.println(calculation);
        scan.close();
    }
    
}
