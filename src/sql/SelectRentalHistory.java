package sql;

public class SelectRentalHistory {

	public void solution() {
		SELECT
		    C.CAR_ID
		FROM CAR_RENTAL_COMPANY_CAR C
		INNER JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY H
		ON C.CAR_ID = H.CAR_ID
		WHERE C.CAR_TYPE = '세단'
		AND MONTH(H.START_DATE) = '10'
		GROUP BY C.CAR_ID
		ORDER BY C.CAR_ID DESC
	}
}
