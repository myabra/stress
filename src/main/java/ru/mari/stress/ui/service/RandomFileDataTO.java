package ru.mari.stress.ui.service;

/**
 * Created by Мария on 10.11.2018.
 */
public class RandomFileDataTO {
    public final String fileName;
    public final String fileContent;

    public RandomFileDataTO(String fileName, String fileContent) {
        this.fileContent = fileContent;
        this.fileName = fileName;
    }
}
