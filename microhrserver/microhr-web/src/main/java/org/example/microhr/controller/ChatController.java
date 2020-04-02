package org.example.microhr.controller;

import org.example.microhr.model.Hr;
import org.example.microhr.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatController {


    @Autowired
    private HrService hrService;
    @GetMapping("/hrs")
    List<Hr> getAllHrs(){
        return hrService.getAllHrsExceptCurrentHr();
    }


}
