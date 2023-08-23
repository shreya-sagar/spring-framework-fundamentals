package dev.shreya.springframeworkindepth;

import dev.shreya.springframeworkindepth.config.AppConfigWithStereotypeAnnotations;
import dev.shreya.springframeworkindepth.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringFrameworkInDepthApplication {

	public static void main(String[] args) {
    //ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
        AppConfigWithStereotypeAnnotations.class);

    //SpeakerService speakerService = new SpeakerServiceImpl();
    SpeakerService speakerService = applicationContext.getBean("speakerService",SpeakerService.class);
    System.out.println(speakerService);
    System.out.println(speakerService.findAll().get(0).getFirstName());
    SpeakerService speakerService2 = applicationContext.getBean("speakerService",SpeakerService.class);
    System.out.println(speakerService2);
	}

}

