package ru.netolohy.radio;

public class Radio {
    private int currentStation;
    private int minRadioStation = 0;
    private int quantityRadioStations;
    private int currentVolume;
    private int minVolume;
    private int maxVolume = 100;

    public Radio(int standardRadioStations) {
        this.quantityRadioStations = standardRadioStations;
    }

    public Radio() {
        quantityRadioStations = 9;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minRadioStation) {
            return;
        }
        if (currentStation > quantityRadioStations) {
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
        if (currentStation >= quantityRadioStations) {
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