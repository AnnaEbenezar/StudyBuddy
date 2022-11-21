package TodoSystem;

import javax.swing.*;

public class Info {

    JCheckBox checkbox;
    String text;
    boolean select;
    String category;

    Info(JCheckBox checkbox, String category) {
        this.checkbox = checkbox;
        this.text = checkbox.getText();
        this.select = checkbox.isSelected();
        this.category = category;
    }

    public void loading() {
        this.text = checkbox.getText();
        this.select = checkbox.isSelected();
    }

    public String getText(){
        return text;
    }
    
    public String getCategory(){
        return category;
    }

    public boolean getSelected() {
        return select;
    }

    public JCheckBox getCheckBox() {
        return checkbox;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setSelected(boolean b) {
        select = b;
    }

    public void setCategory(String category) {
        this.category = category;
    }   

    public void setCheckBox(JCheckBox checkbox) {
        this.checkbox = checkbox;
    }
}
