package tema2;
public class StringTest {

    public static void main(String[] args) {
        String s = "hola";
        String s2 = "hola";
        System.out.println((s == s2));
        
        String s3 = new String("hola");
        String s4 = new String("hola");
        
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println((s3 == s4));
        
        s = "chau";
        s2 = "chau";
        System.out.println((s == s2));
        
    }
    
}
