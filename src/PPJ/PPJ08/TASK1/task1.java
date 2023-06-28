package TASK1;

public class task1 {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int alfa = scanner.nextInt();
        int beta = scanner.nextInt();
        int gamma = scanner.nextInt();

        if (alfa + beta + gamma == 180) {
            System.out.println("jest to trojkat na plaszczyznie euklidesowej");
            if (alfa < 90 && beta < 90 && gamma < 90)
                System.out.println("jest ostrokatny");
            if (alfa >= 90 || beta >= 90 || gamma >= 90)
                System.out.println("nie jest ostrokatny");
        }else if(alfa + beta + gamma != 180)
            System.out.println("nie jesr to trojkat na plaszczyznie euklidesowej");
    }

}

