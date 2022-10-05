package TestCode;


//DTO�� Ʃ�ÿ� ������ ������ ���� �ְų� �Ǵ� ������ ���̽����� ������ Ʃ���� ������ �ڹٷ� �������� ��ü�̴�.
// �̸��� �������� ���� DTO�� �ϴ��� ����.. �̸��� DTO��� DTO�� �Ǵ� ���� �ƴ϶�.
// ���������� getter setter�� �־�� DTO�θ���..
public class WordInfoDTO {
	// �ٸ� ��ü�� �����ϰ� ���� �ʽ��ϴ�.  
		private String engName=null;  // ������ �ҽ����� �߰�...
		private String korName=null;
		private String imporFlag=null;
		private String comment=null;
		// �ֱ� 3�� �������� ������ ����
		private int[] checkFlag = new int[3];
		private int missCnt=0;
		
		public String getEngName() {
			return engName;
		}
		public void setEngName(String engName) {
			this.engName = engName;
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
		public int[] getCheckFlag() {
			return checkFlag;
		}
		public void setCheckFlag(int[] checkFlag) {
			this.checkFlag = checkFlag;
		}
		public int getMissCnt() {
			return missCnt;
		}
		public void setMissCnt(int missCnt) {
			this.missCnt = missCnt;
		}
}
