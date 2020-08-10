# Feature Flagging in spring-boot
Demonstrates how to feature flag spring beans

### What this application includes
<p>There are three `@Component` spring beans viz. 
1. `FeatureOne.java`
1. `FeatureTwo.java`
1. `FeatureThree.java`
  <p/>
<p>And an `application.yml` spring config file which has feature flags' values.
Note that all these components are annotated with `@ConditionalOnProperty` annotation. <p/>
### Enabling features
Based on which feature should be enabled, set the value of feature flags in `application.yml` file.
### Running the application
1. Run `./gradlew bootRun` on Mac/Linux or `gradlew.bat bootRun` on Windows terminal.
2. On the console, verify that the enabled spring bean names are printed.
### Important
All the three components extend from a base class `Feature`. This is *not* necessary to create feature flagged beans.
I created a common base class type for all these components so that it becomes easier for me to only fetch beans that I created for printing.
See `FeatureFlaggingApplication#printEnabledBeanNames()` method to understand this.
