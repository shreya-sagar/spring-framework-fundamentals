package dev.shreya.springframeworkindepth.javaconfig.nonstereotype.service;

import dev.shreya.springframeworkindepth.javaconfig.model.Speaker;
import java.util.List;

public interface SpeakerService {

  List<Speaker> findAll();
}
