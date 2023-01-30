int countDigits(int num){
   int tmp = num, count = 0;
    
        while (tmp) {
            int rem = tmp % 10;
        
            if ((num % rem) == 0) {
                count++;
            }
            tmp = tmp / 10;
        }
        return count;
}