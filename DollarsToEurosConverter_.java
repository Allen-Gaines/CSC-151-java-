package DollarstoEurosConverter;

/*
 * This program...      //Your Block COMMENT Here  ////////////////////////////
 * 
 *
 *
*/


import java.util.Scanner;
public class DollarsToEurosConverter_{
    
    
    
    public static void main(String[] args)
            
   {    
        Scanner keyboard = new Scanner(System.in);
        String Currancy; 
        System.out.println("What currency are you trading(Dollars or Euros)"); 
        Currancy = keyboard.nextLine();
        if ("Dollars".equals(Currancy))
        {
            DollarstoEuro();
        }
        else if ("Euros".equals(Currancy))
        {
            EurotoDollars ();
        }
            
        else{
            System.out.println("no currancy");
        }
        
        
   }  
        
        static void DollarstoEuro() {
            double dollars;
            double eurosPerDollar;
            double grossEuros;
            double fee;
            
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Welcome to the Dollars to Euros Converter.\n");            
            System.out.print("How many dollars do you want to convert? ");        
            dollars = keyboard.nextDouble();        
            System.out.print("What is the euros-per-dollar exchange rate? ");        
            eurosPerDollar = keyboard.nextDouble();        
            grossEuros = dollars * eurosPerDollar;        
            System.out.println(dollars + " Dollars => " + grossEuros
             + " Gross Euros.");
            System.out.print("\nWhat is the euros-per-dollar Fee Percentage % ? ");        
            double rate = keyboard.nextDouble(); 


            fee = grossEuros * rate / 100;
            double netEuros = grossEuros - fee;

            System.out.println("Thank you for using the Dollars to Euros Converter.\n");
            System.out.println("Please check your Math.\n");	
            System.out.println(dollars + " \tDollars\n " + 
                    eurosPerDollar + " \tEuros Per Dollar Exchange Rate\n" +
                    grossEuros + " \tGross Euros\n" +
                    rate + " \tFee Percentage %\n" +
                    fee + " \tFee in Euros\n" +
                    netEuros + " \tNet Euros\n");        
        
    }  
        
        
        static void EurotoDollars (){
            double euros;
            double dollarsperEuro;
            double grossDollars;
            double fee;
            
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Welcome to the Euros to Dollars Converter.\n");            
            System.out.print("How many dollars do you want to convert? ");        
            euros = keyboard.nextDouble();        
            System.out.print("What is the Dallor-per-Euro exchange rate? ");        
            dollarsperEuro = keyboard.nextDouble();        
            grossDollars = euros * dollarsperEuro;        
            System.out.println(euros + " euros => " + grossDollars
             + " Gross Dollars.");
            System.out.print("\nWhat is the Dallor-per-Euror Fee Percentage % ? ");        
            double rate = keyboard.nextDouble(); 


            fee = grossDollars * rate / 100;
            double netdollars = grossDollars - fee;

            System.out.println("Thank you for using the Euro to Dollar Converter.\n");
            System.out.println("Please check your Math.\n");	
            System.out.println(rate + 
                    euros + " \tDollars\n " +
                    grossDollars + " \tDallor-per-Euro Exchange Rate\n" +
                    grossDollars + " \tGross Dollars\n" + " \tFee Percentage %\n" +
                    fee + " \tFee in Dollars\n" +
                    netdollars + " \tNet Dollars\n");
            
        }
}
