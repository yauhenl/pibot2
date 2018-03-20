package com.yauhenl.pibot.hardware.action;

import com.yauhenl.pibot.service.BotControl;

public interface Action {
    void perform(BotControl botControl);
}
