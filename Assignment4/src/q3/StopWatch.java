package q3;

import javax.swing.JFrame;

/**
 * <p>StopWatch.java is used for displaying the
 * stop watch by using the code of StopWatchPanel.java.</p>
 *
 * @author Vinh Le
 * @version 1.0
 */
public class StopWatch {
    /**
     * <p>This is the method that display the 
     * StopWatch's panel.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Stop Watch");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new StopWatchPanel());
        frame.pack();
        frame.setVisible(true);
    }

};
