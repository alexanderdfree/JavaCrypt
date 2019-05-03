import java.util.Random;
/**
 * Write a description of class RSAEncrypt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RSAEncrypt
{
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
    public String RSAEncrypt(String plaintext) {
        double p = getRandomInt(1,500);
        double q = getRandomInt(1,500);
        while (primeCheck(p) == false || primeCheck(q) == false) {
            p = getRandomInt(1,500);
            q = getRandomInt(1,500);
        }
        return "";
    }
}
    
    /*String RSAEncrypt()
    {
        // initialise instance variables
        
        x = 0;
    }*/
 

