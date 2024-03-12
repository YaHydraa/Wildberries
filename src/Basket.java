public class Basket {

    private  String items = "";
    private  double totalPrice = 0;

    private int limit;

    public Basket(){
        items = "Список товаров: ";
        limit = 1000;
    }

    public Basket(int totalPriceLimit){
        limit = totalPriceLimit;
    }
    public  void add(String name, double price){
        if (totalPrice + price >= limit){

            return;
        }
        if (contains(name)){
            return;
        }
    items = items + "\n" + name + " - " + price;
    totalPrice = totalPrice + price;
    }

    public  void clear(){
        items = "";
        totalPrice = 0;
    }

    public boolean contains(String name){
       return items.contains(name);
    }
    public  void print(String title){
        System.out.println(title);

        if (items.isEmpty()){
            System.out.println("Корзина пуста");
        }else{
            System.out.println(items);
            System.out.println("Общая стоимость корзины : " + totalPrice);
        }
    }



}
