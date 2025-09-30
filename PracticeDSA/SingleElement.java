package PracticeDSA;

public class SingleElement {
    public static void singlelement(int arr[]) {

        int low = 0, high = arr.length - 1;
     int ans=0;
        if (arr.length == 1) {
            ans = arr[0];
        } else if (arr[low] != arr[low + 1]){
            ans=arr[low];
        }else if(arr[high]!=arr[high-1]){
            ans=arr[high];
        }
          while (low <= high) {
                int mid = (high + low) / 2;
                 if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                ans= arr[mid];
                System.out.println(ans);
            }

            // We are in the left:
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1])
                    || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                // Eliminate the left half:
                low = mid + 1;
            }
            // We are in the right:
            else {
                // Eliminate the right half:
                high = mid - 1;
            }
            }

    }
    public static void main(String[] args) {
        int arr []={1,1,2,2,3,3,4,5,5,6,6};
        singlelement(arr);
    }
}
