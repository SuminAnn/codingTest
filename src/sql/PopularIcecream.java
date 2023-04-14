package sql;

public class PopularIcecream {

	public void solution() {
		SELECT
		    FLAVOR
		FROM FIRST_HALF
		ORDER BY TOTAL_ORDER DESC, SHIPMENT_ID
	}
}
