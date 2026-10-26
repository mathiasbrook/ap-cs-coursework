import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class NorthAmerica extends JFrame{
   private String[] countries = {"canada","america","mexico","guatemala","belize","el salvador","honduras","nicaragua","costa rica","panama"};
   private int count = 50;
   public NorthAmerica() {
      setTitle("North American Countries Exercise");
      setSize(500,100);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setResizable(false);
      setLayout(new FlowLayout());
      JLabel title = new JLabel("North American Countries Exercise!");
      JTextField textBox = new JTextField(10);
      JLabel counter = new JLabel("10/10 Remaining!");
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
               String potentialCountry = textBox.getText().toLowerCase();
               System.out.println(potentialCountry);
               textBox.setText("");
               for (int i = 0; i < countries.length; i++) {
                  if (potentialCountry.equals(countries[i])) {
                     String[] copy = new String[countries.length - 1];
                     for (int j = 0,  l = 0; j < countries.length; j++) {
                        if (j != i) {
                           copy[l++] = countries[j];
                        } 
                     }
                     for (int k = 0; k < copy.length; k++) {
                        countries[k] = copy[k];
                     }
                     countries[countries.length-1] = null;
                     count = 0;
                     for (int o = 0; o < countries.length; o++) {
                        if (countries[o] != null) {
                           count++;
                        }
                     }
                     if (count == 0) {
                        counter.setText("Complete!");
                     } else {
                        counter.setText(count + "/10 Remaining!");
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
      JFrame NorthAmerica = new NorthAmerica();
   }
}