class Solution {
    public int addDigits(int num) {
       int x=num,c=0;
       while(x>9){
        while(x!=0){
            int r=x%10;
            x/=10;
            c+=r;
        }
        x=c;
        c=0;
       }
       return x;
    }
}