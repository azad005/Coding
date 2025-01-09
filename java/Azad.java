public class Azad {
    public static void main(String[] args) {
        int Total_eggs =1342;
        int gross =Total_eggs/144;
        int a = Total_eggs%144;
        int dozen = a/12;
        int left_eggs = a%12;


        System.out.println("Total no of eggs :"+ Total_eggs);

        System.out.println("Eggs in gross :"+gross);
    
        System.out.println("Total no of eggs in dozen :"+dozen);

        System.out.println("Total no of eggs left :"+left_eggs);
    

    }
}