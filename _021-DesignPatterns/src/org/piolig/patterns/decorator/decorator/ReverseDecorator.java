package org.piolig.patterns.decorator.decorator;

import org.piolig.patterns.decorator.Formateable;

public class ReverseDecorator extends TextDecorator{
    public ReverseDecorator(Formateable text) {
        super(text);
    }

    @Override
    public String giveFormat() {
        StringBuilder sb = new StringBuilder(text.giveFormat());
        return sb.reverse().toString();
    }
}
