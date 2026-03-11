package model;

import java.util.ArrayList;
import java.util.List;

public class BancoPreguntas {

        public static List<Pregunta> getPreguntasEntornos() {
                return new ArrayList<>(List.of(
                                new Pregunta("¿Qué significa IDE?", "Entorno de Desarrollo Integrado",
                                                "Interfaz de Datos Electrónicos",
                                                "Motor de Base de Datos Interna", "Editor de Diseño Interactivo", 1),
                                new Pregunta("¿Cuál es un ejemplo de IDE popular?", "Microsoft Word", "Eclipse",
                                                "Photoshop", "Excel",
                                                2),
                                new Pregunta("¿Qué es Git?", "Un lenguaje de programación",
                                                "Un sistema de control de versiones",
                                                "Un IDE", "Un compilador", 2),
                                new Pregunta("¿Qué comando de Git se usa para subir cambios al repositorio remoto?",
                                                "git pull",
                                                "git push", "git commit", "git add", 2),
                                new Pregunta("¿Qué es un framework?", "Un tipo de hardware",
                                                "Un conjunto de herramientas y bibliotecas para desarrollar software",
                                                "Un sistema operativo",
                                                "Un navegador web", 2),
                                new Pregunta("¿Cuál es un ejemplo de framework para Java?", "React", "Spring", "Django",
                                                "Laravel", 2),
                                new Pregunta("¿Qué es el testing unitario?", "Probar el software completo",
                                                "Probar componentes individuales del código",
                                                "Probar la interfaz de usuario",
                                                "Probar la base de datos", 2),
                                new Pregunta("¿Qué herramienta se usa comúnmente para testing en Java?", "JUnit",
                                                "Selenium", "Postman",
                                                "Jenkins", 1),
                                new Pregunta("¿Qué es Maven?", "Un IDE",
                                                "Una herramienta de gestión de proyectos y dependencias",
                                                "Un lenguaje de programación", "Un servidor web", 2),
                                new Pregunta("¿Qué archivo configura las dependencias en Maven?", "pom.xml",
                                                "build.gradle",
                                                "package.json", "requirements.txt", 1),
                                new Pregunta("¿Qué es Scrum?", "Un lenguaje de programación", "Una metodología ágil",
                                                "Un IDE",
                                                "Un framework", 2),
                                new Pregunta("¿Cuál es el rol del Scrum Master?", "Desarrollar el código",
                                                "Facilitar el proceso Scrum",
                                                "Diseñar la interfaz", "Gestionar la base de datos", 2),
                                new Pregunta("¿Qué es la integración continua?", "Un tipo de base de datos",
                                                "La práctica de integrar cambios de código frecuentemente",
                                                "Un lenguaje de scripting",
                                                "Un servidor de aplicaciones", 2),
                                new Pregunta("¿Qué herramienta se usa para integración continua?", "Git", "Jenkins",
                                                "Eclipse", "Maven",
                                                2),
                                new Pregunta("¿Qué es Docker?", "Un IDE",
                                                "Una plataforma para desarrollar, enviar y ejecutar aplicaciones en contenedores",
                                                "Un sistema de control de versiones", "Un framework web", 2)));
        }

