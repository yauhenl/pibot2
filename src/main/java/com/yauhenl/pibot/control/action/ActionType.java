package com.yauhenl.pibot.control.action;

import static com.yauhenl.pibot.control.action.Actions.*;

public enum ActionType {
    // Power
    ALL_MOTORS_POWER_ON(allMotorsPowerOnAction),
    ALL_MOTORS_POWER_OFF(allMotorsPowerOffAction),

    // Movement
    MOVE_FORWARD(moveForwardAction),
    MOVE_BACKWARD(moveBackwardAction),
    MOVE_LEFT(moveLeftAction),
    MOVE_RIGHT(moveRightAction),
    MOVE_STOP(stopMovingAction);

    private Action action;

    ActionType(Action action) {
        this.action = action;
    }

    public Action getAction() {
        return action;
    }
}
