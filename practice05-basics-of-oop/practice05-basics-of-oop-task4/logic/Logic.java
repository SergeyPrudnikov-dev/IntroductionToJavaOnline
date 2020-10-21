package by.jonline.practice05.oop.task4.logic;

//Дракон и сокровища. Создать программу, позволяющую обрабатывать сведения о
//100 сокровищах в пещере дракона. Реализовать возможность просмотра сокровищ,
//выбор самого дорогого по стоимости сокровища и выбора сокровищ на заданную
//сумму.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.jonline.practice05.oop.task4.treasure.CurrencyType;
import by.jonline.practice05.oop.task4.treasure.PrimitiveTreasure;
import by.jonline.practice05.oop.task4.treasure.RealTreasure;
import by.jonline.practice05.oop.task4.treasure.Treasure;
import by.jonline.practice05.oop.task4.treasure.TreasureBox;
import by.jonline.practice05.oop.task4.treasure.TreasureCostComparator;

public class Logic {

    public Logic() {
    }

    public List<Treasure> generateDragonTreasures() {

        List<Treasure> typesTreasures = createListTypesTreasures();
        int quantityTreasures;
        int numberBox;
        double tempChoice;
        int maxCost;
        quantityTreasures = 100;
        numberBox = 1;
        maxCost = 10000;
        List<Treasure> treasures = new ArrayList<Treasure>();

        for (int i = 1; i <= quantityTreasures; i++) {
            tempChoice = Math.random();
            if (tempChoice < 0.5) { // PrimitiveTreasure
                treasures.add(new PrimitiveTreasure("Gold", (int) (Math.random() * maxCost)));
            } else if (tempChoice >= 0.5 && tempChoice < 0.8) { //
                treasures.add(typesTreasures.get((int) (Math.random() * typesTreasures.size())));
            } else {
                treasures.add(createRandomTreasureBox(typesTreasures, numberBox));
                numberBox++;
            }
        }
        return treasures;
    }

    public Treasure createRandomTreasureBox(List<Treasure> typesTreasures, int numberBox) {
        List<Treasure> treasures = new ArrayList<Treasure>();
        int quantityTreasuresInBox;
        double tempChoice;
        int maxCost;
        maxCost = 10000;
        quantityTreasuresInBox = (int) (2 + Math.random() * 10);

        for (int i = 1; i <= quantityTreasuresInBox; i++) {
            tempChoice = Math.random();
            if (tempChoice < 0.7) { // Primitive Treasure
                treasures.add(new PrimitiveTreasure("Gold", (int) (Math.random() * maxCost)));
            } else { // Good Treasure
                treasures.add(typesTreasures.get((int) (Math.random() * typesTreasures.size())));
            }
        }
        Treasure treasureBox = new TreasureBox(numberBox + "-box with treasures", treasures);
        return treasureBox;
    }

    public List<Treasure> createListTypesTreasures() {
        Integer сostInDollars;
        Integer сostInKarmaPoints;
        сostInDollars = 0;
        сostInKarmaPoints = 1;
        List<Treasure> typesTreasures = new ArrayList<Treasure>();
        typesTreasures.add(new RealTreasure("Family", сostInKarmaPoints));
        typesTreasures.add(new RealTreasure("Friend", сostInKarmaPoints));
        typesTreasures.add(new RealTreasure("Happiness", сostInKarmaPoints));
        typesTreasures.add(new RealTreasure("Health", сostInKarmaPoints));
        typesTreasures.add(new RealTreasure("JobOfferAtEPAM", сostInKarmaPoints));
        typesTreasures.add(new PrimitiveTreasure("Gold", сostInDollars));
        return typesTreasures;
    }

    public Treasure chooseMostExpensiveTreasure(List<Treasure> treasures) {
        TreasureCostComparator comparator = new TreasureCostComparator();
        return Collections.max(treasures, comparator);
    }

    // выбора сокровищ на заданную сумму я понимаю как выбор сокровищ, у которых
    // стоимость из которых меньше заданной суммы
    // в данном решении я принмаю стоимость 1 KARMA_POINTS > любой суммы в DOLLAR

    public List<Treasure> selectingTreasuresForAmount(List<Treasure> treasures, Integer amountKarmaPoints,
            Integer amountDollars) {

        List<Treasure> selectedTreasures = new ArrayList<Treasure>();
        treasures.forEach(treasure -> {
            if (treasure.getCost().get(CurrencyType.KARMA_POINTS) < amountKarmaPoints) {
                selectedTreasures.add(treasure);
            } else if (treasure.getCost().get(CurrencyType.KARMA_POINTS) == amountKarmaPoints) {
                if (treasure.getCost().get(CurrencyType.DOLLAR) <= amountDollars) {
                    selectedTreasures.add(treasure);
                }
            }
        });
        return selectedTreasures;
    }
}
