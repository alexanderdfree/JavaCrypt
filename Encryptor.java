import java.util.Scanner;
/**

 * @author Alex
 * @version 12.0.1
 */
public class Encryptor
{
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
        pseudobool = scanXD2.nextLine();
        double x;
        boolean bool2;
        if (pseudobool == "Yes" || pseudobool == "yes") { //
            bool2 = true;
        }
        else{
            bool2 = false;
        }
        if (bool2 = true) {    
            System.out.print("How many letters do you want to shift? ");
            Scanner scanXD3 = new Scanner(System.in);
            x = scanXD3.nextDouble();
        }
        else {
            x = getRandomInt(1,25);
        }
        double y = 26 - x;
        System.out.println("Your code shift is +" + x + ", or -" + y + ".");
        String cipher;
        String gamerz = "";
        char z;
        for (int riseUp = 0; riseUp < plaintext.length(); riseUp++) {
            char xd = plaintext.charAt(riseUp);
            cipher = ""; //initializes cipher
            if (xd <= 'z' && xd >= 'a') {
                //int z = (int)xd-(int)'a'+ 1;
                //char nowThatsHowGamersDoIt = (char)z;
                z = (char)(xd+x);
                if (z > 'Z') {
                    z = (char)(z - (int)'z'+1);
                }
                cipher += z;//nowThatsHowGamersDoIt;
            }
            if (xd <= 'Z' && xd >= 'A'){
                //int gamersRiseUpInTheClub = (int)xd-(int)'A'+ 1;
                //char gamer = (char)gamersRiseUpInTheClub;
                z = (char)(xd+x);
                if (z > 'Z') {
                    z = (char)(z - (int)'Z'+1);
                }
                cipher += z; //gamer;
            }
            else {
               cipher += xd; 
            }
            gamerz = cipher;
        }
        //please work
        System.out.println(gamerz);
    }

}
