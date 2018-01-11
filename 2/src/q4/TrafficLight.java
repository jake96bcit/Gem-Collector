package q4;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
* Make the traffic lights works.
* @param args
*  Program arguments
*/
public class TrafficLight {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Traffic Light");
        //frame.setSize(120, 290);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        
        frame.getContentPane().add(new TrafficLightPanel());
        
        frame.pack();
        frame.setVisible(true);
    }
}
