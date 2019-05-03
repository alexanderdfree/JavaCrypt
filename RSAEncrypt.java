import java.util.Random;
/**
 * Write a description of class RSAEncrypt here.
 *
 * @author Alex
 * @version 0
 */
public class RSAEncrypt
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
    if (gcf(x,y) == 0) {
        return true;
    }
    else{return false;}
}
    public String RSAEncrypt(String plaintext) {
        String codetext = "";
        double p = getRandomInt(1,5000);
        double q = getRandomInt(1,5000);
        while (primeCheck(p) == false || primeCheck(q) == false) {
            p = getRandomInt(1,5000);
            q = getRandomInt(1,5000);
        }
        double n = p * q;
        double lambda = lcm(p-1,q-1);
        System.out.println("Your \"n\" is " + n + " .");
        System.out.println("Your \"lambda\" is " + lambda + " . Keep this secret.");
        double e = getRandomInt(2,lambda-1);
        while (coPrime(e,lambda) != true)
        {
            e = getRandomInt(2,lambda-1);
        }
        System.out.println("Your \"e\" is " + e + " .");
        return codetext;
    }}


    
    /*String RSAEncrypt()
    {
        // initialise instance variables
        
        x = 0;
    }*/
 

