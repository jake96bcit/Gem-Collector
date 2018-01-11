import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Vote Counter Panel.
 * @author Jake
 * @version 1.0
 */
@SuppressWarnings("serial")
public class VoteCounterPanel extends JPanel {
    
    /**
     * declare the width of the box. 
     */
    static final int WIDTH = 300;
    
    /**
     * declare the height of the box.
     */
    static final int HEIGHT = 80;
    
    /**
     * declare how many vote for Joe.
     */
    private int votesForJoe;
    
    /**
     * declare Joe's vote button.
     */
    private JButton joe;
    
    /**
     * declare how many vote for Sam.
     */
    private int votesForSam;
    
    /**
     * declare Sam's vote button.
     */
    private JButton sam;
    
    /**
     * declare Result label.
     */
    private JLabel labelResult;
    
    /**
     * Create vote counter panel.
     */
    public VoteCounterPanel() {
        votesForJoe = 0;
        joe = new JButton("Vote for Joe");
        joe.addActionListener(new JoeButtonListener());
        add(joe);

        
        votesForSam = 0;
        sam = new JButton("Vote for Sam");
        sam.addActionListener(new SamButtonListener());
        labelResult = new JLabel("");
        add(sam);
        add(labelResult);
        
        
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.cyan);
    }
    
    /**
     *  After Joe's votes or Sam's vote increase,
     *  comparing the votes of the two persons 
     *  and print out the result.
     */
    public void checkResult() {
        if (votesForJoe == votesForSam) {
            labelResult.setText("It's a tie because " 
                    + "Joe and Sam have the same votes.");
        } else {
            boolean joeWin = votesForJoe > votesForSam;
            if (joeWin) {
                labelResult.setText("Joe is the winner with " + votesForJoe 
                        + " vote(s).");
            } else {
                labelResult.setText("Sam is the winner with " + votesForSam 
                        + " vote(s).");
            }
        }
    }
    
    /**
     * Represents a listener for button push (action) events.
     */
    private class JoeButtonListener implements ActionListener {
        
        /**
         * Updates the counter and label when Vote for Joe 
         * button is pushed.
         * @param event 
         * Joe's event
        */
        public void actionPerformed(ActionEvent event) {
            votesForJoe++;
            checkResult();
        }
    }
    
    /**
     * Represents a listener for button push (action) events.
     */
    private class SamButtonListener implements ActionListener {
        
        /**
         * Updates the counter and label when Vote for Joe 
         * button is pushed.
         * @param event
         * Sam's event
        */
        public void actionPerformed(ActionEvent event) {
            votesForSam++;
            checkResult();
        }
    }
}