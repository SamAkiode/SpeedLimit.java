import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SmartPhoneUI extends JFrame  {

    JFrame frame;
    JLabel label,piclabel;
    JPanel panel;
    JMenu menu;
    JMenuItem Cyan,pink,lightgray;
    JMenuBar menuBar;
    JButton button1,button2,button3,button4;

   public SmartPhoneUI(){
       frame = new JFrame(); // Creates a frame
       label = new JLabel();
       panel = new JPanel();
       menuBar = new JMenuBar();
       menu = new JMenu("Select Background color");
       Cyan = new JMenuItem("Cyan");
       pink = new JMenuItem("Pink");
       lightgray = new JMenuItem("Light Gray");
       //ImageIcon iconCam = new ImageIcon("CameraAppLogo.png");
       piclabel = new JLabel(new ImageIcon("src/CameraAppLogo.png"));
       menu.add(Cyan);
       menu.add(pink);
       menu.add(lightgray);
       button1 = new JButton();
       button2 = new JButton();
       button3 = new JButton();
       button4 = new JButton();
       button1.add(piclabel);
       pink.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               panel.setBackground(Color.pink);
           }
       });
       lightgray.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               panel.setBackground(Color.lightGray);
           }
       });
       Cyan.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               panel.setBackground(Color.cyan);
           }
       });
       panel.setBackground(Color.CYAN);
       menuBar.add(menu);
       frame.setVisible(true); // Makes frame visible
       frame.setTitle("Blackberry"); // Sets the title of the frame
       frame.setSize(320,580); //sets the x-dimension and y-dimension of the frame
       frame.setDefaultCloseOperation(3); //exit out of application
       frame.setResizable(false);
       frame.setLocationRelativeTo(null);
       frame.setJMenuBar(menuBar);
       frame.add(panel);
       panel.setLayout(new BorderLayout());
       ImageIcon Icon = new ImageIcon("C:\\Users\\User\\IdeaProjects\\GUI PROJECT\\src\\Logo.png"); // create an ImageIcon
       frame.setIconImage(Icon.getImage()); //change Icon of frame;



   }

    public static void main(String[] args) {
        SmartPhoneUI run = new SmartPhoneUI();
    }
}
