package com.booleanuk.api;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/knockknock")
public class KnockKnockController {
    private ArrayList<ArrayList<String>> jokes;

    public KnockKnockController() {
        this.jokes = new ArrayList<>();

        ArrayList<String> joke1 = new ArrayList<>();
        joke1.add("Knock, knock.");
        joke1.add("Who's there?");
        joke1.add("Boo.");
        joke1.add("Boo who?");
        joke1.add("Don't cry, it's just a joke!");

        
        ArrayList<String> joke2 = new ArrayList<>();
        joke2.add("Knock, knock.");
        joke2.add("Who's there?");
        joke2.add("Lettuce.");
        joke2.add("Lettuce who?");
        joke2.add("Lettuce in, it's cold out here!");

        this.jokes.add(joke1);
        this.jokes.add(joke2);
    }

    @GetMapping("/{index}")
    public String line1(@PathVariable int index) {
        return jokes.get(index).get(0);
    }

    @GetMapping("/{index}/line2")
    public String line2(@PathVariable int index) {
        return String.join("\n", jokes.get(index).subList(0, 2));
    }

    @GetMapping("/{index}/line3")
    public String line3(@PathVariable int index) {
        return String.join("\n", jokes.get(index).subList(0, 3));
    }

    @GetMapping("/{index}/line4")
    public String line4(@PathVariable int index) {
        return String.join("\n", jokes.get(index).subList(0, 4));
    }

    @GetMapping("/{index}/line5")
    public String line5(@PathVariable int index) {
        return String.join("\n", jokes.get(index).subList(0, 5));
    }
}
