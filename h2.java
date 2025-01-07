class H2 {
    public static void main(String[] args) {
        String v = args[0];  
        int consonantCount = 0;  
        int vowelCount = 0;  
        
        
        for (int i = 0; i < v.length(); i++) {
            char ch = v.charAt(i);  
            
            
            if (Character.isLetter(ch)) {
               
                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                   
                    consonantCount++;
                }
            }
        }
        
      
        System.out.println("Total consonants in this string: " + consonantCount);
        System.out.println("Total vowels in this string: " + vowelCount);
    }
	
	public static boolean isVowel(char ch) {
        char lowerCh = Character.toLowerCase(ch);  
        return (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u');
    }

    
    
}
