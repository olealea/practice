package exercise;

public class ShoppingCart {
    public static void main(String[] args){
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message;
        double price = 2;
        double tax = 0.2;
        int quantity = 5;
        double total = price * tax * quantity;

        message = custName +" wants to purchase " +quantity+" " +itemDesc;
        System.out.println(message);
        System.out.println("Total cost is "+total+" lei.");
    }
}
