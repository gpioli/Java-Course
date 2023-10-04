package org.piolig.patterns.decorator.decorator;

import org.piolig.patterns.decorator.Formateable;

public class UnderlineDecorator extends TextDecorator{
    public UnderlineDecorator(Formateable text) {
        super(text);
    }

    @Override
    public String giveFormat() {
        int length = text.giveFormat().length();
        StringBuilder sb = new StringBuilder(text.giveFormat());
        sb.append("\n");
        for(int i=0; i< length; i++){
            sb.append("_");

        }
        return sb.toString();
    }
}
