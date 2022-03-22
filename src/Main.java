public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко", 80);
        vasyaBasket.add("Хлеб", 35);

        Basket mashaBasket = new Basket();
        mashaBasket.add("Сок", 45);
        mashaBasket.add("Шоколад", 143);

        vasyaBasket.print("Корзина Васи: ");
        mashaBasket.print("Корзина Маши: ");
    }
}
