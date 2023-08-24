package dev.shreya.springframeworkindepth.javaconfig;

import dev.shreya.springframeworkindepth.javaconfig.config.AppConfig;
import dev.shreya.springframeworkindepth.javaconfig.config.AppConfigWithStereotypeAnnotations;
import dev.shreya.springframeworkindepth.javaconfig.nonstereotype.service.SpeakerService;
import dev.shreya.springframeworkindepth.javaconfig.stereotype.service.SpeakerServiceStereotype;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringFrameworkInDepthApplication {

	public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

    SpeakerService speakerService = applicationContext.getBean(SpeakerService.class);
    System.out.println(speakerService);
    System.out.println(speakerService.findAll().get(0).getFirstName());

    SpeakerService speakerService2 = applicationContext.getBean(SpeakerService.class);
    System.out.println(speakerService2);

    System.out.println("******************AppConfigWithStereotypeAnnotations*********");
    ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(
        AppConfigWithStereotypeAnnotations.class);

    SpeakerServiceStereotype speakerServiceStereotype = applicationContext2.getBean(
        SpeakerServiceStereotype.class);
    System.out.println(speakerServiceStereotype);
    System.out.println(speakerServiceStereotype.findAll().get(0).getFirstName());
    System.out.println(speakerServiceStereotype.findAll().get(0).getSeedNum());

    SpeakerServiceStereotype speakerServiceStereotype2 = applicationContext2.getBean(SpeakerServiceStereotype.class);
    System.out.println(speakerServiceStereotype2);

    //Edit Configuration -> Java -> Add VM options -Dspring.profiles.active=dev
    System.out.println("PROFILES ACTIVE: "+String.join(",",applicationContext2.getEnvironment().getActiveProfiles()));
	}

}

