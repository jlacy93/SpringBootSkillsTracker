package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class SkillsController {
    @GetMapping(value="") //get stuff for our page
    @ResponseBody //response
    public String startSkills(){
        String html =  "<h1>Skills Tracker</h1>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "<button onclick=\"window.location.href=''https://localhost:8800/form'\";>Change it up!</button>";
        //"<button href='form'>Change it up!</button>";

        return html;
    };

    @GetMapping(value="form")
    @ResponseBody
    public String formSkills(){
        String html = "<form method = 'post'>" +
                "Name:<br>" +
                "<input type = 'text' name = 'name' />" +
                "</form>";
        return  html;
    };

    @PostMapping(value="form")
    @ResponseBody
    public String namePage(@RequestParam String name){
        String html = "<h1>" + name + "</h1>" +
                "<li>" + firstChoice + "</l1>";
        return html;
    };


}
