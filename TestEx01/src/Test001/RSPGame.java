package Test001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RSPGame {
	 public static void main(String[] ar) throws IOException {
	      BufferedReader br = //---3
	         new BufferedReader(new InputStreamReader(System.in));
	      
	      int menu = -1;      int money = 1000;
	      boolean isStop = false;
	      String[] rsp = {"주먹", "가위", "보자기"};
	      int[][] result = { { 0, 1, -1} ,  { -1, 0, 1}, {1, -1, 0} }; // -1 짐 0 비김 1 이김

	      while(!isStop){
	         System.out.println("1. 주먹");
	         System.out.println("2. 가위");
	         System.out.println("3. 보자기");
	         System.out.println("0. 게임종료");
	         System.out.print("메뉴선택 : ");

	         menu = Integer.parseInt(br.readLine());

	         if(menu == 0){
	            System.out.println();
	            System.out.print("정말로 종료 하시겠습니까? (y/n) : ");
	            char re = (char) System.in.read();
	            System.in.read(); System.in.read();
	            if(re == 'Y' || re == 'y'){
	               isStop = true; 
	            }else{
	               isStop = false;
	            }
	            System.out.println();
	            continue;
	         }

	         if(menu != 1 && menu != 2 && menu != 3){
	            System.out.println();
	            System.out.println("메뉴입력오류 : 메뉴를 확인하시고 다시 입력해 주세요^^");
	            System.out.println();
	            continue;
	         }

	         System.out.println();
	         System.out.print("배팅금액 = ");
	         int batMoney = Integer.parseInt(br.readLine());

	         if(batMoney < 100 ){
	            System.out.println();
	            System.out.println("배팅금액 최소 100원입니다. 자동으로 배팅금액이 100원으로 설정되었습니다.");
	            batMoney = 100;
	         }
	         if(batMoney > money ){
	            System.out.println();
	            batMoney = money;
	            System.out.println("배팅금액 보유금액을 초과했습니다. 자동으로 배팅금액을 " + batMoney + "원으로 설정하였습니다.");
	         }
	         if(batMoney%100 > 0){
	            System.out.println();
	            batMoney -= (batMoney % 100);
	            System.out.println("배팅금액 100원 단위로 설정해야 합니다. ");
	            System.out.println("자동으로 배팅금액이 " + batMoney + "원으로 설정되었습니다.");
	         }

	         System.out.println();
	         System.out.println("결과를 보려면 Enter를 치세요^^");
	         System.in.read(); System.in.read();

	         int computer = (int)(Math.random() * 3); // 0 주먹 1 가위 2 보자기
	            
	         System.out.println("Computer : " + rsp[computer] + ", You : " + rsp[menu-1]);
	         if(result[menu-1][computer] == 1){ //내가 이긴경우
	            System.out.println("You Win !!!");
	            money += batMoney;
	         }else if(result[menu-1][computer] == 0){// 비긴경우
	            System.out.println("Draw !!!");
	         }else if(result[menu-1][computer] == -1){// 진 경우
	            System.out.println("You Loose !!!");
	            money -= batMoney;
	         }
	         System.out.println("잔액 : " + money + " 원");

	         if(money >= 3000){
	            System.out.println();
	            System.out.println("지나친 도박은 건강에 해로워요^^;");
	            System.out.println("게임을 강제 종료하겠습니다.");
	            isStop = true;
	         }
	         if(money <= 0){
	            System.out.println();
	            System.out.println("다음에 돈벌어서 다시 오세요 호갱님.^^;");
	            System.out.println("게임을 강제 종료하겠습니다.");
	            isStop = true;
	         }
	         System.out.println();
	      }//end while
	   }//end main
}
