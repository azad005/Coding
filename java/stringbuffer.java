public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");
        System.out.println(sb); 

        sb.reverse();
        System.out.println(sb); 

        sb.insert(1, "Azad");
        System.out.println(sb); 


    }
}
