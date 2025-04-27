
/**
 * Two pointers: one input, opposite ends

   For handling arrays with left and right bounds.
 * @param {*} arr 
 * @returns 
 */

let leftAndRight = arr => {
  let left = 0, ans = 0, right = arr.length - 1;

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