package ru.ad.lab3.dependencies;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Класс покрытия типа ралли
 */
public class Rally implements Coverage{
    /**
     * Название трассы
     */
    private final String name;
    /**
     * Конструктор класса
     *
     * @param name название
     */
    public Rally(String name) {
        this.name = name;
    }

    public static Rally rallyFactory(String race) {
        System.out.println("Factory method for rally used");
        return new Rally(race);
    }

    /**
     * Метод, выводящий название гонки и название трассы типа ралли
     */
    @Override
    public void rideBy(String race) {
        System.out.println(race + " starts on " + name + " rally track");
    }

    @PostConstruct
    private void init() {
        System.out.println("Rally initialized");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Rally destroyed");
    }
}
