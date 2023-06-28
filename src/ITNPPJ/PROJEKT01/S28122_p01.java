package ITNPPJ.PROJEKT01;

import java.util.Scanner;

public
    class S28122_p01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int value_1 = 1;
        int value_2 = 1;
        int valueTemplate_1;
        int valueTemplate_2;
        char operator;

        while (value_1 != 0 || value_2 != 0) {

            String binVal1 = "";
            String binVal2 = "";
            String binary_result = "";

            System.out.print("Podaj pierwsza liczbe: ");
            value_1 = scanner.nextInt();

            System.out.print("Podaj druga liczbe: ");
            value_2 = scanner.nextInt();

            if (value_1 == 0 && value_2 == 0) {
                break;
            }

            System.out.print("Podaj operacje: ");
            operator = scanner.next().charAt(0);


            int result = 0;

            switch (operator){
                case '+':
                    valueTemplate_1 = value_1;
                    valueTemplate_2 = value_2;
                    while (valueTemplate_2 != 0) {
                        int przeniesienie = valueTemplate_1 & valueTemplate_2;
                        valueTemplate_1 = valueTemplate_1 ^ valueTemplate_2;
                        valueTemplate_2 = przeniesienie << 1;
                        result = valueTemplate_1;
                    }
                    break;
                case '-':
                    result = 0;
                    int roznica;
                    int przeniesienie;
                    valueTemplate_1 = value_1;
                    valueTemplate_2 = value_2;
                    while (valueTemplate_2 != 0) {
                        przeniesienie = (~valueTemplate_1) & valueTemplate_2;
                        roznica = valueTemplate_1 ^ valueTemplate_2;
                        valueTemplate_1 = roznica;
                        valueTemplate_2 = przeniesienie << 1;
                        result = valueTemplate_1;
                    }
                    break;
                case '*':
                    result = 0;
                    valueTemplate_1 = value_1;
                    valueTemplate_2 = value_2;
                    while ( valueTemplate_2!= 0) {
                        if ((valueTemplate_2 & 1) != 0) {
                            result += valueTemplate_1;
                        }
                        valueTemplate_1 <<= 1;
                        valueTemplate_2 >>= 1;
                    }
                    break;
                case '/':
                    result = 0;
                    valueTemplate_1 = value_1;
                    valueTemplate_2 = value_2;
                    while (valueTemplate_1 >= valueTemplate_2) {
                        przeniesienie = 0;
                        while ((valueTemplate_2 << przeniesienie) <= valueTemplate_1) {
                            przeniesienie++;
                        }
                        przeniesienie--;
                        result += (1 << przeniesienie);
                        valueTemplate_1 -= (valueTemplate_2 << przeniesienie);
                    }
                    break;
                default:
                    System.out.println("Nieprawidłowy operator. Spróbuj ponownie.");
                    result = 0;
            }

            for (int i = 31; i >= 0; i--) {
                int bit1 = (value_1 >> i) & 1;
                binVal1 += bit1;
            }

            System.out.println(value_1 + " - " + binVal1 );

            for (int i = 31; i >= 0; i--) {
                int bit2 = (value_2 >> i) & 1;
                binVal2 += bit2;
            }

            System.out.println(value_2 + " - " + binVal2);

            for (int i = 31; i >= 0; i--) {
                int bit3 = (result >> i) & 1;
                binary_result += bit3;
            }

            System.out.println(result + " - " + binary_result);

            System.out.println("========================================");
        }
    }
}
