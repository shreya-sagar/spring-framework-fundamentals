package dev.shreya.springframeworkindepth.model.service;

import dev.shreya.springframeworkindepth.model.Speaker;
import dev.shreya.springframeworkindepth.model.repository.SpeakerRepository;
import dev.shreya.springframeworkindepth.model.repository.SpeakerRepositoryHibernateImpl;
import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
  private SpeakerRepository speakerRepository = new SpeakerRepositoryHibernateImpl();

  @Override
  public List<Speaker> findAll() {
    return speakerRepository.findAll();
  }
}
