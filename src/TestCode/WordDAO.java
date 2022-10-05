package TestCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//DAO���� data access object
// �����ͺ��̽��� �����Ͽ� ������ ����
//���� ���� �ĸ��ϰ��� �޴� �۾��� �����ϴ�
//��ü�� �ǹ������� DAO��� �Ѵ�.
// �� ��ü�� ����̹��ε�
// �����û, ��������, ������� �޴´�.
// �ڿ��� �ݳ��ϴ� �ڵ尡 ���Եȴ�. 
public class WordDAO {
	//�����ͺ��̽� ������ ���� �ڿ�(��ü)�� �ּҸ� ������ �������� ����
	private Connection conn = null;
	WordDAO(){
		//����.. ���α׷� ���� �߿� �߻��ϴ� ��.. ����: �������� �ȵ�..
		try {
			// 1. ����̹� �ε�(�ʿ��� Ŭ������ �ڹٷ� �ε�)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("�ε� ����");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("�ε� ����");
		}
	}
	//�ʿ��Ҷ����� Ŀ�ؼ� ���� �޼��� ����
	public boolean connect() {
		try {
			// Ŀ�ؼ��� �õ��ϰ� �� ����� ��� ���� �ڵ�... 
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "11111111");
			System.out.println("���Ἲ��");
			return true;
		} catch (SQLException e) {
			System.out.println("�������");
			return false;
		}
	}
	// insert into word1 values ('a','b','c','d',default);
	public void insertWord(WordInfoDTO w) {
		//2. �����û�� �ϰ� �������� ����� �ް� �����ڿ��� �ݳ��ϴ� ���� 
		if(connect()) {
			String sql="insert into word1 values (?,?,?,?,default)";
			//���� ������ �����ϴ� ��ü
			try {
				PreparedStatement psmt = conn.prepareStatement(sql); //���� ��ü ��� ����
				psmt.setString(1, w.getEngName());  //mapping
				psmt.setString(2, w.getKorName());  //mapping
				psmt.setString(3, w.getImporFlag());  //mapping
				psmt.setString(4, w.getComment());  //mapping
				int r = psmt.executeUpdate();   // ���� ���� �� ���ϰ� ����.
				System.out.println(r+"���� �ԷµǾ����ϴ�");
				conn.close();  // �����ڿ��� �ݳ�
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("������ �� �� ��� �Է��� ���� ���մϴ�.");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
