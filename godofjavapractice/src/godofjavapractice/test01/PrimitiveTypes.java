package godofjavapractice.test01;

public class PrimitiveTypes {
  public static void main(String[] args) {
    PrimitiveTypes types = new PrimitiveTypes();
  // types.checkByte();
  // types.checkOthertypes();
    
   // types.checkChar();
    
    types.defaultValues();
  }
  
  
  
  
  
  
  
  
  public void checkByte() {
    byte byteMin = -128;
    byte byteMax= 127;
    System.out.println("byteMin =" + byteMin);
    System.out.println("byteMax =" + byteMax);
    byteMin--;
    byteMax++;
    System.out.println("byteMin-- =" + byteMin);
    System.out.println("byteMax++ =" + byteMax);
  }
  
  public void checkOthertypes() {
    short shortMax = 32767;
    int intMax = 2147483647;
    long longMax = 9223372036854775807l;
    
    System.out.println("shortMax =" + shortMax);
    System.out.println("intMax =" + intMax);
    System.out.println("longMax =" + longMax);
    
    shortMax++;
    intMax++;
    longMax++;
    
    System.out.println("shortMax++ =" + shortMax);
    System.out.println("intMax++ =" + intMax);
    System.out.println("longMax++ =" + longMax);
    
  }
  
  public void checkChar() {
    char charMin = '\u0000';
    char charMax = '\uffff';
    System.out.println("charMin = [" + charMin + "]");
    
    System.out.println("charMax = [" + charMax + "]" );
    
    int intValue = 'a';
    
    System.out.println("intValue=[" + intValue + "]");
    
  }
  public void checkBoolean() {
    boolean flag = true;
    System.out.println(flag);
    flag=false;
    System.out.println(flag);
    
    
    
    
  }
  
  
  
  int intDefault1;
  byte byteDefault;
  short shortDefault;
  long longDefault;
  float floatDefault;
  double doubleDefault;
  char charDefault;
  boolean booleanDefault;
  public void defaultValues(){
    System.out.println("intDefault1=" + intDefault1);
    System.out.println("byteDefault=" + byteDefault);
    System.out.println("shortDefault=" + shortDefault);
    System.out.println("longDefault=" + longDefault);
    System.out.println("floatDefault=" + floatDefault);
    System.out.println("doubleDefault=" + doubleDefault);
    System.out.println("charDefault=" + charDefault);
    System.out.println("booleanDefault=" + booleanDefault);
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
