package org.piolig.patterns.decorator;

import org.piolig.patterns.decorator.decorator.ReplaceSpaceDecorator;
import org.piolig.patterns.decorator.decorator.ReverseDecorator;
import org.piolig.patterns.decorator.decorator.UnderlineDecorator;
import org.piolig.patterns.decorator.decorator.UpperCaseDecorator;

public class DecoratorExample {
    public static void main(String[] args) {

        Formateable text = new Text("Hello, what's up Gaston?!");

        UpperCaseDecorator ud = new UpperCaseDecorator(text);
        System.out.println("ud = " + ud.giveFormat());
        ReverseDecorator rd = new ReverseDecorator(ud);
        System.out.println("rd = " + rd.giveFormat());
        UnderlineDecorator uld = new UnderlineDecorator(rd);

        System.out.println(uld.giveFormat());

        ReplaceSpaceDecorator rpd = new ReplaceSpaceDecorator(uld);
        System.out.println("rpd = " + rpd.giveFormat());

    }
}
