public class SeperateBlackAndWhiteBalls {
    public long minimumSteps(String s) {
        long count=0;
        long ans=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='0'){
                count++;
            }
            else{
                ans+=count;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        SeperateBlackAndWhiteBalls seperateBlackAndWhiteBalls=new SeperateBlackAndWhiteBalls();
        System.out.println(seperateBlackAndWhiteBalls.minimumSteps("1000"));
    }
}