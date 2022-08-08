package ru.netology.radio;

public class Radio {
    private int maxStation;

    private int maxVolume;

    private int currentStation = maxStation;
    private int currentVolume = maxVolume;

    public Radio (int maxStation, int maxVolume){
        this.maxStation = maxStation - 1;
        this.maxVolume = maxVolume;
    }

    public Radio (){
        currentStation = 9;
    }
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }

        if (newCurrentStation > maxStation) {
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

        if (newCurrentVolume > maxVolume) {
            return;
        }

        currentVolume = newCurrentVolume;
    }

    public void increaseStation() {
        int target = currentStation + 1;

        if (target > maxStation) {
            currentStation = 0;
        } else currentStation = target;
    }

    public void decreaseStation() {

        int target = currentStation - 1;

        if (target < 0) {
            currentStation = maxStation;
        }
        else currentStation = target;
    }

    public void increaseVolume() {

        int target = currentVolume + 1;

        if (target > maxVolume) {
            currentVolume = maxVolume;
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
