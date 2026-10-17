class Solution {
    public int countPrimes(int n) {

      int count = 0;
      for(int i=0; i<n; i++){
          if((isPrime(i))==true){
            count++;
          }
      }
      return count;

    }

       public static boolean isPrime(int n) {
        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }
        
        // 2 is the only even prime number
        if (n == 2) {
            return true;
        }
        
        // Exclude all other even numbers
        if (n % 2 == 0) {
            return false;
        }

        // Check odd factors up to the square root of n
        // Using i * i <= n is more efficient than Math.sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; // Found a factor, so it's not prime
            }
        }

        return true; // No factors found, it is prime
    }
}