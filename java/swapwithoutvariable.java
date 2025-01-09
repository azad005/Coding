public class swapwithoutvariable {

    public static void main(String[] args) {
        
        int a=20;
        int b=10;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("A="+a);
        System.out.println("B="+b);


    }
    
}
