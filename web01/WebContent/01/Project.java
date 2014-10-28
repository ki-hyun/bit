package java02.test02;

import java.util.ArrayList;
import java.util.Scanner;


public class Project {
  

  class Score{
    String name;
    int kor;
    int eng;
    int math;

    public Score() {}

    public Score(String n, int k, int e, int m) {
      name = n; 
      kor = k;
      eng = e; 
      math = m;
    }
    
    public void add(){
      
    }
  }

  //class Score 


  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Score score = new Score();
    ArrayList<Score>arraylist = new ArrayList();
    System.out.println("명령>");
    Scanner scanner = new Scanner(System.in);
    if (scanner.nextLine().equals("help")) {
      System.out.println("list");
      System.out.println("view 인덱스");
      System.out.println("add 이름 국어 영어 수학");
      System.out.println("delete 인덱스");
      System.out.println("update 인덱스");
      System.out.println("exit");
      System.out.println("명령>");


      String[] cmd = scanner.nextLine().split(" ");
      System.out.println(cmd[0]/* + add[1] + add[2] + add[3] + add[4]*/);
      
      if (cmd[0].equals("add")) {
        //add(cmd[1] + " " + cmd[2] + " " + cmd[3] + " " + cmd[4]);
        arraylist.add(score(cmd[1],(int)cmd[2],(int)cmd[3],(int)cmd[4]));

      } else if (cmd[0].equals("delete")){
        System.out.println("delete");

      } else if (cmd[0].equals("view")){
        System.out.println("view");

      } else if (cmd[0].equals("update")){
        System.out.println("update");

      }else{
        System.out.println("값을 잘못 입력하였습니다.");
      }


    }
  }

}
