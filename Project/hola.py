lista = [8, 6, 4, 2, 1, 12, 6, 9]
n = len(lista)

print(n)
# burbujeo

for i in range(n):
    for j in range(0, n-i-1):
        if lista[j] > lista[j+1]:
            lista[j], lista[j+1] = lista[j+1], lista[j]

print(lista)


def buscar(lista, elemento):
    n = len(lista)
    inicio = 0
    fin = n - 1

    while inicio <= fin:
        medio = (inicio+fin) // 2
        if lista[medio] == elemento:
            return medio
        elif lista[medio] < elemento:
            inicio = medio + 1
        elif lista[medio] > elemento:
            fin = medio - 1

    return -1


print(
    f'El elemento{4} se encuentra en la posición {buscar(lista, 4)} del arreglo.')
