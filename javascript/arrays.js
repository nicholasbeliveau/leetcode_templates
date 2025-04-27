
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

/**
  Two pointers: two inputs, exhaust both

  For looping through two arrays, both with their own control.

 * @param {*} arr1 
 * @param {*} arr2 
 * @returns 
 */

let twoArraysTwoInputs = (arr1, arr2) => {
  let i = 0, j = 0, ans = 0;
  
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