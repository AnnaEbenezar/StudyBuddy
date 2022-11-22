package TodoSystem;

import javax.swing.*;

import com.google.gson.annotations.Expose;

public class Info {

    @Expose(serialize = false)
    JCheckBox checkbox;
    @Expose(serialize = true)
    String text;
    @Expose(serialize = true)
    boolean select;
    @Expose(serialize = true)
    String category;

    Info(JCheckBox checkbox, String category) {
        this.checkbox = checkbox;
        this.text = checkbox.getText();
        this.select = checkbox.isSelected();
        this.category = category;
    }

    Info(Task t, String category) {
        this.checkbox = new JCheckBox(t.taskName, t.done);
        this.text = t.taskName;
        this.select = t.done;
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
