package dev.shreya.springframeworkindepth.xmlconfig;

import dev.shreya.springframeworkindepth.xmlconfig.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFrameworkInDepthApplication {

	public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    //SpeakerService speakerService = new SpeakerServiceImpl();
    SpeakerService speakerService = applicationContext.getBean("speakerService", SpeakerService.class);
    System.out.println(speakerService);
    System.out.println(speakerService.findAll().get(0).getFirstName());
    SpeakerService speakerService2 = applicationContext.getBean("speakerService", SpeakerService.class);
    System.out.println(speakerService2);
	}

}

