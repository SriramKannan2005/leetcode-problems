class Solution {
    public int[] plusOne(int[] digits) {
        int length=digits.length;
        if(digits[length-1]<9){
        digits[length-1]=digits[length-1]+1;
        return digits;
        }
        else {
    int i = length - 1;

    while (i >= 0 && digits[i] == 9) {
        digits[i] = 0;
        i--;
    }

    if (i >= 0) {
        digits[i]++;
        return digits;
    }

    int[] result = new int[length + 1];
    result[0] = 1;
    return result;
}
        
    }
}