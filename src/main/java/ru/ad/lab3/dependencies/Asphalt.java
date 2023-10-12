package ru.ad.lab3.dependencies;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Класс покрытия типа асфальт
 */
public class Asphalt implements Coverage{

    /**
     * Количество поворотов
     */
    private final int turnsCount;

    /**
     * Конструктор класса
     *
     * @param turnsCount количество поворотов
     */
    public Asphalt(int turnsCount) {
        this.turnsCount = turnsCount;
    }

    /**
     * Метод, выводящий название гонки и количество поворотов
     */
    @Override
    public void rideBy(String race) {
        System.out.println(race + " starts on asphalt to make " + turnsCount + " turns" );
    }

    @PostConstruct
    private void init() {
        System.out.println("Asphalt initialized");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Asphalt destroyed");
    }

}
