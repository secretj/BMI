package project;

import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args)  {
		//init() �ʱ�ȭ�� �޸��� �о���� Ű�� ��.
		
		Scanner sc = new Scanner(System.in);
		//�޼ҵ尡 ����ִ� Ŭ���� ����
		
		MemberMethod Method  = new MemberMethod();
		
		//login �޼ҵ� ȣ��
		MemberInfo info = Method.login();  
        	
		while(true) {
		System.out.println("\n\n\n\n\n");
	   //bmi�޼ҵ� ȣ��
		Method.bmi(info);				 
		
       System.out.println();
       System.out.println("  * �ٽ� �˻��Ͻ÷��� '1'�� �Է����ֽð� �����÷��� �ƹ�Ű�� �Է����ּ���.");
       

       if(Method. input().charAt(0)=='1') {
        	continue;
        }else {
        	break;
        }
		}
		 
		
		
		
		try {
	          	String fileNm = "C:\\Dev211\\Studyjava\\Project01\\src\\membertext\\memberInformation.txt";		// ȸ���� ������ ������ �ּ�

	          	File file = new File(fileNm);
	            FileWriter fileWrite = new FileWriter(file, true);
			
	         // �ʿ� ����� Key,Value ��� ���
			Iterator<Map.Entry<String, String>> iteratora = info.memberTable.entrySet().iterator();		//������ HashMap �о����.
			Iterator<Map.Entry<String, String>> iteratorb = info.bmiTable.entrySet().iterator();
			Iterator<Map.Entry<String, String>> iteratorc = info.nomalTable.entrySet().iterator();
	    	
			while (iteratora.hasNext()) {																//�ݺ��ڸ� �̿��� ����� ���� �ϳ��� �о��.
	    		Map.Entry<String, String> entry = (Map.Entry<String, String>) iteratora.next();
	    	 
	    	    fileWrite.write("[��ID] : \t");
	    	   	fileWrite.write(entry.getKey());
	    	   	fileWrite.write("\n\n[��PW] : \t");
	    	   	fileWrite.write(entry.getValue());
	    	    fileWrite.write("\n");
	    	   	
	    	   	System.out.println("[ID]:" + entry.getKey() + ",  [PW]     : " + entry.getValue());
	    	   	}
	    	
	    	while (iteratorb.hasNext()) {
	    		Map.Entry<String, String> entry = (Map.Entry<String, String>) iteratorb.next();
	    	   	    
	    	   	fileWrite.write("\n[�񸸵�] : \t");
	    	   	fileWrite.write(entry.getValue());
	    	    fileWrite.write("\n");
	    	   	System.out.println("[ID]:" + entry.getKey() + ", " + entry.getValue());
	    	   	}
	    	
	    	while (iteratorc.hasNext()) {
	    		Map.Entry<String, String> entry = (Map.Entry<String, String>) iteratorc.next();
	    	   	
	    	   	fileWrite.write("\n[ǥ��ü��] :\t");
	    	   	fileWrite.write(entry.getValue());
	    	   	fileWrite.write("\n===================================");
	    	    fileWrite.write("\n");
	    	   	System.out.println("[ID]:" + entry.getKey() + ", " + entry.getValue());
	    	   	}
	        
	    	fileWrite.flush();
	        fileWrite.close();
	        
	     } catch (Exception e) {
	        e.printStackTrace();
	     }
		 
		 
        System.out.println();
        System.out.println("�̿��� �ּż� �����մϴ�.");
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
       
        sc.close();
        System.exit(0);
        
        
 
       }

	}
    
			

		  
		

