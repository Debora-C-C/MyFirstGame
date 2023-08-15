import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {

    //Declarations of variables

    JFrame frame;
    JLabel label;

    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    Game() {

        //The Gui box displaying
        frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);

        //experimento con Icon para image
        ImageIcon plane = new ImageIcon("/C:/Users/debor/Pictures/Plane2200.png");

        //This is the square I use to bind to the inputs
        label = new JLabel(plane);
       // label.setBackground(Color.BLACK);
        label.setBounds(100, 100, 200, 200);
        label.setOpaque(true);

        //The methods of the variables
        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        //Keybindings. Each stroke to the corresponding action. Note: get on with these methods.
        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        label.getActionMap().put("upAction", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getActionMap().put("downAction", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getActionMap().put("leftAction", leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label.getActionMap().put("rightAction", rightAction);

        //This is for the square to be visible inside the Gui box
        frame.add(label);
        frame.setVisible(true);
    }

    //I am not sure what this is
    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()-10);
        }
    }
    public class DownAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()+10);
        }
    }
    public class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10, label.getY());
        }
    }

    public class RightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10, label.getY());
        }
    }


}