        public static List<Pregunta> getPreguntasDigitalizacion() {
                return new ArrayList<>(List.of(
                                new Pregunta("¿Qué es la transformación digital?", "Pasar todos los archivos a PDF",
                                                "Integrar tecnología en todas las áreas de una empresa",
                                                "Comprar ordenadores nuevos",
                                                "Usar redes sociales para publicidad", 2),
                                new Pregunta("¿A qué hace referencia el término 'Cloud Computing' (Computación en la nube)?",
                                                "Almacenamiento y servicios a través de internet",
                                                "Predicción del clima mediante software",
                                                "Redes sociales en la estratosfera",
                                                "Ordenadores que funcionan con energía solar", 1),
                                new Pregunta("¿Qué significa 'IoT' (Internet de las Cosas)?", "Internet Of Technology",
                                                "Internal Organization Tools",
                                                "Interconexión digital de objetos cotidianos con internet",
                                                "Un tipo de cable de fibra óptica", 3),
                                new Pregunta("¿Qué es el 'Big Data'?", "Un disco duro de gran tamaño",
                                                "Conjuntos de datos demasiado grandes y complejos para procesar tradicionalmente",
                                                "Una empresa de telecomunicaciones",
                                                "El servidor principal de internet", 2),
                                new Pregunta(
                                                "¿Qué tecnología utiliza bloques criptográficos inmutables, comúnmente asociada a criptomonedas?",
                                                "Inteligencia Artificial", "Machine Learning", "Blockchain", "5G", 3),
                                new Pregunta("¿Cuál de las siguientes protege los sistemas y redes de ataques digitales?",
                                                "Ciberseguridad", "Cybermarketing", "SEO", "Software Open Source", 1),
                                new Pregunta(
                                                "¿Qué concepto describe una identidad virtual que recopila nuestros datos, acciones y rastros en internet?",
                                                "IP estática", "Huella digital", "Avatar", "Cookies", 2),
                                new Pregunta("¿Qué es el comercio electrónico (E-commerce)?",
                                                "Enviar correos electrónicos comerciales",
                                                "Aprender economía por internet",
                                                "Compra y venta de productos o servicios a través de internet",
                                                "Bancos que solo tienen cajeros", 3),
                                new Pregunta("¿Qué significa SEO en marketing digital?", "Search Engine Optimization",
                                                "System Electronic Output", "Secure Enterprise Operations",
                                                "Software Execution Order", 1),
                                new Pregunta("¿A qué se refiere el término 'Brecha Digital'?",
                                                "Un virus que rompe el sistema operativo",
                                                "Desigualdad en el acceso y uso de las TIC",
                                                "Espacio entre dos monitores", "Avería física en un cable de red", 2),
                                new Pregunta("¿Qué tecnología permite a una máquina simular inteligencia humana?",
                                                "Realidad Virtual (VR)", "Inteligencia Artificial (IA)",
                                                "Internet de las Cosas (IoT)",
                                                "Realidad Aumentada (AR)", 2),
                                new Pregunta("¿Qué es el phishing?", "Un juego de pesca en línea",
                                                "Técnica para mejorar la velocidad de internet",
                                                "Suplantación de identidad para robar datos confidenciales",
                                                "Un tipo de filtro para fotografías", 3),
                                new Pregunta("La Cuarta Revolución Industrial (Industria 4.0) se caracteriza principalmente por...",
                                                "Uso de energía de vapor", "Producción en cadena automatizada clásica",
                                                "Sistemas ciberfísicos, IoT e IA en la industria",
                                                "Invención de la bombilla", 3),
                                new Pregunta("¿Cuál es una ventaja clave del teletrabajo (trabajo remoto)?",
                                                "Exige comprar equipo más caro",
                                                "Flexibilidad geográfica y de horarios",
                                                "Reduce los sueldos a la mitad",
                                                "Elimina la necesidad de usar internet", 2),
                                new Pregunta(
                                                "¿Qué tecnología mezcla entornos reales con objetos virtuales superpuestos en tiempo real?",
                                                "Realidad Virtual (VR)", "Realidad Aumentada (AR)", "Metaverso",
                                                "Cloud Computing", 2)));
        }

