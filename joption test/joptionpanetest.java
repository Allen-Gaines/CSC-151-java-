import javax.swing.*;

public class joptionpanetest {

    public static void main(String[] args) {
        // Welcome message
        JOptionPane.showMessageDialog(null, "Welcome to the Currency Exchange Program!");

        // Step 1: Country Selection (e.g., USA or other countries)
        String[] countries = {
            "USA", "Canada", "Mexico", "Belize", "Costa Rica", "El Salvador",
            "Guatemala", "Honduras", "Nicaragua", "Panama", "Antigua and Barbuda",
            "Bahamas", "Barbados", "Cuba", "Dominica", "Dominican Republic", "Grenada",
            "Haiti", "Jamaica", "Saint Kitts and Nevis", "Saint Lucia", 
            "Saint Vincent and the Grenadines", "Trinidad and Tobago", "Argentina", 
            "Bolivia", "Brazil", "Chile", "Colombia", "Ecuador", "Guyana", "Paraguay", 
            "Peru", "Suriname", "Uruguay", "Venezuela"
        };
        
        String selectedCountry = (String) JOptionPane.showInputDialog(
            null,
            "Select the country you are from:",
            "Country Selection",
            JOptionPane.QUESTION_MESSAGE,
            null,
            countries,
            countries[0]
        );

        if (selectedCountry == null) {
            // User cancelled the country selection
            JOptionPane.showMessageDialog(null, "Program has been cancelled.");
            return;
        }

        // Step 2: Handle special cases for certain countries (e.g., USA)
        if (selectedCountry.equals("USA")) {
            // Ask if they are selecting the US or its territories
            String[] territoriesOptions = {"Mainland USA", "US Territories/Minor Islands"};
            String selectedTerritory = (String) JOptionPane.showInputDialog(
                null,
                "Are you selecting Mainland USA or US Territories/Minor Islands?",
                "Select USA or Territory",
                JOptionPane.QUESTION_MESSAGE,
                null,
                territoriesOptions,
                territoriesOptions[0]
            );

            if (selectedTerritory == null) {
                // User cancelled the territory selection
                JOptionPane.showMessageDialog(null, "Program has been cancelled.");
                return;
            }

            if (selectedTerritory.equals("US Territories/Minor Islands")) {
                // Handle US Territories (could add logic for specific territories here)
                JOptionPane.showMessageDialog(null, "You selected a US Territory.");
            }
        }

        // Step 3: Destination Country
        String[] destinationCountries = {
            "USA", "Canada", "Mexico", "Belize", "Costa Rica", "El Salvador",
            "Guatemala", "Honduras", "Nicaragua", "Panama", "Argentina", "Bolivia",
            "Brazil", "Chile", "Colombia", "Ecuador", "Guyana", "Paraguay", "Peru",
            "Suriname", "Uruguay", "Venezuela"
        };

        String destinationCountry = (String) JOptionPane.showInputDialog(
            null,
            "Select the country you are visiting:",
            "Destination Country",
            JOptionPane.QUESTION_MESSAGE,
            null,
            destinationCountries,
            destinationCountries[0]
        );

        if (destinationCountry == null) {
            // User cancelled the destination selection
            JOptionPane.showMessageDialog(null, "Program has been cancelled.");
            return;
        }

        // Step 4: Amount to exchange
        String amountStr = JOptionPane.showInputDialog(null, "Enter the amount you are exchanging:");

        if (amountStr == null || amountStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "You must enter a valid amount.");
            return;
        }

        try {
            double amount = Double.parseDouble(amountStr);
            
             // Step 5: Confirm the transaction
            int confirm = JOptionPane.showConfirmDialog(
                null,
                "Are you sure you want to do a transaction of amount: " + amount + " to " + destinationCountry + "?",
                "Confirm Transaction",
                JOptionPane.YES_NO_OPTION
            );

            if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Transaction cancelled.");
                return;
            }

            // Call the appropriate method for exchange
            switch (destinationCountry) {
                case "USA": usdExchange(); break;
                case "Canada": cadExchange(); break;
                case "Mexico": mxnExchange(); break;
                case "Belize": bzdExchange(); break;
                case "Costa Rica": crcExchange(); break;
                case "El Salvador": usdExchange(); break;
                case "Guatemala": gtqExchange(); break;
                case "Honduras": hnlExchange(); break;
                case "Nicaragua": nioExchange(); break;
                case "Panama": pabExchange(); break;
                case "Antigua and Barbuda": xcdExchange(); break;
                case "Bahamas": bsdExchange(); break;
                case "Barbados": bbdExchange(); break;
                case "Cuba": cupExchange(); break;
                case "Dominica": xcdExchange(); break;
                case "Dominican Republic": dopExchange(); break;
                case "Grenada": xcdExchange(); break;
                case "Haiti": htgExchange(); break;
                case "Jamaica": jmdExchange(); break;
                case "Saint Kitts and Nevis": xcdExchange(); break;
                case "Saint Lucia": xcdExchange(); break;
                case "Saint Vincent and the Grenadines": xcdExchange(); break;
                case "Trinidad and Tobago": ttdExchange(); break;
                case "Argentina": arsExchange(); break;
                case "Bolivia": bobExchange(); break;
                case "Brazil": brlExchange(); break;
                case "Chile": clpExchange(); break;
                case "Colombia": copExchange(amount); break; // Colombia exchange case
                case "Ecuador": usdExchange(); break;
                case "Guyana": gydExchange(); break;
                case "Paraguay": pygExchange(); break;
                case "Peru": penExchange(); break;
                case "Suriname": srdExchange(); break;
                case "Uruguay": uyuExchange(); break;
                case "Venezuela": vesExchange(); break;
                default: JOptionPane.showMessageDialog(null, "No exchange method available for this country.");
            }

