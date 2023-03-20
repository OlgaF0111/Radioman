package org.example.Radioman.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    //номер радиостанции
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

    //следующая радиостанция
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

    //предыдущая радиостанция
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
            "5,5",
            "9,9",
            "10,10",
            "11,0",
            "0,0",
            "1,1",
            "2,2",
            "-1,0"
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
            "6,7",
            "0,1",
            "1,2",
            "2,3",
            "8,9",
            "9,10",
            "10,0"
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
            "5,4",
            "0,10",
            "1,0",
            "2,1",
            "10,9",
            "9,8",
            "8,7"
    })
    public void reducingTheSoundVolume(int soundVolume, int expected) {
        Radio service = new Radio();
        service.setSoundVolume(soundVolume);

        service.reduceTheSoundVolume();

        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}

