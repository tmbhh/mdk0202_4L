import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> orders = new HashMap<>();
        orders.put("Иван И.", 4345.5);
        orders.put("Ольга С.", 76564.43);
        orders.put("Александр Т.", 1234.86);
        orders.put("Александр Р.", 23432.87);
        orders.put("Екатерина О.", 1034753.6);
        orders.put("Ярослав В.", 450.0);

         double sum=0; // объявите переменную, где будет сохранена общая сумма
        for (String key:orders.keySet()) { // пройдитесь в цикле по значениям
            Double value=orders.get(key);
            sum= sum+ value;
        }

        System.out.println("Всего было совершено заказов на сумму: " + sum);
    }
}