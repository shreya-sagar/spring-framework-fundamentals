package dev.shreya.springframeworkindepth.model.service;

import dev.shreya.springframeworkindepth.model.Speaker;
import java.util.List;

public interface SpeakerService {

  List<Speaker> findAll();
}
