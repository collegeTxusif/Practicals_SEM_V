import queue as Q
from RMP import dict_gn

start = "Arad"
end = "Bucharest"
result = ""

def DLS(city, visitedStack, startLim, endLim):
    global result
    found = 0
    global result
    result = result + city + " "
    visitedStack.append(city)
    if city == end:
        return 1
    if startLim == endLim:
        return 0
    for eachCity in dict_gn[city].keys():
        if eachCity not in visitedStack:
            found = DLS(eachCity, visitedStack, startLim + 1, endLim)
        if found:
            return found

def IDDFS(city, visitedStack, endLim):
    global result
    for i in range(0, endLim):
        print("Searching at lim:", i)
        found = DLS(city, visitedStack, 0, i)
        if found:
            print("found")
            break
        else:
            print("not found")
            print(result)
            print("\n")
            result = ""
            visitedStack = []

def main():
    visitedStack = []
    IDDFS(start, visitedStack, 9)

    print('IDDFS Traversal From ', start, ' to', end, ' is: ')
    print(result)
    
main()
