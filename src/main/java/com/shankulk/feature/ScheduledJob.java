package com.shankulk.feature;

import com.shankulk.service.PublisherService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "feature-flags.publishing.enabled", havingValue = "true")
public class ScheduledJob {

  private final PublisherService publisherService;

  public ScheduledJob(PublisherService publisherService) {
    this.publisherService = publisherService;
  }

  @Scheduled(fixedDelay = 10000)
  void publishUpdates() {
    publisherService.publishUpdates();
  }
}
