package by.jonline.practice05.oop.task4.treasure;

import java.util.HashMap;
import java.util.Map;

//Дракон и сокровища. Создать программу, позволяющую обрабатывать сведения о
//100 сокровищах в пещере дракона. Реализовать возможность просмотра сокровищ,
//выбор самого дорогого по стоимости сокровища и выбора сокровищ на заданную
//сумму.

abstract class BaseTreasure implements Treasure {

    private String name;
    Map<CurrencyType, Integer> cost;

    BaseTreasure(String name, Map<CurrencyType, Integer> cost) {
        this.name = name;
        this.cost = cost;
    }

    BaseTreasure(String name) {
        this.name = name;
        this.cost = new HashMap<CurrencyType, Integer>();
    }

    BaseTreasure() {
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setCost(Map<CurrencyType, Integer> cost) {
        this.cost = cost;
    }

    @Override
    public Map<CurrencyType, Integer> getCost() {
        return cost;
    }
}
