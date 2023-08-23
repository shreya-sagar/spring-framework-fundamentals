/*
package dev.shreya.springframeworkindepth.config;

import dev.shreya.springframeworkindepth.repository.SpeakerRepository;
import dev.shreya.springframeworkindepth.repository.SpeakerRepositoryHibernateImpl;
import dev.shreya.springframeworkindepth.service.SpeakerService;
import dev.shreya.springframeworkindepth.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

  @Bean(name = "speakerService")
  //@Scope(value = BeanDefinition.SCOPE_SINGLETON)
  //@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
  public SpeakerService getSpeakerService() {
    //SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository());
    SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
    //speakerService.setSpeakerRepository(getSpeakerRepository());
    return speakerService;
  }

  @Bean(name = "speakerRepository")
  public SpeakerRepository getSpeakerRepository() {
    return new SpeakerRepositoryHibernateImpl();
  }
}
*/
