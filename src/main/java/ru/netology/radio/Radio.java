package ru.netology.radio;

public class Radio {
    private int currentStation;

    private int currentVolume;

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

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }

        if (newCurrentVolume > 10) {
            return;
        }

        currentVolume = newCurrentVolume;
    }

    public void increaseStation() {
        int target = currentStation + 1;

        if (target > 9) {
            currentStation = 0;
        } else currentStation = target;
    }

    public void decreaseStation() {

        int target = currentStation - 1;

        if (target < 0) {
            currentStation = 9;
        }
        else currentStation = target;
    }

    public void increaseVolume() {

        int target = currentVolume + 1;

        if (target > 10) {
            currentVolume = 10;
        }

        else currentVolume = target;
    }

    public void decreaseVolume() {

        int target = currentVolume - 1;

        if (target < 0) {
            currentVolume = 0;
        }

        else currentVolume = target;
    }
}