            // Step 5: Display the exchange details
            JOptionPane.showMessageDialog(null, 
                "Exchange details:\n" +
                "You are exchanging from your selected country to " + destinationCountry + "\n" +
                "Amount: " + amount);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a valid number.");
        }
    }

    // Empty methods for each country
    public static void usdExchange() 
    {
        String amountStr = JOptionPane.showInputDialog(null, "Enter the amount in USD:");
    
    if (amountStr == null || amountStr.isEmpty()) {
        JOptionPane.showMessageDialog(null, "You must enter a valid amount.");
        return;
    }
    
    try {
        double amount = Double.parseDouble(amountStr);
        // USD is the base currency, so no conversion needed
        JOptionPane.showMessageDialog(null, 
            "Currency: US Dollar (USD)\n" +
            "Amount: $" + String.format("%.2f", amount) + "\n" +
            "The US Dollar is accepted in the US, El Salvador, and Ecuador."
        );
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a valid number.");
    }
    }
        // Logic for USD exchange (e.g., US, El Salvador, Ecuador)
    
    public static void cadExchange() 
    {
        // Logic for CAD exchange (e.g., Canada)
        String amountStr = JOptionPane.showInputDialog(null, "Enter the amount in USD:");
    
        if (amountStr == null || amountStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "You must enter a valid amount.");
            return;
        }
        
        try {
            double amount = Double.parseDouble(amountStr);
            // Example exchange rate (USD to CAD)
            double exchangeRate = 1.35; // 1 USD = 1.35 CAD (example rate)
            
            double amountInCAD = amount * exchangeRate;
            
            JOptionPane.showMessageDialog(null, 
                "Currency: Canadian Dollar (CAD)\n" +
                "Exchange Rate: 1 USD = " + exchangeRate + " CAD\n" +
                "Amount in USD: $" + String.format("%.2f", amount) + "\n" +
                "Amount in CAD: C$" + String.format("%.2f", amountInCAD)
            );
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a valid number.");
        }
    }
    public static void mxnExchange() 
    {
        String amountStr = JOptionPane.showInputDialog(null, "Enter the amount in USD:");
    
        if (amountStr == null || amountStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "You must enter a valid amount.");
            return;
        }
        
        try {
            double amount = Double.parseDouble(amountStr);
            // Example exchange rate (USD to MXN)
            double exchangeRate = 19.85; // 1 USD = 19.85 MXN (example rate)
            
            double amountInMXN = amount * exchangeRate;
            
            JOptionPane.showMessageDialog(null, 
                "Currency: Mexican Peso (MXN)\n" +
                "Exchange Rate: 1 USD = " + exchangeRate + " MXN\n" +
                "Amount in USD: $" + String.format("%.2f", amount) + "\n" +
                "Amount in MXN: MX$" + String.format("%.2f", amountInMXN)
            );
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a valid number.");
        }
        // Logic for MXN exchange (e.g., Mexico)
    }
    public static void bzdExchange() 
    {
        String amountStr = JOptionPane.showInputDialog(null, "Enter the amount in USD:");
    
    if (amountStr == null || amountStr.isEmpty()) {
        JOptionPane.showMessageDialog(null, "You must enter a valid amount.");
        return;
    }
    
    try {
        double amount = Double.parseDouble(amountStr);
        // Example exchange rate (USD to BZD)
        double exchangeRate = 2.0; // 1 USD = 2.0 BZD (fixed rate)
        
        double amountInBZD = amount * exchangeRate;
        
        JOptionPane.showMessageDialog(null, 
            "Currency: Belize Dollar (BZD)\n" +
            "Exchange Rate: 1 USD = " + exchangeRate + " BZD\n" +
            "Amount in USD: $" + String.format("%.2f", amount) + "\n" +
            "Amount in BZD: BZ$" + String.format("%.2f", amountInBZD)
        );
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a valid number.");
    }
        // Logic for BZD exchange (e.g., Belize)
    }
    public static void crcExchange() 
    {
        // Logic for CRC exchange (e.g., Costa Rica)
         // Logic for CRC exchange (Costa Rica)
    String amountStr = JOptionPane.showInputDialog(null, "Enter the amount in USD:");
    
    if (amountStr == null || amountStr.isEmpty()) {
        JOptionPane.showMessageDialog(null, "You must enter a valid amount.");
        return;
    }
    
    try {
        double amount = Double.parseDouble(amountStr);
        // Example exchange rate (USD to CRC)
        double exchangeRate = 615.0; // 1 USD = 615 CRC (example rate)
        
        double amountInCRC = amount * exchangeRate;
        
        JOptionPane.showMessageDialog(null, 
            "Currency: Costa Rican Colón (CRC)\n" +
            "Exchange Rate: 1 USD = " + exchangeRate + " CRC\n" +
            "Amount in USD: $" + String.format("%.2f", amount) + "\n" +
            "Amount in CRC: ₡" + String.format("%.2f", amountInCRC)
        );
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a valid number.");
    }
    }
    public static void gtqExchange() 
    {
        // Logic for GTQ exchange (e.g., Guatemala)
        String amountStr = JOptionPane.showInputDialog(null, "Enter the amount in USD:");
    
    if (amountStr == null || amountStr.isEmpty()) {
        JOptionPane.showMessageDialog(null, "You must enter a valid amount.");
        return;
    }
    
    try {
        double amount = Double.parseDouble(amountStr);
        // Example exchange rate (USD to GTQ)
        double exchangeRate = 7.75; // 1 USD = 7.75 GTQ (example rate)
        
        double amountInGTQ = amount * exchangeRate;
        
        JOptionPane.showMessageDialog(null, 
            "Currency: Guatemalan Quetzal (GTQ)\n" +
            "Exchange Rate: 1 USD = " + exchangeRate + " GTQ\n" +
            "Amount in USD: $" + String.format("%.2f", amount) + "\n" +
            "Amount in GTQ: Q" + String.format("%.2f", amountInGTQ)
        );
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a valid number.");
    }
    }
    public static void hnlExchange() 
    {

        // Logic for HNL exchange (e.g., Honduras)
        String amountStr = JOptionPane.showInputDialog(null, "Enter the amount in USD:");
    
    if (amountStr == null || amountStr.isEmpty()) {
        JOptionPane.showMessageDialog(null, "You must enter a valid amount.");
        return;
    }
    
    try {
        double amount = Double.parseDouble(amountStr);
        // Example exchange rate (USD to HNL)
        double exchangeRate = 24.65; // 1 USD = 24.65 HNL (example rate)
        
        double amountInHNL = amount * exchangeRate;
        
        JOptionPane.showMessageDialog(null, 
            "Currency: Honduran Lempira (HNL)\n" +
            "Exchange Rate: 1 USD = " + exchangeRate + " HNL\n" +
            "Amount in USD: $" + String.format("%.2f", amount) + "\n" +
            "Amount in HNL: L" + String.format("%.2f", amountInHNL)
        );
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a valid number.");
    }
    }
    public static void nioExchange() {
        // Logic for NIO exchange (e.g., Nicaragua)
    }
    public static void pabExchange() {
        // Logic for PAB exchange (e.g., Panama)
    }
    public static void xcdExchange() {
        // Logic for XCD exchange (e.g., Antigua and Barbuda, Dominica, Grenada, Saint Kitts and Nevis, etc.)
    }
    public static void bsdExchange() {
        // Logic for BSD exchange (e.g., Bahamas)
    }
    public static void bbdExchange() {
        // Logic for BBD exchange (e.g., Barbados)
    }
    public static void cupExchange() {
        // Logic for CUP exchange (e.g., Cuba)
    }
    public static void dopExchange() {
        // Logic for DOP exchange (e.g., Dominican Republic)
    }
    public static void htgExchange() {
        // Logic for HTG exchange (e.g., Haiti)
    }
    public static void jmdExchange() {
        // Logic for JMD exchange (e.g., Jamaica)
    }
    public static void ttdExchange() {
        // Logic for TTD exchange (e.g., Trinidad and Tobago)
    }
    public static void arsExchange() {
        // Logic for ARS exchange (e.g., Argentina)
    }
    public static void bobExchange() {
        // Logic for BOB exchange (e.g., Bolivia)
    }
    public static void brlExchange() {
        // Logic for BRL exchange (e.g., Brazil)
    }
    public static void clpExchange() {
        // Logic for CLP exchange (e.g., Chile)
    }
    public static void copExchange(double amountInUSD) 
    {
        // Example exchange rate (USD to COP)
        double exchangeRate = 4800.0; // 1 USD = 4800 COP (This is just an example; actual rates may vary)

        // Perform the conversion
        double amountInCOP = amountInUSD * exchangeRate;

        // Show the result in COP
        JOptionPane.showMessageDialog(null, "The amount in Colombian Pesos (COP) is: " + amountInCOP);
    }
    public static void gydExchange() {
        // Logic for GYD exchange (e.g., Guyana)
    }
    public static void pygExchange() {
        // Logic for PYG exchange (e.g., Paraguay)
    }
    public static void penExchange() {
        // Logic for PEN exchange (e.g., Peru)
    }
    public static void srdExchange() {
        // Logic for SRD exchange (e.g., Suriname)
    }
    public static void uyuExchange() {
        // Logic for UYU exchange (e.g., Uruguay)
    }
    public static void vesExchange() {
        // Logic for VES exchange (e.g., Venezuela)
    }
}
