public class fibonacciseries {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        int next;

        for (int i= 1; i<=n;++i){
            if (i<=1){
                next=i;
            }
             else{
                 next= a+ b ;
                 a=b;
                 b=next;
             }
      System.out.println(""+ next);   
    }
  }
}