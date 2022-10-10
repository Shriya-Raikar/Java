public class Java_Gen<E> {
public E[] Array;

    public Java_Gen(E[] Array){
        this.Array = Array;
    }

    public static <E> void printArray(E[] Array) {
        for(E x : Array){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {

        Integer[] intA = {1,2,3};
        Double[] douA = {1.1,1.2};
        Character[] charA = {'A','S'};
        new Java_Gen(douA).printArray(douA);
        //printArray(douA);
        //printArray(charA);


    }
}
