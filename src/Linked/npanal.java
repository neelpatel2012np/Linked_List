package Linked;
import java.awt.Color;
import javax.swing.*;
public class npanal extends javax.swing.JPanel {

     JLabel l;
     public JTextArea a;
     public JTextArea v;
     public npanal(int x) {
          l=new JLabel(Integer.toString(x));
          a=new JTextArea("",1,1);
          v=new JTextArea("",1,1);
          v.setBounds(0,0,50,20);
          v.setEditable(false);
          v.setForeground(Color.getHSBColor((float) 1.623,1000,1000));
          v.setBackground(Color.DARK_GRAY);        
          add(v);
          a.setBounds(50,0,50,20);
          a.setForeground(Color.ORANGE);
          a.setBackground(Color.DARK_GRAY);
          a.setEditable(false);
          add(a);
          l.setBounds(0,30,100,20);
          l.setForeground(Color.red);
          l.setHorizontalAlignment(0);
          add(l);
          setSize(100,50);
          setLayout(null);
          setBackground(Color.DARK_GRAY);
          setVisible(true);
     }
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
     }// </editor-fold>//GEN-END:initComponents


     // Variables declaration - do not modify//GEN-BEGIN:variables
     // End of variables declaration//GEN-END:variables

    
}
