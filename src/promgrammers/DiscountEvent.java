package promgrammers;

public class DiscountEvent {

final int USER_QUALIFICATION_DURATION = 10; // 변하지 않는 상품의 할인 유지 날짜
    
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String,Integer> wantMap = new HashMap<>(); // 원하는 할인 상품과 갯수
        
        for(int i=0; i<number.length; i++){
            wantMap.put(want[i], number[i]);
        }
        
        Map<String,Integer> discountMap = new HashMap<>(); // 할인하는 상품의 정보
        
        for(int i=0; i<USER_QUALIFICATION_DURATION; i++){
            String addItem = discount[i];
            discountMap.put(addItem, discountMap.getOrDefault(addItem, 0) + 1);
        } // 1일부터 10일까지의 할인 상품 정보
        
        if(isEqual(wantMap, discountMap)){
            answer++;
        } // user가 원하는 상품과 갯수가 동일한지 확인
        
        for(int i=1; i<=discount.length - USER_QUALIFICATION_DURATION; i++){
            String deleteItem = discount[i-1];
            discountMap.put(deleteItem, discountMap.get(deleteItem) - 1);
            
            String addItem = discount[USER_QUALIFICATION_DURATION + i - 1];
            discountMap.put(addItem, discountMap.getOrDefault(addItem, 0) + 1);
            
            if(isEqual(wantMap, discountMap)){
                answer++;
            }
        } // 10일 이후부터는 이후 상품은 추가하고 1일차 상품부터 하나씩 추가 상품과 변경
        
        return answer;
    }
    
    public boolean isEqual(Map<String,Integer> wantMap, Map<String,Integer> compareMap){
        for(String key : wantMap.keySet()){
            if(!compareMap.containsKey(key) || wantMap.get(key) != compareMap.get(key)){
                return false;
            } // 동일한 상품이 없는 경우와 원하는 갯수를 충족하지 못하는 경우
        }
        return true;
    } // // user가 원하는 상품과 갯수가 동일한지 확인하는 메서드
}
