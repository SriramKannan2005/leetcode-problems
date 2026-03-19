class Solution {
    public boolean isValid(String word) {
        boolean isVowel=false;
        boolean isConsonant=false;
        boolean length=false;
        boolean isDigit=false;
        boolean isSpecialCharacter=false;
        String result=word.toLowerCase();
        if(word.length()>=3){
            for(int i=0;i<=result.length()-1;i++)
            {
            char ch=result.charAt(i);
            if (Character.isDigit(ch))
            {
                isDigit=true;
            }
            else if(Character.isAlphabetic(ch)&& ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                isVowel=true;
            }
            else if(!Character.isLetterOrDigit(ch))
            {
                isSpecialCharacter=true;
            }
            else 
            {
                isConsonant=true;
            }
            
            
        }
        if(isVowel && isConsonant && !isSpecialCharacter)

        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    else
    {
        return false;
    }

    }
    
}