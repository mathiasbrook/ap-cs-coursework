import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class States extends JFrame{
   private String[] states = {"alabama","alaska","arizona","arkansas","california","colorado","connecticut","delaware","florida","georgia","hawaii","idaho","illinois","indiana","iowa","kansas","kentucky","louisiana","maine","maryland","massachusetts","michigan","minnesota","mississippi","missouri","montana","nebraska","nevada","new hampshire","new jersey","new mexico","new york","north carolina","north dakota","ohio","oklahoma","oregon","pennsylvania","rhode island","south carolina","south dakota","tennessee","texas","utah","vermont","virginia","washington","west virginia","wisconsin","wyoming"};
   private int count = 50;
   public States() {
      setTitle("50 States Exercise");
      setSize(400,100);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setResizable(false);
      setLayout(new FlowLayout());
      JLabel title = new JLabel("50 States Exercise!");
      JTextField textBox = new JTextField(10);
      JLabel counter = new JLabel("50/50 Remaining!");
      JLabel timer = new JLabel("0 Seconds");
      add(title);
      add(textBox);
      add(counter);
      add(timer);
      Action action = 
         new AbstractAction()
         {
            //@Override
            public void actionPerformed(ActionEvent e)
            {
               String potentialState = textBox.getText().toLowerCase();
               System.out.println(potentialState);
               textBox.setText("");
               for (int i = 0; i < states.length; i++) {
                  if (potentialState.equals(states[i])) {
                     String[] copy = new String[states.length - 1];
                     for (int j = 0,  l = 0; j < states.length; j++) {
                        if (j != i) {
                           copy[l++] = states[j];
                        } 
                     }
                     for (int k = 0; k < copy.length; k++) {
                        states[k] = copy[k];
                     }
                     states[states.length-1] = null;
                     count = 0;
                     for (int o = 0; o < states.length; o++) {
                        if (states[o] != null) {
                           count++;
                        }
                     }
                     if (count == 0) {
                        counter.setText("Complete!");
                     } else {
                        counter.setText(count + "/50 Remaining!");
                     }
                  }
               }
            }
         };
      textBox.addActionListener(action);
      setVisible(true);
      setLocationRelativeTo(null);
      for (int mil = 0, sec = 0; mil > -1; mil++) {
         if (mil == 14500000) {
            sec++;
            mil = 0;
         }
         timer.setText(sec + " Seconds");
      }
   }
   public static void main(String[] args) {
      JFrame States = new States();
   }
}