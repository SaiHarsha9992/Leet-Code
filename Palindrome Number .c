bool isPalindrome(int x){
    int t , r  , s = 0 ;
    t = x ;
    while ( x > 0 )
    {
      r = x % 10;
      s = (s * 10) + r ;
      x = x / 10 ;
    }
    if ( t == s )
    {
       return true  ;
    }
    else
    {
       return false ; 
    }
    return 0 ;
}