package promgrammers;

public class BirthOfMar {

	public static void main(String[] args) {
		SELECT
		    MEMBER_ID,
		    MEMBER_NAME,
		    GENDER,
		    TO_CHAR(DATE_OF_BIRTH,'YYYY-MM-DD') AS DATE_OF_BIRTH //0000-00-00�������� ��ȸ
		FROM MEMBER_PROFILE
		WHERE TO_CHAR(DATE_OF_BIRTH,'MM') = '03' // ������ 3����
		AND TLNO IS NOT NULL // ��ȭ��ȣ�� NULL�� �ƴ�
		AND GENDER = 'W' // ����
		ORDER BY MEMBER_ID
	}
}
