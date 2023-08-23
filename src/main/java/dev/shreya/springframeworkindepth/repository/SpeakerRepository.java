package dev.shreya.springframeworkindepth.repository;

import dev.shreya.springframeworkindepth.model.Speaker;
import java.util.List;

public interface SpeakerRepository {

  List<Speaker> findAll();
}
