package dev.shreya.springframeworkindepth.xmlconfig.repository;

import dev.shreya.springframeworkindepth.xmlconfig.model.Speaker;
import java.util.ArrayList;
import java.util.List;

public class SpeakerRepositoryHibernateImpl implements SpeakerRepository {

  @Override
  public List<Speaker> findAll() {
    List<Speaker> speakers = new ArrayList<>();
    Speaker speaker = new Speaker();
    speaker.setFirstName("Shreya");
    speaker.setLastName("Sagar");
    speakers.add(speaker);
    return speakers;
  }
}
