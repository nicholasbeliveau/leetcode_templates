
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