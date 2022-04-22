package springboot.multiplejars.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api")

public class TestController {

    @GetMapping(path = "testHello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getHello() {

        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

}