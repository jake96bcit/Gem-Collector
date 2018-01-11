package q3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * <p>StopWatchPanel.java is used for creating 
 * and setting up the stopwatch by JApplet. This 
 * StopWatchPanel.java have 3 button ("Start, Stop, Reset") 
 * on it.</p>
 * 
 * @author Vinh Le
 * @version 1.0
 */
@SuppressWarnings("serial")
public class StopWatchPanel extends JPanel {

    /**
     * Width of the stop watch.
     */
    static final int WIDTH = 250;

    /**
     * Height of the stop watch.
     */
    static final int HEIGHT = 500;
    
    /**
     * The speed of the ten millisecond.
     */
    static final int SPEED = 10;
    
    /**
     * The maximum number of the ten milisecond.
     */
    static final int MAX = 100;

    /**
     * Creating stop button.
     */
    private JButton stopButton;

    /**
     * Creating start button.
     */
    private JButton startButton;

    /**
    * Creating reset button.
    */
    private JButton resetButton;

    /**
     * Declare timer.
     */
    private Timer timer;

    /**
     * Declare second.
     */
    private int second;

    /**
     * Declare ten milisecond.
     */
    private int tenMiliSecond;
    
    /**
     * Declare timer label.
     */
    private JLabel timerLabel;


    /**
     * Creating the stop watch panel.
     */
    public StopWatchPanel() {

        startButton = new JButton("Start");
        startButton.addActionListener(new StartButtonListener());
        add(startButton);

        stopButton = new JButton("Stop");
        stopButton.addActionListener(new StopButtonListener());
        add(stopButton);

        resetButton = new JButton("Reset");
        resetButton.addActionListener(new ResetButtonListener());
        add(resetButton);

        second = 0;
        tenMiliSecond = 0;
        String timerString = formatTimerString();
        timerLabel = new JLabel(timerString);
        add(timerLabel);

        timer = new Timer(SPEED, new TimerListener());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.cyan);
    }
    
    /**
     * Formarting the timer when it runs.
     * @return
     * Time couting formart (00:00)
     */
    private String formatTimerString() {
        String timerString = "";
        if (second < SPEED) {
            timerString = timerString + "0" + second;
        } else {
            timerString = timerString + second;
        }
        timerString = timerString + " : ";
        if (tenMiliSecond < SPEED) {
            timerString = timerString + "0" + tenMiliSecond;
        } else {
            timerString = timerString + tenMiliSecond;
        }
        return timerString;
    }
    
    /**
     * <p>Creating and setting up for the three button
     * and make it work.</p>
     * 
     * @author Jake
     * 
     */
    private class TimerListener implements ActionListener {

        /**
         * <p>Updates the number when the stop watch run.</p>
         * 
         * @param event
         * event
         */
        public void actionPerformed(ActionEvent event) {
            System.out.println("Timer updated");
            if (tenMiliSecond < MAX) {
                tenMiliSecond++;
            }
            if (tenMiliSecond == MAX) {
                tenMiliSecond = 0;
                second++;
            }
            timerLabel.setText(formatTimerString());
        }
    }

    /**
     * Represents a listener for  reset button push (action) events.
     */
    private class ResetButtonListener implements ActionListener {

        /**
         * Updates the stop watch and label when reset button is pushed.
         * 
         * @param event
         * event
         */
        public void actionPerformed(ActionEvent event) {
            System.out.println("Reset");
            timer.stop();
            tenMiliSecond = 0;
            second = 0;
            timerLabel.setText(formatTimerString());
        }
    }

    /**
     * Represents a listener for start button push (action) events.
     */
    private class StartButtonListener implements ActionListener {

        /**
         * Updates the stop watch and label when start button is pushed.
         * 
         * @param event
         * event
         */
        public void actionPerformed(ActionEvent event) {
            System.out.println("Start");
            timer.start();
        }
    }

    /**
     * Represents a listener for stop button push (action) events.
     */
    private class StopButtonListener implements ActionListener {

        /**
         * Updates the stop watch and label when stop button is pushed. 
         * 
         * @param event
         * event
         */
        public void actionPerformed(ActionEvent event) {
            System.out.println("Stop");
            timer.stop();
        }
    }
}