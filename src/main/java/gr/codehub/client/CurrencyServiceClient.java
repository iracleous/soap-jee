package gr.codehub.client;

import java.net.URL;
import java.util.List;

//wsimport -keep -p gr.codehub.client http://localhost:8080/currencyservice?wsdl

//Only this file has been written manually
// all other files were created by the previous command

public class CurrencyServiceClient {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/currencyservice?wsdl");
        CurrencyServiceImplService currencyServiceImplService = new CurrencyServiceImplService(url);
        CurrencyService currencyService = currencyServiceImplService.getCurrencyServiceImplPort();


        List currencyList = currencyService.getAllCurrencies();
        System.out.println("Number of currencies retrieved: " + currencyList.size());
    }
}