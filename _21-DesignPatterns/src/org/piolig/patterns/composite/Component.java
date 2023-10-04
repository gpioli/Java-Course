package org.piolig.patterns.composite;

import java.util.Objects;

public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    };

    public String getName() {
        return this.name;
    }

    abstract public String show(int level);
    abstract public boolean search(String name);

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Component component = (Component) object;
        return Objects.equals(name, component.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
