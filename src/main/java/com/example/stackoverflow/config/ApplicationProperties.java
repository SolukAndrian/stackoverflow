package com.example.stackoverflow.config;

import java.nio.file.Path;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class ApplicationProperties {
  private Path path;

  public Path getPath() {
    return path;
  }

  public void setPath(Path path) {
    this.path = path;
  }
}
