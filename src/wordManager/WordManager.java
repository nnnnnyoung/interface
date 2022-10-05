package wordManager;

import java.util.HashMap;
import java.util.Scanner;

import word.WordInfo;

public class WordManager {
	// �ܾ� ����, ����, ����, ��ü����
	// WordInfo ��ü�� �ʿ��մϴ�..�� ��ü�� �����ϰ� �ִ�.
	// ������ �ݵ�� �ʿ��� ���� �ƴϴ�.. �����Ҷ��� �ʿ��ϴ�..
	private WordInfo winfo = null;
	private Scanner in = new Scanner(System.in);
	private HashMap<String,WordInfo> wList = new HashMap<>();
	
	public WordManager(){
	}
	public HashMap<String, WordInfo> getwList() {
		return wList;
	}
	public void wordManagerRun() {
	//	for(;;) {
		while(true) {
			menu();
			System.out.println("���� >>");
			int selMenu = in.nextInt();
			in.nextLine();
			if(selMenu==1) {
				addWord();
			}else if(selMenu==2) {
				delWord();
			}else if(selMenu==3) {
				modWord();
			}else if(selMenu==4) {
				listWord();
			}else {
				break;
			}
			
		}
	}
	private void listWord() {
		System.out.println("-- ��ϵ� �ܾ� ��� -- ("+wList.size()+")");
		for(String keyinfo : wList.keySet()) {
			System.out.println("<�ܾ�����> "+keyinfo);
			WordInfo temp = wList.get(keyinfo);
			temp.prt();
			System.out.println("----------------------");
		}
	}
	private void modWord() {
		// ������
	}

	private void delWord() {
		// ������
	}
	private void addWord() {
		winfo = new WordInfo();		
		System.out.println("�ܾ��߰� -----");
		System.out.println("key�� ����� ���� �ܾ� �Է��ϼ���");
		String keyWord = in.nextLine();
		System.out.println("Value �� �ѱ� �ܾ��� �ǹ̸� �Է��ϼ���");
		String valueKorWord = in.nextLine();
	//	System.out.println("Value ��  �߿䵵�� �Է��ϼ���");
	//	String valueimporWord = in.nextLine();
	//	System.out.println("Value �� ���� �Է��ϼ���");
	//	String valuecommetkeyWord = in.nextLine();
	//	winfo.setComment(valuecommetkeyWord);
	//	winfo.setImporFlag(valueimporWord);
		winfo.setKorName(valueKorWord);
		wList.put(keyWord, winfo);
	}
	private void menu() {
		System.out.println("1. �߰�");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ��ü����");
		System.out.println("5. ����");
	}
}
