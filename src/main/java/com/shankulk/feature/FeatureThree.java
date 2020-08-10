package com.shankulk.feature;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "feature-flags.feature3.enabled",
    havingValue = "true")
public class FeatureThree extends Feature {

}
