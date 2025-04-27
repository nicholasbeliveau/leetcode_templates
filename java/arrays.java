
/**
  Two pointers: one input, opposite ends

  For handling arrays with left and right bounds. 
 */
public int leftAndRight(int[] arr) {
  int left = 0;
  int right = arr.length - 1;
  int ans = 0;

  while (left < right) {
      // do some logic here with left and right
      if (CONDITION) {
          left++;
      } else {
          right--;
      }
  }

  return ans;
}