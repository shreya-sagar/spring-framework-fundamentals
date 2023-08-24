package dev.shreya.springframeworkindepth.javaconfig.stereotype.repository;

import dev.shreya.springframeworkindepth.javaconfig.model.Speaker;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface SpeakerRepositoryStereotype {

  List<Speaker> findAll();
}
