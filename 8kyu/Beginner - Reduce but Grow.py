def grow(arr):
    x = 1
    for i in range(len(arr)):
        x*=arr[i]
    return x