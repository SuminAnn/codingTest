package promgrammers;

public class BirthOfMar {

	public static void main(String[] args) {
		SELECT
		    MEMBER_ID,
		    MEMBER_NAME,
		    GENDER,
		    TO_CHAR(DATE_OF_BIRTH,'YYYY-MM-DD') AS DATE_OF_BIRTH //0000-00-00형식으로 조회
		FROM MEMBER_PROFILE
		WHERE TO_CHAR(DATE_OF_BIRTH,'MM') = '03' // 생일이 3월인
		AND TLNO IS NOT NULL // 전화번호가 NULL이 아닌
		AND GENDER = 'W' // 여성
		ORDER BY MEMBER_ID
	}
}
