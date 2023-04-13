package sql;

public class SelectRentalCnt {

	public void solution() {
		SELECT
		    MONTH(START_DATE) AS MONTH,
		    CAR_ID,
		    COUNT(*) AS RECORDS
		FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
		WHERE date_format(start_date, '%Y-%m') between '2022-08' and '2022-10'
		AND CAR_ID IN(
		    SELECT 
		        CAR_ID 
		    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
		    WHERE date_format(start_date, '%Y-%m') between '2022-08' and '2022-10'
		    GROUP BY CAR_ID
		    HAVING COUNT(CAR_ID) >= 5
		)
		GROUP BY CAR_ID, MONTH(START_DATE)
		ORDER BY MONTH, CAR_ID DESC
	}
}
