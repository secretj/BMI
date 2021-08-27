package project;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MemberMethod extends MemberInfo{
	
	//메뉴 출력 메소드
    public char display() {
    	for(int i=0; i<=10; i++) {
    		System.out.println();
    	}
    	System.out.println("♡                               BMI PROGRAM                     ♡");
    	System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◇◆◇◆◇◆ ");
    	System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆1. 로그인  ◆◇◆◇◆◇◆◇◆◇◆◇◇◆◇◆◇◆ ");
        System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆2. 회원가입 ◆◇◆◇◆◇◆◇◆◇◆◇◆◇◇◆◇ ");
        System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◆◇3. 로그아웃◆◇◆◇◆◇◆◇◆◇◆◇◇◆◇◆◇◆ ");
        System.out.println("◆◇           	    선택할 메뉴의 번호를 입력해주세요.     	     ◆");
        System.out.println();
        System.out.print("                   ");
        return input().charAt(0);
      
        
    }
    
    
    //입력 메소드
    public String input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    
    //회원가입 메소드
    public void Join() {
        if (loginFlag) {
            System.out.println("자동 로그아웃하고 새로운 회원가입을 시작합니다.");		//로그인된 상태로 회원가입 옵션 선택시 발생
            System.out.println();
            loginFlag = false;
        }
    
        while(true) {
            System.out.print("[ 가입 ID ]: ");
            String newid = input();
            if(newid.contains(" ")) {										//아이디 사용 조건 입력 공백은 사용할 수 없다.
               System.out.println("공백은 ID로 사용하실 수 없습니다.");				
               System.out.println();
               continue;													//공백입력시 다시 ID입력란으로 넘어가라
            }
            if(memberTable.containsKey(newid)) {							//중복체크
                System.out.println("이미 존재하는 아이디 입니다.");
                System.out.println();
                continue;													//ID 중복시 다시 ID 입력란으로 넘어가라
            }
            System.out.print("[ 가입 PW ]: ");
            String newPwd = input();
            memberTable.put(newid, newPwd);
            break;
        }
       
        System.out.println("[회원 가입이 성공적으로 완료되셨습니다.]");
        System.out.println();
    }
   
    //로그인확인 메소드
    public void loginVaild() {
        if (loginFlag) {														// 로그인 검사
            System.out.println("이미 로그인되어 있는 상태입니다.");
            System.out.println();
            return;
        }
   }
  
    
    // 아이디와 비밀번호 검사 메소드
public void isMemberCheck(String id, String pw) {  
        if (memberTable.containsKey(id)) {												//memberTable에 id가 존재하는가
            if (!memberTable.get(id).equals(pw)) {										//받은 id와 입력한 pw가 일치하지않으면  ,,
                System.out.println();
            	System.out.println("  [  비밀번호가 맞지 않습니다.  ]");						//출력
                System.out.println();
            } else {
            	System.out.println();
                System.out.println("            BMI PROGRAM에 로그인 되셨습니다.");			//일치하면 로그인 완료.
                System.out.println();
                loginFlag = true;
                
            }
        } else {
            System.out.println("  [  존재하지 않는 아이디 입니다.  ]  ");						//입력한 id가 존재하지않으면
            System.out.println();
        }
    }
   

//로그인 메소드
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
              System.out.print("<아이디 입력> :");
              String myId = input.nextLine().trim();			// 클라이언트가 아이디 입력
              info.setId(myId);									// 입력한 값 set에 저장									
              System.out.print("<비밀번호 입력> : ");
              String myPw = input.nextLine().trim();			// 클라이언트가 비밀번호 입력
              info.setPassword(myPw);							// 입력한 값 set에 저장
              isMemberCheck(info.getId(), info.getPassword());   //멤버체크메소드 호출
              
              info.memberTable.put(myId, myPw);   			 // 입력한 값을 Map에 KEY:ID와 Value:PASSWORD 담음
              


              if(MemberInfo.loginFlag) {break;}                  //로그인에 성공하면 while문 빠져나가기  
         }
         //회원가입
         else if(select=='2') {                             
             	Join();
                                               
              
         }
         //로그아웃
         else if(select=='3') { 					
             System.out.println("===================로그아웃 합니다.==================="); 
            System.exit(0);
         }
         else {
              System.out.println("\n\n===========================잘못된 값 입력============================");
              continue;
          }
      }
      return info;
   
}





