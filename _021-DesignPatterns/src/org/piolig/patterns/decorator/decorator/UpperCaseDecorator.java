package org.piolig.patterns.decorator.decorator;

import org.piolig.patterns.decorator.Formateable;

public class UpperCaseDecorator extends TextDecorator{
    public UpperCaseDecorator(Formateable text) {
        super(text);
    }

    @Override
    public String giveFormat() {
        return text.giveFormat().toUpperCase();
    }
}
