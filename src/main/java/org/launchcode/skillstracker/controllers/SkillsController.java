package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class SkillsController {
    @GetMapping(value = "") //get stuff for our page
    @ResponseBody //response
    public String startSkills() {
        String html = "<h1>Skills Tracker</h1>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "<button onclick=\"window.location.href=''https://localhost:8800/form'\";>Change it up!</button>";
        //"<button href='form'>Change it up!</button>";

        return html;
    }

    ;

    @GetMapping(value = "form")
    @ResponseBody
    public String formSkills() {
        String html = "<form method='post'>" +
                "Name:<br>" +
                "<input type = 'text' name = 'name' />" +
                "<br>My favorite language:<br>" +
                "<select name = 'firstChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<br>My second favorite language:<br>" +
                "<select name = 'secondChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<br>My third favorite language:<br>" +
                "<select name = 'thirdChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select><br>" +
                "<input type = 'submit' value = 'Submit' />" +
                "</form>";
        return html;
    }

    ;

    @PostMapping(value = "form")
    @ResponseBody
    public String namePage(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        String html = "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>" +
                // i added this button for fun lol -hanna
                "<button onclick=\"window.location.href='http://localhost:8080'\";>reset</button>";
        return html;

    }

}