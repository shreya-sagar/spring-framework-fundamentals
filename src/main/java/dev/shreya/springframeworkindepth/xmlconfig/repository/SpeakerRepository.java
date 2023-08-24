package dev.shreya.springframeworkindepth.xmlconfig.repository;

import dev.shreya.springframeworkindepth.xmlconfig.model.Speaker;
import java.util.List;

public interface SpeakerRepository {

  List<Speaker> findAll();
}
