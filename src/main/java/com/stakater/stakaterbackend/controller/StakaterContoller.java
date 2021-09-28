package com.stakater.stakaterbackend.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*** This class is controller class responsible to support stakater greetings api
 * @author jay
 */

@RestController
@RequestMapping("/api")
public class StakaterContoller {

    /*** This API is get api which returns Hello {Name} string
     *
     * @return String
     */

    @CrossOrigin
    @GetMapping(path = "/greetings")
    public String getHelloString() {
        String response = System.getenv("NAME");
        return "Hello " + response;
    }
}
