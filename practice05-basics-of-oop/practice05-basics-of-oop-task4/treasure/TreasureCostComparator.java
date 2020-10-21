package by.jonline.practice05.oop.task4.treasure;

import java.util.Comparator;
import java.util.Map;

//Дракон и сокровища. Создать программу, позволяющую обрабатывать сведения о
//100 сокровищах в пещере дракона. Реализовать возможность просмотра сокровищ,
//выбор самого дорогого по стоимости сокровища и выбора сокровищ на заданную
//сумму.

public class TreasureCostComparator implements Comparator<Treasure> {

    @Override
    public int compare(Treasure o1, Treasure o2) {
        Map<CurrencyType, Integer> cost1 = o1.getCost();
        Map<CurrencyType, Integer> cost2 = o2.getCost();
        Integer karmaPoints1 = cost1.get(CurrencyType.KARMA_POINTS);
        Integer dollar1 = cost1.get(CurrencyType.DOLLAR);
        Integer karmaPoints2 = cost2.get(CurrencyType.KARMA_POINTS);
        Integer dollar2 = cost2.get(CurrencyType.DOLLAR);

        if (karmaPoints1 < karmaPoints2) {
            return -1;
        } else if (karmaPoints1 > karmaPoints2) {
            return 1;
        } else {
            if (dollar1 < dollar2) {
                return -1;
            } else if (dollar1 > dollar2) {
                return 1;
            } else {
                return 0;
            }
        }
    }

}
