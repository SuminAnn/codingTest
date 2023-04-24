package sql;

public class SelectIsNullUserInfo {

	public void solution() {
		SELECT
			COUNT(*)
		FROM USER_INFO
		WHERE AGE IS NUL
	}
}
