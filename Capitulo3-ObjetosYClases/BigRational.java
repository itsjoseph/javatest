import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.BitSet;

public class BigRational {
    private BigInteger num;
    private BigInteger den;

    public static final BigRational ZERO = new BigRational();
    public static final BigRational ONE = new BigRational("1");

    public BigRational() {
        this(BigInteger.ZERO);
    }

    public BigRational(BigInteger n) {
        this(n, BigInteger.ONE);
    }

    public BigRational(BigInteger n, BigInteger d) {
        num = n;
        den = d;
        check00();
        fixSigns();
        reduce();
    }

    public BigRational(String str){
        if (str.length() == 0) {
            throw new IllegalArgumentException("Zero-lengh String");            
        }

        int slashIndex = str.indexOf('/');
        if(slashIndex == -1){
            num = new BigInteger(str.trim());
            den = new BigInteger.ONE;
        } else {
            num = new BigInteger(str.substring(0,slashIndex).trim());
            den = new BigInteger(str.substring(slashIndex + 1).trim());
            check00();
            fixSigns();
            reduce();
        }
    }

    private void check00() {
        if (num.equals(BigInteger.ZERO) && den.equals(BigInteger.ZERO))
            throw new ArithmeticException("Zero divide by zero");
    }

    private void fixSigns() {
        if (den.compareTo(BigInteger.ZERO) < 0) {
            num = num.negate();
            den = den.negate();
        }
    }

    private void reduce() {
        BigInteger gcd = num.gcd(den);
        num.divide(gcd);
        den.divide(gcd);
    }

    public BigRational abs() {
        return new BigRational(num.abs(), den);
    }

    public BigRational negate() {
        return new BigRational(num.negate(), den);
    }

    public BigRational add(BigRational other) {
        BigInteger newNumerator = num.multiply(den).add(other.num.multiply(den));
        BigInteger newDeniminator = den.multiply(other.den);
        return new BigRational(newNumerator, newDeniminator);
    }

    public BigRational substract(BigRational other) {
        return add(other.negate());
    }

    public BigRational multiply(BigRational other) {
        BigInteger newNumer = num.multiply(other.num);
        BigInteger newden = den.multiply(other.den);

        return new BigRational(newNumer, newden);
    }

    public BigRational divide(BigRational other) {
        BigInteger newNum = num.multiply(other.num);
        BigInteger newDen = den.multiply(other.den);

        return new BigRational(newNum, newDen);
    }

    public boolean equals(Object obj) {
        
    }
    
}
