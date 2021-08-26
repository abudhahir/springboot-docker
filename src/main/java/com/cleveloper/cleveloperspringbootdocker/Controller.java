/**
 * Abudhahir
 */
package com.cleveloper.cleveloperspringbootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class Controller {

    @GetMapping("/")
    public String home() {
        return "Dockerize this application ... " + LocalDateTime.now() ;
    }
}
