package project02;


import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Dimension;

public class BMICalculator extends JFrame {
   
      
//      background
      private Image pagebackground = new ImageIcon
            (BMICalculator.class.getResource("../img/sub_img.jpg")).getImage();
      
      public BMICalculator() {
         
         Container pagepanel = getContentPane();
         pagepanel.setLayout(new FlowLayout()); // ��ġ ���� 
      
         JPanel pagebg= new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
               g.drawImage(pagebackground, -10, 0, 1000, 750,null);
            }
         };   
      pagebg.setBounds(0, 0, 1000, 800);
      
//      ����߰�
      JLabel title = new JLabel("< ������ �Է����ּ��� >");
      JLabel weighttext = new JLabel("������ ( Weight )");
      JLabel heighttext = new JLabel("Ű ( Height )");
      JTextField weightfield = new JTextField(" ", 20);
      JTextField heightfield = new JTextField(" ", 20);
      JButton calculator = new JButton("BMI ����ϱ�");
      
      title.setFont(new Font("�������", Font.PLAIN, 40));
      weighttext.setFont(new Font("�������", Font.PLAIN, 30));
      heighttext.setFont(new Font("�������", Font.PLAIN, 30));
      heightfield.setFont(new Font("�������", Font.PLAIN, 50));
      heightfield.setFont(new Font("�������", Font.PLAIN, 50));
      calculator.setFont(new Font("�������", Font.PLAIN, 25));
      
      title.setBounds(290, 100, 500, 200);
      weighttext.setBounds(180, 340, 300, 50);
      heighttext.setBounds(620, 340, 300, 50);
      weightfield.setBounds(150, 400, 300, 50);
      heightfield.setBounds(550, 400, 300, 50);
      calculator.setBounds(270, 500, 460, 70);
      
      calculator.setBackground(Color.yellow);
      
      pagepanel.add(title);
      pagepanel.add(weighttext);
      pagepanel.add(heighttext);
      pagepanel.add(weightfield);
      pagepanel.add(heightfield);
      pagepanel.add(calculator);
      pagepanel.add(pagebg);
      
      
      
//      �⺻ ����
      setTitle("5�� ������Ʈ"); // â�� title
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �߰�
      setSize(1000, 800); // â�� (x,y) ������
      setLayout(null); // ���̾ƿ��� ������� ���� �Ҽ��ְ� ����
      setResizable(false); // â�� ũ�⸦ �ٲ��� ���ϰ� ��
      setVisible(true); // ���� ���ϰ����� �ƴ��� true�� ���δ�.
      
//      login.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new BMICalculator();
//                setVisible(false); // â �Ⱥ��̰� �ϱ� 
//            }
//        });
      
   }
   
   
   public static void main(String[] args) {
      BMICalculator frame = new BMICalculator();
   }
   

}
