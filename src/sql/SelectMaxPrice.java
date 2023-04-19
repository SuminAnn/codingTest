package sql;

public class SelectMaxPrice {

	public void solution() {
		SELECT
		    price AS MAX_PRICE
		FROM PRODUCT
		ORDER BY price DESC
		LIMIT 1
	}
}
