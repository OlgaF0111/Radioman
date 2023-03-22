package org.example.Radioman.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class RadioTest {
    //номер радиостанции в конструкторе с параметрами
    @ParameterizedTest
    @CsvSource({
            "30,30",
            "40,40",
            "10,10",
            "11,11",
            "49,49",
            "50,0",
            "51,0",
            "-50,0"
    })
    public void settingTheRadioStationNumber(int radioStationNumber, int expected) {
        Radio service = new Radio(50);
        service.setRadioStationNumber(radioStationNumber);

        int actual = service.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //номер предыдущей радиостанции с параметрами
    @ParameterizedTest
    @CsvSource({
            "0,49",
            "49,48",
            "10,9",
            "11,10",
            "25,24"
    })
    public void radioStationNumberWhenSwitching(int radioStationNumber, int expected) {
        Radio service = new Radio(50);
        service.setRadioStationNumber(radioStationNumber);

        service.previousStationNumber();

        int actual = service.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //номер следующей радиостанции с параметрами
    @ParameterizedTest
    @CsvSource({
            "9,10",
            "10,11",
            "36,37",
            "48,49",
            "49,0"
    })
    public void theTextStationTheMaxRange(int radioStationNumber, int expected) {
        Radio service = new Radio(50);
        service.setRadioStationNumber(radioStationNumber);

        service.nextStationNumber();

        int actual = service.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //номер радиостанции без параметров
    @ParameterizedTest
    @CsvSource({
            "5,5",
            "8,8",
            "9,9",
            "10,0",
            "0,0",
            "1,1",
            "-1,0",
            "-4,0",
            "11,0"
    })
    public void RadioStationNumber(int radioStationNumber, int expected) {
        Radio service = new Radio();
        service.setRadioStationNumber(radioStationNumber);

        int actual = service.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //следующая радиостанция без параметров
    @ParameterizedTest
    @CsvSource({
            "7,8",
            "0,1",
            "1,2",
            "2,3",
            "8,9",
            "9,0"
    })
    public void switchingToTheNextRadioStation(int radioStationNumber, int expected) {
        Radio service = new Radio();
        service.setRadioStationNumber(radioStationNumber);

        service.nextStationNumber();

        int actual = service.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //предыдущая радиостанция без параметров
    @ParameterizedTest
    @CsvSource({
            "5,4",
            "9,8",
            "8,7",
            "0,9",
            "1,0",
            "2,1"
    })
    public void switchingToThePreviousRadioStation(int radioStationNumber, int expected) {
        Radio service = new Radio();
        service.setRadioStationNumber(radioStationNumber);

        service.previousStationNumber();

        int actual = service.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //уровень громкости
    @ParameterizedTest
    @CsvSource({
            "50,50",
            "35,35",
            "10,10",
            "100,100",
            "99,99",
            "101,0",
            "0,0",
            "1,1",
            "2,2",
            "-1,0",
            "-100,0"
    })
    public void volumeLevel(int soundVolume, int expected) {
        Radio service = new Radio();
        service.setSoundVolume(soundVolume);

        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    //увеличение громкости
    @ParameterizedTest
    @CsvSource({
            "60,61",
            "0,1",
            "1,2",
            "2,3",
            "54,55",
            "99,100",
            "100,0",
            "10,11",
            "15,16",
            "9,10"
    })
    public void increaseTheVolume(int soundVolume, int expected) {
        Radio service = new Radio();
        service.setSoundVolume(soundVolume);

        service.increaseTheSoundVolume();

        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    //уменьшение громкости
    @ParameterizedTest
    @CsvSource({
            "45,44",
            "0,100",
            "100,99",
            "99,98",
            "20,19",
            "10,9",
            "9,8",
            "88,87"
    })
    public void reducingTheSoundVolume(int soundVolume, int expected) {
        Radio service = new Radio();
        service.setSoundVolume(soundVolume);

        service.reduceTheSoundVolume();

        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}

