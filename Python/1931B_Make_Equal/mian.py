def MakeEqual(water_amount, Container, average):
    extra = 0
    for i in range(container):
        if water_amount[i] >= average:
            extra += water_amount[i] - average
        else:
            pour_amount = average - water_amount[i]
            if extra >= pour_amount:
                extra -= pour_amount
            else:
                return "NO"
    if extra == 0:
        return "YES"
    else:
        return "NO"
test_cases = int(input())
while (test_cases > 0):
    container = int(input())
    water_amount = [0]*container
    sum, count = 0, 0
    for i in range(container):
        water_amount.append(int(input()))
        sum += water_amount[i]
        count += 1
    average = sum / count
    print(MakeEqual(water_amount, container, average))
    test_cases -= 1