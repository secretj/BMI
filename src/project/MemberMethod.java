package project;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MemberMethod extends MemberInfo{
	
	//�޴� ��� �޼ҵ�
    public char display() {
    	for(int i=0; i<=10; i++) {
    		System.out.println();
    	}
    	System.out.println("��                               BMI PROGRAM                     ��");
    	System.out.println("�ߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡߡޡޡߡޡߡޡ� ");
    	System.out.println("�ߡޡߡޡߡޡߡޡߡޡߡޡߡޡ�1. �α���  �ߡޡߡޡߡޡߡޡߡޡߡޡޡߡޡߡޡ� ");
        System.out.println("�ߡޡߡޡߡޡߡޡߡޡߡޡߡޡ�2. ȸ������ �ߡޡߡޡߡޡߡޡߡޡߡޡߡޡޡߡ� ");
        System.out.println("�ߡޡߡޡߡޡߡޡߡޡߡޡߡߡ�3. �α׾ƿ��ߡޡߡޡߡޡߡޡߡޡߡޡޡߡޡߡޡ� ");
        System.out.println("�ߡ�           	    ������ �޴��� ��ȣ�� �Է����ּ���.     	     ��");
        System.out.println();
        System.out.print("                   ");
        return input().charAt(0);
      
        
    }
    
    
    //�Է� �޼ҵ�
    public String input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    
    //ȸ������ �޼ҵ�
    public void Join() {
        if (loginFlag) {
            System.out.println("�ڵ� �α׾ƿ��ϰ� ���ο� ȸ�������� �����մϴ�.");		//�α��ε� ���·� ȸ������ �ɼ� ���ý� �߻�
            System.out.println();
            loginFlag = false;
        }
    
        while(true) {
            System.out.print("[ ���� ID ]: ");
            String newid = input();
            if(newid.contains(" ")) {										//���̵� ��� ���� �Է� ������ ����� �� ����.
               System.out.println("������ ID�� ����Ͻ� �� �����ϴ�.");				
               System.out.println();
               continue;													//�����Է½� �ٽ� ID�Է¶����� �Ѿ��
            }
            if(memberTable.containsKey(newid)) {							//�ߺ�üũ
                System.out.println("�̹� �����ϴ� ���̵� �Դϴ�.");
                System.out.println();
                continue;													//ID �ߺ��� �ٽ� ID �Է¶����� �Ѿ��
            }
            System.out.print("[ ���� PW ]: ");
            String newPwd = input();
            memberTable.put(newid, newPwd);
            break;
        }
       
        System.out.println("[ȸ�� ������ ���������� �Ϸ�Ǽ̽��ϴ�.]");
        System.out.println();
    }
   
    //�α���Ȯ�� �޼ҵ�
    public void loginVaild() {
        if (loginFlag) {														// �α��� �˻�
            System.out.println("�̹� �α��εǾ� �ִ� �����Դϴ�.");
            System.out.println();
            return;
        }
   }
  
    
    // ���̵�� ��й�ȣ �˻� �޼ҵ�
public void isMemberCheck(String id, String pw) {  
        if (memberTable.containsKey(id)) {												//memberTable�� id�� �����ϴ°�
            if (!memberTable.get(id).equals(pw)) {										//���� id�� �Է��� pw�� ��ġ����������  ,,
                System.out.println();
            	System.out.println("  [  ��й�ȣ�� ���� �ʽ��ϴ�.  ]");						//���
                System.out.println();
            } else {
            	System.out.println();
                System.out.println("            BMI PROGRAM�� �α��� �Ǽ̽��ϴ�.");			//��ġ�ϸ� �α��� �Ϸ�.
                System.out.println();
                loginFlag = true;
                
            }
        } else {
            System.out.println("  [  �������� �ʴ� ���̵� �Դϴ�.  ]  ");						//�Է��� id�� ��������������
            System.out.println();
        }
    }
   

//�α��� �޼ҵ�
public MemberInfo login() {
     Scanner input = new Scanner(System.in);
      MemberInfo info =new MemberInfo();
      
      while (true) {
       
         
          char select = display();
          
          
         if(select=='1') {
             loginVaild();
              if (MemberInfo.loginFlag) {
                  break;
              }
              System.out.print("<���̵� �Է�> :");
              String myId = input.nextLine().trim();			// Ŭ���̾�Ʈ�� ���̵� �Է�
              info.setId(myId);									// �Է��� �� set�� ����									
              System.out.print("<��й�ȣ �Է�> : ");
              String myPw = input.nextLine().trim();			// Ŭ���̾�Ʈ�� ��й�ȣ �Է�
              info.setPassword(myPw);							// �Է��� �� set�� ����
              isMemberCheck(info.getId(), info.getPassword());   //���üũ�޼ҵ� ȣ��
              
              info.memberTable.put(myId, myPw);   			 // �Է��� ���� Map�� KEY:ID�� Value:PASSWORD ����
              


              if(MemberInfo.loginFlag) {break;}                  //�α��ο� �����ϸ� while�� ����������  
         }
         //ȸ������
         else if(select=='2') {                             
             	Join();
                                               
              
         }
         //�α׾ƿ�
         else if(select=='3') { 					
             System.out.println("===================�α׾ƿ� �մϴ�.==================="); 
            System.exit(0);
         }
         else {
              System.out.println("\n\n===========================�߸��� �� �Է�============================");
              continue;
          }
      }
      return info;
   
}





//bmi�޼ҵ�
public void bmi(MemberInfo info) {
     
      Scanner scan = new Scanner(System.in);
     
      try {
      System.out.print("[����� ü����?] : ");
      double Weight=info.setW(Double.parseDouble(scan.nextLine()));
      System.out.print("[����� Ű��?] : ");
      double Height =info.setH(Double.parseDouble(scan.nextLine()));
     
         
       DecimalFormat df = new DecimalFormat("00.00");   	//�Էµ� ���� df�� ����� ���·� ����   >> �����ϸ� MAP�� ���� �� ���� 
       
        double nomalWeight = (Height - 100) * 0.9;  // ǥ�� ü�� ��� ����
         
        double fatnessWeight = (Weight / nomalWeight) * 100; //�񸸵� ��� ����
        
      //  String fatness = Double.toString(fatnessWeight);	//double�� ��Ʈ�������� �ٲ㼭 Map�� ������� ��ȯ   > String���� �ٲ��ֱ����� ��������� df�� �������� �ʿ������
      //  String nomal = Double.toString(nomalWeight);	    //double�� ��Ʈ�������� �ٲ㼭 Map�� ������� ��ȯ
        
      //  String w = Double.toString(Weight);
      //  String h = Double.toString(Height);
        
        info.bmiTable.put(info.getId(), df.format(fatnessWeight));         //bmiTable�� ���                             ***
        info.nomalTable.put(info.getId(), df.format(nomalWeight));		   //nomalTable�� ���
         
         
        
         System.out.println("\n [���� Ű�� �����Դ� " + Height + "cm" + ", " + Weight + "kg �Դϴ�.]");			//Ű�� ������ Ȯ�θ�Ʈ
         System.out.println(" [����� ǥ�� ü���� " + df.format(nomalWeight) + "�Դϴ�.]\n");						//ǥ��ü�� ���
         System.out.printf("[BMI] : " + df.format(fatnessWeight)+"\n");										//BMI ���
         System.out.println();
   
               


         if(fatnessWeight < 90 ) {															//BMI ��ġ�� ���� ���⽬�� �񸸵��� Ŭ���̾�Ʈ���� ������
            System.out.println(" [����� ��ü�� �Դϴ�.]");
            System.out.println(" [�� �� ������ �弼�� !] ");
            System.out.println("���������V���������|�����������������|������������������|");
            System.out.println("           ��ü��                          ǥ��                             ��ü��             ");
            System.out.println();
         } else if(fatnessWeight >= 90 && fatnessWeight < 110) {
            System.out.println("[����� ǥ�� �Դϴ�.]");
            System.out.println("     [�� ���߾�� !]");
            System.out.println("�����������������|��������V���������|������������������|");
            System.out.println("           ��ü��                            ǥ��                            ��ü��             ");
            System.out.println();
         } else if(fatnessWeight >= 100){
            System.out.println("[����� ��ü�� �Դϴ�.]");
            System.out.println("     [������ �弼�� !] ");
            System.out.println("�����������������|�����������������|��������V����������|");
            System.out.println("           ��ü��                           ǥ��                             ��ü��             ");
            System.out.println();
         } else {
            System.out.println("[BMI ����] : �ٽ� �Է����ּ���");									//������ ���Ե���������
         }
         
         
   }catch(Exception e) {
	  System.out.println("=================================================");				//�߸��� �� �Է½� ����ó��
 	  System.out.println("=====���ڸ� ������ Ű�� �Է��Ͻ� �� �����ϴ�.=====");
 	  System.out.println("=================================================");
   }

}
   

}

