package sql;

public class SelectRentalAVG {

	public void solution() {
		SELECT
		    CAR_ID,
		    ROUND(SUM(DATEDIFF(END_DATE, START_DATE)+1) / COUNT(CAR_ID),1) AS AVERAGE_DURATION
		FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
		GROUP BY CAR_ID
		HAVING AVERAGE_DURATION > 6
		ORDER BY AVERAGE_DURATION DESC, CAR_ID DESC
	}
}
