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
         pagepanel.setLayout(new FlowLayout()); // 배치 유형 
      
         JPanel pagebg= new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
               g.drawImage(pagebackground, -10, 0, 1000, 750,null);
            }
         };   
      pagebg.setBounds(0, 0, 1000, 800);
      
//      요소추가
      JLabel title = new JLabel("< 정보를 입력해주세요 >");
      JLabel weighttext = new JLabel("몸무게 ( Weight )");
      JLabel heighttext = new JLabel("키 ( Height )");
      JTextField weightfield = new JTextField(" ", 20);
      JTextField heightfield = new JTextField(" ", 20);
      JButton calculator = new JButton("BMI 계산하기");
      
      title.setFont(new Font("맑은고딕", Font.PLAIN, 40));
      weighttext.setFont(new Font("맑은고딕", Font.PLAIN, 30));
      heighttext.setFont(new Font("맑은고딕", Font.PLAIN, 30));
      heightfield.setFont(new Font("맑은고딕", Font.PLAIN, 50));
      heightfield.setFont(new Font("맑은고딕", Font.PLAIN, 50));
      calculator.setFont(new Font("맑은고딕", Font.PLAIN, 25));
      
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
      
      
      
//      기본 설정
      setTitle("5조 프로젝트"); // 창의 title
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료기능 추가
      setSize(1000, 800); // 창의 (x,y) 사이즈
      setLayout(null); // 레이아웃을 내맘대로 설정 할수있게 해줌
      setResizable(false); // 창의 크기를 바꾸지 못하게 함
      setVisible(true); // 눈에 보일것인지 아닌지 true는 보인다.
      
//      login.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new BMICalculator();
//                setVisible(false); // 창 안보이게 하기 
//            }
//        });
      
   }
   
   
   public static void main(String[] args) {
      BMICalculator frame = new BMICalculator();
   }
   

}
