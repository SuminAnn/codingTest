package sql;

public class IceCreamOrderTop3 {

	public void solution() {
		SELECT
		    FLAVOR
		FROM(
		    SELECT
		        F.FLAVOR,
		        J.TOTAL_ORDER + F.TOTAL_ORDER AS TOTAL_ORDER
		    FROM FIRST_HALF F
		    INNER JOIN(
		        SELECT
		            FLAVOR,
		            SUM(TOTAL_ORDER) AS TOTAL_ORDER
		        FROM JULY
		        GROUP BY FLAVOR
		    )J
		    ON F.FLAVOR = J.FLAVOR
		    ORDER BY TOTAL_ORDER DESC
		)A
		LIMIT 3
	}
}
