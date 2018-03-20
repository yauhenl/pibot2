package com.yauhenl.pibot.service;

import com.yauhenl.pibot.hardware.action.ActionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class ActionHandler {

    private final BotControl botControl;

    @Autowired
    public ActionHandler(BotControl botControl) {
        this.botControl = botControl;
    }

    public Mono<ServerResponse> performAction(ServerRequest request) {
        String actionType = request.pathVariable("actionType");
        try {
            ActionType.valueOf(actionType).getAction().perform(botControl);
            return ServerResponse.ok().build();
        } catch (IllegalArgumentException e) {
            return ServerResponse.notFound().build();
        }
    }
}
