package mission11;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyFrame extends JFrame{
    private JButton btnRed = new JButton("RED");
    private JButton btnBlue = new JButton("BLUE");
    private JPanel panelBackground = new JPanel();
     
    public MyFrame(){
        ColorListener listener = new ColorListener();
        btnRed.addActionListener(listener);
        btnBlue.addActionListener(listener);
         
        panelBackground.add(btnRed);
        panelBackground.add(btnBlue);
         
        add(panelBackground);
         
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
     
    public static void main(String[] args) {
    	MyFrame f = new MyFrame();
    }
///////////////////////////////////////////////////////
    class ColorListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btnRed){
                panelBackground.setBackground(Color.red);
            }else if(e.getSource() == btnBlue){
                panelBackground.setBackground(Color.blue);
            }
        }
    }
 
}


