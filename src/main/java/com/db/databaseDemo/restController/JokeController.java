package com.db.databaseDemo.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/joke")
public class JokeController {
    Random rand = new Random();
    @GetMapping("/random")
    public Object getRandomJoke()
    {
        Map<String, Object> object = new HashMap<>();
        object.put("type", "random");
        object.put("Joke", "your sister is a cauliflower" + rand.nextInt(1000));
        return object;
    }
}
