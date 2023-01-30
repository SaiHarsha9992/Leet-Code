int differenceOfSum(int* nums, int numsSize){
    int s = 0 , s1 = 0 , x , r , t ;
    for ( int i = 0 ; i < numsSize ; i++ )
    {
        s = s + nums [ i ] ;
    }
    for ( int i = 0 ; i < numsSize ; i++ )
    {
        t = nums [ i ] ; 
        while( t != 0 )
        {
            r = t % 10 ;
            s1 = s1 + r ;
            t = t / 10 ;
        }
    }
    x = abs ( s - s1 ) ;
    return x ;

}