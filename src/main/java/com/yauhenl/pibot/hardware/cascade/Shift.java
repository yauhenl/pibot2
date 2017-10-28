package com.yauhenl.pibot.hardware.cascade;

import com.pi4j.io.gpio.GpioPinDigitalOutput;

import static com.pi4j.wiringpi.Shift.LSBFIRST;
import static com.pi4j.wiringpi.Shift.shiftOut;

public class Shift {
    private GpioPinDigitalOutput clk;
    private GpioPinDigitalOutput ser;
    private GpioPinDigitalOutput latch;

    Shift(GpioPinDigitalOutput clk, GpioPinDigitalOutput ser, GpioPinDigitalOutput latch) {
        this.clk = clk;
        this.ser = ser;
        this.latch = latch;
    }

    public void writeShift(int value) {
        latch.low();
        shiftOut((byte) ser.getPin().getAddress(), (byte) clk.getPin().getAddress(), (byte) LSBFIRST, (byte) value);
        latch.high();
    }
}
