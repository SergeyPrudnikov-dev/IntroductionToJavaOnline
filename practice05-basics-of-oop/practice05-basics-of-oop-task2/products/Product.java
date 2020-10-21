package by.jonline.practice05.oop.task2.products;

import java.io.Serializable;

//Создать класс Payment с внутренним классом, с помощью которого можно сформировать
//покупку из нескольких товаров.

public class Product implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private TypePoduct typePoduct;
    private Double price;
    private Integer article;

    public Product(TypePoduct typePoduct, Double price, Integer vendorCode) {
        this.typePoduct = typePoduct;
        this.price = price;
        this.article = vendorCode;
    }

    public Product() {
    }

    public TypePoduct getTypePoduct() {
        return typePoduct;
    }

    public void setTypePoduct(TypePoduct typePoduct) {
        this.typePoduct = typePoduct;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getArticle() {
        return article;
    }

    public void setArticle(Integer article) {
        this.article = article;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((typePoduct == null) ? 0 : typePoduct.hashCode());
        result = prime * result + ((article == null) ? 0 : article.hashCode());
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
        Product other = (Product) obj;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (!price.equals(other.price))
            return false;
        if (typePoduct != other.typePoduct)
            return false;
        if (article == null) {
            if (other.article != null)
                return false;
        } else if (!article.equals(other.article))
            return false;
        return true;
    };

    @Override
    public String toString() {
        return "Product [typePoduct=" + typePoduct + ", price=" + price + ", article=" + article + "]";
    }
}
