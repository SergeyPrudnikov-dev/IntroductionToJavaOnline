package by.jonline.practice05.oop.task2.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//Создать класс Payment с внутренним классом, с помощью которого можно сформировать
//покупку из нескольких товаров.

public class User implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private int id; // Not used for this task.
    private double currentBalance;

    public User(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public User() {
    }

    public List<Integer> createShoppingList() {

        List<Integer> articlesShoppingList = new ArrayList<Integer>();
        articlesShoppingList.add(1001);
        articlesShoppingList.add(1002);
        articlesShoppingList.add(1003);
        articlesShoppingList.add(1004);
//        articlesShoppingList.add(1005);
        articlesShoppingList.add(1006);
        articlesShoppingList.add(1020);
        return articlesShoppingList;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(currentBalance);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + id;
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
        User other = (User) obj;
        if (Double.doubleToLongBits(currentBalance) != Double.doubleToLongBits(other.currentBalance))
            return false;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", currentBalance=" + currentBalance + "]";
    }

}
