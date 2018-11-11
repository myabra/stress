package ru.mari.stress.ui.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.mari.stress.ui.service.MainPageService;
import ru.mari.stress.ui.service.RandomFileDataTO;

/**
 * Created by Мария on 10.11.2018.
 */
@RestController
@RequestMapping("/")
public class MainRestContoller {

    @Autowired
    private MainPageService service;

    @RequestMapping(path = "generateFileData", method = RequestMethod.POST)
    public RandomFileDataTO generateFileData() {
        return service.generateRandomFileData();
    }
}
