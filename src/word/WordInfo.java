package word;

public class WordInfo {
	// �ٸ� ��ü�� �����ϰ� ���� �ʽ��ϴ�.  
	private String korName=null;
	private String imporFlag=null;
	private String comment=null;
	// �ֱ� 3�� �������� ������ ����
	private int[] checkFlag = new int[3];
	private int missCnt=0;
	
	public int getMissCnt() {
		return missCnt;
	}
	
	public int[] getCheckFlag() {
		return checkFlag;
	}

	public void setCheckFlag(int[] checkFlag) {
		this.checkFlag = checkFlag;
	}

	public void setCheckFlag(boolean flag) {
		//flag�� true�̸� ����, �����̸� false�Ű� ������ �Ѿ�´�.. 
		checkFlag[0]=checkFlag[1];
		checkFlag[1]=checkFlag[2];
		if(flag) {
			checkFlag[2]=0;
		}else {
			checkFlag[2]=1;
		}
		missCnt = checkFlag[0] + checkFlag[1] + checkFlag[2]; 
	}
	
	public void setMissCnt(int missCnt) {
		this.missCnt = missCnt;
	}

	public String getKorName() {
		return korName;
	}
	public void setKorName(String korName) {
		this.korName = korName;
	}
	public String getImporFlag() {
		return imporFlag;
	}
	public void setImporFlag(String imporFlag) {
		this.imporFlag = imporFlag;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public void prt() {
		System.out.println(" �ѱۼ��� : "+korName);
		System.out.println(" �߿䵵   : "+imporFlag);
		System.out.println(" ��  ��   : "+comment);
	}
	
	

}
