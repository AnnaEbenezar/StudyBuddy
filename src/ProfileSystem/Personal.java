package ProfileSystem;

import java.util.ArrayList;

public class Personal {

    private String major;
    private String quote;

    ArrayList<CheckBox> goals;
    ArrayList<String> accomplishment;

    Personal() {
        goals = new ArrayList<CheckBox>();
        accomplishment = new ArrayList<String>();
    }

    Personal(Personal source) {
        this.major = source.major;
        this.quote = source.quote;

        for (CheckBox c: source.goals) {
            this.goals.add(new CheckBox(c));
        }

        for (String a: source.accomplishment) {
            this.accomplishment.add(new String(a));
        }
    }

    public String getMajor() {
        return major;
    }

    public String getQuote() {
        return quote;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public ArrayList<CheckBox> getGoals() {
        ArrayList<CheckBox> temp = new ArrayList<CheckBox>();

        for (CheckBox c: goals) {
            temp.add(new CheckBox(c));
        }

        return temp;
    }

    public void setGoals(ArrayList<CheckBox> newGoals) {
        if (this.goals != null) {
            this.goals.removeAll(goals);
        }

        for (CheckBox c: newGoals) {
            this.goals.add(new CheckBox(c));
        }
    }

    public ArrayList<String> getAccomplishment() {
        ArrayList<String> temp = new ArrayList<String>();

        for (String a: accomplishment) {
            temp.add(a);
        }

        return temp;
    }

    public void setAccomplishment(ArrayList<String> accomplishment) {
        if (this.accomplishment != null) {
            this.accomplishment.removeAll(this.accomplishment);
        }
        for (String a: accomplishment) {
            this.accomplishment.add(new String(a));
        }
    }
}

class CheckBox {

    private String name;
    private boolean isCheck;

    public CheckBox() {}

    public CheckBox(CheckBox source) {
        this.name = source.name;
        this.isCheck = source.isCheck;
    }

    public String getName() {
        return name;
    }

    public boolean isCheck() {
        return isCheck;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCheck(boolean isCheck) {
        this.isCheck = isCheck;
    }
}