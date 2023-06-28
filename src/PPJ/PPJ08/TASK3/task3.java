package TASK3;

public class task3 {
    public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("ile masz punktow ?");
    double pkt = scanner.nextDouble();
    System.out.println("na ile mozliwych ?");
    double maxpkt = scanner.nextDouble();

    double percent = ((pkt*100.)/maxpkt);
    System.out.println("masz "+percent+"%");

    if(percent >= 87.5 && percent <= 100.){
        System.out.println("otrzymujesz ocene : 5");
    }else if(percent >= 81.25 && percent <= 87.4){
        System.out.println("otzrymujesz ocene : 4.5");
    }else if(percent >= 75. && percent <= 81.24){
        System.out.println("otrzymujesz ocene : 4");
    }else if(percent >= 62.6 && percent <=74.9){
        System.out.println("otrzymujesz ocene : 3.5");
    }else if(percent >= 50. && percent <= 62.5){
        System.out.println("otrzymujesz ocene : 3");
    }else if(percent < 50.){
        System.out.println("nie zdajesz");
    }

}

}
