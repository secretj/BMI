package project;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberInfo {
   //�ʵ� ����
   private String id, password;
   private double w;
   private double h;
   static boolean loginFlag;
   
   
   Map<String, String> memberTable;     //Map �ʱ�ȭ
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


   






