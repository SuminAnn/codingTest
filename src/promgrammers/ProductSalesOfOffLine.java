package promgrammers;

public class ProductSalesOfOffLine {

	public static void main(String[] args) {
		SELECT
			A.PRODUCT_CODE,
			SUM(B.SALES_AMOUNT*A.PRICE) AS SALES //상품 코드별 OFFLINE_SALE 테이블 판매 수 * PRODUCT 테이블 가격
		FROM PRODUCT A
		JOIN (SELECT * FROM OFFLINE_SALE) B //OFFLINE_SALE 테이블 Join
		ON A.PRODUCT_ID = B.PRODUCT_ID //PRODUCT 테이블과 OFFLINE_SALE테이블의 PRODUCT_ID가 같은 것들만 join
		GROUP BY A.PRODUCT_CODE
		ORDER BY SALES DESC, A.PRODUCT_CODE
	}
}
