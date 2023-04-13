package sql;

public class SelectBookListAuthor {

	public void solution() {
		SELECT
		    BOOK_ID,
		    AUTHOR_NAME,
		    DATE_FORMAT(PUBLISHED_DATE,'%Y-%m-%d') AS PUBLISHED_DATE
		FROM BOOK B
		INNER JOIN(
		    SELECT
		        AUTHOR_ID,
		        AUTHOR_NAME
		    FROM AUTHOR
		)A
		ON B.AUTHOR_ID = A.AUTHOR_ID
		WHERE CATEGORY = '경제'
		ORDER BY PUBLISHED_DATE
	}
}