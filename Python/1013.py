a,b,c = map(int, input().split())
maior = int
def maiorAB(x,y):
    maiorAB = (x + y + abs(x-y)) / 2
    return int(maiorAB)
if maiorAB(a,b) == a:
    maior = maiorAB(a,c)
else:
    maior = maiorAB(b,c)
print(f"{maior} eh o maior")