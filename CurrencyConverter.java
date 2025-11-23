import java.util.Scanner;
import java.util.HashMap;

public class CurrencyConverter {
    public static void main(String[] args) {
       try(Scanner scanner = new Scanner(System.in)) {
            // Step 1: Some sample exchange rates (Base: USD)
            HashMap<String, Double> rates = new HashMap<>();
            rates.put("USD", 1.0);       // Base currency
            rates.put("INR", 83.0);      // 1 USD = 83 INR
            rates.put("EUR", 0.92);      // 1 USD = 0.92 EUR
            rates.put("GBP", 0.80);      // 1 USD = 0.80 GBP
            rates.put("JPY", 150.0);     // 1 USD = 150 JPY

            // Step 2: Ask the user for base currency
            System.out.print("Enter base currency (USD/INR/EUR/GBP/JPY): ");
            String baseCurrency = scanner.next().toUpperCase();

            // Step 3: Ask the user for target currency
            System.out.print("Enter target currency (USD/INR/EUR/GBP/JPY): ");
            String targetCurrency = scanner.next().toUpperCase();

            // Step 4: Ask the user for amount
            System.out.print("Enter amount in " + baseCurrency + ": ");
            double amount = scanner.nextDouble();

            // Step 5: Convert the amount
            if (rates.containsKey(baseCurrency) || rates.containsKey(targetCurrency)) {
                     double usdAmount = amount / rates.get(baseCurrency); // Convert to USD first
                double convertedAmount = usdAmount * rates.get(targetCurrency);

                // Step 6: Display the result
                System.out.println("Converted amount:" + convertedAmount);
            }   
            
            else {
                System.out.println("Invalid currency entered.");
            }
   
            scanner.close();
               
        }    
    }

}
