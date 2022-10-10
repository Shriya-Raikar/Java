public class Java_Gen {

    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void printArray(double[] arr){
        for(double i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void printArray(char[] arr){
        for(char i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] intA = {1,2,3};
        double[] douA = {1.1,1.2,7,8};
        char[] charA = {'A','S'};
        printArray(intA);
        printArray(douA);
        printArray(charA);

    }
}
