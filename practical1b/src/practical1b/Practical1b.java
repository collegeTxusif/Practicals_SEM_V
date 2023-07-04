/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1b;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Practical1b {
    public static char PlainText[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'x', ' '};
    public static char keys[] =      {' ', 'm', 'n', 'b', 'v', 'c', 'x', 'z', 'l', 'k', 'j', 'h', 'g', 'f', 'd', 's', 'a', 'p', 'o', 'i', 'u', 'y', 't', 'r', 'e', 'w', 'q'};
    
    public static String doEncryption(String msg) {
        char cipherText[] = new char[(msg.length())];
        for (int i = 0; i < msg.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (PlainText[j] == msg.charAt(i)) {
                    cipherText[i] = keys[j];
                            break;
                }
            }
        }
        return new String(cipherText);
    }
    
    public static String doDecryption(String msg) {
        char plainText[] = new char[(msg.length())];
        for (int i = 0; i < msg.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (keys[j] == msg.charAt(i)) {
                    plainText[i] = PlainText[j];
                            break;
                }
            }
        }
        return new String(plainText);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Text: ");
        String inp = sc.nextLine();
        String cipherText = doEncryption(inp.toLowerCase());
        System.out.println(cipherText);

        String ogText = doDecryption(cipherText);
        System.out.println(ogText);
    }
}