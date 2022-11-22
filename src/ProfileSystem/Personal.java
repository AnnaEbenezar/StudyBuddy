package ProfileSystem;

import java.util.ArrayList;

public class Personal {
    private String major;
    private String quote;
    private ArrayList<Checkbox> accomplishment;
    private ArrayList<Checkbox> personalGoal;

    public Personal() {
        accomplishment = new ArrayList<Checkbox>();
        personalGoal = new ArrayList<Checkbox>();
    }

    public Personal(Personal source) {
        this.major = source.major;
        this.quote = source.quote;
        this.accomplishment = source.getAccomplishment();
        this.personalGoal = source.getPersonalGoal();
    }
    
    public String getMajor() {
        return major;
    }

    public String getQuote() {
        return quote;
    }

    public ArrayList<Checkbox> getAccomplishment() {
        ArrayList<Checkbox> temp = new ArrayList<Checkbox>();

        for (Checkbox c: accomplishment) {
            temp.add(new Checkbox(c));
        }

        return temp;
    }

    public ArrayList<Checkbox> getPersonalGoal() {
        ArrayList<Checkbox> temp = new ArrayList<Checkbox>();

        for (Checkbox c: personalGoal) {
            temp.add(new Checkbox(c));
        }

        return temp;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setAccomplishment(ArrayList<Checkbox> accomplishment) {
        this.accomplishment = new ArrayList<Checkbox>();
        for (Checkbox c: accomplishment) {
            this.accomplishment.add(new Checkbox(c));
        }
    }

    public void setPersonalGoal(ArrayList<Checkbox> personalGoal) {
        this.personalGoal = new ArrayList<Checkbox>();
        for (Checkbox c: personalGoal) {
            this.personalGoal.add(new Checkbox(c));
        }
    }

}

class Checkbox {
    private boolean isChecked;
    private String name;

    public Checkbox() {};

    public Checkbox(Checkbox source) {
        this.isChecked = source.isChecked;
        this.name = source.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }
    

}