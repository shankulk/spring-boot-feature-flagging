package com.shankulk;

import com.shankulk.feature.Feature;
import java.util.Arrays;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FeatureFlaggingApplication {

  private final ApplicationContext applicationContext;

  @Autowired
  public FeatureFlaggingApplication(ApplicationContext applicationContext) {
    this.applicationContext = applicationContext;
  }

  public static void main(String[] args) {
    SpringApplication.run(FeatureFlaggingApplication.class, args);
  }

  @PostConstruct
  public void printEnabledBeanNames() {
    Arrays.stream(applicationContext.getBeanNamesForType(Feature.class))
        .sorted()
        .forEach(System.out::println);
  }
}
