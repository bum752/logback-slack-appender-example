package io.github.bum752.logbackslackappenderexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LogbackSlackAppenderExampleApplication {

  private static final Logger logger = LoggerFactory.getLogger(LogbackSlackAppenderExampleApplication.class);

  @GetMapping("/")
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public String fail() {
    final String message = "failed request";

    logger.error(message);
    logger.warn(message);
    logger.info(message);
    logger.debug(message);
    logger.trace(message);
    return message;
  }

  public static void main(String[] args) {
    SpringApplication.run(LogbackSlackAppenderExampleApplication.class, args);
  }

}
