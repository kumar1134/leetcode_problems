package LinearSearch.problems;

public class evendigits {
    public static void main(String[] args) {
        int[] arr1 ={ 12,345,2,-13,0,6,7896};
        System.out.println(checkeven(arr1));
    }
    static int checkeven(int[] arr){
        int count=0;
        for(int num:arr){
            String str = Integer.toString(Math.abs(num));//math.abs to handle negative numbers

            if(str.length()%2==0){
                count++;
            }
        }
        return count;
    }
}
