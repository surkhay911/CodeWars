def quarter_of(month):
    a = 0
    if (month >= 1 and month <= 3):
        a = 1
    elif (month >=4  and month <= 6):
        a = 2
    elif (month >= 7 and month <= 9):
        a = 3
    else:
        a = 4
    return (a)