//bmi메소드
public void bmi(MemberInfo info) {
     
      Scanner scan = new Scanner(System.in);
     
      try {
      System.out.print("[당신의 체중은?] : ");
      double Weight=info.setW(Double.parseDouble(scan.nextLine()));
      System.out.print("[당신의 키는?] : ");
      double Height =info.setH(Double.parseDouble(scan.nextLine()));
     
         
       DecimalFormat df = new DecimalFormat("00.00");   	//입력된 값을 df에 저장된 형태로 변경   >> 변경하면 MAP에 담을 수 있음 
       
        double nomalWeight = (Height - 100) * 0.9;  // 표준 체중 계산 공식
         
        double fatnessWeight = (Weight / nomalWeight) * 100; //비만도 계산 공식
        
      //  String fatness = Double.toString(fatnessWeight);	//double을 스트링형으로 바꿔서 Map에 담기위해 변환   > String으로 바꿔주기위해 만들었지만 df의 등장으로 필요없어짐
      //  String nomal = Double.toString(nomalWeight);	    //double을 스트링형으로 바꿔서 Map에 담기위해 변환
        
      //  String w = Double.toString(Weight);
      //  String h = Double.toString(Height);
        
        info.bmiTable.put(info.getId(), df.format(fatnessWeight));         //bmiTable에 담기                             ***
        info.nomalTable.put(info.getId(), df.format(nomalWeight));		   //nomalTable에 담기
         
         
        
         System.out.println("\n [현재 키와 몸무게는 " + Height + "cm" + ", " + Weight + "kg 입니다.]");			//키와 몸무게 확인멘트
         System.out.println(" [당신의 표준 체중은 " + df.format(nomalWeight) + "입니다.]\n");						//표준체중 출력
         System.out.printf("[BMI] : " + df.format(fatnessWeight)+"\n");										//BMI 출력
         System.out.println();
   
               


         if(fatnessWeight < 90 ) {															//BMI 수치에 따른 보기쉬운 비만도를 클라이언트에게 보여줌
            System.out.println(" [당신은 저체중 입니다.]");
            System.out.println(" [좀 더 열심히 드세요 !] ");
            System.out.println("■■■■■■■■V■■■■■■■■|■■■■■■■■■■■■■■■■|■■■■■■■■■■■■■■■■■|");
            System.out.println("           저체중                          표준                             과체중             ");
            System.out.println();
         } else if(fatnessWeight >= 90 && fatnessWeight < 110) {
            System.out.println("[당신은 표준 입니다.]");
            System.out.println("     [참 잘했어요 !]");
            System.out.println("■■■■■■■■■■■■■■■■|■■■■■■■V■■■■■■■■|■■■■■■■■■■■■■■■■■|");
            System.out.println("           저체중                            표준                            과체중             ");
            System.out.println();
         } else if(fatnessWeight >= 100){
            System.out.println("[당신은 과체중 입니다.]");
            System.out.println("     [적당히 드세요 !] ");
            System.out.println("■■■■■■■■■■■■■■■■|■■■■■■■■■■■■■■■■|■■■■■■■V■■■■■■■■■|");
            System.out.println("           저체중                           표준                             과체중             ");
            System.out.println();
         } else {
            System.out.println("[BMI 측정] : 다시 입력해주세요");									//범위에 포함되지않은값
         }
         
         
   }catch(Exception e) {
	  System.out.println("=================================================");				//잘못된 값 입력시 예외처리
 	  System.out.println("=====숫자를 제외한 키는 입력하실 수 없습니다.=====");
 	  System.out.println("=================================================");
   }

}
   

}

