import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger n=new BigInteger(num1);
        BigInteger x=new BigInteger(num2);
        BigInteger y=n.multiply(x);
        

        String h=y.toString();
        
        return h;   
    }
}