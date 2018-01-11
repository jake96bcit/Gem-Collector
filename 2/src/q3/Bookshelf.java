package q3;

/**
 * Book shelf.
 *
 * @author Vinh Le
 * @version 1.0
 */
public class Bookshelf {

    /**
     * <p>
     * This is the main method that input the book information.
     * </p>
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        final int year2 = 1996;
        final int year3 = 2009;

        Book name1 = new Book("The Java Handbook", "Patrick Naughton" 
                    + ", Micheal Morrison", "Osborne/NcGraw-Hill", year2);
        Book name2 = new Book("Data Structures & Problem Solving Using Java" 
                    + "Fourth Edition", "Mark Allen Weiss",
                        "Pearson College Div", year3);

        System.out.println(name1);
        System.out.println(name2);
    }

};
