package com.example.chatserver;

import java.util.Collections;
import java.util.List;

import com.example.chatserver.types.Message;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;

@DgsComponent
public class MessageDataFetcher {

    @DgsData(parentType = "Query", field= "messages")
    public List<Message> listMessages() {
        return Collections.emptyList();
    }
}
