package org.example.mcpclient.controlers;
import org.example.mcpclient.agents.MistralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ai")
public class AiControllers {

    @Autowired
    private MistralService mistralService;

    @GetMapping("/ask")
    public String ask(@RequestParam String question) {
        return mistralService.askMistral(question).block(); // .block() pour simplifier
    }
}
