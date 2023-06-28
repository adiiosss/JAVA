package PPJ07.Task5;

public class task5 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        char ch = scanner.next().charAt(0);

        if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='y')) {
            System.out.println("Podana litera jest samogloska");
        }


        else if((ch=='q')||(ch=='w')||(ch=='r')||(ch=='t')||(ch=='p')||(ch=='s')||(ch=='d')||(ch=='f')||(ch=='g')||
                (ch=='h')||(ch=='j')||(ch=='k')||(ch=='l')||(ch=='x')||(ch=='z')||(ch=='c')||(ch=='v')||(ch=='b')
                ||(ch=='n')||(ch=='m')) {
            System.out.println("Podana litera jest spolgloska");
        }


        else {
            System.out.println("Podany znak jest nie dozwolony");

        }

    }
}







