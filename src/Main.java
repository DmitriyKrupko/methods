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

        Basket dimaBasket = new Basket("Стол", 5000);

        vasyaBasket.print("Корзина Васи: ");
        System.out.println();
        mashaBasket.print("Корзина Маши: ");
        System.out.println();
        veronikaBasket.print("Корзина Вероники: ");
        System.out.println();
        dimaBasket.print("Корзина Димы: ");

        System.out.println();
        System.out.println("Сумма корзины Васи: " + vasyaBasket.getTotalPrice());
        System.out.println("Сумма корзины Маши: " + mashaBasket.getTotalPrice());
        System.out.println("Сумма корзины Вероники: " + veronikaBasket.getTotalPrice());
        System.out.println("Сумма корзины Димы: " + dimaBasket.getTotalPrice());
    }
}
