package project02;

import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Dimension;

import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Dimension;

public class StandbyScreen extends JFrame {
	
	
//	background
	private Image mainbackground = new ImageIcon
			(StandbyScreen.class.getResource("../img/main_login.jpg")).getImage();

	public StandbyScreen() {

		Container panel = getContentPane();
		panel.setLayout(new FlowLayout()); // 배치 유형 
		
		JPanel mainbg= new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(mainbackground, -10, 0, 1000, 750,null);
			}
		};
		
		
		
//		Button
		JLabel maintitle = new JLabel("BMI Program");
		JLabel IDlabel = new JLabel("ID");
		JLabel PWlabel = new JLabel("PW");
		JTextField IDfield = new JTextField(" ", 20);
		JTextField PWfield = new JTextField(" ", 20);
		
		JButton login = new JButton("로그인");
		JButton join = new JButton("회원 가입");
		
		maintitle.setFont(new Font("IMPACT", Font.PLAIN, 60));
		IDlabel.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 25));
		PWlabel.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 25));
		PWfield.setFont(new Font("맑은고딕", Font.PLAIN, 30));
		
		
		mainbg.setBounds(0, 0, 1000, 800);
		maintitle.setBounds(350, 100, 400, 150);
		IDlabel.setBounds(310, 300, 150, 50);
		PWlabel.setBounds(300, 370, 150, 50);
		IDfield.setBounds(350, 300,350,50);
		PWfield.setBounds(350, 370,350,50);
		login.setBounds(300, 450, 400, 50); // 배치위치
		join.setBounds(300, 520, 400, 50);
		
		panel.add(IDlabel);
		panel.add(PWlabel);
		panel.add(maintitle);
		panel.add(IDfield);// button
		panel.add(PWfield);
		panel.add(join); 
		panel.add(login);
		panel.add(mainbg);
		
		//버튼색상
		login.setBackground(Color.yellow);
		join.setBackground(Color.yellow);
		
	
		

//		기본 설정
		setTitle("5조 프로젝트"); // 창의 title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료기능 추가
		setSize(1000, 800); // 창의 (x,y) 사이즈
		setLayout(null); // 레이아웃을 내맘대로 설정 할수있게 해줌
		setResizable(false); // 창의 크기를 바꾸지 못하게 함
		setVisible(true); // 눈에 보일것인지 아닌지 true는 보인다.
		
		
		 login.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                new BMICalculator();
	                setVisible(false); // 창 안보이게 하기 
	            }
	        });
		 join.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                new JoinPage();
	                setVisible(false); // 창 안보이게 하기 
	            }
	        });

	}
	
	public static void main(String[] args) {
		StandbyScreen frame = new StandbyScreen();
	}
}