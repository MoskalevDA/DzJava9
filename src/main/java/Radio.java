public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }
    public void next() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation > 9) {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation < 9) {
            currentStation = currentStation - 1;
        }
        if (currentStation < 0) {
            currentStation = 9;
        }
    }
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void volumeUp() {
        if (currentVolume < 100) {
            currentVolume = currentVolume +1;
        }
        if (currentVolume > 100) {
            currentVolume = 0;
        }
    }

    public void volumeDown() {
        if (currentVolume < 100) {
            currentVolume = currentVolume -1;
        }
        if (currentVolume < 0) {
            currentVolume = 100;
        }
    }

}