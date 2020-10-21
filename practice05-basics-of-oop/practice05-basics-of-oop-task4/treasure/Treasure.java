package by.jonline.practice05.oop.task4.treasure;

import java.util.Map;

// Дракон и сокровища. Создать программу, позволяющую обрабатывать сведения о
// 100 сокровищах в пещере дракона. Реализовать возможность просмотра сокровищ,
// выбор самого дорогого по стоимости сокровища и выбора сокровищ на заданную
// сумму.

public interface Treasure { // для тренировки попробую реализовать в этой задаче
                            // паттерн Компоновщик(Дерево, Composite)

    String getName();

    void setName(String name);

    Map<CurrencyType, Integer> getCost();

    void setCost(Map<CurrencyType, Integer> cost);
}
