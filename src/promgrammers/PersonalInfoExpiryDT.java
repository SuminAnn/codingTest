package promgrammers;

public class PersonalInfoExpiryDT {

	public int[] solution(String today, String[] terms, String[] privacies) {
        int[] arr = new int[privacies.length];
        int arrCnt = 0;
        HashMap<String,Integer> map = new LinkedHashMap<>(); //약관종류와 유효기간을 담을 map
        
        for(int i=0; i<terms.length; i++){
            String[] str = terms[i].split(" ");
            map.put(str[0], Integer.parseInt(str[1])); //key : 약관종류, value : 유효기간
        }
        
        String[] todayArr = today.split("\\.");
        int todayY = Integer.parseInt(todayArr[0]);
        int todayM = Integer.parseInt(todayArr[1]);
        int todayD = Integer.parseInt(todayArr[2]); //오늘 날짜 년,월,일
        int cnt = (todayY*12*28) + (todayM*28) + todayD; //오늘 날짜 년 월 일의 합
        
        for(int i=0; i<privacies.length; i++){
            String[] privaciesArr = privacies[i].split(" ");
            String[] pDayArr = privaciesArr[0].split("\\.");
            int gap = map.get(privaciesArr[1]);
            int pDayY = Integer.parseInt(pDayArr[0]);
            int pDayM = Integer.parseInt(pDayArr[1]);
            int pDayD = Integer.parseInt(pDayArr[2]); // 개인정보 수집일자
            pDayM += gap; //개인정보 수집일자 + 약관 유효기간
            int pcnt = (pDayY*12*28) + (pDayM*28) + pDayD-1; // 유효기간 날짜 년 월 일 합
            
            if(cnt > pcnt){
                arr[i] = i+1;
                arrCnt++;
            } // 유효기간이 지난 약관을 찾기위한 if문
            
        }
        int[] answer = new int[arrCnt];
        int idx = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                answer[idx] = arr[i];
                idx++;
            }
        }
        
        return answer;
    }
}
