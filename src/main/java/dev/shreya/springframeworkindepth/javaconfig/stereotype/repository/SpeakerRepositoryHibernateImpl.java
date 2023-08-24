package dev.shreya.springframeworkindepth.javaconfig.stereotype.repository;

import dev.shreya.springframeworkindepth.javaconfig.model.Speaker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository//("speakerRepository")
@Profile("dev")
public class SpeakerRepositoryHibernateImpl implements SpeakerRepositoryStereotype {

  @Value("#{ T(java.lang.Math).random() * 100 }")
  Double seedNum;
  @Autowired
  Calendar calendar;

  @Override
  public List<Speaker> findAll() {
    List<Speaker> speakers = new ArrayList<>();
    Speaker speaker = new Speaker();
    speaker.setFirstName("Shreya");
    speaker.setLastName("Sagar");
    speaker.setSeedNum(seedNum);
    speakers.add(speaker);
    System.out.println("TIME: "+calendar.getTime());
    return speakers;
  }
}
