package by.jonline.practice05.oop.task2.main;

import java.util.List;
import java.util.Map;

import by.jonline.practice05.oop.task2.logic.Logic;
import by.jonline.practice05.oop.task2.payment.Payment;
import by.jonline.practice05.oop.task2.products.OnlineStore;
import by.jonline.practice05.oop.task2.products.Product;
import by.jonline.practice05.oop.task2.view.Show;
import by.jonline.practice05.oop.task2.view.User;

//Создать класс Payment с внутренним классом, с помощью которого можно сформировать
//покупку из нескольких товаров.

public class Main {

    public static void main(String[] args) {

        Payment payment = new Payment();
        Payment.ShoppingBasket shoppingBasket = payment.new ShoppingBasket();
        OnlineStore onlineStore = new OnlineStore();
        User user = new User(2000.0);
        Logic logic = new Logic();
        Show show = new Show();
        boolean paymentPassed;

        show.showAccountBalance(user.getCurrentBalance());

        Map<Integer, Product> mapAvailableProducts = onlineStore.getMapAvailableProducts();
        logic.createAffordableProducts(mapAvailableProducts);
        show.showAvailableProducts(mapAvailableProducts);

        List<Integer> articlesShoppingList = user.createShoppingList();
        List<Product> productsInTheBasket = shoppingBasket.getProductsInTheBasket();

        logic.addProductsInShoppingBasket(articlesShoppingList, mapAvailableProducts, productsInTheBasket);

        payment.setOrderPrice(shoppingBasket.calculateOrder());
        paymentPassed = logic.makeAPayment(user, payment.getOrderPrice());

        if (paymentPassed)
            show.printACheck(productsInTheBasket, payment.getOrderPrice(), Payment.getId(), user.getCurrentBalance());
        else
            show.printError("There are not enough funds on the balance sheet, the cost of your order: "
                    + payment.getOrderPrice() + " $.");

        show.showAccountBalance(user.getCurrentBalance());
    }

}
