public class Java_Gen<I,D,C> {
public I[] IArray;
public D[] DArray;
public C[] CArray;



    public Java_Gen(I[] IArray,D[] DArray,C[] CArray){
        this.IArray = IArray;
	this.DArray = DArray;
	this.CArray =CArray;
	
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
        new Java_Gen<Integer,Double,Character>(intA,douA,charA).printArray(intA);
	new Java_Gen<Integer,Double,Character>(intA,douA,charA).printArray(douA);
	new Java_Gen<Integer,Double,Character>(intA,douA,charA).printArray(charA);
        //printArray(douA);
        //printArray(charA);


    }
}
