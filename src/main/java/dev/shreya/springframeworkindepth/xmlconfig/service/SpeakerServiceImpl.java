package dev.shreya.springframeworkindepth.xmlconfig.service;

import dev.shreya.springframeworkindepth.xmlconfig.model.Speaker;
import dev.shreya.springframeworkindepth.xmlconfig.repository.SpeakerRepository;
import java.util.List;

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

  //@Autowired
  public void setSpeakerRepository(SpeakerRepository speakerRepository) {
    System.out.println("SpeakerServiceImpl speakerRepository SETTER Constructor");
    this.speakerRepository = speakerRepository;
  }

  @Override
  public List<Speaker> findAll() {
    return speakerRepository.findAll();
  }
}
