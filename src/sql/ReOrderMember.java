package sql;

public class ReOrderMember {

	public void solution() {
		SELECT
		    USER_ID
		    ,PRODUCT_ID
		FROM ONLINE_SALE
		GROUP BY USER_ID, PRODUCT_ID
		HAVING COUNT(PRODUCT_ID) >= 2
		ORDER BY USER_ID, PRODUCT_ID DESC
	}
}
