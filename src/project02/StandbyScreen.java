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
		panel.setLayout(new FlowLayout()); // ��ġ ���� 
		
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
		
		JButton login = new JButton("�α���");
		JButton join = new JButton("ȸ�� ����");
		
		maintitle.setFont(new Font("IMPACT", Font.PLAIN, 60));
		IDlabel.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 25));
		PWlabel.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 25));
		PWfield.setFont(new Font("�������", Font.PLAIN, 30));
		
		
		mainbg.setBounds(0, 0, 1000, 800);
		maintitle.setBounds(350, 100, 400, 150);
		IDlabel.setBounds(310, 300, 150, 50);
		PWlabel.setBounds(300, 370, 150, 50);
		IDfield.setBounds(350, 300,350,50);
		PWfield.setBounds(350, 370,350,50);
		login.setBounds(300, 450, 400, 50); // ��ġ��ġ
		join.setBounds(300, 520, 400, 50);
		
		panel.add(IDlabel);
		panel.add(PWlabel);
		panel.add(maintitle);
		panel.add(IDfield);// button
		panel.add(PWfield);
		panel.add(join); 
		panel.add(login);
		panel.add(mainbg);
		
		//��ư����
		login.setBackground(Color.yellow);
		join.setBackground(Color.yellow);
		
	
		

//		�⺻ ����
		setTitle("5�� ������Ʈ"); // â�� title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �߰�
		setSize(1000, 800); // â�� (x,y) ������
		setLayout(null); // ���̾ƿ��� ������� ���� �Ҽ��ְ� ����
		setResizable(false); // â�� ũ�⸦ �ٲ��� ���ϰ� ��
		setVisible(true); // ���� ���ϰ����� �ƴ��� true�� ���δ�.
		
		
		 login.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                new BMICalculator();
	                setVisible(false); // â �Ⱥ��̰� �ϱ� 
	            }
	        });
		 join.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                new JoinPage();
	                setVisible(false); // â �Ⱥ��̰� �ϱ� 
	            }
	        });

	}
	
	public static void main(String[] args) {
		StandbyScreen frame = new StandbyScreen();
	}
}