public class SearchMin {
    public static void main(String[] args) {
        int [] arr = { +2, 52, 061, 5, -43, 11, 44};
        System.out.println(min(arr));

    }
    static int min( int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ( arr[1] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
