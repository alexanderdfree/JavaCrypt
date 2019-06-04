import java.util.Scanner;
/**

 * @author Alex
 * @version 12.0.1
 */
public class Encryptor extends Cipher
{
    private int key;
    
    public double getRandomInt(double min, double max) { //code credit to mozilla and edited by alex
        min = Math.ceil(min);
        max = Math.floor(max);
        return Math.floor(Math.random() * (max - min)) + min; }

    public Encryptor()
    {
        Scanner scanXD = new Scanner(System.in);
        System.out.print("Which message would you like to encrypt? ");
        String plaintext = scanXD.nextLine();
        System.out.print("Would you like to choose your own key? ");
        String pseudobool = null;
        Scanner scanXD2 = new Scanner(System.in);
        pseudobool = scanXD2.nextLine(); // toLower
        double x;
        boolean bool2;
        if (pseudobool == "Yes" || pseudobool == "yes") { // then you can just done one check here
            System.out.print("How many letters do you want to shift? ");
            Scanner scanXD3 = new Scanner(System.in);
            x = scanXD3.nextDouble();
        }
        
        else{
            x = getRandomInt(1,25);
        }

        double y = 26 - x;
        System.out.println("Your code shift is +" + x + ", or -" + y + ".");
        String cipher = "";
        String gamerz = "";
        key = (int) x;
        char z;
        int offset = 65;
        for (int riseUp = 0; riseUp < plaintext.length(); riseUp++) {
            char xd = plaintext.charAt(riseUp);
            if (xd <= 'z' && xd >= 'a') {
                gamerz += encodeWithOffset( xd, 97 );
            } else if (xd <= 'Z' && xd >= 'A'){ 
                gamerz += encodeWithOffset( xd, 65 );
            } else {
                gamerz += xd; 
            }
            //int z = (int)xd-(int)'a'+ 1;
            //char nowThatsHowGamersDoIt = (char)z;
            //since it didnt work earlier
        }
        //please work
        System.out.println("Your encrypted text is: " + gamerz + ".");
    }
    
    private char encodeWithOffset( char xd, int offset ) {
        char z = (char)((int)xd+key);
        if ((int)z > (int)'z') {
            int ohYeahYeah = offset + (z%26);
            z = (char)ohYeahYeah;
        }    
        return z;
    }

}
