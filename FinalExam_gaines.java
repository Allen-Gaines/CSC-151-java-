import java.util.Scanner;



public class FinalExam_gaines {

    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);
        String keep_going = "yes";
        while (keep_going.equalsIgnoreCase("yes")) {
            double TAX = .07;
            displayInfo();
            int itemcount = getItemCount(k);
            double ItemPrice = getItemPrices(itemcount, k);
            
            double Stax = getsalesTax(ItemPrice, TAX);
            double totalOwned = getTotalOwned(Stax, ItemPrice);
            displayValues(ItemPrice, itemcount, Stax, totalOwned);
            System.out.println();
            System.out.print("Do you want to run the program again? Enter yes or no: ");
            keep_going = k.next();
            System.out.println();

                    
    }
            k.close();
            System.out.println("Program has terminated!");
}
    

    public static void displayInfo()
    {
       
        System.out.println("Allen Gaines"); 
        System.out.println("2025 Spring CIS 115 Final Exam");
        System.out.println("I did not use AI to help me with this final ");
        System.out.println("I used only concepts covered in this class");
    }
    
    public static int getItemCount(Scanner k)
    {
        int itemsPurchased = 0; 
        System.out.println("how many items were purchased");
        itemsPurchased = k.nextInt();
    

        return itemsPurchased;

    }
    public static double getItemPrices(int itemsprice ,Scanner k)
    {
        double price=0 ;
        double totalprice = 0; 
        
        
        
            for( int i= 1; i <= itemsprice; i++){
                System.out.println("Enter the price of " + i+":" );
                price = k.nextDouble();
                totalprice = price + totalprice; 
                while (price<0) {
                System.out.println("please reenter number " + i + "again");
                price = k.nextDouble();
                totalprice = price + totalprice; 
                 }
        
    }
    return totalprice;
    }
    public static double getsalesTax(double totalprice,double TAX){
        TAX = .07;
        double salesTax = totalprice * TAX;  
        System.out.println(salesTax);

        return salesTax;

    }
    public static double getTotalOwned(double salesTax, double totalprice)
    {
        
        return totalprice + salesTax;
        

    }
    public static void displayValues(double totalprice, int itemsPurchased, double salesTax, double totalOwned )
    {
        System.out.println("Number of items is " + itemsPurchased );
        System.out.println("subtotal: " + totalprice );
        System.out.println("Tax Due: " + salesTax );
        System.out.println("Total Owned " + totalOwned);
        
        

    }
    
    
}