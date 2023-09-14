package org.piolig.recursion.example.models;

import java.util.ArrayList;
import java.util.List;

public class Component {

    private String name;
    private List<Component> children;
    private int level;

    public Component(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Component> getChildren() {
        return children;
    }

    public void setChildren(List<Component> children) {
        this.children = children;
    }

    public Component addComponent(Component c) {
        this.children.add(c);
        return this;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean hasSons(){
        return !this.children.isEmpty();
    }


}
