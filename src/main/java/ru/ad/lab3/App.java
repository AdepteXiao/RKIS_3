package ru.ad.lab3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Главный класс программы
 */
public class App {
    /**
     * Класс для запуска программы
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                Configurer.class
        );
        Race asphaltRace = context.getBean("asphaltRace", Race.class);
        Race rallyRace = context.getBean("rallyRace", Race.class);
        System.out.println("########");
        asphaltRace.start();
        rallyRace.start();
        System.out.println("########");
        context.close();
    }
}
