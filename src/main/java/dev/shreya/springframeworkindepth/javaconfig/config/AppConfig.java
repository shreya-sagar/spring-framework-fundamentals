
package dev.shreya.springframeworkindepth.javaconfig.config;

import dev.shreya.springframeworkindepth.javaconfig.nonstereotype.repository.SpeakerRepository;
import dev.shreya.springframeworkindepth.javaconfig.nonstereotype.repository.SpeakerRepositoryHibernateImpl;
import dev.shreya.springframeworkindepth.javaconfig.nonstereotype.service.SpeakerService;
import dev.shreya.springframeworkindepth.javaconfig.nonstereotype.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

  @Bean(name = "speakerServiceBean")
  @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
  public SpeakerService getSpeakerService() {
    System.out.println("AppConfig - getSpeakerService");
    SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository());
    //SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
    //speakerService.setSpeakerRepository(getSpeakerRepository());
    return speakerService;
  }

  @Bean(name = "speakerRepositoryBean")
  @Scope(value = BeanDefinition.SCOPE_SINGLETON)
  public SpeakerRepository getSpeakerRepository() {
    return new SpeakerRepositoryHibernateImpl();
  }
}

