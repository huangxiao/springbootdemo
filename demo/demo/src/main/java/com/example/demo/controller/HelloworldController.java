package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by user on 2017/11/1.
 */
@Api(tags="best")
@RestController
@RequestMapping("/best")

public class HelloworldController {


    @ApiOperation(value = "print helloworld",notes = "")
    @RequestMapping(value = {"/first"},method = RequestMethod.GET)
    String home(){
        return "helloworld";
    }

//    @RequestMapping("/hello/{yourname}")
//    String index(@PathVariable String yourname){
//        return "say hello to "+ yourname;
//    }
}



