class Solution {
public:
    int countEven(int num) {
        int c = 0;
        int t = 0 , r = 0;
        for(int i = 1 ; i <= num ; i++){
            if(i<10&&i%2==0){
                c+=1;
            }
            else{
                int s = 0;
                t = i;
                while(t!=0){
                    r = t%10;
                    s += t;
                    t = t / 10;
                }
                if(s%2==0){
                    c+=1;
                }
            }
        }
        return c;
    }
};