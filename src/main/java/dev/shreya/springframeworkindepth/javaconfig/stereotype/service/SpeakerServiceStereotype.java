package dev.shreya.springframeworkindepth.javaconfig.stereotype.service;

import dev.shreya.springframeworkindepth.javaconfig.model.Speaker;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface SpeakerServiceStereotype {

  List<Speaker> findAll();
}
