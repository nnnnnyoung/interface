package aaaaa;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "d:\\wordata\\";
		String saveStr = "ok sk";
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("�����̸������ϼ���");
			String fname=in.nextLine();
			filePath=filePath+fname+".txt";
			FileWriter fileWriter = new FileWriter(filePath);
			//fileWriter.write(saveStr);
			//fileWriter.append("�߰��ǳ�");
			
			while(true) {
				String d =in.nextLine();
				if(d.equals("exit")) break;
				fileWriter.append(d+"\n");
			}

			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
