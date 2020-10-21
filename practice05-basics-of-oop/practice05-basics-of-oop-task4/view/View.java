package by.jonline.practice05.oop.task4.view;

import java.util.List;

import by.jonline.practice05.oop.task4.treasure.CurrencyType;
import by.jonline.practice05.oop.task4.treasure.Treasure;

//Дракон и сокровища. Создать программу, позволяющую обрабатывать сведения о
//100 сокровищах в пещере дракона. Реализовать возможность просмотра сокровищ,
//выбор самого дорогого по стоимости сокровища и выбора сокровищ на заданную
//сумму.

public class View {

    public View() {
    }

    public void showDragonTreasures(List<Treasure> treasures) {
        int numberTreasure = 0;

        for (Treasure treasure : treasures) {
            numberTreasure++;
            System.out.print(numberTreasure + ") ");
            showTreasure(treasure);
        }
        System.out.println();
    }

    public void showTreasure(Treasure treasure) {
        System.out.print(treasure.getName() + ", cost " + treasure.getCost().get(CurrencyType.KARMA_POINTS) + " "
                + " karma-points" + ", " + treasure.getCost().get(CurrencyType.DOLLAR) + " " + " usd");
        System.out.println();
    }

    public void showMessage(String message) {
        System.out.println(message);
        System.out.println();
    }
}
