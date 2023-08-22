package dev.shreya.springframeworkindepth;

import dev.shreya.springframeworkindepth.model.service.SpeakerService;
import dev.shreya.springframeworkindepth.model.service.SpeakerServiceImpl;

public class Application {

  public static void main(String[] args) {
    SpeakerService speakerService = new SpeakerServiceImpl();
    System.out.println(speakerService.findAll().get(0).getFirstName());
  }

}
