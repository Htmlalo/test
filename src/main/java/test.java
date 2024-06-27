import javax.swing.*;
import javax.swing.GroupLayout;
import java.awt.*;
/*
 * Created by JFormDesigner on Thu Jun 27 11:59:58 ICT 2024
 */


import javax.swing.border.AbstractBorder;
/**
 * @author ACER
 */import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
public class test extends JFrame {
    public test() {
        initComponents();
        JPanel jPanel = new BackgroundPanel("C:/Users/ACER/Downloads/123.jpg");
        setContentPane(jPanel);
        panel1.setBounds(0,0,getWidth(),getHeight());
        panel1.setBackground(new Color(0,0,0,0));
        panel1.setOpaque(false);
        this.add(panel1);
        txt1.setBackground(Color.lightGray);
        txt1.setOpaque(false);



    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - TRỊNH THUẬT
        panel1 = new JPanel();
        button1 = new JButton();
        txt1 = new JTextField();
        textField2 = new JTextField();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new
            javax.swing.border.EmptyBorder(0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion",javax
            .swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java
            .awt.Font("D\u0069alog",java.awt.Font.BOLD,12),java.awt
            .Color.red),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans.
            PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062order".
            equals(e.getPropertyName()))throw new RuntimeException();}});

            //---- button1 ----
            button1.setText("text");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(368, 368, 368)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt1, GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                                    .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(411, 411, 411)
                                .addComponent(button1)))
                        .addContainerGap(486, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(142, Short.MAX_VALUE)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(button1)
                        .addGap(176, 176, 176))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - TRỊNH THUẬT
    private JPanel panel1;
    private JButton button1;
    private JTextField txt1;
    private JTextField textField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public class BackgroundPanel extends JPanel {
        private Image backgroundImage;

        public BackgroundPanel(String fileName) {
            backgroundImage = new ImageIcon(fileName).getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
    public static void main(String[] args) {
        new test().setVisible(true);
    }
}
