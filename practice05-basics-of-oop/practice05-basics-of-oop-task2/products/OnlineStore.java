package by.jonline.practice05.oop.task2.products;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

//Создать класс Payment с внутренним классом, с помощью которого можно сформировать
//покупку из нескольких товаров.

public class OnlineStore implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    Map<Integer, Product> mapAvailableProducts;

    public OnlineStore(Map<Integer, Product> mapAvailableProducts) {
        this.mapAvailableProducts = mapAvailableProducts;
    }

    public OnlineStore() {
        this.mapAvailableProducts = new HashMap<Integer, Product>();
    }

    public Map<Integer, Product> getMapAvailableProducts() {
        return mapAvailableProducts;
    }

    public void setMapAvailableProducts(Map<Integer, Product> mapAvailableProducts) {
        this.mapAvailableProducts = mapAvailableProducts;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((mapAvailableProducts == null) ? 0 : mapAvailableProducts.hashCode());
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
        OnlineStore other = (OnlineStore) obj;
        if (mapAvailableProducts == null) {
            if (other.mapAvailableProducts != null)
                return false;
        } else if (!mapAvailableProducts.equals(other.mapAvailableProducts))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OnlineStore [mapAvailableProducts=" + mapAvailableProducts + "]";
    }

}
