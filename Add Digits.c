int addDigits(int n ){
    int s = 0 , r ;
    while ( n != 0 )
    {
        r = n % 10 ;
        s = s + r ;
        n = n / 10 ;
        if ( n == 0 && s > 9 )
        {
            n = s ;
            s = 0 ;
        } 
    }
    return s ;

}