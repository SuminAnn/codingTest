package sql;

public class CountAppointment {

	public static void main(String[] args) {
		SELECT
		 MCDP_CD AS '������ڵ�',
		 count(*) AS '5������Ǽ�'
		FROM APPOINTMENT
		WHERE APNT_YMD LIKE '2022-05%' // ���� ���� 5����
		GROUP BY MCDP_CD // ����� �ڵ带 �������� �׷�ȭ
		ORDER BY count(MCDP_CD) ASC, MCDP_CD ASC
	}
}
