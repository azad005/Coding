class Calculator{
    // Add one integers
    void add(int x) {
        System.out.println("Sum of one integer: " + x);
    }

    //Add two integers
    void add(int x, int y) {
        System.out.println("Sum of two integers: " + (x + y));
    }

    // Add three doubles
    void add(double x, double y, double z) {
        System.out.println("Sum of three doubles: " + (x + y + z));
    }
    public static void main(String[] args) {
        Calculator c = new Calculator(); 
        c.add(4); 
        c.add(4, 6); 
        c.add(3.4, 4.2, 2.1); 
    }
}