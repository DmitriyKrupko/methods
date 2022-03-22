public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket(100);
        vasyaBasket.add("Молоко", 80);
        vasyaBasket.add("Хлеб", 40);

        Basket mashaBasket = new Basket(500);
        mashaBasket.add("Лопата", 280);
        mashaBasket.add("Бочка", 2900);

        Basket veronikaBasket = new Basket();
        veronikaBasket.add("Фигурка", 5000);
        veronikaBasket.add("Манга", 3500);

        vasyaBasket.print("Корзина Васи: ");
        mashaBasket.print("Корзина Маши: ");
        veronikaBasket.print("Корзина Вероники: ");
    }
}
