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
        boolean pseudobool = scanXD.nextBoolean();
        double x;
        if (pseudobool == true) {
            System.out.print("How many letters do you want to shift? ");
            x = scanXD.nextDouble();
        }
        else {
            x = getRandomInt(1,26);
        }
        System.out.println("Your code shift is + " + x + ".");
        for (int i = 0; i < plaintext.length(); i++) {
            
        }
    }

}
