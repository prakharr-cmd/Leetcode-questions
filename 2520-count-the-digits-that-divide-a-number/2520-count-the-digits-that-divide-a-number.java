class Solution {
    public int countDigits(int num) {
        int c=0,x=num;
        while(num!=0){
            int d=num%10;
            num/=10;
            if(x%d==0){
                c++;
            }
        }
        return c;
    }
}