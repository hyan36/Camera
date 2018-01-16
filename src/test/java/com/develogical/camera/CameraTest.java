package com.develogical.camera;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static org.mockito.Mockito.*;

public class CameraTest {


    Sensor sensor = mock(Sensor.class);
    Camera myCamera = new Camera(sensor);


    @Test
    public void switchingTheCameraOnPowersUpTheSensor() {
        // write your test here
        myCamera.powerOn();
        verify(sensor).powerUp();
    }

    @Test
    public void switchingTheCameraOffPowersDownTheSensor() {
        myCamera.powerOff();
        verify(sensor).powerDown();
    }
}
