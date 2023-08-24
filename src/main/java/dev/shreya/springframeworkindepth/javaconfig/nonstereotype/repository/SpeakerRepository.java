package dev.shreya.springframeworkindepth.javaconfig.nonstereotype.repository;

import dev.shreya.springframeworkindepth.javaconfig.model.Speaker;
import java.util.List;

public interface SpeakerRepository {

  List<Speaker> findAll();
}
