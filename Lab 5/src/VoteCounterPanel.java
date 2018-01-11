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
     * declare Joe's label.
     */
    private JLabel labelJoe;
    
    /**
     * declare how many vote for Sam.
     */
    private int votesForSam;
    
    /**
     * declare Sam's vote button.
     */
    private JButton sam;
    
    /**
     * declare Sam's label.
     */
    private JLabel labelSam;
    
    /**
     * Create vote counter panel.
     */
    public VoteCounterPanel() {
        votesForJoe = 0;
        joe = new JButton("Vote for Joe");
        joe.addActionListener(new JoeButtonListener());
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        add(joe);
        add(labelJoe);

        
        votesForSam = 0;
        sam = new JButton("Vote for Sam");
        sam.addActionListener(new SamButtonListener());
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        add(sam);
        add(labelSam);
        
        
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.cyan);
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
            labelJoe.setText("Votes for Joe: " + votesForJoe);
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
            labelSam.setText("Votes for Sam: " + votesForSam);
        }
    }
}