package ru.netolohy.radio;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class TestRadio {

    @Test
    void shouldSetStation() {
        Radio rad = new Radio(10);

        rad.setCurrentStation(10);

        int expected = 10;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetLessZero() {
        Radio rad = new Radio(10);

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNextStation() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(8);

        rad.next();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationZero() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(9);

        rad.next();

        int expected = 10;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNext7To8() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(7);

        rad.next();

        int expected = 8;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNext1To2() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(1);

        rad.next();

        int expected = 2;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStation() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(0);

        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStation() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(8);

        rad.prev();

        int expected = 7;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void prevStationMoreBorder() {
        Radio rad = new Radio(10);
        rad.setCurrentStation(9);

        rad.prev();

        int expected = 8;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldVolumeUp() {
        Radio rad = new Radio(10);
        rad.setCurrentVolume(99);

        rad.volumeUp();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldVolumeUpZero() {
        Radio rad = new Radio(10);
        rad.setCurrentVolume(0);

        rad.volumeUp();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void volumeUpMiddle() {
        Radio rad = new Radio(1);
        rad.setCurrentVolume(50);

        rad.volumeUp();

        int expected = 51;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolume() {
        Radio rad = new Radio(10);

        rad.setCurrentVolume(102);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeLessZero() {
        Radio rad = new Radio(10);

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void volumeDownMiddle() {
        Radio rad = new Radio(10);
        rad.setCurrentVolume(50);

        rad.volumeDown();

        int expected = 49;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void volumeDown1To0() {
        Radio rad = new Radio(10);
        rad.setCurrentVolume(1);

        rad.volumeDown();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void volumeDown100To99() {
        Radio rad = new Radio(10);
        rad.setCurrentVolume(100);

        rad.volumeDown();

        int expected = 99;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void should0() {
        Radio rad = new Radio(10);
        rad.setCurrentVolume(0);

        rad.volumeDown();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
        }
