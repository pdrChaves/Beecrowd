a,b,c = map(float,input().split())
tRetangulo = a * c / 2
circulo = 3.14159* (c**2)
trapezio = (a + b) * c / 2
quadrado = b**2
retangulo = a * b

print(f"TRIANGULO: {tRetangulo:.3f}")
print(f"CIRCULO: {circulo:.3f}")
print(f"TRAPEZIO: {trapezio:.3f}")
print(f"QUADRADO: {quadrado:.3f}")
print(f"RETANGULO: {retangulo:.3f}")
