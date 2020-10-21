package by.jonline.practice05.oop.task2.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import by.jonline.practice05.oop.task2.products.Product;
import by.jonline.practice05.oop.task2.products.TypePoduct;
import by.jonline.practice05.oop.task2.view.Show;
import by.jonline.practice05.oop.task2.view.User;

//Создать класс Payment с внутренним классом, с помощью которого можно сформировать
//покупку из нескольких товаров.

public class Logic {
    private Show show;

    public Logic() {
    }

    public void createAffordableProducts(Map<Integer, Product> mapAvailableProducts) {
        Product product1 = new Product(TypePoduct.COMPUTER_MOUSE, 15.0, 1001);
        mapAvailableProducts.put(product1.getArticle(), product1);
        Product product2 = new Product(TypePoduct.KEYBOARD, 25.0, 1002);
        mapAvailableProducts.put(product2.getArticle(), product2);
        Product product3 = new Product(TypePoduct.LAPTOP, 1400.0, 1003);
        mapAvailableProducts.put(product3.getArticle(), product3);
        Product product4 = new Product(TypePoduct.MONITOR, 470.0, 1004);
        mapAvailableProducts.put(product4.getArticle(), product4);
        Product product5 = new Product(TypePoduct.NETWORK_FILTER, 10.0, 1005);
        mapAvailableProducts.put(product5.getArticle(), product5);
    }

    public void addProductInProductCatalog(TypePoduct typePoduct, Double price, Integer vendorCode,
            Map<Integer, Product> productCatalog) {
        Product product = new Product(typePoduct, price, vendorCode);
        productCatalog.put(product.getArticle(), product);
    }

    public boolean makeAPayment(User user, double orderPrice) {

        double currentBalance, tempBalance;
        currentBalance = user.getCurrentBalance();
        tempBalance = currentBalance - orderPrice;
        if (tempBalance >= 0) {
            user.setCurrentBalance(tempBalance);
        } else {
            return false;
        }
        return true;
    }

    public void addProductsInShoppingBasket(List<Integer> articlesShoppingList,
            Map<Integer, Product> mapAvailableProducts, List<Product> productsInTheBasket) {

        List<Integer> articlesUnavailableProducts = new ArrayList<Integer>();
        if (show == null) {
            show = new Show();
        }
        articlesShoppingList.forEach(article -> {
            if (mapAvailableProducts.containsKey(article)) {
                productsInTheBasket.add(mapAvailableProducts.get(article));
            } else {
                articlesUnavailableProducts.add(article);
            }
        });
        if (articlesUnavailableProducts != null) {
            show.printError(
                    " Sorry, no products were found with these SKUs: " + articlesUnavailableProducts.toString());
        }
    }
}
