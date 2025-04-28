
""" 
  Two pointers: one input, opposite ends

  For handling arrays with left and right bounds.
"""

def leftAndRight( arr ) :
    left = ans = 0
    right = len(arr) - 1

    while left < right:
        # do some logic here with left and right
        if CONDITION:
            left += 1
        else:
            right -= 1
    
    return ans


"""
  Two pointers: two inputs, exhaust both

  For looping through two arrays, both with their own control
"""

def twoArraysTwoInputs( arr1, arr2):
    i = j = ans = 0

    while i < len(arr1) and j < len(arr2):
        # do some logic here
        if CONDITION:
            i += 1
        else:
            j += 1
    
    while i < len(arr1):
        # do logic
        i += 1
    
    while j < len(arr2):
        # do logic
        j += 1
    
    return ans

"""
    Count number of occurances of a subarray wihtin an array
"""
from collections import defaultdict

def subarray(arr, k):
    counts = defaultdict(int)
    counts[0] = 1
    ans = curr = 0

    for num in arr:
        # do logic to change curr
        ans += counts[curr - k]
        counts[curr] += 1
    
    return ans