package sql;

public class SelectRentalDay {

	public void solution() {
		SELECT
		    HISTORY_ID,	
		    CAR_ID,	
		    DATE_FORMAT(START_DATE, '%Y-%m-%d') AS START_DATE,	
		   DATE_FORMAT(END_DATE, '%Y-%m-%d') AS END_DATE,
		    CASE WHEN DATEDIFF(END_DATE, START_DATE)+1 >= 30 THEN '장기 대여'
		    ELSE '단기 대여' END AS RENT_TYPE
		FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
		WHERE START_DATE BETWEEN date('2022-09-01') and date('2022-09-30')+1
		ORDER BY HISTORY_ID DESC
	}
}
