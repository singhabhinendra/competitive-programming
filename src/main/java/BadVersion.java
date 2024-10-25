public class BadVersion {
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    private boolean isBadVersion(int mid) {
        return false;
    }

    public static void main(String[] args) {
        BadVersion bv = new BadVersion();
        System.out.println(bv.firstBadVersion(1));
    }
}
