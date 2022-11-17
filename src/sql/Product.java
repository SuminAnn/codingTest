package sql;

public class Product {

	public static void main(String[] args) {
		SELECT
		    TRUNCATE(PRICE,-4) AS PRICE_GROUP, //10000원 단위로 버림을 통해 10000월씩 그룹화 될 수 있도록
		    COUNT(PRODUCT_ID) AS PRODUCTS
		FROM PRODUCT
		GROUP BY PRICE_GROUP
		ORDER BY PRICE_GROUP
	}
}
