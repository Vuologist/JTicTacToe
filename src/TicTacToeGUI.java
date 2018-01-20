import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeGUI implements ActionListener {
    public static void main (String args[]){

        JFrame jfrm = new JFrame("Tic Tac Toe");

        jfrm.getContentPane().setLayout(new GridLayout());

        jfrm.setSize (960, 540);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* board representation
        1   2   3
        4   5   6
        7   8   9
        */
        JButton button1 = new JButton("button1");
        JButton button2 = new JButton("button2");
        JButton button3 = new JButton("button3");
        JButton button4 = new JButton("button4");
        JButton button5 = new JButton("button5");
        JButton button6 = new JButton("button6");
        JButton button7 = new JButton("button7");
        JButton button8 = new JButton("button8");
        JButton button9 = new JButton("button9");

        jfrm.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
