package godofjavapractice.test01;

public class Operators {
  public static void main(String[] args) {
    Operators sample = new Operators();
   //sample.additive();
   // sample.multiplicative();
   //sample.remainder();
    //sample.compund();
   // sample.unary();
    sample.increDecre();
  }
  
  public void additive() {
    int intValue1 = 5;
    int intValue2 = 10;
    
    int result = intValue1 + intValue2;
    System.out.println(result);
    result = intValue2 - intValue1;
    System.out.println(result);
  }
  public void multiplicative() {
    int intValue1 = 5;
    int intValue2 = 10;
    
    int result = intValue1 * intValue2;
    System.out.println(result);
    float result2 = (float)intValue1 / intValue2;
    System.out.println(result2);
  }

  
  public void remainder() {
    int intValue1 = 50;
    int intValue2 = 10;
    int result = intValue1 % intValue2;
    System.out.println(result);
  }
  
  public void compund() {
    
    int intValue1 = 10;
    intValue1 += 5;
    System.out.println(intValue1);
    intValue1 -= 5;
    System.out.println(intValue1);
    intValue1 *= 5; 
    System.out.println(intValue1);
    intValue1 /= 5; 
    System.out.println(intValue1);
    intValue1 %= 5; 
    System.out.println(intValue1);
    
    
  }
  
  public void unary() {
    int intValue = -10;
    int result = +intValue;
    System.out.println(result);
    result = - intValue;
    System.out.println(result);
  }
  
  
  public void increDecre() {
    int intValue = 1;
    System.out.println(intValue++);
    System.out.println(intValue);
    System.out.println(++intValue);
  }
  
  
  
  public void complement() {
    boolean flag = true;
    System.out.println(flag);
    System.out.println(!flag);
  }
  
  
}