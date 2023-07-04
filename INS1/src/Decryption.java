package ins1;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Decryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cipherMessage, decryptedcipherMessage = "";
        int key;
        char ch;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a cipher text: ");
        cipherMessage = sc.nextLine();
        
        System.out.println("Enter a key: ");
        key = sc.nextInt();
        
        for (int i = 0; i < cipherMessage.length(); i++) {
            ch = cipherMessage.charAt(i);
            
            if(Character.isLowerCase(ch)) {
                ch = (char) (ch - key);
               
                if (ch < 'a') {
                    ch = (char) (ch - 'a' + 'z' + 1);
                }
                
                decryptedcipherMessage += ch;
            }
            else if (Character.isUpperCase(ch)) {
                ch = (char) (ch - key);
                
                if (ch < 'A') {
                    ch = (char) (ch - 'A' + 'Z' + 1);
                }
                decryptedcipherMessage += ch;
            }
            else {
                decryptedcipherMessage += ch;
            }
        }
        System.out.println("Original Message: " + decryptedcipherMessage);
    }
}