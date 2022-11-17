package sql;

public class CountAppointment {

	public static void main(String[] args) {
		SELECT
		 MCDP_CD AS '진료과코드',
		 count(*) AS '5월예약건수'
		FROM APPOINTMENT
		WHERE APNT_YMD LIKE '2022-05%' // 예약 월이 5월인
		GROUP BY MCDP_CD // 진료과 코드를 기준으로 그룹화
		ORDER BY count(MCDP_CD) ASC, MCDP_CD ASC
	}
}
