package org.example.Radioman.radio;

public class Radio {
    private int radioStationNumber;
    private int soundVolume;
    private int maxRadioStations;
    private int maxVolumeLevel = 100;

    //кол-во радиостанций по умолчанию
    public Radio() {

        maxRadioStations = 9;
    }

    // кол-во радиостанций всего
    public Radio(int radioStationNumber) {

        maxRadioStations = radioStationNumber - 1;
    }

    // номер следующей станции
    public void nextStationNumber() {
        if (radioStationNumber != maxRadioStations) {
            radioStationNumber++;
        } else {
            radioStationNumber = 0;
        }
    }

    //предыдущий номер станции
    public void previousStationNumber() {
        if (radioStationNumber != 0) {
            radioStationNumber--;
        } else {
            radioStationNumber = maxRadioStations;
        }
    }

    //узнать номер радиостанции
    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    //установите номер радиостанции
    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber < 0) {
            return;
        }
        if (radioStationNumber > maxRadioStations) {
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }

    //увеличьте громкость звука
    public void increaseTheSoundVolume() {
        if (soundVolume != maxVolumeLevel) {
            soundVolume++;
        } else {
            soundVolume = 0;
        }
    }

    //уменьшите громкость звука
    public void reduceTheSoundVolume() {
        if (soundVolume != 0) {
            soundVolume--;
        } else {
            soundVolume = maxVolumeLevel;
        }
    }

    //увеличьте громкость звука
    public int getSoundVolume() {
        return soundVolume;
    }

    //установите громкость звука
    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > maxVolumeLevel) {
            return;
        }
        this.soundVolume = soundVolume;
    }
}
