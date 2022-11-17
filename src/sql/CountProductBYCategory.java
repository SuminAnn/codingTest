package sql;

public class CountProductBYCategory {

	public static void main(String[] args) {
		SELECT
		    SUBSTR(PRODUCT_CODE, 0, 2) AS CATEGORY,
		    COUNT(*) AS PRODUCTS //��ǰ ����
		FROM PRODUCT
		GROUP BY SUBSTR(PRODUCT_CODE, 0, 2) //ī�װ� �ڵ庰 �׷�ȭ
		ORDER BY CATEGORY
	}
}
