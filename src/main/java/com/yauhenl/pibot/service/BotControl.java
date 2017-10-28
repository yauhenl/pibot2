package com.yauhenl.pibot.service;

import com.pi4j.io.gpio.GpioFactory;
import com.yauhenl.pibot.hardware.cascade.BotCascade;
import com.yauhenl.pibot.hardware.cascade.Motor;
import com.yauhenl.pibot.hardware.cascade.MotorKey;
import com.yauhenl.pibot.hardware.cascade.Shift;

import java.util.Map;

public class BotControl {

    private BotCascade cascade;
    private static BotControl botControl;

    private BotControl() {
        cascade = new BotCascade();
        cascade.initCascade(GpioFactory.getInstance());
    }

    public static BotControl getInstance() {
        if (botControl == null) {
            botControl = new BotControl();
        }
        return botControl;
    }

    public Shift getShift() {
        return cascade.getShift();
    }

    public Map<MotorKey, Motor> getMotors() {
        return cascade.getMotors();
    }
}
