package dev.shreya.springframeworkindepth.repository;

import dev.shreya.springframeworkindepth.model.Speaker;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository("speakerRepository")
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
