import java.util.*;
class Ques_1 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
       Queue<Integer> qe = new LinkedList<>();

       for(int i = 0;i<tickets.length;i++){
        qe.add(i);
       }
        while(!qe.isEmpty()){
            int x =  qe.poll();
            time++;
           tickets[x]--;
           if(x==k&& tickets[x]==0)break;
           if(tickets[x]==0)continue;
           else qe.offer(x);
        }
        return time;
    }
}