package dev.shreya.springframeworkindepth.javaconfig.config;

import dev.shreya.springframeworkindepth.javaconfig.util.CalendarFactory;
import java.util.Calendar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("dev.shreya.springframeworkindepth.javaconfig.stereotype")
public class AppConfigWithStereotypeAnnotations {

  @Bean
  public CalendarFactory calendarFactory() {
    CalendarFactory calendarFactory = new CalendarFactory();
    calendarFactory.addDays(5);
    return calendarFactory;
  }

  @Bean
  public Calendar calendar() throws Exception {
    return calendarFactory().getObject();
  }
}
