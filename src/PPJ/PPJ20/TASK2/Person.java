package PPJ20.TASK2;

import java.time.LocalDate;

public class Person {

    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person(String name) {
        this(name, 1990);
    }

    public String getName (){
        return this.name;
    }

    public int getAge (){

        return LocalDate.now().getYear() - birthYear;
    }

    public static Person getOlder (Person p1, Person p2){
        if(p1.getAge() > p2.getAge()){
          return p1;
        }
        return p2;
    }

    public static Person getOldest (Person[] array){
        Person oldest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].getAge() > oldest.getAge()) {
                oldest = array[i];
            }
        }
        return oldest;
    }
}
