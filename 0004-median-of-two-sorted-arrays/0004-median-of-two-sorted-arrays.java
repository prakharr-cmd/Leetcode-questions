class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;int n=nums2.length;double q;
        int ma[]=new int[m+n]; 
        if(n==0)
        {
            if(m%2==0)
            return (double)(nums1[(m-1)/2]+nums1[m/2])/2;
            else
            return nums1[m/2];
        }
        else if(m==0)
        {   
            if(n%2==0)
            return (double)(nums2[(n-1)/2]+nums2[n/2])/2;
            else
            return nums2[n/2];
        }                  
        for(int i=0;i<m;i++)
        {
            ma[i]=nums1[i];
        }
        for(int j=m,k=0;k<n;k++,j++)
        {
            ma[j]=nums2[k];
        }
        for(int i=0;i<ma.length-1;i++)
        {
           for(int j=0;j<ma.length-1-i;j++)
           {
            if(ma[j]>ma[j+1])
            {
                int temp=ma[j];
                ma[j]=ma[j+1];
                ma[j+1]=temp;
            }
           }
        }
        int l=ma.length;
        if(l%2!=0)
        {
            q=ma[l/2];
        }
        else
        { 
            q=(double)(ma[l/2]+ma[(l-1)/2])/2;
        }
        return q;
    }
}