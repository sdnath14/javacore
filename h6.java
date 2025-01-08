class Fact {
    public static void main(String[] args) {
        int v = Integer.parseInt(args[0]);
        System.out.println("Factorial of this number: " + factorial(v));
    }

    public static int factorial(int v) {
        int product = 1;
        for (int i = 1; i <= v; i++) {
            product *= i; 
        }
        return product;
    }
}
