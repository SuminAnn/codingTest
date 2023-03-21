package sql;

public class SelectCountUser {

	public void solution() {
		SELECT
		    U.USER_ID,
		    U.NICKNAME,
		    CONCAT(U.CITY, ' ', U.STREET_ADDRESS1,' ', U.STREET_ADDRESS2) AS 전체주소,
		    CASE LENGTH(U.TLNO)
				WHEN 11 THEN CONCAT(LEFT(U.TLNO, 3), '-', MID(U.TLNO, 4, 4), '-', RIGHT(U.TLNO, 4))
		        WHEN 10 THEN CONCAT(LEFT(U.TLNO, 3), '-', MID(U.TLNO, 4, 3), '-', RIGHT(U.TLNO, 4))
			END AS 전화번호
		FROM USED_GOODS_BOARD B
		INNER JOIN USED_GOODS_USER U
		ON B.WRITER_ID = U.USER_ID
		GROUP BY U.USER_ID
		HAVING COUNT(*) >= 3
		ORDER BY U.USER_ID DESC
    }
}
