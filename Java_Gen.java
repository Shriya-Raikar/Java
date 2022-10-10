public class Java_Gen {
public static <E> void printArray(E[] arr){
        for(E i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Integer[] intA = {1,2,3};
        Double[] douA = {1.1,1.2};
        Character[] charA = {'A','S'};
        printArray(intA);
        printArray(douA);
        printArray(charA);


    }
}
