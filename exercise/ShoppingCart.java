package exercise;

public class ShoppingCart {
    public static void main(String[] args){
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message;
        boolean outOfStock = false;

        double price = 29.99;
        int quantity = 2;
        double tax = 1.04;
        double total;

        message = custName +" wants to purchase " +quantity +" " +itemDesc;
        total = quantity * price * tax;

        if (quantity > 1)
            message = message + "s";

        if (outOfStock)
            System.out.println("Item is unavaible");
        else System.out.println(message + "\nThe total cost is "+total);
    }
}
