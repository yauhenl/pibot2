package com.yauhenl.pibot.control.action;

import com.yauhenl.pibot.hardware.cascade.Motor;

class Actions {
    private static final int BACKWARD_SHIFT_VAL = 156;
    private static final int FORWARD_SHIFT_VAL = 99;
    private static final int LEFT_SHIFT_VAL = 46;
    private static final int RIGHT_SHIFT_VAL = 209;
    private static final int STOP_SHIFT_VAL = 0;

    static Action moveBackwardAction = botControl -> botControl.getShift().writeShift(BACKWARD_SHIFT_VAL);

    static Action moveForwardAction = botControl -> botControl.getShift().writeShift(FORWARD_SHIFT_VAL);

    static Action moveLeftAction = botControl -> botControl.getShift().writeShift(LEFT_SHIFT_VAL);

    static Action moveRightAction = botControl -> botControl.getShift().writeShift(RIGHT_SHIFT_VAL);

    static Action stopMovingAction = botControl -> botControl.getShift().writeShift(STOP_SHIFT_VAL);

    static Action allMotorsPowerOffAction = botControl -> botControl.getMotors().values().forEach(Motor::setLowOutput);

    static Action allMotorsPowerOnAction = botControl -> botControl.getMotors().values().forEach(Motor::setHighOutput);
}
