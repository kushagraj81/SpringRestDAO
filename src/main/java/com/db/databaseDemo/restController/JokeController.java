package com.db.databaseDemo.restController;

import com.db.databaseDemo.Exception.ArraySizeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/joke")
public class JokeController {
    Random rand = new Random();
    List<Object> arr= new ArrayList<>();

    public JokeController()
    {
        arr.add("Kushagra is a fool 0");
        arr.add("Kushagra is a fool 1");
        arr.add("Kushagra is a fool 2");
        arr.add("Kushagra is a fool 3");
    }
    @GetMapping("/random/{jokeid}")
    public Object getRandomJoke(@PathVariable int jokeid)
    {
        Map<String, Object> object = new HashMap<>();
        object.put("type", "random");
        object.put("Joke", "your sister is a cauliflower" + rand.nextInt(1000));
        object.put("joke",jokeid);
        return object;
    }
    @GetMapping("/list/{jokeid}")
    public Object getJokeFromList(@PathVariable int jokeid)
    {
        if(jokeid >=arr.size())
        {
            throw new ArraySizeException("The id given is out array bounds: " + jokeid);
        }
        return arr.get(jokeid);
    }
//to handle all exception

    @ExceptionHandler
    public ResponseEntity<Object> throwArraySizeException(Exception exc)
//    public ResponseEntity<Object> throwArraySizeException(ArraySizeException exc)
    {
        return new ResponseEntity<>(exc.getMessage(), HttpStatus.NOT_FOUND);
    }
}
