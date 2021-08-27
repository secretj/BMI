package project;

import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args)  {
		//init() 초기화후 메모장 읽어오고 키값 비교.
		
		Scanner sc = new Scanner(System.in);
		//메소드가 들어있는 클래스 선언
		
		MemberMethod Method  = new MemberMethod();
		
		//login 메소드 호출
		MemberInfo info = Method.login();  
        	
		while(true) {
		System.out.println("\n\n\n\n\n");
	   //bmi메소드 호출
		Method.bmi(info);				 
		
       System.out.println();
       System.out.println("  * 다시 검사하시려면 '1'을 입력해주시고 나가시려면 아무키나 입력해주세요.");
       

       if(Method. input().charAt(0)=='1') {
        	continue;
        }else {
        	break;
        }
		}
		 
		
		
		
		try {
	          	String fileNm = "C:\\Dev211\\Studyjava\\Project01\\src\\membertext\\memberInformation.txt";		// 회원의 정보를 저장할 주소

	          	File file = new File(fileNm);
	            FileWriter fileWrite = new FileWriter(file, true);
			
	         // 맵에 저장된 Key,Value 모두 출력
			Iterator<Map.Entry<String, String>> iteratora = info.memberTable.entrySet().iterator();		//각각의 HashMap 읽어오기.
			Iterator<Map.Entry<String, String>> iteratorb = info.bmiTable.entrySet().iterator();
			Iterator<Map.Entry<String, String>> iteratorc = info.nomalTable.entrySet().iterator();
	    	
			while (iteratora.hasNext()) {																//반복자를 이용해 저장된 값을 하나씩 읽어옴.
	    		Map.Entry<String, String> entry = (Map.Entry<String, String>) iteratora.next();
	    	 
	    	    fileWrite.write("[고객ID] : \t");
	    	   	fileWrite.write(entry.getKey());
	    	   	fileWrite.write("\n\n[고객PW] : \t");
	    	   	fileWrite.write(entry.getValue());
	    	    fileWrite.write("\n");
	    	   	
	    	   	System.out.println("[ID]:" + entry.getKey() + ",  [PW]     : " + entry.getValue());
	    	   	}
	    	
	    	while (iteratorb.hasNext()) {
	    		Map.Entry<String, String> entry = (Map.Entry<String, String>) iteratorb.next();
	    	   	    
	    	   	fileWrite.write("\n[비만도] : \t");
	    	   	fileWrite.write(entry.getValue());
	    	    fileWrite.write("\n");
	    	   	System.out.println("[ID]:" + entry.getKey() + ", " + entry.getValue());
	    	   	}
	    	
	    	while (iteratorc.hasNext()) {
	    		Map.Entry<String, String> entry = (Map.Entry<String, String>) iteratorc.next();
	    	   	
	    	   	fileWrite.write("\n[표준체중] :\t");
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
        System.out.println("이용해 주셔서 감사합니다.");
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
       
        sc.close();
        System.exit(0);
        
        
 
       }

	}
    
			

		  
		

