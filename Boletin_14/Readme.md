# Boletin 14

---

![imagen](https://i.blogs.es/fd396a/hook/840_560.jpg)

---


###### **Diagrama de el ejercicio 8 del boletín 2.**
14- Codifica un programa que visualice los valores de varios componentes de un ordenador.

>1…. Monitor

>2…. Teclado

>3…. Cpu


*Este es el enlace a el  [JavaDoc](https://lonoal.github.io/Boletin_14/).*

---
## Peudocódigo.


```
        public static void main(String[] args) {
        Monitor mo = new Monitor(27);
        Teclado te = new Teclado("Logitech");
        Cpu pro = new Cpu(5);
        Ordenador pc = new Ordenador();
        pc.setPrecio(750);
        System.out.println(mo.toString()+te.toString()+pro.toString()+pc.toString());
    }
```

---
## Pasos:

- Crear el proyecto.

- [ ]  Hacer el ordinograma.

- [x] Hacer el pseudocódigo.

- Empezar a programar.
    - [x] Crear clase principal con la estructura.
    - [x] Hacer la clase secundaria con los métodos pedidos en la clase main.


<!--- md --->