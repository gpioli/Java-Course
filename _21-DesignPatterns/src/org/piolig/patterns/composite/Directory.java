package org.piolig.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Component{

    private List<Component> sons;

    public Directory(String name) {
        super(name);
        this.sons = new ArrayList<>();
    }

    public Directory addComponent (Component c){
        sons.add(c);
        return this;
    };

    public void removeComponent(Component c){
        sons.remove(c);
    }

    @Override
    public String show(int level) {
        StringBuilder sb = new StringBuilder("\t".repeat(level));
        sb.append(name)
                .append("/")
                .append("\n");
        for(Component son: this.sons){
            sb.append(son.show(level+1));
            if(son instanceof File) {
                sb.append("\n");
            }

        }
        return sb.toString();
    }

    @Override
    public boolean search(String name) {
        if (this.name.equalsIgnoreCase(name)){
            return true;
        }

        return sons.stream().anyMatch(s -> s.search(name));

        /*for (Component son: sons){
            if (son.search(name)){
                return true;
            }
        }
        return false;*/
    }
}
