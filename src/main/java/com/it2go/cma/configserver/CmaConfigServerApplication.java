package com.it2go.cma.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CmaConfigServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(CmaConfigServerApplication.class, args);
  }

}
