
/**
 *
 * @author user
 */
public class GenApp {
    private static <T> void printArray(T[] a){
        for (Object o : a){
            System.out.println(o);
        }
    }
    public static void main(String[]args){
        Integer iArr[] = new Integer[3];
        iArr[0] = 10;
        iArr[1] = 20;
        iArr[2]= 30;
        printArray(iArr);
        
        String sArr[] = new String[3];
        sArr[0]="Sepuluh";
        sArr[1]="dua puluh";
        sArr[3]="tiga puluh";
        printArray(sArr);
        
        Character cArr[] = new Character[3];
        cArr[0] = '1';
        cArr[1] = '1';
        cArr[2] = '3';
         printArray(cArr);  
        
        Double doubleArr[] = new Double[3];
        doubleArr[0] = 10.10;
        doubleArr[1] = 20.20;
        doubleArr[2] = 30.30;
         printArray(doubleArr);
         
    
    }
    
}
