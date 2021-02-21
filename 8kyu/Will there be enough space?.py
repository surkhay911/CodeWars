def enough(cap, on, wait):
    if (cap>on+wait):
        return 0
    cap=cap-on
    return abs(cap-wait)

print(enough(10, 5, 5))
print(enough(100, 60, 50))
print(enough(20, 5, 5))