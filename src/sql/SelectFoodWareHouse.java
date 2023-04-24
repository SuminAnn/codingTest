package sql;

public class SelectFoodWareHouse {

	public void solution() {
		SELECT
		    WAREHOUSE_ID
		    ,WAREHOUSE_NAME	
		    ,ADDRESS	
		    ,CASE WHEN FREEZER_YN IS NULL THEN 'N'
		    ELSE FREEZER_YN END AS FREEZER_YN
		FROM FOOD_WAREHOUSE
		WHERE SUBSTRING(WAREHOUSE_NAME,4,2) = '경기'
		ORDER BY WAREHOUSE_ID
	}
}
