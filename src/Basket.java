public class Basket {
    private static String items = "";
    private static int totalPrice = 0;

    public static void main(String[] args) {
         add("Колбоса", 150);
         add("Молоко", 100);
         add("Хлеб", 30);
         add("Сок", 95);
         add("Мука", 106);
         print("Содержимое корзины:");
         clear();
         print("Содержимое корзины:");
    }

    public static void add(String name, int price) {
        items = items + "\n" + name + "-" + price;
        totalPrice = totalPrice + price;
    }

    public static void clear () {
        items = "";
        totalPrice = 0;
    }

    public static int getTotalPrice() {
        return totalPrice;
    }

    public static void print (String title) {
        System.out.println(title);
        if(items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
