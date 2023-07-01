package fr.railway.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping(value = "/student/{studentId}")
    public String getTestData(@PathVariable Integer studentId) {
        return studentId.toString();
    }
}