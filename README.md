# Programación Orientada a Objetos - Ejercitación 4.E.1 (Manejo de Excepciones)

Este repositorio contiene la resolución de la **Ejercitación 4.E.1** de la materia **Programación Orientada a Objetos en Java**, centrada en **manejo de excepciones**: bloques `try-catch-finally`, propagación con `throws`, excepciones verificadas y no verificadas, re-lanzamiento y encadenamiento.

Cada ejercicio está modularizado de forma independiente dentro de su propio paquete. Todos los ejercicios son **autocontenidos**: las clases que se necesitan (`Estudiante`, `NotaInvalidaException`, etc.) se replican en el paquete de cada ejercicio para poder compilarlo y ejecutarlo por separado sin dependencias externas.

Además, se incluye un **Menú Interactivo de Consola (`Main.java`)** para compilar y ejecutar cualquier consigna cómodamente.

---

## 📂 Índice de Ejercicios Resueltos

### Ejercitación 4.E.1: Manejo de Excepciones

| Ejercicio | Archivo Principal | Descripción & Lógica Aplicada |
| --- | --- | --- |
| **01. CalculadorAcademico** | [`CalculadorAcademico.java`](src/ejercitacion4_1/ejercicio01/CalculadorAcademico.java) | Captura básica con `try-catch` ante un `ArithmeticException` lanzado a mano. |
| **02. CargaNotasExamen** | [`CargaNotasExamen.java`](src/ejercitacion4_1/ejercicio02/CargaNotasExamen.java) | Captura múltiple con `catch` específicos y cierre garantizado con `finally`. |
| **03. Evaluacion** | [`Evaluacion.java`](src/ejercitacion4_1/ejercicio03/Evaluacion.java) | Excepción verificada propia `NotaInvalidaException` para validar el rango de la nota. |
| **04. Comision** | [`Comision.java`](src/ejercitacion4_1/ejercicio04/Comision.java) | Propagación de `CupoAgotadoException` por la pila de llamadas hasta la capa cliente. |
| **05. Estudiante** | [`Estudiante.java`](src/ejercitacion4_1/ejercicio05/Estudiante.java) | Excepción no verificada `LegajoInvalidoException` como validación defensiva del invariante. |
| **06. AulaVirtual** | [`AulaVirtual.java`](src/ejercitacion4_1/ejercicio06/AulaVirtual.java) | Transición de estado inválida con `EstadoAulaInvalidoException` al tomar asistencia. |
| **07. SistemaTitulacion** | [`VerificadorTitulacion.java`](src/ejercitacion4_1/ejercicio07/VerificadorTitulacion.java) | Re-lanzamiento de excepciones: auditoría en la capa intermedia y `throw e;`. |
| **08. AccesoCampusVirtual** | [`AccesoCampusVirtual.java`](src/ejercitacion4_1/ejercicio08/AccesoCampusVirtual.java) | Encadenamiento de excepciones con wrapping de `IOException` y causa raíz. |
| **09. RegistroUniversidad** | [`RegistroUniversidad.java`](src/ejercitacion4_1/ejercicio09/RegistroUniversidad.java) | `EstudianteNoEncontradoException` al buscar dentro de un `ArrayList<Estudiante>`. |
| **10. ProcesadorMatricula** | [`ProcesadorMatricula.java`](src/ejercitacion4_1/ejercicio10/ProcesadorMatricula.java) | Integración: excepción verificada y no verificada, captura múltiple y `finally`. |

---

## Compilación y Ejecución

### Opción 1: Menú Interactivo de Consola (¡Recomendado!)

**Desde la Terminal:**

```bash
# 1. Compilar todo el proyecto
javac -encoding UTF-8 -d bin -sourcepath src src/Main.java

# 2. Ejecutar el menú principal
java -cp bin Main
```

**Desde cualquier IDE:** abrir y ejecutar la clase [`src/Main.java`](src/Main.java).

### Opción 2: Ejecutar un Ejercicio Individual

Cada ejercicio se compila indicando el path completo del archivo principal y se ejecuta con su package completo:

```bash
# Ejemplo: Ejercicio 10 - ProcesadorMatricula
javac -encoding UTF-8 -d bin -sourcepath src src/ejercitacion4_1/ejercicio10/ProcesadorMatricula.java
java -cp bin ejercitacion4_1.ejercicio10.ProcesadorMatricula
```

> La opción `-sourcepath src` le permite a `javac` resolver las clases auxiliares del mismo ejercicio automáticamente.

---

## Requisitos

- **Java Development Kit (JDK):** Versión 17 o superior.
- **IDE recomendado:** Visual Studio Code, IntelliJ IDEA, Eclipse o NetBrains.

---

**Elrond:** "¡Isildur! ¡Destruye el anillo! ¡Arrójalo al fuego!"

**Isildur:**

```java
public void destruirAnillo() throws NiEnPedoException {
    // Que se haga cargo Frodo en la próxima ejecución.
}
```
