import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Creates Polynomial objects and performs polynomial operations.
 * Created by Cody Young on 4/27/17.
 */
public class Polynomial {
    //Instance variables
    private ObjectList list1;       //Used to store polynomials as terms
    private ObjectList list2;
    private Term term;

    /**
     * Constructor method for Polynomial objects. Initializes instance variables.
     */
    public Polynomial() throws IOException {
        list1 = new ObjectList();
        list2 = new ObjectList();
    }

    /**
     * Reads numbers from input file, and forms into polynomial.
     * @throws IOException
     */
    public void scanFile() throws IOException {
        Scanner sc = new Scanner(new File("polyinput.txt"));
        while (sc.hasNext()) {
            String input_string = sc.nextLine();     //Split input string up into tokens delimited by spaces
            String delims = "[ ]+";
            String[] tokens = input_string.split(delims);  //Read tokens into appropriate variables
            int coeff = Integer.parseInt(tokens[0]);
            int exp = Integer.parseInt(tokens[1]);
            term = new Term(coeff,exp);
            list1.insert(term);
        }
    }

    /**
     * Subtracts two polynomial linked lists.
     */
    /*public ObjectList subTwoPolys (ObjectList list1, ObjectList list2) {
        ObjectListNode p = list1.getFirstNode();
        ObjectListNode q = list2.getFirstNode();

        while (p != null && q != null) {
            Term t1 = (Term) p.getInfo();
            Term t2 = (Term) q.getInfo();
            if (t1.getExp() == t2.getExp()) {
                int coeff = t1.getCoeff() + t2.getCoeff();
                if (coeff != 0) {
                    attach(coeff, t1.getExp());
                }
                p = p.getNext();
                q = q.getNext();
            } else if (t1.getExp() > t2.getExp()) {
                attach(t1.getCoeff(), t1.getExp());
                p = p.getNext();
            } else {
                attach(t2.getCoeff(), t2.getExp());
                q = q.getNext();
            }
        }
        while (p != null) {
            Term t1 = (Term) p.getInfo();
            attach(t1.getCoeff(), t1.getExp());
            p = p.getNext();
        }
        while (q != null) {
            Term t2 = (Term) q.getInfo();
            attach(t2.getCoeff(), t2.getExp());
            q = q.getNext();
        }
        return sum;
    }
    */
}
