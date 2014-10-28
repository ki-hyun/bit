package java02.test02;

import java.util.ArrayList;
import java.util.Scanner;


public class Project {

  static ArrayList<Score>arraylist = new ArrayList<Score>();

  public static void help() {
    System.out.println("list");
    System.out.println("view 인덱스");
    System.out.println("add b이름 국어 영어 수학");
    System.out.println("delete 인덱스");
    System.out.println("update 인덱스");
    System.out.println("exit");
  }
  
  public static void update(int index){
    System.out.println("이름(" + arraylist.get(index).name+") ?");
    
     
  }

  public static class Score{
    String name;
    int kor; 
    int eng;
    int math;

    public Score (String n, int k, int e, int m){
      name = n;
      kor = k;
      eng = e;
      math = m;
    }
  }



  //class Score 


  public static void main(String[] args){
    // TODO Auto-generated method stub
    while(true){
      System.out.println("명령>");
      /*   Scanner scanner = new Scanner(System.in);
      String[] cmd = scanner.nextLine().split(" ");*/

      Scanner scanner = new Scanner(System.in);
      String str = scanner.nextLine();
      String[] cmd = str.split(" ");



      if(cmd[0].equals("help")){
        help();
        
      }else if (cmd[0].equals("add")) {
        arraylist.add(new Score(cmd[1],Integer.parseInt(cmd[2]), Integer.parseInt(cmd[3]), Integer.parseInt(cmd[4])));

      } else if (cmd[0].equals("delete")){
        System.out.println("delete");
        arraylist.remove(Integer.parseInt(cmd[1]));
        System.out.println("제거되었습니다.");
        
      } else if (cmd[0].equals("view")){
        System.out.println("view");
        System.out.println(arraylist.get(Integer.parseInt(cmd[1])).name + arraylist.get(Integer.parseInt(cmd[1])).kor + arraylist.get(Integer.parseInt(cmd[1])).eng+ arraylist.get(Integer.parseInt(cmd[1])).math);

      } else if (cmd[0].equals("update")){
            update(Integer.parseInt(cmd[1]));
              
           

      }else if(cmd[0].equals("list")){
        for(int i=0; i< arraylist.size(); i++){
          System.out.print(arraylist.get(i).name + arraylist.get(i).kor + arraylist.get(i).eng+ arraylist.get(i).math);
        }
        
       }else if(cmd[0].equals("exit")){
          System.out.println("exit문장 입니다.");
       }

      else{
        System.out.println("값을 잘못 입력하였습니다.");
      }
    }
  }


}













