class Prime {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (isPrime(num) && num % 2 == 0) {
            System.out.println(num + " is even and prime");
        } else if (isPrime(num)) {
            System.out.println(num + " is a prime number and also an odd number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
