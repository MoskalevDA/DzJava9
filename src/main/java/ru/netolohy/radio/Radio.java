package ru.netolohy.radio;

public class Radio {
    private int currentStation;
    private int minRadioStation;
    private int maxRadioStation;
    private int currentVolume;
    private int minVolume;
    private int maxVolume = 101;

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public Radio() {
        maxRadioStation = 10;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minRadioStation) {
            return;
        }
        if (currentStation > maxRadioStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentStation >= maxRadioStation) {
            setCurrentStation(0);
        } else {
            this.currentStation++;
        }
    }


    public void prev() {
        if (currentStation <= minRadioStation) {
            setCurrentStation(9);
        } else {
            this.currentStation--;

        }
    }

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;

        }
    }
}