package com.shankulk.feature;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "feature-flags.feature2.enabled", havingValue = "true")
public class FeatureTwo extends Feature {}
