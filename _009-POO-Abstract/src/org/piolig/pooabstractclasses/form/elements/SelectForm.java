package org.piolig.pooabstractclasses.form.elements;

import org.piolig.pooabstractclasses.form.elements.select.Option;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends FormElement {

    private List<Option> options;

    public SelectForm(String name) {
        super(name);
        // initialize array
        this.options = new ArrayList<Option>();
    }

    public SelectForm(String name, List<Option> options) {
        super(name);
        this.options = options;
    }

    public SelectForm addOption(Option option) {
        this.options.add(option);
        return this;
    }

    @Override
    public String drawHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(this.name)
                .append("'>");

        for(Option option: this.options){
            sb.append("\n<option value='")
                    .append(option.getValue())
                    .append("'");
            if (option.isSelected()){
                sb.append(" selected");
                this.value = option.getValue();
            }
            sb.append(">")
                    .append(option.getName())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
