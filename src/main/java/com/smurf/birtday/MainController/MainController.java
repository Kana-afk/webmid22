package com.smurf.birtday.MainController;

import com.smurf.birtday.models.Day;
import com.smurf.birtday.repo.DayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private DayRepository Dayrepository;

    @GetMapping("/")
    public String home(Model model){
        Iterable<Day> posts = Dayrepository.findAll();
        model.addAttribute("posts", posts);
        return "home";
    }

    @PostMapping("/")
    public String DataAdd(@RequestParam String name, @RequestParam String data, Model model){
        Day post = new Day (name, data);
        Dayrepository.save(post);
        return "redirect:/";
    }

}