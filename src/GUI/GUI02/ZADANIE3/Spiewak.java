package GUI.GUI02.ZADANIE3;


abstract class Spiewak {

    private static int number = 1;  //licznik
    private String surname;
    private int start_number;

    public Spiewak(String surname) {
        this.surname = surname;
        this.start_number = number++;  //dla powiekszenia licznika o 1 numer
    }


    public String getSurname() {    //zwort imienia
        return surname;
    }


    public int getStart_number() {   //zwrot numeru startowego, ktory jest rowny licznikowi powiekszonemu o 1
        return start_number;
    }


    public abstract String spiewaj();  //metoda abstrakcyjna spiewaj


    @Override
    public String toString() {
        return "(" + start_number + ") " + surname + ": " + spiewaj();    //adnotacja zwracajaca numer startowy, nazwisko oraz metode abstrakcyjna spiewaj
    }

    public static Spiewak najglosniej(Spiewak[] sp)      /*metoda przyjmujaca tablice obiektow spiewak w którego śpiewanym tekście suma
                                                         kodów największej cyfry (z zakresu '0' - '9') i największej litery (z zakresu 'a' - 'z')
                                                         jest największa (np. w tekście zwróconym przez metodę spiewaj()
                                                         - "Hi...Hello...2023" największa cyfra to '3', największa litera to 'o',
                                                         suma kodów '3' + 'o' = 51 + 111 = 162). Można założyć, że kod = 0 jeśli w tekście
                                                         nie występują cyfry/litery.*/

    {
        Spiewak naglosniejszy = sp[0];
        int maxSum = 0;             //maxymalna suma najglosniejszego spiewaka

        for (Spiewak s : sp) {
            String dzwiek = s.spiewaj();
            int sum = 0;

            char minDigit = '0';    //minimalna liczba
            char minLetter = 'a';   //minimalna litera


            for (int i = 0; i < dzwiek.length(); i++)
            {
                char c = dzwiek.charAt(i);

                if (Character.isDigit(c) && c > minDigit)
                {
                    minDigit = c;
                }

                if (Character.isLetter(c) && c > minLetter)
                {
                    minLetter = c;
                }
            }

            sum = minDigit + minLetter;
            if (sum > maxSum)
            {
                maxSum = sum;
                naglosniejszy = s;
            }

        }
        return naglosniejszy;
    }

}
