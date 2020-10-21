package by.jonline.practice05.oop.task2.payment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import by.jonline.practice05.oop.task2.products.Product;

// Создать класс Payment с внутренним классом, с помощью которого можно сформировать
// покупку из нескольких товаров.

public class Payment implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private double orderPrice;
    private static int id = 1000; // zeroId = 1000

    public Payment() {
        id++;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Payment.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(orderPrice);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Payment other = (Payment) obj;
        if (Double.doubleToLongBits(orderPrice) != Double.doubleToLongBits(other.orderPrice))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Payment [orderPrice=" + orderPrice + "]";
    }

    public class ShoppingBasket {

        private List<Product> productsInTheBasket;

        public ShoppingBasket() {
            this.productsInTheBasket = new ArrayList<Product>();
        }

        public List<Product> getProductsInTheBasket() {
            return this.productsInTheBasket;
        }

        public double calculateOrder() {
            productsInTheBasket.forEach(product -> {
                orderPrice = orderPrice + product.getPrice();
            });
            return orderPrice;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getEnclosingInstance().hashCode();
            result = prime * result + ((productsInTheBasket == null) ? 0 : productsInTheBasket.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            ShoppingBasket other = (ShoppingBasket) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (productsInTheBasket == null) {
                if (other.productsInTheBasket != null)
                    return false;
            } else if (!productsInTheBasket.equals(other.productsInTheBasket))
                return false;
            return true;
        }

        private Payment getEnclosingInstance() {
            return Payment.this;
        }

        @Override
        public String toString() {
            return "ShoppingBasket [productsInTheBasket=" + productsInTheBasket + "]";
        }
    }
}
