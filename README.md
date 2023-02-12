# Kata 2 

## Prototip de correcció automàtica

Completar la implementació d'una funció de correcció automàtica. Donada una cadena (String) de consulta de cerca, la funció hauria de retornar totes les paraules que siguin anagrames.

Donades 2 matrius (arrays), paraules[n] i consultes[q], per a cada consulta, retorna una matriu de les cadenes que són anagrames, ordenades alfabèticament de forma ascendent.

```
Nota: un anagrama és qualsevol cadena que es pot formar reordenant les lletres d'una cadena.

```
### Descripció de la funció: 

Completa la funció getSearchResults en l’editor a continuació. 

getSearchResults té els següents arguments: 

	- String words [n]: la llista de paraules a buscar. 

	- String queries [q]: les paraules a buscar.
 
Returns: 

	- String[q][]: els resultats de cada consulta de cerca. 

### Exemple: 

n = 4, q = 2

words = [“duel”, “speed”, “dule”, “car”],

queries = [“spede”, “deul”]

L'únic anagrama de “spede” és “speed”.

Tant “duel” com “dule” són anagrames de “deul”.

Retorna [[“speed”],[“duel”,”dule”]].


