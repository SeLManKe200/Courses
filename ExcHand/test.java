package ExcHand;

public class test {
    public static void main(String[] args) {
        
int a=0;
// a =2/0; burada yazsaydık direkt program biterdi
        try {
            // burada hatayı gördüğü satırda direkt catch içine geçer altındaki satırları okumaz
            System.out.println("Program Basladi");
             a =2/0; 
             System.out.println("Hata bulundu(Bunu basmaz)");   
      
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //TODO: handle exception
        }

        System.out.println(a);  
      System.out.println("Program bitti");
    }
    
}
