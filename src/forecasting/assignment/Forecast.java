package forecasting.assignment;

import java.util.Date;


public class Forecast {
    Date day;
    String productCode;
    String outletCode;
    Double alpha;
    Double calculation;
    Double dbSales;
    Double dbForecast;
    
    public Forecast (Date day, String productCode, String outletCode, 
            Double alpha) {
        super();
        this.day = day;
        this.productCode = productCode;
        this.outletCode = outletCode;
        this.alpha = alpha;
    }

    public Forecast () {
        super();
    }
    
    public Double getForecast(Date day, String productCode, 
            String outletCode, Double alpha) {
        Forecast forecast = new Forecast(day, productCode, outletCode, alpha);
        forecast.setForecastInfo();
        forecast.calculateForecast();
        
        return calculation;
    }
    
   
    public void setForecastInfo() {
        
        /** 
         * See the document for explanation
         */
    }
    
    public void calculateForecast () {
        calculation = (alpha * dbSales) + ((1 - alpha) * dbForecast);
    }
    
}
