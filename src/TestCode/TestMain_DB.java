package TestCode;

public class TestMain_DB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordDAO wdao= new WordDAO();
		//�ܾ������� ����� �̰��� �Է�...
		String eng="banana";
		String kor="�ٳ���";
		String impor="��";
		String comment="���";
		WordInfoDTO w = new WordInfoDTO();
		w.setEngName(eng);
		w.setKorName(kor);
		w.setImporFlag(impor);
		w.setComment(comment);
		
		wdao.insertWord(w);
		//wdao.insertWord(eng,kor,impor,comment);
		//System.out.println(wdao.connect());
	}

}
