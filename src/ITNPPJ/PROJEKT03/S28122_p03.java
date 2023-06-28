package ITNPPJ.PROJEKT03;

import java.io.*;

public
class S28122_p03 {
    public static void main(String[] args) throws IOException {

        String wilczyPlik = "wilki.txt";

        Ssak[] stadoALFA = {
                new Wilk("SamiecAlfa1", (short) 2008, false, "ALFA", 1),
                new Wilk("SamiecAlfa2", (short) 2009, false, "ALFA", 2),
                new Wilk("SamiecAlfa3", (short) 2010, true, "ALFA", 3),
                new Wadera("SamicaAlfa1", (short) 2008, false, 1),
                new Wadera("SamicaAlfa2", (short) 2009, false, 0),
                new Wadera("SamicaAlfa3", (short) 2010, true, 1)
        };

        Ssak[] stadoBETA = {
                new Wilk("SamiecBeta1", (short) 2008, false, "BETA", 1),
                new Wilk("SamiecBeta2", (short) 2009, false, "BETA", 2),
                new Wilk("SamiecBeta3", (short) 2010, true, "BETA", 3),
                new Wadera("SamicaBeta1", (short) 2008, false, 1),
                new Wadera("SamicaBeta2", (short) 2009, false, 0),
                new Wadera("SamicaBeta3", (short) 2010, true, 1)
        };

        if(istnieje(wilczyPlik)) {
           zaladuj(wilczyPlik);
        } else {
            FileOutputStream fileOutputStream = new FileOutputStream(wilczyPlik);
            for (Ssak ssak : stadoALFA) {
                ssak.zapisz(fileOutputStream);
            }
            for (Ssak ssak : stadoBETA) {
                ssak.zapisz(fileOutputStream);
            }
            fileOutputStream.close();
        }

        for (Ssak ssak : stadoALFA) {
            ssak.przedstawSie();
        }

        for (Ssak ssak : stadoBETA) {
            ssak.przedstawSie();
        }
    }

    public static boolean istnieje(String nazwaPliku) {
        File plik = new File(nazwaPliku);
        return plik.exists();
    }

    public static Ssak[] zaladuj(String sciezka){

        System.out.println();

        try (BufferedReader br = new BufferedReader(new FileReader(sciezka))) {
            String linia;
            while ((linia = br.readLine()) != null) {
                System.out.println(linia);
            }
        } catch (IOException e) {
            System.out.println("BLAD ODCZYTU");
            e.printStackTrace();
        }
        return new Ssak[0];
    }
}

class Ssak {
    private String imie;
    private short rokUrodzenia;
    private boolean mlody;

    public Ssak(String imie, short rokUrodzenia, boolean mlody) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
        this.mlody = mlody;
    }

    public String przedstawSie() {
        return this.getClass().getSimpleName() + "," + imie + "," + rokUrodzenia + "," + mlody;
    }

    public void zapisz(FileOutputStream fos) throws IOException {
        String data = this.przedstawSie() + "\n";
        fos.write(data.getBytes());
    }
}

class Wadera extends Ssak {
    private int iloscSzczeniat;

    public Wadera(String imie, short rokUrodzenia, boolean mlody, int iloscSzczeniat) {
        super(imie, rokUrodzenia, mlody);
        this.iloscSzczeniat = iloscSzczeniat;
    }

    @Override
    public String przedstawSie() {
        return super.przedstawSie() + "," + iloscSzczeniat + ";";
    }
}

class Wilk extends Ssak {
    private String nazwaStada;
    private int pozycja;

    public Wilk(String imie, short rokUrodzenia, boolean mlody, String nazwaStada, int pozycja) {
        super(imie, rokUrodzenia, mlody);
        this.nazwaStada = nazwaStada;
        this.pozycja = pozycja;
    }

    @Override
    public String przedstawSie() {
        return super.przedstawSie() + "," + nazwaStada + "," + pozycja + ";";
    }
}


