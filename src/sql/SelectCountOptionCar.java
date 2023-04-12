package sql;

public class SelectCountOptionCar {

	public void solution() {
		SELECT
		    CAR_TYPE,
		    COUNT(CAR_TYPE) AS CARS
		FROM CAR_RENTAL_COMPANY_CAR
		WHERE OPTIONS LIKE '%통풍시트%'
		OR OPTIONS LIKE '%열선시트%'
		OR OPTIONS LIKE '%가죽시트%'
		GROUP BY CAR_TYPE
		ORDER BY CAR_TYPE
	}
}