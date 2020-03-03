package co.za.AngaDev;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest{

    @Test
    public void inheritanceTest(){
        Employee e = new Employee("Anganathi", "Ngodwane", 23,21700);
        System.out.println(e.toString());
        Assert.assertTrue(e instanceof Person);
    }

    @Test
    public void encapsulationTest(){
        Person p = new Person();
        p.setFirstName("Sinovuyo");
        p.setLastName("Lize");
        p.setAge(22);

        Assert.assertEquals(p.getFirstName(), "Sinovuyo");
        Assert.assertEquals(p.getLastName(), "Lize");
        Assert.assertEquals(p.getAge(), 22);
    }


    @Test
    public void polymorphismTest() {
        HumanBehaviour emp1 = new Employee("Mr Arinze", "Anikwue", 35, 158977);
        HumanBehaviour person = new Person("Lukanyo","Nkohla", 21);
        emp1.talk();
        emp1.walk();
        person.talk();
        person.walk();

        Assert.assertTrue(emp1 instanceof HumanBehaviour);
        Assert.assertTrue(person instanceof HumanBehaviour);
    }

    @Test
    public void compositionTest(){
        Person p = new Person();
        Person person = new Person("Aysha", "Lotter", 28, 1.8, "Light", 'F');
        Characteristics characteristics  = new Characteristics();
        characteristics.setHeight(person.getHeight());
        boolean isEqual = characteristics.getHeight() == person.getHeight();
        System.out.println(person.toStringWithChars());

        Assert.assertTrue(isEqual);
    }

}