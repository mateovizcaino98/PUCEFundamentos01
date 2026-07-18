PUCE FUNDAMENTOS 01

Problemas que resuelve la aplicacion 
    Este codigo es un sistema de gestion academica que esta diseñado para validar si un
    estudiante cumple con los requisitos para poder mastricularse evaluando los datos que 
    se le proporcionan. 

Flujo de datos
    1.- El sistema pide y registra el nombre del estudiante, ademas de preguntar si es de reingreso. 
    2.- Si es de reingreso se le solicitara su calificacion para el prerequisito. 
        Si no lo es inica un historial vacio y omite la peticion de la nota. 
    3.- El usuario indica si quiere matricularse para "estructura de datos"
    4.- Se verifica si existe el prerequisito en el historial. 
    5.- Se evalua la nota y se determina la aprobacion, rechazo. 
    6.- El sistema imprime el estado de la maticula. 

Cambio en los nombre vagos de las variables
    nombreEstudiante: Identificador del usuario.

    materiaPrerrequisito: Nombre del requisito académico.

    reingreso: Determina el flujo del programa.

    nota: Nota numérica del alumno.

    cumple_requisito: Bandera booleana de validación.

    Con ertos cambios se espera tener una lectura y correcion mas sencilla y practica del codigo. 

Bug oculto
    Problema
        El error ocurria cuando el estudiante o usuario indicaba que era de primer semestre, de modo que el arreglo que que almacenaba el historial de materias 
        nunca se iniciaba. Seguido de esto el programa intentaba recorrer ese arreglo para verificar el prerequisito, lo que provocaba una excepción y se detenia
        la ejecución. 

    Solucion 
        Se implemento una logica que valida explícitamente el estado del estudiante antes de realizar la iteración o se ajustó la inicialización para evitar comparaciones inválidas.

Nueva funcion 
    Se añadio la funcion de felicitacion e caso de que el estudiante registre la nota mas alta posible, en el cual, ademas de aprobar la matricula se imprimira un mensaje de reconocimiento. 