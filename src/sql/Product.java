package sql;

public class Product {

	public static void main(String[] args) {
		SELECT
		    TRUNCATE(PRICE,-4) AS PRICE_GROUP, //10000�� ������ ������ ���� 10000���� �׷�ȭ �� �� �ֵ���
		    COUNT(PRODUCT_ID) AS PRODUCTS
		FROM PRODUCT
		GROUP BY PRICE_GROUP
		ORDER BY PRICE_GROUP
	}
}
