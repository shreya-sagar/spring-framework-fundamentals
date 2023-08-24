package dev.shreya.springframeworkindepth.javaconfig.nonstereotype.repository;

import dev.shreya.springframeworkindepth.javaconfig.model.Speaker;
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
