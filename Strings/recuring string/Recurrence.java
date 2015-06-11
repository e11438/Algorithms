import java.math.BigDecimal;  
   
public class Recurrence {  
     
   public static void main(String[] args) {  
      for (int i = 1; i < 100; i++) {  
         System.out.println("1 / " + i + " is "  
               + (isRecurring(1, i) ? "" : "not")  
               + " recurring.");  
      }  
   }  
     
   static boolean isRecurring (int numerator, int denominator) {  
      BigDecimal n = new BigDecimal(numerator);  
      n.setScale(2 * denominator + 1);  
        
      BigDecimal d = new BigDecimal(denominator);  
      try {  
         n.divide(d);  
         return false;  
      } catch (ArithmeticException ae) {  
         return true;  
      }  
   }  
}  