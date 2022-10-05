package wordGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import word.WordInfo;
import wordManager.WordManager;

public class WordGame extends GameInfo{
// �����ϱ�, ä���ϱ�, ä�� �� ó���ϱ�
	// ���ӿ� �ʿ��� �ܾ����� �ʿ��ϴ� > WordManager ��ü�� ����
	private WordManager wmanager = null;
	private HashMap<String, WordInfo> wgList = null;
	private String[] wgKeySet = null;   // ���� �ܾ ���� ����...
	private int[] wgKeySetCnt = null;
	private Scanner in = new Scanner(System.in);
	private int jumsu = 0;
	private ArrayList<String> badWordList = new ArrayList<>();

	public WordGame(WordManager w) {
		this.wmanager = w;
	}
	
	@Override
	public void WordGameRun() {
		// menu();
		init();
		gameRun();
	}

	private void gameRun() {
		Random r = new Random();
		for (;;) {
			int nowIdx = r.nextInt(wgKeySet.length);
			String nowKey = wgKeySet[nowIdx];  // ���� �ε����� ��ġ�� ���þ�
			          // ���þ� ��ġ�� ���� �迭�� ���� ���� > 
			WordInfo nowWordInfo = wgList.get(nowKey);
			String nowkorName = nowWordInfo.getKorName();
			System.out.println("���� �ܾ� : " + nowkorName);
			if(nowWordInfo.getMissCnt() > 1) {
				System.out.println("<��������>");
			}
			String inputKey = in.nextLine();
			if (inputKey.equals("exit")) { // ���α׷� ����
				prtPoint();
				badWordprt();
				prtWordMiss();
				break;
			}
			if (inputKey.equals(nowKey)) {
				System.out.println(" ���� ");
				nowWordInfo.setCheckFlag(true);
				jumsu += 10;
			} else {
				System.out.println(" ���� ");
				wgKeySetCnt[nowIdx]++;   
				// Ʋ���ܾ ����ϴ� ���� .. ���� �Է��� ���̳� - 1 �ܾ �Է� > ArrayList
				badWordList.add("���ôܾ� : " + nowKey + "�Է��Ѵܾ� : " + inputKey); // 1��
				nowWordInfo.setCheckFlag(false);
			}
			
		}
	}

	private void prtWordMiss() {
		System.out.println("---- Ʋ���ܾ� �м� -------");
		for(int i=0; i < wgKeySetCnt.length; i++) {
			if(wgKeySetCnt[i]!=0) {
				System.out.println("�ܾ� : "+wgKeySet[i]+ " Ʋ�� Ƚ�� : "+wgKeySetCnt[i]);
			}
		}
		
	}

	private void prtPoint() {
		System.out.println("����� ���� : " + jumsu);
	}

	private void badWordprt() {
		System.out.println("---- �ʰ� Ʋ�� �� ----------");
		for (int i = 0; i < badWordList.size(); i++) {
			System.out.println(badWordList.get(i));
		}

	}

	private void init() { // ���� �غ� �޼���
		// TODO Auto-generated method stub
		wgList = wmanager.getwList(); // wordmanger�� �ܾ� ���� ��������
		wgKeySet = new String[wgList.size()];
		wgKeySetCnt = new int[wgList.size()];
		int wgKeySetFlag = 0;
		for (String nowKey : wgList.keySet()) {
			wgKeySet[wgKeySetFlag] = nowKey;
			wgKeySetFlag++;
		}
		/*
		 * System.out.println("--- ������ Ű�� ����Ʈ ----------"); for (int i = 0; i <
		 * wgKeySet.length; i++) { System.out.println(i + "/" + wgKeySet[i]); }
		 */
	}

	/*
	 * private void menu() { System.out.println("1. �����ϱ�"); }
	 */
}
