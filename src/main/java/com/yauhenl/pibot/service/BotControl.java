package com.yauhenl.pibot.service;

import com.yauhenl.pibot.hardware.cascade.BotCascade;
import com.yauhenl.pibot.hardware.cascade.Motor;
import com.yauhenl.pibot.hardware.cascade.MotorKey;
import com.yauhenl.pibot.hardware.cascade.Shift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BotControl {

    private final BotCascade cascade;

    @Autowired
    public BotControl(BotCascade cascade) {
        this.cascade = cascade;
    }

    public Shift getShift() {
        return cascade.getShift();
    }

    public Map<MotorKey, Motor> getMotors() {
        return cascade.getMotors();
    }
}
