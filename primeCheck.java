
/**
 * Write a description of class isPrime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class primeCheck
{
    public boolean primeCheck(int y)
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
}
