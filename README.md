![unnamed](https://user-images.githubusercontent.com/64206343/101793865-3fa22200-3ad4-11eb-91f0-6fddc126f5d9.jpg)<br>
Imagen tomada de: [Aquí](http://www.newmarketsoccer.com/Default.asp?id=outdoor-recreational&l=1)
# IntegrativeTask3 

### Enunciado: 

Debido a sus grandes habilidades como programador, usted ha sido contratado por un importante club deportivo de fútbol del país, para que le implemente un software que le permita manejar su entidad deportiva. Dicho club cuenta con un nombre, un NIT que lo identifica y una fecha de fundación. Asimismo, dicha institución cuenta con diversos empleados de distintos tipos dentro de su nómina (entrenadores principales, entrenadores asistentes y jugadores). El club posee dos equipos profesionales de fútbol (A y B), además, cuenta con unas excelentes instalaciones deportivas dentro de las que se cuentan dos vestidores para jugadores y un remodelado sector de oficinas para entrenadores.


Como se indicaba anteriormente, se tiene un camerino asignado para cada equipo (la única restricción es que cada camerino puede utilizarse por jugadores de un mismo equipo en un instante dado), el primero de estos tienen una capacidad para 42 jugadores (7x6) y el segundo tiene una capacidad para 49 jugadores (7x7). Desafortunadamente, debido a los tiempos de pandemia, y siguiendo con las últimas medidas de bioseguridad, un jugador no puede estar contiguo a otro dentro del camerino, es decir, debe existir un espacio entre él y el siguiente jugador, de manera que se garantice la distancia segura estipulada por el gobierno nacional. 

En cuanto al sector de oficinas se tienen 36 de ellas (6x6), pero al igual que los camerinos, debe haber una oficina desocupada de por medio.

Los dos equipos que hacen parte del club cuentan con un nombre, un entrenador principal, 3 asistentes técnicos y hasta 25 jugadores en la plantilla. Ambos cuadros cuentan con varias alineaciones para cada uno de los partidos que deben disputar durante los distintos torneos de la temporada. Dichas alineaciones cuentan con una fecha, una táctica (posesión, contraataque, presión alta, o por defecto) y una formación en el campo (por ejemplo, 4-4-2, 4-3-3, etc.) representada a través de una matriz binaria de 10x7 en donde el 1 representa al jugador y el 0 un espacio del campo. A partir de la formación representada por dicha matriz, se debe tener un método para transformarlo en una cadena que indique la cantidad de defensores, volantes y delanteros en el campo (eg., 4-4-2) de tal manera que se pueda presentar ese aspecto a los medios de comunicación cuando sea el momento del partido.

Pasando a los empleados de la entidad, cada uno de ellos tiene un nombre, un identificador, un salario y un estado (activo, inactivo). Los jugadores, además, cuentan con un número de camiseta, la cantidad de goles que han marcado en el club, su calificación promedio y su posición dentro del terreno de juego (portero, defensor, volante o delantero). Los entrenadores, en general, cuentan con años de experiencia, mientras que en particular, los entrenadores principales tienen como atributos a destacar, el número de equipos a cargo en su carrera como manager y los campeonatos conseguidos. Asimismo, los asistentes técnicos cuentan con la característica de haber sido o no jugadores profesionales en algún momento de su vida y una serie de experticias (que pueden ser: ofensivo, defensivo, posesión, jugadas de laboratorio).

Finalmente, tanto a los jugadores como a los entrenadores principales se les debe poder calcular su precio de mercado y su nivel como estrellas dentro del mundo del fútbol.

Para calcular el precio de mercado para jugadores se debe seguir la siguiente fórmula:

- Si es portero: (salario x 12) + (calificación promedio x 150) 

- Si es defensor: (salario x 13) + (calificación promedio x 125) + (goles x 100) 

- Si es volante: (salario x 14) + (calificación promedio x 135) + (goles x 125)

- Si es delantero: (salario x 15) + (calificación promedio x 145) + (goles x 150)  

Para calcular el precio de mercado para entrenadores principales se debe seguir la siguiente fórmula:

- (salario x 10) + (años de experiencia x 100) + (campeonatos ganados x 50)

Para calcular el nivel para jugadores se debe seguir la siguiente fórmula:

- Si es portero: calificación promedio x 0.9 

- Si es defensor: (calificación promedio x 0.9) + (goles/100) 

- Si es volante: (calificación promedio x 0.9) + (goles/90) 

- Si es delantero: (calificación promedio x 0.9) + (goles/80) 

Para calcular el nivel para entrenadores principales se debe seguir la siguiente fórmula:

- 5 + (campeonatos ganados/10)

**Requerimientos:**

El club debe permitir contratar y despedir empleados, ya sean jugadores o entrenadores. Debe ser posible agregar jugadores o entrenadores a los equipos siempre y cuando no se pasen de los límites tope (y ya se encuentren como empleados del club), actualizar y mostrar la información de los empleados y de los equipos. Igualmente se debe poder agregar alineaciones al equipo teniendo en cuenta las características ya citadas previamente. 

También se debe poder ubicar a los entrenadores en las oficinas y a los jugadores en los vestuarios siguiendo los protocolos de bioseguridad estipulados en un comienzo. 

La herramienta debe permitir mostrar la información de todo el club, incluyendo la información de sus equipos, empleados e instalaciones (de manera general o particular).
Existirá un requerimiento adicional para mostrar la ubicación de los entrenadores en sus oficinas, al igual que el requerimiento para mostrar la ubicación de los jugadores en el camerino.
