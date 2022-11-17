package sql;

public class Icecream {

	public static void main(String[] args) {
		SELECT
		    B.INGREDIENT_TYPE AS INGREDIENT_TYPE,
		    SUM(A.TOTAL_ORDER) AS TOTAL_ORDER
		FROM FIRST_HALF A
		LEFT JOIN(
		    SELECT * FROM ICECREAM_INFO
		)B
		ON A.FLAVOR = B.FLAVOR // ���� ���� �ͳ��� Join
		GROUP BY B.INGREDIENT_TYPE // ������ �������� GROUPȭ
		ORDER BY TOTAL_ORDER
	}
}
