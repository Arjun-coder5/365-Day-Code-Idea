public class Ques_2 {
  public static void main(String[] args) {
    Ques_2 obj = new Ques_2();
    int[] score = {5, 4, 3, 2, 1};
    String[] ranks = obj.findRelativeRanks(score);
    for (String rank : ranks) {
        System.out.println(rank);
    }
  }
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;

        String[] ans = new String[n];
        int[] idx = new int[n];

        // store indices
        for(int i = 0; i < n; i++){
            idx[i] = i;
        }
        // sort indices based on score (descending)
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(score[idx[j]] > score[idx[i]]){

                    int temp = idx[j];
                    idx[j] = idx[i];
                    idx[i] = temp;
                }
            }
        }

        // assign ranks
        for(int i = 0; i < n; i++){

            if(i == 0){
                ans[idx[i]] = "Gold Medal";
            }
            else if(i == 1){
                ans[idx[i]] = "Silver Medal";
            }
            else if(i == 2){
                ans[idx[i]] = "Bronze Medal";
            }
            else{
                ans[idx[i]] = String.valueOf(i+1);
            }
        }

        return ans;
    }
}
