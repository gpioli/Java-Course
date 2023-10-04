package org.piolig.patterns.decorator.decorator;

import org.piolig.patterns.decorator.Formateable;

public class ReplaceSpaceDecorator extends TextDecorator{
    public ReplaceSpaceDecorator(Formateable text) {
        super(text);
    }

    @Override
    public String giveFormat() {
        return text.giveFormat().replace(" ", "_");
    }
}
