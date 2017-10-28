package com.yauhenl.pibot.hardware.cascade;

import com.pi4j.io.gpio.GpioPinDigitalOutput;

public class Motor {

    private GpioPinDigitalOutput outputChannel;

    Motor(GpioPinDigitalOutput outputChannel) {
        this.outputChannel = outputChannel;
    }

    public void setHighOutput() {
        outputChannel.high();
    }

    public void setLowOutput() {
        outputChannel.low();
    }
}
