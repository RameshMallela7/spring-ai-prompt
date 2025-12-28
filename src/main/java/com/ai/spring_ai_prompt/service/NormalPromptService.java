package com.ai.spring_ai_prompt.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;


@Service
public class NormalPromptService {

    private final ChatClient chatClient;

    public NormalPromptService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }
    

    public String normalProcessChat(String userMessage) {
        String response = chatClient.prompt().user(userMessage).call().content();
        return "Processed message: " + response;
    }
}
