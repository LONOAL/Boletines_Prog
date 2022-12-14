# Boletin 8

---

![imagen](https://i.blogs.es/fd396a/hook/840_560.jpg)

---
## Diagrama de flujo.
```mermaid
graph TD;

INICIO-->id1[Mostrar menu]
id1-->id2[/Opciones/]
id2-->sw{1,2 o 3}
sw-->|Opcion 1|1[/Pedir lado/]
sw-->|Opcion 2|2[/Pedir base/]
sw-->|Opcion 3|3[/Pedir radio/]
sw-->|Default|4[Mostrar error]
2-->2.1[/Pedir altura/]
1-->1.1[lado * lado = areaCuadrado]
2.1-->2.2[base * altura/2 = areaTriangulo]
3-->3.1[radio^2 * PI]
1.1-->mostrar[Mostrar resultado area]
2.2-->mostrar
3.1-->mostrar
4-->mostrar
mostrar-->FINAL
```
###### **Diagrama de el ejercicio 8 del boletín 2.**
7- Codifica un programa que, utilizando un menú de opcións, calcule a superficie de distintas figuras . 
     O usuario premerá a opción desexada .Según ésta o programa pediralle os datos precisos e, utilizando un switch…case visualizará o resultado .
   No caso de premer unha opción que non teña o menú visualizar unha mensaxe de “ opción incorrecta “.

>1…. Cadrado 

>2…. Triangulo

>3…. Circulo 


*Este es el enlace a  [esemtia](https://danielcastelao.esemtia.net/moodle/course/view.php?id=49).*

---
## Peudocódigo.


```
        opcion = introducirOpcion();

        switch (opcion){
            case CUADRADO:
                lado = introducirNumero();
                area = calcularAreaCuadrado(lado);
                mostrarArea(area);
            break;
            case TRIANGULO:
                altura = introducirNumero();
                base = introducirNumero();
                area = calcularAreaTriangulo(base,altura);
                mostrarArea(area);
            break;
            case CIRCUNFERENCIA:
                radio = introducirNumero();
                area = calcularAreaCircunferencia(radio);
                mostrarArea(area);
            break;
            default:
                mostrarMensaje();
```
---
## Estructura del proyecto:

![Estructura](images/Sin%20título.png)

---
## Pasos:

- Crear el proyecto.

- [ ]  Hacer el ordinograma.

- [x] Hacer el pseudocódigo.

- Empezar a programar.
    - [x] Crear clase principal con la estructura.
    - [x] Hacer la clase secundaria con los métodos pedidos en la clase main.

@github/RubenDanielCastelao :+1: 

<!--- mi primer md --->
