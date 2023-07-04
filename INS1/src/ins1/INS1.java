/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ins1;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class INS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String message, encryptedMessage = "";
        int key;
        char ch;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a plain text message: ");
        message = sc.nextLine();
        
        System.out.println("Enter a key: ");
        key = sc.nextInt();
        
        for (int i = 0; i < message.length(); i++) {
            ch = message.charAt(i);
            
            if(Character.isLowerCase(ch)) {
                ch = (char) (ch + key);
               
                if (ch > 'z') {
                    ch = (char) (ch - 'z' + 'a' - 1);
                }
                
                encryptedMessage += ch;
            }
            else if (Character.isUpperCase(ch)) {
                ch = (char) (ch + key);
                
                if (ch > 'Z') {
                    ch = (char) (ch - 'Z' + 'A' - 1);
                }
                encryptedMessage += ch;
            }
            else {
                encryptedMessage += ch;
            }
        }
        System.out.println("Encrypted Message: " + encryptedMessage);
    }
}