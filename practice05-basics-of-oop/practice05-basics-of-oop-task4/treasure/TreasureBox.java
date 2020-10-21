package by.jonline.practice05.oop.task4.treasure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

//Дракон и сокровища. Создать программу, позволяющую обрабатывать сведения о
//100 сокровищах в пещере дракона. Реализовать возможность просмотра сокровищ,
//выбор самого дорогого по стоимости сокровища и выбора сокровищ на заданную
//сумму.

public class TreasureBox extends BaseTreasure { // сундук с сокровищами

    private List<Treasure> treasureArray = new ArrayList<Treasure>(); // разобраться, параметризовали интерфейсом

    public TreasureBox(String name, Treasure... components) {
        super();
        super.setName(name);
        add(components);
    }

    public TreasureBox(String name, List<Treasure> components) {
        super(name);
        this.cost.put(CurrencyType.KARMA_POINTS, 0);
        this.cost.put(CurrencyType.DOLLAR, 0);
        add(components);
    }

    public void add(Treasure component) {
        treasureArray.add(component);
    }

    public void add(List<Treasure> treasures) {
        treasureArray.addAll(treasures);
    }

    public void add(Treasure... components) {
        treasureArray.addAll(Arrays.asList(components));
    }

    public void remove(Treasure component) {
        treasureArray.remove(component);
    }

    public void remove(Treasure... components) {
        treasureArray.removeAll(Arrays.asList(components));
    }

    public void clear() {
        treasureArray.clear();
    }

    @Override
    public String getName() {
        return getNamesOfAllTreasures();
    }

    public String getNamesOfAllTreasures() {
        StringBuffer tempName = new StringBuffer(super.getName()); // проверить
        tempName.append(": ");
        treasureArray.forEach(component -> {
            tempName.append(component.getName());
            tempName.append("/ ");
        });
        return tempName.toString();
    }

    @Override
    public Map<CurrencyType, Integer> getCost() {
        if (cost.get(CurrencyType.DOLLAR) == 0 && cost.get(CurrencyType.KARMA_POINTS) == 0) {
            calculateCostBox();
            return cost;
        }
        return cost;

    }

    private void calculateCostBox() {
        Integer сostInDollars = this.cost.get(CurrencyType.DOLLAR);
        Integer сostInKarmaPoints = this.cost.get(CurrencyType.KARMA_POINTS);

        for (Treasure component : treasureArray) {
            if (component.getCost().containsKey(CurrencyType.DOLLAR)) {
                сostInDollars = сostInDollars + component.getCost().get(CurrencyType.DOLLAR);
            }
            if (component.getCost().containsKey(CurrencyType.KARMA_POINTS)) {
                сostInKarmaPoints = сostInKarmaPoints + component.getCost().get(CurrencyType.KARMA_POINTS);
            }
        }
        this.cost.put(CurrencyType.DOLLAR, сostInDollars);
        this.cost.put(CurrencyType.KARMA_POINTS, сostInKarmaPoints);
    }

}
