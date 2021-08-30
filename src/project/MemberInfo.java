package project;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberInfo {
   //필드 선언
   private String id, password;		//아이디 패스워드
   private double w;				//체중
   private double h;				//키
   static boolean loginFlag;		//로그인 확인 변수
   
   
   Map<String, String> memberTable;     //Map 초기화
   Map<String, String> bmiTable;     
   Map<String, String> nomalTable;
   
 
   
   public MemberInfo() {
	   memberTable = new HashMap<>(); 
	   bmiTable = new HashMap<>(); 
	   nomalTable = new HashMap<>();
   }
  
   
   //get,set
   
   public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public double getW() {
       return w;
    }
    public double setW(double w) {
       return w;
    }
    public double getH() {
       return h;
    }
    public double setH(double h) {
       return h;
    }
     
    
    
   
   
}


   






