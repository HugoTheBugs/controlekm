package com.hugoferreira.controlekm.controller;

import com.hugoferreira.controlekm.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonController {

    @GetMapping("/persons")
    public String listPerson(Model model){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Hugo", "hugo@fema.edu.br", "18988025850"));
        persons.add(new Person(2, "Robin", "robin@fema.edu.br", "18988025850"));
        persons.add(new Person(3, "Batman", "batman@fema.edu.br", "18988025850"));
        persons.add(new Person(4, "Super", "super@fema.edu.br", "18988025850"));
        model.addAttribute("persons", persons);
        return "person-list";
    }

    @GetMapping("/profile")
    public String showPersonProfile(Model model){
        Person person = new Person(1, "Hugo", "hugo@fema.edu.br", "18988025850");
        model.addAttribute("person", person);
        return "person-profile";
    }
}
