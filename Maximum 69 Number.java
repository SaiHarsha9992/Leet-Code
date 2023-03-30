class Solution {
    public int maximum69Number (int n) {
    int r=0,rev=0,c=0,v,f;
    while(n!=0)
    { 
        v=n%10;
        r=r*10+v;
        n=n/10;
    } 
    while(r!=0)
    { 
        f=r%10;
        if(r%10==6 && c==0) 
        { 
            rev=(rev*10)+9; 
            c++; 
        }
        else
        { 
            rev=(rev*10)+f;
            } 
            r=r/10; 
    } 
    return rev;
    }
}