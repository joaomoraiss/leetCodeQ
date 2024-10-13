public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,4,5,6,7,9};
        System.out.println(binarySearch(7, arr));
    }
    public static int binarySearch(int target, int arr[]){
        int low = 0;
        int high = arr.length -1;

        while (low <= high){
            int middlePosition = (low + high)/2;
            if (arr[middlePosition] == target)return middlePosition;
            if (arr[middlePosition] > target) high = middlePosition -1;
            else low = middlePosition +1;
        }
        return -1;
    }
}
