public class Main {
    public static void main(String[] args) {
       Basket NikitaBasket = new Basket();
       NikitaBasket.add("Кола",150);
       NikitaBasket.add("Чебупицца", 200);
       NikitaBasket.add("Сникерс", 80);

        NikitaBasket.print("Содержимое корзины Никиты: ");
       NikitaBasket.clear();
       NikitaBasket.print("Содержимое корзины Никиты: ");

       Basket SashaBasket = new Basket(500);
       SashaBasket.add("Вода", 69);
       SashaBasket.add("Киндер", 39);
       SashaBasket.add("Пелмени", 199);

       SashaBasket.print("Сожермое корзины Саши: ");
       SashaBasket.clear();
       SashaBasket.print("Сожермое корзины Саши: ");

    }
}
