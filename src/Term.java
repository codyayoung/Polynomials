/**
 * Represents a polynomial term as an object.
 * Created by Cody on 4/20/2017.
 */
public class Term {
    //Instance variables
    private int coeff;
    private int exp;

    /**
     * Constructor method for term objects - coefficient and exponent.
     */
    public Term (int c, int e) {
        coeff = c;
        exp = e;
    }

    /**
     * Returns coefficient of polynomial.
     * @return Coefficient of polynomial
     */
    public int getCoeff() {
        return coeff;
    }

    /**
     * Sets coefficient of polynomial.
     * @param coeff
     */
    public void setCoeff(int coeff) {
        this.coeff = coeff;
    }

    /**
     * Returns power of polynomial.
     * @return Exponent as polynomial
     */
    public int getExp() {
        return exp;
    }

    /**
     * Sets power of polynomial.
     * @param exp Exponent of polynomial.
     */
    public void setExp(int exp) {
        this.exp = exp;
    }
}
