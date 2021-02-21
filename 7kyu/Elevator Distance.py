import math

def elevator_distance(array):
    x = 0
    for i in range(len(array) - 1):
        x += math.fabs(array[i] - array[i+1])
    return x