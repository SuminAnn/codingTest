package sql;

public class SelectComment {

	public void solution() {
		SELECT
		    TITLE,
		    A.BOARD_ID,
		    REPLY_ID,
		    B.WRITER_ID,
		    B.CONTENTS,
		    DATE_FORMAT(B.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
		FROM USED_GOODS_BOARD A
		INNER JOIN USED_GOODS_REPLY B
		ON A.BOARD_ID = B.BOARD_ID
		WHERE DATE_FORMAT(A.CREATED_DATE, '%Y-%m') = '2022-10'
		ORDER BY CREATED_DATE , TITLE
    }
}