        public static List<Pregunta> getPreguntasLenguajeDeMarca() {
                return new ArrayList<>(List.of(
                                new Pregunta("¿Qué significa HTML?", "Hyper Terminal Markup Language",
                                                "HyperText Markup Language",
                                                "High Transfer Machine Language", "Hyperlink Text Management Language",
                                                2),
                                new Pregunta("¿Cuál de las siguientes etiquetas define el título de un documento HTML?",
                                                "<head>",
                                                "<meta>", "<title>", "<h1>", 3),
                                new Pregunta("¿Qué lenguaje se usa principalmente para dar estilo a las páginas web?",
                                                "HTML",
                                                "JavaScript", "XML", "CSS", 4),
                                new Pregunta("¿Qué significa XML?", "eXtensible Markup Language", "Extra Modern Link",
                                                "eXecutable Multiple Language", "X-Markup Language", 1),
                                new Pregunta("¿Cuál es la etiqueta correcta para insertar una imagen en HTML?",
                                                "<image src='img.jpg'>",
                                                "<img href='img.jpg'>", "<img src='img.jpg'>", "<pic src='img.jpg'>",
                                                3),
                                new Pregunta("¿Qué etiqueta se utiliza para crear un enlace (hipervínculo) en HTML?",
                                                "<link>", "<a>",
                                                "<href>", "<url>", 2),
                                new Pregunta("En HTML5, ¿cuál etiqueta se usa para reproducir contenido de video?",
                                                "<media>",
                                                "<movie>", "<video>", "<mp4>", 3),
                                new Pregunta("¿Qué significa JSON?", "Java Standard Output Network",
                                                "JavaScript Object Notation",
                                                "JavaScript Oriented Network", "Java Serialized Object Node", 2),
                                new Pregunta("¿Cuál es la estructura básica de una tabla en HTML?",
                                                "<table>, <tr>, <td>",
                                                "<table>, <row>, <cell>", "<tab>, <tr>, <td>",
                                                "<table>, <head>, <body>", 1),
                                new Pregunta("¿Qué atributo HTML se usa para definir estilos en línea (inline)?",
                                                "class", "font",
                                                "style", "styles", 3),
                                new Pregunta("¿Cuál de estos NO es un lenguaje de marcado?", "HTML", "XML", "Markdown",
                                                "Python", 4),
                                new Pregunta("¿Qué etiqueta de HTML5 se usa para el contenido principal de un documento?",
                                                "<main>",
                                                "<content>", "<section>", "<body>", 1),
                                new Pregunta("¿Qué lenguaje se usa comúnmente para escribir archivos de configuración simples?",
                                                "YAML",
                                                "C++", "Java", "PHP", 1),
                                new Pregunta("¿Qué versión de HTML introdujo elementos semánticos como <article> y <nav>?",
                                                "HTML 3.2",
                                                "HTML 4.01", "XHTML", "HTML5", 4),
                                new Pregunta(
                                                "¿Qué atributo se usa en las imágenes (<img>) para el texto alternativo si la imagen no carga?",
                                                "title", "src", "alt", "description", 3)));
        }

        public static List<Pregunta> getPreguntasProgramacion() {
                return new ArrayList<>(List.of(
                                new Pregunta(
                                                "¿Qué lenguaje de programación se utiliza principalmente para el desarrollo web del lado del cliente?",
                                                "Java", "Python", "JavaScript", "C#", 3),
                                new Pregunta("¿Cuál es el propósito principal de la sentencia 'if' en programming?",
                                                "Repetir código",
                                                "Realizar cálculos matemáticos", "Tomar decisiones condicionales",
                                                "Declarar variables", 3),
                                new Pregunta("¿Qué estructura de datos se utiliza para almacenar una colección ordenada de elementos?",
                                                "Array (Arreglo)", "Objeto", "Variable booleana", "Constante", 1),
                                new Pregunta("¿Qué significa 'HTML' en el contexto del desarrollo web?",
                                                "High Transfer Markup Language", "HyperText Markup Language",
                                                "Hyperlink and Text Management Language", "Home Tool Markup Language",
                                                2),
                                new Pregunta("¿Cuál es el resultado de la siguiente operación: 5 + 3 * 2?", "16", "11",
                                                "13", "8", 2),
                                new Pregunta("¿Qué tipo de dato se utiliza para representar valores verdadero o falso?",
                                                "String",
                                                "Integer", "Boolean", "Float", 3),
                                new Pregunta(
                                                "¿Qué se utiliza para comentar una sola línea en la mayoría de los lenguajes de programación?",
                                                "//", "/* */", "#", "<!-- -->", 1),
                                new Pregunta("¿Qué significa 'API' en el contexto de software?",
                                                "Advanced Programming Interface",
                                                "Application Programming Interface", "Automated Program Instruction",
                                                "Application Process Integration", 2),
                                new Pregunta(
                                                "¿Qué estructura de control se utiliza para repetir un bloque de código mientras una condición sea verdadera?",
                                                "If-else", "Switch", "While", "For", 3),
                                new Pregunta(
                                                "¿Qué lenguaje de programación se utiliza principalmente para el desarrollo de aplicaciones Android?",
                                                "Swift", "Kotlin", "Dart", "Ruby", 2),
                                new Pregunta("¿Qué significa el acrónimo POO (o OOP en inglés)?",
                                                "Programación Orientada a Objetos",
                                                "Programación Oficial de Ordenadores",
                                                "Programa Organizado en Operaciones",
                                                "Posicionamiento Original de Objetos", 1),
                                new Pregunta("¿Qué mecanismo permite a una clase adquirir las propiedades y métodos de otra clase?",
                                                "Polimorfismo", "Encapsulamiento", "Herencia", "Abstracción", 3),
                                new Pregunta("¿Qué es un 'bug' en el contexto de la programación?",
                                                "Una nueva característica del programa",
                                                "Un error o fallo en el código",
                                                "Un tipo de algoritmo de ordenación",
                                                "Una herramienta de diseño de interfaces", 2),
                                new Pregunta(
                                                "¿Cómo se llama la acción de traducir código fuente en código máquina para que lo entienda el ordenador?",
                                                "Interpretación", "Traducción", "Compilación", "Depuración", 3),
                                new Pregunta(
                                                "¿Qué lenguaje está diseñado principalmente para realizar consultas, crear y gestionar bases de datos relacionales?",
                                                "Python", "SQL", "C++", "HTML", 2)));
        }

