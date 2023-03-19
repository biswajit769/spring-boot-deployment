package com.biswajitroutray.computedeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
public class ComputedeploymentApplication {

   public static void main(String[] args) {
      SpringApplication.run(ComputedeploymentApplication.class, args);
   }

   @GetMapping("hello/{name}")
   public String hello(@Valid @PathVariable("name") String name) {
      return "Hello " + name;
   }
}
