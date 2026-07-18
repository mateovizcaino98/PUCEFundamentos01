PUCE FUNDAMENTOS 01

Problemas que resuelve la aplicacion 
    Este codigo es un sistema de gestion academica que esta diseñado para validar si un
    esrtudiante cumple con los requisitos para poder mastricularse evaluando los datos que 
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
        El bug oculto dentro del codigo se encontraba en la linea 37 
        for (int i = 0; i < historial_materias.length; i++)
        lo que ocurria era que si un estudiante selecionaba "N" que significa no es de reingreso el arreglo historial_materias se inicializa como new String[]{""} (un arreglo con un elemento vacío). Aunque el programa no colapsa en el for, la lógica falla porque compara un String vacío con el prerrequisito, resultando siempre en false.

    Solucion 
        Se implemento una logica que valida explícitamente el estado del estudiante antes de realizar la iteración o se ajustó la inicialización para evitar comparaciones inválidas.

Nueva funcion 
    Se añadio la funcion de felicitacion e caso de que el estudiante registre la nota mas alta posible, en el cual, ademas de aprobar la matricula se imprimira un mensaje de reconocimiento. 