
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

/**
  Two pointers: two inputs, exhaust both

  For looping through two arrays, both with their own control.
 */

public int twoArraysTwoInputs(int[] arr1, int[] arr2) {
  int i = 0, j = 0, ans = 0;

  while (i < arr1.length && j < arr2.length) {
      // do some logic here
      if (CONDITION) {
          i++;
      } else {
          j++;
      }
  }

  while (i < arr1.length) {
      // do logic
      i++;
  }

  while (j < arr2.length) {
      // do logic
      j++;
  }

  return ans;
}

/**
 * Count number of occurances of a subarray wihtin an array
 */
public int subarray(int[] arr, int k) {
    Map<Integer, Integer> counts = new HashMap<>();
    counts.put(0, 1);
    int ans = 0, curr = 0;

    for (int num: arr) {
        // do logic to change curr
        ans += counts.getOrDefault(curr - k, 0);
        counts.put(curr, counts.getOrDefault(curr, 0) + 1);
    }

    return ans;
}