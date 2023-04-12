package sql;

public class SelectRentalAverageFee {

	public void solution() {
		SELECT
		    ROUND(SUM(DAILY_FEE) / COUNT(*),0) AS AVERAGE_FEE
		FROM CAR_RENTAL_COMPANY_CAR
		WHERE CAR_TYPE = 'SUV'
	}
}
