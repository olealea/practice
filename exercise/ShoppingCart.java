package exercise;

public class ShoppingCart {
    public static void main(String[] args){
        Item item1, item2;
        item1 = new Item();
        item2 = new Item();

        item1.descr = "Shirt";
        item2.descr = "Belt";

        System.out.println("Item1: "+item1.descr);
        System.out.println("Item2: "+item2.descr);
    }
}
