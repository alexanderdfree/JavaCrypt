import java.util.Random;
import java.util.Scanner;
//import java.util.Math;
/**
 * Write a description of class RSAEncrypt here.
 *
 * @author Alex
 * @version 0
 */
public class RSAEncrypt extends primeCheck
{
    public boolean primeCheck(double y)
    {
        int number = 2;
        while (number < y) {
            if (y % number == 0) {
                return false;
            }
            number++;
        }
        return true;
    }
    public double getRandomInt(double min, double max) { //code credit to mozilla and edited by alex
        min = Math.ceil(min);
        max = Math.floor(max);
        return Math.floor(Math.random() * (max - min)) + min; }
    //gcf and lcm code from StackOverflow
        double gcf(double a, double b)
{
    while (a != b) // while the two numbers are not equal...
    { 
        // ...subtract the smaller one from the larger one

        if (a > b) a -= b; // if a is larger than b, subtract b from a
        else b -= a; // if b is larger than a, subtract a from b
    }

    return a; // or return b, a will be equal to b either way
}

double lcm(double a, double b)
{
    // the lcm is simply (a * b) divided by the gcf of the two

    return (a * b) / gcf(a, b);
    
}
public boolean coPrime(double x, double y) {
    if (gcf(x,y) == 0 || gcf(x,y) == 1) {
        return true;
    }
    else{return false;}
}
    public void RSAEncrypt() {
        System.out.print("Which message would you like to encrypt? ");
        Scanner scanner = new Scanner(System.in);
        String plaintext = scanner.nextLine();
        String codetext = "";
        double codeTemp = 0;
        double p = getRandomInt(1,500);
        double q = getRandomInt(1,500);
        while (primeCheck(p) == false || primeCheck(q) == false) {
            p = getRandomInt(1,500);
            q = getRandomInt(1,500);
        }
        double n = p * q;
        double lambda = lcm(p-1,q-1);
        System.out.println("Your \"n\" is " + n + ".");
        //
        System.out.println("Your \"lambda\" is " + lambda + ". Keep this secret.");
        double e = getRandomInt(2,lambda-1);
        char furtherTemp;
        while (coPrime(e,lambda) == false)
        {
            e = getRandomInt(2,lambda-1);
        }
        System.out.println("Your \"e\" is " + e + ".");
        String space = " ";
        for (int riseUp = 0; riseUp < plaintext.length(); riseUp++) {
            char currentChar = plaintext.charAt(riseUp);
            codeTemp =  (Math.pow((int)currentChar,e))%n;
            furtherTemp = (char)((Math.pow((int)currentChar,e))%n);
            System.out.println(codeTemp);
            codetext += space += codeTemp;
        }
        System.out.println(codetext);
    }}


    
    /*String RSAEncrypt()
    {
        // initialise instance variables
        
        x = 0;
    }*/
 

