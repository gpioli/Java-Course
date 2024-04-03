package org.piolig.patterns.decorator.decorator;

import org.piolig.patterns.decorator.Formateable;

abstract public class TextDecorator implements Formateable {

    protected Formateable text;

    public TextDecorator(Formateable text) {
        this.text = text;
    }
}
