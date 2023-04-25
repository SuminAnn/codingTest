package sql;

public class SelectWomanPatient {

	public void solution() {
		SELECT
		     PT_NAME 
		    ,PT_NO
		    ,GEND_CD
		    ,AGE
		    ,IFNULL(TLNO, 'NONE') AS TLNO
		FROM PATIENT
		WHERE AGE <= 12
		AND GEND_CD = 'W'
		ORDER BY AGE DESC, PT_NAME
	}
}