        public static List<Pregunta> getPreguntasSistemas() {
                return new ArrayList<>(List.of(
                                new Pregunta(
                                                "¿Qué componente es considerado el cerebro del ordenador?",
                                                "CPU",
                                                "RAM",
                                                "Disco duro",
                                                "Fuente de alimentación",
                                                1),

                                new Pregunta(
                                                "¿Qué tipo de memoria es volátil y pierde su contenido al apagar el equipo?",
                                                "ROM",
                                                "SSD",
                                                "RAM",
                                                "Memoria Flash",
                                                3),

                                new Pregunta(
                                                "¿Qué dispositivo convierte señales digitales en analógicas y viceversa?",
                                                "Switch",
                                                "Router",
                                                "Repetidor",
                                                "Módem",
                                                4),

                                new Pregunta(
                                                "¿Qué sistema operativo es de código abierto?",
                                                "Windows",
                                                "macOS",
                                                "Linux",
                                                "ChromeOS",
                                                3),

                                new Pregunta(
                                                "¿Qué protocolo se utiliza para transferir archivos entre computadoras?",
                                                "DNS",
                                                "FTP",
                                                "SMTP",
                                                "HTTP",
                                                2),

                                new Pregunta(
                                                "¿Qué tipo de red abarca distancias muy grandes, como países o continentes?",
                                                "LAN",
                                                "PAN",
                                                "WAN",
                                                "MAN",
                                                3),

                                new Pregunta(
                                                "¿Qué dispositivo asigna direcciones IP dentro de una red local?",
                                                "Hub",
                                                "Router",
                                                "Switch",
                                                "Firewall",
                                                2),

                                new Pregunta(
                                                "¿Qué significa el acrónimo BIOS?",
                                                "Binary Integrated Operating System",
                                                "Basic Input Output System",
                                                "Boot Instruction Operating Setup",
                                                "Basic Internal Operation System",
                                                2),

                                new Pregunta(
                                                "¿Cuál es la función principal de un firewall?",
                                                "Almacenar datos",
                                                "Aumentar la velocidad de Internet",
                                                "Proteger la red controlando el tráfico",
                                                "Reparar errores del sistema",
                                                3),

                                new Pregunta(
                                                "¿Qué tipo de software gestiona los recursos del hardware?",
                                                "Sistema operativo",
                                                "Firmware",
                                                "Controladores",
                                                "Software de aplicación",
                                                1),

                                new Pregunta(
                                                "¿Qué sistema de archivos es común en Windows?",
                                                "EXT4",
                                                "APFS",
                                                "NTFS",
                                                "FAT32",
                                                3),

                                new Pregunta(
                                                "¿Qué componente almacena de forma permanente el sistema operativo?",
                                                "RAM",
                                                "Tarjeta gráfica",
                                                "CPU",
                                                "Disco duro / SSD",
                                                4),

                                new Pregunta(
                                                "¿Qué tecnología permite ejecutar varias máquinas virtuales en un mismo equipo?",
                                                "Fragmentación",
                                                "Virtualización",
                                                "Multiplexación",
                                                "Compilación",
                                                2),

                                new Pregunta(
                                                "¿Qué comando se utiliza para comprobar la conectividad con otro host?",
                                                "tracert",
                                                "netstat",
                                                "ping",
                                                "ipconfig",
                                                3),

                                new Pregunta(
                                                "¿Qué tipo de copia de seguridad solo guarda los archivos modificados desde la última copia completa?",
                                                "Copia completa",
                                                "Copia espejo",
                                                "Copia incremental",
                                                "Copia diferencial",
                                                3)));

        }

