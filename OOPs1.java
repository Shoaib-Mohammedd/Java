public class OOPs1 {
    public static void main(String[] args) {
        int [] numbers = { +2, 52, 061, 5, -43, 11, 44};
            int target = 11;
            int ans = LinearSearch(numbers,target);
        System.out.println( ans);
        System.out.println();
        }
         // search an array return if item the index is found
        // otherwise is index not found return -1
    static int LinearSearch( int [] arr , int target){
        if ( arr.length == 0 ){
            return -1;
        } //... run for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element in every index if it's the target
            int element = arr[1];
            if ( element == target){
                return index;
            }
        }//  this line will execute if none of the statements above has executed
        //  hence the target not found
        return -1;
    }

}
