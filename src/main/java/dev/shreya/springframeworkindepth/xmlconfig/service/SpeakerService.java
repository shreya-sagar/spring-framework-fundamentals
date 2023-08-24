package dev.shreya.springframeworkindepth.xmlconfig.service;

import dev.shreya.springframeworkindepth.xmlconfig.model.Speaker;
import java.util.List;

public interface SpeakerService {

  List<Speaker> findAll();
}
