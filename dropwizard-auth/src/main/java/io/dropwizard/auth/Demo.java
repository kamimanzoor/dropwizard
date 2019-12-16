import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;

public class Demo {
    public static void main(String[] args) throws Exception {
        String rpository = "test";
        int wek = 4;
        String day;
    
        Cipher c = Cipher.getInstance("DESede/ECB/PKCS5Padding");
        
        switch (wek) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
        }
        System.out.println(day);
    }
}
