package by.jonline.practice05.oop.task4.treasure;

import java.util.Map;

//Дракон и сокровища. Создать программу, позволяющую обрабатывать сведения о
//100 сокровищах в пещере дракона. Реализовать возможность просмотра сокровищ,
//выбор самого дорогого по стоимости сокровища и выбора сокровищ на заданную
//сумму.

public class PrimitiveTreasure extends BaseTreasure {

    public PrimitiveTreasure() {
        super();
        // TODO Auto-generated constructor stub
    }

    public PrimitiveTreasure(String name, Map<CurrencyType, Integer> cost) {
        super(name, cost);
        // TODO Auto-generated constructor stub
    }

    public PrimitiveTreasure(String name, Integer сostInDollars) {
        super(name);
        this.cost.put(CurrencyType.DOLLAR, сostInDollars);
        this.cost.put(CurrencyType.KARMA_POINTS, 0);

    }
}
