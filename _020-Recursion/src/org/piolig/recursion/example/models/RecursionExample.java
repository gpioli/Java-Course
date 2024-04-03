package org.piolig.recursion.example.models;

import java.util.stream.Stream;

public class RecursionExample {
    public static void main(String[] args) {

        Component pc = new Component("Gabinete PC ATX");
        Component powerUnit = new Component("Power Unit 700w");
        Component motherboard = new Component("Motherboard Asus sockets AMD");
        Component cpu = new Component("Cpu AMD Ryzen 5 2800");
        Component fan = new Component("CPU fan");
        Component heatsink = new Component("heatsink");
        Component gpu = new Component("Nvidia RTX 3080 8GB");
        Component graphicCard = new Component("Nvidia GPU RTX");
        Component gpuRam = new Component("4GB RAM");
        Component gpuRam2 = new Component("4GB RAM");
        Component gpuFans = new Component("Fans");
        Component ram = new Component("Ram stick 32 GB");
        Component ssd = new Component("SSD 2TB");

        cpu.addComponent(fan)
                .addComponent(heatsink);
        graphicCard.addComponent(gpu)
                .addComponent(gpuRam)
                .addComponent(gpuRam2)
                .addComponent(gpuFans);
        motherboard.addComponent(graphicCard)
                .addComponent(ram)
                .addComponent(ssd);
        pc.addComponent(powerUnit)
                .addComponent(motherboard)
                .addComponent(new Component("Keyboard"))
                .addComponent(new Component("Mouse"));

        recursiveStreamMethod(pc, 0).forEach(c -> System.out.println("\t".repeat(c.getLevel()) + c.getName()));
    }

    //
    public static void recursiveMethod(Component component, int level) {
        System.out.println("\t".repeat(level) + component.getName());
        if (component.hasSons()) {
            for (Component son : component.getChildren()) {
                recursiveMethod(son, level + 1);
            }
        }
    }

    public static Stream<Component> recursiveStreamMethod(Component component, int level) {
        component.setLevel(level);
        return Stream.concat(Stream.of(component),
                component.getChildren().stream().flatMap(child -> recursiveStreamMethod(child, level + 1)));
    }
}
