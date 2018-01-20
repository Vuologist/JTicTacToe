import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *  Name:       Vu, Anthony
 *  Homework:   1
 *  Due:        1/22/18
 *  Course:     cs24501-w18
 *
 *  Description:
 *      This program is responsible for creating a Tic Tac Toe GUI
 *      playing board and will be rendered through java swing. The
 *      user will be able to interact with the board. This is a 2
 *      player game with no ai opponent implemented.
 */
public class TicTacToeGUI implements ActionListener {
    JButton button[] = new JButton[9];
    int counter = 0;

    /* board representation
        1   2   3
        4   5   6
        7   8   9
        */
    public TicTacToeGUI(){

        JFrame jfrm = new JFrame("Tic Tac Toe");
        jfrm.setLayout(new GridLayout(3,3));
        jfrm.setSize (500, 500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);

        for(int i = 0; i < button.length; i++) {
            button[i] = new JButton("blank");
            button[i].addActionListener(this);
            jfrm.add(button[i]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(!ae.getActionCommand().equals("blank"))
            return;

        if(counter%2 == 0){
            ((JButton)ae.getSource()).setText("X");
            counter++;
        } else {
            ((JButton)ae.getSource()).setText("O");
            counter++;
        }
    }

    public static void main (String args[]){
        System.out.println("A. Vu's Tic Tac Toe");
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new TicTacToeGUI();
            }
        });
    }
}
