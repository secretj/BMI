package project02;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Dimension;

public class JoinPage extends JFrame {

//   background
   private Image joinbackground = new ImageIcon
         (BMICalculator.class.getResource("../img/sub_img.jpg")).getImage();
   
   JButton previous = new JButton(new ImageIcon("../img/previous_icon.png"));

   
 
   public JoinPage() {
      
      //���
      Container joinpanel = getContentPane();
      joinpanel.setLayout(new FlowLayout()); // ��ġ ���� 
   
      JPanel joinbg= new JPanel() {
         @Override
         protected void paintComponent(Graphics g) {
            g.drawImage(joinbackground, -10, 0, 1000, 750,null);
         }
      };   
      
      
      //��һ���
      JLabel title = new JLabel("< ȸ������ >");
      JLabel IDtext = new JLabel("ID");
      JLabel PWtext = new JLabel("PW");
      JTextField IDfield = new JTextField(" ", 20);
      JTextField PWfield = new JTextField(" ", 20);
      JButton JOIN = new JButton("�����ϱ�");
      JButton previous = new JButton("����");
      
      title.setFont(new Font("�������", Font.PLAIN, 40));
      IDtext.setFont(new Font("�������", Font.PLAIN, 30));
      PWtext.setFont(new Font("�������", Font.PLAIN, 30));
      IDfield.setFont(new Font("�������", Font.PLAIN, 50));
      PWfield.setFont(new Font("�������", Font.PLAIN, 50));
      JOIN.setFont(new Font("�������", Font.PLAIN, 25));
      previous.setFont(new Font("�������", Font.PLAIN, 25));
      
      title.setBounds(400, 100, 400, 150);
      IDtext.setBounds(300, 300, 100, 50);
      PWtext.setBounds(300, 400, 100, 50);
      IDfield.setBounds(400, 300,350,50);
      PWfield.setBounds(400, 400,350,50);
      JOIN.setBounds(330, 500, 400, 50); // ��ġ��ġ
      previous.setBounds(100, 550, 100, 100);
      
      JOIN.setBackground(Color.yellow);
      
      
      joinpanel.add(title);
      joinpanel.add(IDtext);
      joinpanel.add(PWtext);
      joinpanel.add(IDfield);
      joinpanel.add(PWfield);
      joinpanel.add(JOIN);
      joinpanel.add(previous);
      
      joinbg.setBounds(0, 0, 1000, 800);
      joinpanel.add(joinbg);
      
      
      previous.setBorderPainted(false);
      JOIN.setBorderPainted(false);
//      previous.setContentAreaFilled(false);
      previous.setFocusPainted(false);
      JOIN.setFocusPainted(false);
      
      
//      �⺻ ����
      setTitle("5�� ������Ʈ"); // â�� title
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �߰�
      setSize(1000, 800); // â�� (x,y) ������
      setLayout(null); // ���̾ƿ��� ������� ���� �Ҽ��ְ� ����
      setResizable(false); // â�� ũ�⸦ �ٲ��� ���ϰ� ��
      setVisible(true); // ���� ���ϰ����� �ƴ��� true�� ���δ�.
      
      JOIN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StandbyScreen();
                setVisible(false); // â �Ⱥ��̰� �ϱ� 
            }
        });
      previous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StandbyScreen();
                setVisible(false); // â �Ⱥ��̰� �ϱ� 
            }
        });
      
   }
   
   public static void main(String[] args) {
      JoinPage frame = new JoinPage();
   }
}
