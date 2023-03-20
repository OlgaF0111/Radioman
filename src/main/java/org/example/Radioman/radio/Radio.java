package org.example.Radioman.radio;
public class Radio {
    private int radioStationNumber;
    private int soundVolume;
    // номер следующей станции
    public void nextStationNumber() {
        if (radioStationNumber != 9) {
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
            radioStationNumber = 9;
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
        if (radioStationNumber > 9) {
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }

    //увеличьте громкость звука
    public void increaseTheSoundVolume() {
        if (soundVolume != 10) {
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
            soundVolume = 10;
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
        if (soundVolume > 10) {
            return;
        }
        this.soundVolume = soundVolume;
    }
}
