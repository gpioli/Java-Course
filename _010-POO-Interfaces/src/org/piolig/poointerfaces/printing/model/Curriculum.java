package org.piolig.poointerfaces.printing.model;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Sheet implements Printable {

    private Person person;
    private String profession;
    private List<String> experiences;

    public Curriculum(Person person, String profession, String content) {
        super(content);
        this.person = person;
        this.profession = profession;
        // initializing the List:
        this.experiences = new ArrayList<>();
    }

    public Curriculum addExperiences(String exp) {
        this.experiences.add(exp);
        return this;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n===CV INFORMATION===\n")
                .append(person).append("\n")
                .append("Resume: ").append(this.content)
                .append("\n").append("Profession: ")
                .append(this.profession).append("\n")
                .append("Experience: \n");
        for (String exp : this.experiences) {
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
