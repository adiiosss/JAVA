package PPJ17.TASK3;

public class task3 {
    public static void main(String[] args) {
        char[] tab = {'a','n','n','a'};
        System.out.println(isPalindrom(tab));
        char[] tab1 = {'a','n','j','n','a'};
        System.out.println(isPalindrom(tab1));
        char[] tab2 = {'a','x','n','a'};
        System.out.println(isPalindrom(tab2));
    }
    public static boolean isPalindrom(char[] word){
        if(word.length <= 1)
            return true;
        else{
            boolean test = word[0] == word[word.length-1];
            char[] temp = new char[word.length-2];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = word[i+1];
            }
            return test && isPalindrom(temp);
        }
    }
}
