package PPJ20.TASK2;

public class main {

    public static void main(String[] args) {

        Person p1 = new Person("Adrian", 2002);
        Person p2 = new Person("Kaja", 2003);
        Person p3 = new Person("Mateusz", 2005);
        Person p4 = new Person("Dawid");

        Person[] people = {p1, p2, p3, p4};

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p2.getName());
        System.out.println(p4.getAge());

        System.out.println();
        System.out.println();

        Person older = Person.getOlder(p1, p2);
        System.out.println(older);
        Person oldest = Person.getOldest(people);
        System.out.println(oldest);

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i] + " ");
        }

        for (int i = 1; i < people.length; i++) {
            Person key = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getAge() > key.getAge()) {
                people[j + 1] = people[j];
            }
        }


    }
}
