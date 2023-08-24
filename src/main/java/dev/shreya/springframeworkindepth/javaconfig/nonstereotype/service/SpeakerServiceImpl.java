package dev.shreya.springframeworkindepth.javaconfig.nonstereotype.service;

import dev.shreya.springframeworkindepth.javaconfig.model.Speaker;
import dev.shreya.springframeworkindepth.javaconfig.nonstereotype.repository.SpeakerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class SpeakerServiceImpl implements SpeakerService {
  private SpeakerRepository speakerRepository;

  public SpeakerServiceImpl() {
    System.out.println("SpeakerServiceImpl No Args Constructor");
  }

  //@Autowired
  public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
    System.out.println("SpeakerServiceImpl speakerRepository Constructor");
    this.speakerRepository = speakerRepository;
  }

  @Autowired
  public void setSpeakerRepository(SpeakerRepository speakerRepository) {
    System.out.println("SpeakerServiceImpl speakerRepository SETTER Constructor");
    this.speakerRepository = speakerRepository;
  }

  @Override
  public List<Speaker> findAll() {
    return speakerRepository.findAll();
  }
}
