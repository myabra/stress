package ru.mari.stress.ui.service;

import me.xdrop.jrand.JRand;
import org.springframework.stereotype.Service;

/**
 * Created by Мария on 10.11.2018.
 */
@Service
public class MainPageService {

    public RandomFileDataTO generateRandomFileData() {
        String content = JRand.paragraph().sentences(1).gen();
        String fileName = JRand.firstname().gen() + ".txt";
        return new RandomFileDataTO(fileName, content);
    }
}
