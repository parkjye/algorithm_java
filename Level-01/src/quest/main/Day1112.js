/**
 * 서울에서 김서방 찾기
 */

function solution(seoul) {
    var answer = '';
    
    let num = seoul.indexOf('Kim')
    answer=`김서방은 ${num}에 있다` 
    
    return answer;
}