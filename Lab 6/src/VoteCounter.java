import javax.swing.JFrame;

/**
 * Vote Counter.
 * @author Jake
 * @version 1.0
 */
public class VoteCounter {
    
    /**
     * Create the main program.
     * @param args
     *  Program arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vote Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new VoteCounterPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
