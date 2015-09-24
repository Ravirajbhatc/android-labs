import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.*;  
import javax.swing.*; 
  
public class TestFrameExample { 
  
    public static void main(String s[]) {
        JTextField jtfText1,jtfText2,jtfText3;
        JFrame frame = new JFrame("Online Student Bonafide Automation");
  
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
  
        JLabel label = new JLabel("Enter ROll No:");
        jtfText1 = new JTextField(10);
        JLabel label1 = new JLabel("Enter Student Name:");
        JLabel result = new JLabel();
        jtfText2 = new JTextField(10);
        JLabel label2 = new JLabel("Reason For Bonafide:");
        Choice choice=new Choice();
        choice.add("USA Visa");
        choice.add("Educational Loan");
        choice.add("Sport Loan");
        
        JButton button = new JButton();
        button.setText("Submit");
        button.addActionListener(new ActionListener()
            {
              public void actionPerformed(ActionEvent e)
              {
                // display/center the jdialog when the button is pressed
                result.setText("Submission Success!");
              }
            });
  
        panel.add(label);
        panel.add(jtfText1);
        
        panel.add(label1);
        panel.add(jtfText2);
        
        panel.add(label2);
        panel.add(choice);
        
        panel.add(button);
        panel.add(result);
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
  
    } 
  
} 