        public static List<Pregunta> getPreguntasSostenibilidad() {
                return new ArrayList<>(List.of(

                                new Pregunta(
                                                "¿Qué es el desarrollo sostenible?",
                                                "Satisfacer necesidades actuales sin comprometer las futuras",
                                                "Evitar el uso de recursos naturales",
                                                "Producir más energía sin límites",
                                                "Reducir el consumo sin importar el impacto",
                                                1),

                                new Pregunta(
                                                "¿Cuál de los siguientes es un gas de efecto invernadero?",
                                                "Oxígeno",
                                                "Dióxido de carbono (CO₂)",
                                                "Helio",
                                                "Nitrógeno",
                                                2),

                                new Pregunta(
                                                "¿Qué tipo de energía es renovable?",
                                                "Carbón",
                                                "Gas natural",
                                                "Energía solar",
                                                "Petróleo",
                                                3),

                                new Pregunta(
                                                "¿Qué significa la regla de las 3R?",
                                                "Reparar, Reusar, Reemplazar",
                                                "Reducir, Reutilizar, Reciclar",
                                                "Repetir, Reusar, Reciclar",
                                                "Reducir, Rehacer, Reusar",
                                                2),

                                new Pregunta(
                                                "¿Cuál es una consecuencia del cambio climático?",
                                                "Mayor estabilidad climática",
                                                "Disminución del nivel del mar",
                                                "Aumento de fenómenos meteorológicos extremos",
                                                "Reducción de temperaturas globales",
                                                3),

                                new Pregunta(
                                                "¿Qué recurso natural es no renovable?",
                                                "Energía eólica",
                                                "Energía solar",
                                                "Energía hidráulica",
                                                "Petróleo",
                                                4),

                                new Pregunta(
                                                "¿Qué contenedor se usa para el vidrio?",
                                                "Amarillo",
                                                "Azul",
                                                "Verde",
                                                "Gris",
                                                3),

                                new Pregunta(
                                                "¿Cuál es una práctica sostenible en el hogar?",
                                                "Usar bombillas LED",
                                                "Dejar luces encendidas",
                                                "Tirar aceite por el fregadero",
                                                "Comprar productos desechables",
                                                1),

                                new Pregunta(
                                                "¿Qué organismo promueve los Objetivos de Desarrollo Sostenible (ODS)?",
                                                "OTAN",
                                                "OMS",
                                                "ONU",
                                                "Unión Europea",
                                                3),

                                new Pregunta(
                                                "¿Cuál es un ejemplo de economía circular?",
                                                "Usar productos y tirarlos",
                                                "Fabricar sin reciclar",
                                                "Consumir más recursos",
                                                "Reparar y reutilizar productos",
                                                4),

                                new Pregunta(
                                                "¿Qué sector genera más emisiones de CO₂?",
                                                "Educación",
                                                "Tecnología",
                                                "Transporte",
                                                "Agricultura",
                                                3),

                                new Pregunta(
                                                "¿Qué es la huella ecológica?",
                                                "Consumo de agua diario",
                                                "Impacto ambiental total de una persona o país",
                                                "Uso de energía renovable",
                                                "Cantidad de basura generada",
                                                2),

                                new Pregunta(
                                                "¿Qué material tarda más en degradarse?",
                                                "Papel",
                                                "Cartón",
                                                "Madera",
                                                "Plástico",
                                                4),

                                new Pregunta(
                                                "¿Qué acción ayuda a ahorrar agua?",
                                                "Cerrar el grifo al cepillarse",
                                                "Duchas largas",
                                                "Lavar el coche con manguera",
                                                "Dejar el grifo abierto",
                                                1),

                                new Pregunta(
                                                "¿Qué es el reciclaje?",
                                                "Tirar desechos al contenedor gris",
                                                "Enterrar basura",
                                                "Quemar residuos",
                                                "Transformar residuos en nuevos productos",
                                                4)));
        }
}
