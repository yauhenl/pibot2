package com.yauhenl.pibot.service;

import com.yauhenl.pibot.control.action.ActionType;

public class ActionService {
    private static ActionService actionService;

    private ActionService() {
    }

    public static ActionService getInstance() {
        if (actionService == null) {
            actionService = new ActionService();
        }
        return actionService;
    }

    public void performAction(ActionType actionType) {
        actionType.getAction().perform(BotControl.getInstance());
    }
}
