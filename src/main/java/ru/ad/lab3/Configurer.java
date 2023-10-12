package ru.ad.lab3;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.ad.lab3.dependencies.Asphalt;
import ru.ad.lab3.dependencies.Rally;

@Configuration
@ComponentScan("ru.ad.lab3")
@PropertySource("classpath:race.properties")
public class Configurer {


  @Bean
  public Rally rallyBean(@Value("${rallyTrack.name}") String trackName) {
    return Rally.rallyFactory(trackName);
  }

  @Bean
  public Asphalt asphaltBean(@Value("${asphaltTrack.turnsCount}") int turnsCount) {
    return new Asphalt(turnsCount);
  }

  @Bean
  public Race rallyRace(Rally rally, @Value("${rallyRace.carsCount}") int carsCount) {
    Race rallyRace = new Race("RedBullCrazyRace", rally);
    rallyRace.setCarsCount(carsCount);
    return rallyRace;
  }

  @Bean
  public Race asphaltRace(Asphalt asphalt, @Value("${asphaltRace.carsCount}") int carsCount) {
    Race asphaltRace = new Race("Indianapolis500", asphalt);
    asphaltRace.setCarsCount(carsCount);
    return asphaltRace;
  }
}
