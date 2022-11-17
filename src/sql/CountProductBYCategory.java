package sql;

public class CountProductBYCategory {

	public static void main(String[] args) {
		SELECT
		    SUBSTR(PRODUCT_CODE, 0, 2) AS CATEGORY,
		    COUNT(*) AS PRODUCTS //상품 개수
		FROM PRODUCT
		GROUP BY SUBSTR(PRODUCT_CODE, 0, 2) //카테고리 코드별 그룹화
		ORDER BY CATEGORY
	}
}
