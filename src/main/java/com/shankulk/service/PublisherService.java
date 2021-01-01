package com.shankulk.service;

import org.springframework.stereotype.Service;

@Service
public class PublisherService {

  public void publishUpdates() {
    System.out.println("Publishing updates" + System.currentTimeMillis());
  }
}
