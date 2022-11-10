package promgrammers;

public class OverPrice {

	public static void main(String[] args) {
		SELECT 
			* 
		FROM FOOD_PRODUCT A
		WHERE A.PRICE = (SELECT MAX(PRICE) FROM FOOD_PRODUCT) //가격이 제일 비싼 식품의 정보 출력하기
	}
}
