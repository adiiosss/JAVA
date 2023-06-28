package PPJ11.TASK2;

public class task2 {

    public static void main(String[] args) {

        int sizeArr1;
        int sizeArr2;
        {
            int min = 5;
            int max = 10;
            //range [min, max]
            sizeArr1 = (int) (Math.random() * (max - min + 1) + min);
            sizeArr2 = (int) (Math.random() * (max - min + 1) + min);
        }
        int[] arr1 = new int[sizeArr1];
        int[] arr2 = new int[sizeArr2];
        int randomRange = 15;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * randomRange);
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * randomRange);
            System.out.print(arr2[i] + "\t");
        }
        System.out.println();
        {
            int[] podpunkt1 = new int[arr1.length + arr2.length];
            for (int i = 0; i < arr1.length; i++) {
                podpunkt1[i] = arr1[i];
            }
            for (int i = arr1.length, j = 0; i < podpunkt1.length; i++, j++) {
                podpunkt1[i] = arr2[j];
            }
            System.out.println("PODPUNKT 1");
            for (int i = 0; i < podpunkt1.length; i++) {
                System.out.print(podpunkt1[i] + "\t");
            }
            System.out.println();
        }
        {
            int [] temp = new int[arr1.length];
            int counter = 0;
            for (int i = 0; i < arr1.length; i++) {
                boolean repeat = false;
                for (int j = i-1; j >= 0; j--) {
                    if(arr1[i] == arr1[j]) {
                        repeat = true;
                        break;
                    }
                }
                if(!repeat){
                    boolean havePair = false;
                    for (int j = 0; j < arr2.length; j++) {
                        if(arr1[i] == arr2[j]){
                            havePair = true;
                            break;
                        }
                    }
                    if(havePair){
                        temp[counter++] = arr1[i];
                    }
                }
            }
            int[] pd2 = new int[counter];
            for (int i = 0; i < pd2.length; i++) {
                pd2[i] = temp[i];
            }
            System.out.println("PODPUNKT 2");
            for (int i = 0; i < pd2.length; i++) {
                System.out.print(pd2[i] + "\t");
            }
            System.out.println();
        }
        {
            int max = arr1[0];
            int min = arr1[0];
            for (int i = 1; i < arr1.length; i++) {
                if(max < arr1[i])
                    max = arr1[i];
                if(min > arr1[i])
                    min = arr1[i];
            }
            for (int i = 1; i < arr2.length; i++) {
                if(max < arr2[i])
                    max = arr2[i];
                if(min > arr2[i])
                    min = arr2[i];
            }
            int [] temp = new int[Math.abs(max) - Math.abs(min)];
            int counter = 0;
            addelement:
            for (int i = min+1; i < max; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    if(i == arr1[j])
                        continue addelement;
                }
                for (int j = 0; j < arr2.length; j++) {
                    if(i == arr2[j])
                        continue addelement;
                }
                temp[counter++] = i;
            }
            int[] pd3 = new int[counter];
            for (int i = 0; i < pd3.length; i++) {
                pd3[i] = temp[i];
            }
            System.out.println("PODPUNKT 3");
            for (int i = 0; i < pd3.length; i++) {
                System.out.print(pd3[i] + "\t");
            }
            System.out.println();
        }
    }
}