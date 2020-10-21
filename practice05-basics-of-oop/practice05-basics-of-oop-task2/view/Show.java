package by.jonline.practice05.oop.task2.view;

//Создать класс Payment с внутренним классом, с помощью которого можно сформировать
//покупку из нескольких товаров.

import java.util.List;
import java.util.Map;

import by.jonline.practice05.oop.task2.products.Product;

public class Show {

    public Show() {
    }

    public void printError(String str) {
        System.out.println();
        System.out.println("Error. " + str);
    }

    public void printACheck(List<Product> productsInTheBasket, double orderPrice, int id, double currentBalance) {
        System.out.println();
        System.out.println("Check №: " + id);
        int i = 1;
        for (Product s : productsInTheBasket) {
            System.out.println("      " + i + ") " + s.getPrice() + " - " + s.getTypePoduct());
            i++;
        }
        System.out.println("Total order price " + orderPrice + " $.");
        System.out.println();
    }

    public void showAccountBalance(double currentBalance) {
        System.out.println("Account balance: " + currentBalance + " $.");
        System.out.println();
    }

    public void showAvailableProducts(Map<Integer, Product> mapAvailableProducts) {
        System.out.println("Available products: ");

        mapAvailableProducts.forEach((article, product) -> {
            System.out.println(product.getTypePoduct().toString() + ", article " + article + ", price "
                    + product.getPrice() + " $");
        });
    }
}
