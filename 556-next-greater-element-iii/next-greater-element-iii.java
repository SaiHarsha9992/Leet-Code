class Solution {
    private int pivotNumber;
    private int pivotNumberIndex;
    private int[] convertedArray;

    public void reverseFromOneIndexToEnd(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }   
    }

    public int[] getArrayFromNumber(int number){
        int[] digits = new int[ (int) Math.log10(number) + 1];
        int index = digits.length - 1;
        while (number > 0) {
            digits[index] = number % 10;
            number /= 10;
            index--;
        }
        return digits;
    }

    public int findPivotNumberIndex(int number){
        int[] digits =  getArrayFromNumber(number);
        int pivotIndex = -1;
        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] < digits[i + 1]) {
                pivotIndex = i;
                break;
            }
        }
        return pivotIndex;
    }

    public int findNextGreatestNumber(int inputN){
        int pivotNumberIndex = findPivotNumberIndex(inputN);
        if (pivotNumberIndex == -1) {
            return -1; 
        }
        int[] convertedArray = getArrayFromNumber(inputN);
        
        int nextSmallestElement = convertedArray[pivotNumberIndex + 1];
        int nextSmallestElementIndex = pivotNumberIndex + 1;
        for (int i = convertedArray.length - 1; i >= pivotNumberIndex + 1; i--) {
            if (convertedArray[i] > convertedArray[pivotNumberIndex] ) {
                nextSmallestElementIndex = i;
                break;
            }
        }
        int tempArrayElement =  convertedArray[pivotNumberIndex];
        convertedArray[pivotNumberIndex] = convertedArray[nextSmallestElementIndex];
        convertedArray[nextSmallestElementIndex] = tempArrayElement;

        
        reverseFromOneIndexToEnd(convertedArray, pivotNumberIndex + 1, convertedArray.length - 1);
        

        long result = 0;
        for (int digit : convertedArray) {
            result = result * 10 + digit;
        }
        if (result > Integer.MAX_VALUE) {
            return -1;
        }
        return (int) result;
        
    }

    public int nextGreaterElement(int n) {
        int finalNumber = findNextGreatestNumber(n);
        
        return finalNumber;
    }
}