package co.za.AngaDev;


public class Person implements HumanBehaviour
{
    private String firstName;
    private  String lastName;
    private int age;
    private Characteristics characteristics = new Characteristics();;

    public Person(){
    }

    public  Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double height, String skinColour, char gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        characteristics.setHeight(height);
        characteristics.setSkinColour(skinColour);
        characteristics.setGender(gender);
    }

    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    //toString method
    @Override
    public String toString(){
        return "Name: " + firstName + ", Surname: " + lastName + ", Age: "+ age;
    }

    //interface methods
    @Override
    public void talk() {
        System.out.println(firstName +" is a Person and is talking.");
    }

    @Override
    public void walk() {
        System.out.println(firstName +" is a Person and is walking." );
    }

    //getters of Characteristics
    public double getHeight(){
        return characteristics.getHeight();
    }

    public String getSkinColour(){
        return characteristics.getSkinColour();
    }

    public char getGender(){
        return characteristics.getGender();
    }

    public String toStringWithChars(){
        return "Name: " + firstName + ", Surname: " + lastName + ", Age: "+ age + ", Height:" +getHeight() +", Skin: " + getSkinColour() + ", Gender: " + getGender();
    }


}

