package ru.mari.stress.ui.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mari.stress.ui.service.MainPageService;

/**
 * Created by Мария on 01.11.2018.
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "index.html";
    }

}
