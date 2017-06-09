public class Hewan <T ,N>{
    private T type;
    private N type1;
    
    public T getType(){
        return type;
    }
    
    public N getType1(){
      return type1;  
    }
    
    public void setType (T type){
        this.type = type;
    }
    
    public void setType1 (N type1){
        this.type1 =  type1;
    }
    
    public static void main(String[]args){
        
   Hewan<Character,Character> genChar = new Hewan();
genChar.setType('3');
genChar.setType1('2');
System.out.println(genChar.getType());
System.out.println(genChar.getType1());

 Hewan<String,String> genString = new Hewan();
genString.setType("3");
genString.setType1("2");
System.out.println(genChar.getType());
System.out.println(genChar.getType1());

 Hewan<Integer,Integer> genInt = new Hewan();
genInt.setType(9);
genInt.setType1(8);
System.out.println(genInt.getType());
System.out.println(genInt.getType1());

 Hewan<Double,Double> genDouble = new Hewan();
genDouble.setType(20.20);
genDouble.setType1(10.10);


System.out.println(genDouble.getType());
System.out.println(genDouble.getType1());
   
    }
    
  
}
