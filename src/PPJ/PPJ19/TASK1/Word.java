package PPJ19.TASK1;

public class Word {

    private char[] tab;
    private int length;

public Word(){
    this.tab = new char [100];
    this.length = 0;
}

    public void addChar(char a) {
    this.tab[this.length] = a;
    this.length++;


    }

    public void show(){
        for (int i = 0; i < this.length ; i++) {
            System.out.print(this.tab[i]);
        }

    }

    public int length(){
    return this.length;

    }

}


