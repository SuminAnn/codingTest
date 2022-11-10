package promgrammers;

public class ProductSalesOfOffLine {

	public static void main(String[] args) {
		SELECT
			A.PRODUCT_CODE,
			SUM(B.SALES_AMOUNT*A.PRICE) AS SALES //��ǰ �ڵ庰 OFFLINE_SALE ���̺� �Ǹ� �� * PRODUCT ���̺� ����
		FROM PRODUCT A
		JOIN (SELECT * FROM OFFLINE_SALE) B //OFFLINE_SALE ���̺� Join
		ON A.PRODUCT_ID = B.PRODUCT_ID //PRODUCT ���̺�� OFFLINE_SALE���̺��� PRODUCT_ID�� ���� �͵鸸 join
		GROUP BY A.PRODUCT_CODE
		ORDER BY SALES DESC, A.PRODUCT_CODE
	}
}
