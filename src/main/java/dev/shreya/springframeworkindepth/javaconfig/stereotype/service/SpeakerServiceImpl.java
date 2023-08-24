package dev.shreya.springframeworkindepth.javaconfig.stereotype.service;

import dev.shreya.springframeworkindepth.javaconfig.model.Speaker;
import dev.shreya.springframeworkindepth.javaconfig.stereotype.repository.SpeakerRepositoryStereotype;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service//("speakerService")
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerServiceStereotype {
  @Autowired
  private SpeakerRepositoryStereotype speakerRepository;

  public SpeakerServiceImpl() {
    System.out.println("SpeakerServiceImpl No Args Constructor");
  }

  //@Autowired
  public SpeakerServiceImpl(SpeakerRepositoryStereotype speakerRepository) {
    System.out.println("SpeakerServiceImpl speakerRepository Constructor");
    this.speakerRepository = speakerRepository;
  }

  //@Autowired
  public void setSpeakerRepository(SpeakerRepositoryStereotype speakerRepository) {
    System.out.println("SpeakerServiceImpl speakerRepository SETTER Constructor");
    this.speakerRepository = speakerRepository;
  }

  @Override
  public List<Speaker> findAll() {
    return speakerRepository.findAll();
  }

  @PostConstruct
  public void init(){
    System.out.println("PostConstruct init - Called After the constructors! :)");
  }

  @PreDestroy
  public void cleanUp(){
    System.out.println("cleanUp! :S");
  }

}
