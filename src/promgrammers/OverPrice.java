package promgrammers;

public class OverPrice {

	public static void main(String[] args) {
		SELECT 
			* 
		FROM FOOD_PRODUCT A
		WHERE A.PRICE = (SELECT MAX(PRICE) FROM FOOD_PRODUCT) //������ ���� ��� ��ǰ�� ���� ����ϱ�
	}
}
