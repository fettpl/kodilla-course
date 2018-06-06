package com.kodilla.stream.beautifier;

import static com.kodilla.stream.beautifier.PoemDecorator.*;

public class PoemBeautifier {
    public void beautify(String text, String decorator, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(text, decorator);
        System.out.println("Beautified string: " + result);
    }
}
