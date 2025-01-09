public class string {
        public static void main(String[] args) {
            String str = "Hellow";
            String str1 = "Welcome to the class of PAPL";
    
            String joinedString = str + " " + str1;
            System.out.println("Joined String: " + joinedString);
    
        
            String replacedString = str.replace("ll", "na");
            System.out.println("Replaced String: " + replacedString);
    
           
            int indexOfM = str1.indexOf('m');
            System.out.println("Index of 'm' in str1: " + indexOfM);
    
        
            int lengthOfJoinedString = joinedString.length();
            System.out.println("Length of Joined String: " + lengthOfJoinedString);
    
            String upperCaseStr1 = str1.toUpperCase();
            System.out.println("str1 in Upper Case: " + upperCaseStr1);
    
            String lowerCaseJoinedString = joinedString.toLowerCase();
            System.out.println("Joined String in Lower Case: " + lowerCaseJoinedString);
    
            
            int whiteSpaceCount = str1.length() - str1.replace(" ", "").length();
            System.out.println("Number of White Spaces in str1: " + whiteSpaceCount);
        }
    }
 



