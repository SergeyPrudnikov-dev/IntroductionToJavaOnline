package by.jonline.practice05.oop.task4.main;

import java.util.List;

import by.jonline.practice05.oop.task4.logic.Logic;
import by.jonline.practice05.oop.task4.treasure.Treasure;
import by.jonline.practice05.oop.task4.view.ConsoleInput;
import by.jonline.practice05.oop.task4.view.View;

//Создать консольное приложение, удовлетворяющее следующим условиям:
/*
 * - приложение должно быть объектноориентированным; - каждый класс должен иметь
 * отражающее смысл название и информативный состав; - наследование должно
 * применяться только тогда, когда это имеет смысл; - при кодировании должны
 * использоваться соглашения согласно code convention; - классы должны быть
 * грамотно разложенны по пакетам; - консольное меню должно быть минимальным; -
 * для хранения данных можно использовать файлы.
 */
/*
 * Дракон и сокровища. Создать программу, позволяющую обрабатывать сведения о
 * 100 сокровищах в пещере дракона. Реализовать возможность просмотра сокровищ,
 * выбор самого дорогого по стоимости сокровища и выбора сокровищ на заданную
 * сумму.
 */

public class Main {

    public static void main(String[] args) {
        Logic logic = new Logic();
        View view = new View();
        ConsoleInput consoleInput = new ConsoleInput();
        List<Treasure> dragonTreasures;
        List<Treasure> selectedTreasures;
        Integer amountKarmaPoints;
        Integer amountDollars;

        dragonTreasures = logic.generateDragonTreasures();
        view.showMessage("Dragon treasures:");
        view.showDragonTreasures(dragonTreasures);

        view.showMessage("The most expensive treasure: ");
        Treasure expensiveTreasure = logic.chooseMostExpensiveTreasure(dragonTreasures);
        view.showTreasure(expensiveTreasure);

        amountKarmaPoints = 1;
        amountDollars = 5000;
        view.showMessage("Selecting treasures for a given amount: " + amountKarmaPoints + " karma-points, "
                + amountDollars + " dollars.");
        selectedTreasures = logic.selectingTreasuresForAmount(dragonTreasures, amountKarmaPoints, amountDollars);
        view.showDragonTreasures(selectedTreasures);

        // блок демонстрации минимальной работы с консолью
        view.showMessage("Block working with the console.");
        amountKarmaPoints = consoleInput.enterInt("Enter the number of karma points>>");
        amountDollars = consoleInput.enterInt("Enter the number of dollars>>");

        view.showMessage("Selecting treasures for a given amount: " + amountKarmaPoints + " karma-points, "
                + amountDollars + " dollars.");
        selectedTreasures = logic.selectingTreasuresForAmount(dragonTreasures, amountKarmaPoints, amountDollars);
        view.showDragonTreasures(selectedTreasures);
    }
}
