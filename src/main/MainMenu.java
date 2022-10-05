package main;

import java.util.Scanner;

import wordGame.*;
import wordManager.WordManager;

public class MainMenu {
	// 1. ��������
	   // ������ �����ϱ� ���ؼ� �ʿ��� ����.. WordGame, WordManager
	private WordManager wmge=new WordManager();
	private GameInfo wgame= null;
	private Scanner in = new Scanner(System.in);
	
	MainMenu(){
		// 1. �ܾ����, 2. �ܾ������ �б� �ϴ� Ŭ����
		for(;;) {
			System.out.println("1.  �ܾ����");
			System.out.println("2.  �ܾ����");
			
			System.out.println("3.  ���α׷�����");
			System.out.println("4.  ���Ӽ���");
			System.out.println("���� >>");
			int selMenu = in.nextInt();
			in.nextLine();
			if(selMenu==1) {
				wmge.wordManagerRun();
			}else if(selMenu==2) {
				if(wgame == null) {
					System.out.println("������ ���� �����ϼ���");
				}else {
					wgame.WordGameRun();
				}
			}else  if(selMenu==4) {
				choiceGame();
			}else{
				break;
			}
		}
		
	}
	private void choiceGame() {
		// ������ �����ϼ���
		int a = 2;
		if(a==1) {
			wgame= new WordGame(wmge);
		}else if(a==2) {
			wgame= new WordGameV2(wmge);
		}
		
	}
	
}
