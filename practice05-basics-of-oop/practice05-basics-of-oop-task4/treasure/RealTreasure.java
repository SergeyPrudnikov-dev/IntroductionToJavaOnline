package by.jonline.practice05.oop.task4.treasure;

import java.util.Map;

//Дракон и сокровища. Создать программу, позволяющую обрабатывать сведения о
//100 сокровищах в пещере дракона. Реализовать возможность просмотра сокровищ,
//выбор самого дорогого по стоимости сокровища и выбора сокровищ на заданную
//сумму.

public class RealTreasure extends BaseTreasure {

    public RealTreasure() {
        super();
    }

    public RealTreasure(String name, Map<CurrencyType, Integer> cost) {
        super(name, cost);
    }

    public RealTreasure(String name, Integer сostInKarmaPoints) {
        super(name);
        this.cost.put(CurrencyType.KARMA_POINTS, сostInKarmaPoints);
        this.cost.put(CurrencyType.DOLLAR, 0);

    }

}
