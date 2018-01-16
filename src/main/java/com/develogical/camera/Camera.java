package com.develogical.camera;

public class Camera {

    Sensor sensor;

    public Camera(Sensor sensor) {
        this.sensor = sensor;
    }

    public void pressShutter() {
        // not implemented
    }

    public void powerOn() {
        // not implemented
        this.sensor.powerUp();
    }

    public void powerOff() {
       // not implemented
        this.sensor.powerDown();
    }
}

