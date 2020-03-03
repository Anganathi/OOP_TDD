package co.za.AngaDev;

public class Characteristics {
    private double height;
    private String skinColour;
    private char gender;

    public double getHeight() {
        return height;
    }

    public String getSkinColour(){
        return skinColour;
    }

    public char getGender() {
        return gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSkinColour(String skinColour) {
        this.skinColour = skinColour;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        String output = "Height: " + height + " Skin color: " + skinColour + " Gender: " + gender;
        return output;
    }
}
