package model;

import java.util.ArrayList;
import java.util.List;

public class BancoPreguntas {

        public static List<Pregunta> getPreguntasEntornos() {
                return new ArrayList<>(List.of(
                                new Pregunta("¿Qué significa IDE?", "Entorno de Desarrollo Integrado",
                                                "Interfaz de Datos",
                                                "Base de Datos Interna", "Editor de Diseño", 1),
                                new Pregunta("¿Cuál es un ejemplo de IDE popular?", "Microsoft Word", "Eclipse",
                                                "Photoshop", "Excel",
                                                2),
                                new Pregunta("¿Qué es Git?", "Un lenguaje de programación",
                                                "Un control de versiones",
                                                "Un IDE", "Un compilador", 2),
                                new Pregunta("¿Qué comando de Git se usa para subir cambios al repositorio remoto?",
                                                "git pull",
                                                "git push", "git commit", "git add", 2),
                                new Pregunta("¿Qué es un framework?", "Un tipo de hardware",
                                                "Herramientas para desarrollar software",
                                                "Un sistema operativo",
                                                "Un navegador web", 2),
                                new Pregunta("¿Cuál es un ejemplo de framework para Java?", "React", "Spring", "Django",
                                                "Laravel", 2),
                                new Pregunta("¿Qué es el testing unitario?", "Probar todo el software",
                                                "Probar componentes individuales",
                                                "Probar la interfaz",
                                                "Probar la base de datos", 2),
                                new Pregunta("¿Qué herramienta se usa comúnmente para testing en Java?", "JUnit",
                                                "Selenium", "Postman",
                                                "Jenkins", 1),
                                new Pregunta("¿Qué es Maven?", "Un IDE",
                                                "Gestor de proyectos y dependencias",
                                                "Un lenguaje de programación", "Un servidor web", 2),
                                new Pregunta("¿Qué archivo configura las dependencias en Maven?", "pom.xml",
                                                "build.gradle",
                                                "package.json", "requirements.txt", 1),
                                new Pregunta("¿Qué es Scrum?", "Un lenguaje de programación", "Una metodología ágil",
                                                "Un IDE",
                                                "Un framework", 2),
                                new Pregunta("¿Cuál es el rol del Scrum Master?", "Programar código",
                                                "Facilitar el proceso Scrum",
                                                "Diseñar la interfaz", "Gestionar la base de datos", 2),
                                new Pregunta("¿Qué es la integración continua?", "Una base de datos",
                                                "Integrar cambios frecuentemente",
                                                "Un lenguaje de scripting",
                                                "Un servidor de aplicaciones", 2),
                                new Pregunta("¿Qué herramienta se usa para integración continua?", "Git", "Jenkins",
                                                "Eclipse", "Maven",
                                                2),
                                new Pregunta("¿Qué es Docker?", "Un IDE",
                                                "Plataforma basada en contenedores",
                                                "Un control de versiones", "Un framework web", 2)));
        }

        public static List<Pregunta> getPreguntasDigitalizacion() {
                return new ArrayList<>(List.of(
                                new Pregunta("¿Qué es la transformación digital?", "Pasar todos los archivos a PDF",
                                                "Integrar tecnología en todas las áreas de una empresa",
                                                "Comprar ordenadores nuevos",
                                                "Usar redes sociales para publicidad", 2),
                                new Pregunta("¿Qué es la 'Computación en la nube'?",
                                                "Almacenamiento y servicios a través de internet",
                                                "Predicción del clima mediante software",
                                                "Redes sociales en la estratosfera",
                                                "Ordenadores que funcionan con energía solar", 1),
                                new Pregunta("¿Qué significa 'IoT'?", "Internet Of Technology",
                                                "Internal Organization Tools",
                                                "Interconexión digital de objetos cotidianos con internet",
                                                "Un tipo de cable de fibra óptica", 3),
                                new Pregunta("¿Qué es el 'Big Data'?", "Un disco duro de gran tamaño",
                                                "Conjuntos de datos demasiado grandes y complejos para procesar tradicionalmente",
                                                "Una empresa de telecomunicaciones",
                                                "El servidor principal de internet", 2),
                                new Pregunta(
                                                "¿Qué tecnología de bloques inmutables usan las criptomonedas?",
                                                "Inteligencia Artificial", "Machine Learning", "Blockchain", "5G", 3),
                                new Pregunta("¿Qué protege redes y sistemas de ciberataques?",
                                                "Ciberseguridad", "Cybermarketing", "SEO", "Software Open Source", 1),
                                new Pregunta(
                                                "¿Qué identidad virtual recopila nuestros rastros online?",
                                                "IP estática", "Huella digital", "Avatar", "Cookies", 2),
                                new Pregunta("¿Qué es el E-commerce?",
                                                "Enviar correos electrónicos comerciales",
                                                "Aprender economía por internet",
                                                "Compra y venta de productos o servicios a través de internet",
                                                "Bancos que solo tienen cajeros", 3),
                                new Pregunta("¿Qué significa SEO?", "Search Engine Optimization",
                                                "System Electronic Output", "Secure Enterprise Operations",
                                                "Software Execution Order", 1),
                                new Pregunta("¿Qué es la 'Brecha Digital'?",
                                                "Un virus que rompe el sistema operativo",
                                                "Desigualdad en el acceso y uso de las TIC",
                                                "Espacio entre dos monitores", "Avería física en un cable de red", 2),
                                new Pregunta("¿Qué tecnología simula la inteligencia humana?",
                                                "Realidad Virtual (VR)", "Inteligencia Artificial (IA)",
                                                "Internet de las Cosas (IoT)",
                                                "Realidad Aumentada (AR)", 2),
                                new Pregunta("¿Qué es el phishing?", "Un juego de pesca en línea",
                                                "Técnica para mejorar la velocidad de internet",
                                                "Suplantación de identidad para robar datos confidenciales",
                                                "Un tipo de filtro para fotografías", 3),
                                new Pregunta("¿Por qué destaca la Industria 4.0?",
                                                "Uso de energía de vapor", "Producción en cadena automatizada clásica",
                                                "Sistemas ciberfísicos, IoT e IA en la industria",
                                                "Invención de la bombilla", 3),
                                new Pregunta("¿Cuál es la mayor ventaja del teletrabajo?",
                                                "Exige comprar equipo más caro",
                                                "Flexibilidad geográfica y de horarios",
                                                "Reduce los sueldos a la mitad",
                                                "Elimina la necesidad de usar internet", 2),
                                new Pregunta(
                                                "¿Qué tecnología superpone objetos virtuales al mundo real?",
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
                                                "Fuente de poder",
                                                1),

                                new Pregunta(
                                                "¿Qué tipo de memoria es volátil y pierde su contenido al apagar el equipo?",
                                                "ROM",
                                                "SSD",
                                                "RAM",
                                                "USB",
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
                                                "Binary Input System",
                                                "Basic Input Output System",
                                                "Boot Instruction System",
                                                "Basic Internal System",
                                                2),

                                new Pregunta(
                                                "¿Cuál es la función principal de un firewall?",
                                                "Almacenar datos",
                                                "Aumentar velocidad",
                                                "Filtrar tráfico de red",
                                                "Reparar errores",
                                                3),

                                new Pregunta(
                                                "¿Qué tipo de software gestiona los recursos del hardware?",
                                                "Sistema Operativo",
                                                "Firmware",
                                                "Drivers",
                                                "Apps",
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
                                                "Gráfica",
                                                "CPU",
                                                "Disco Duro",
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
                                                "Completa",
                                                "Espejo",
                                                "Incremental",
                                                "Diferencial",
                                                3)));

        }

        public static List<Pregunta> getPreguntasSostenibilidad() {
                return new ArrayList<>(List.of(
                                new Pregunta(
                                                "¿Qué impacto ambiental grave tiene la Inteligencia Artificial?",
                                                "Destrucción del ozono",
                                                "Alto consumo energético",
                                                "Residuos nucleares",
                                                "Agotamiento del silicio",
                                                2),

                                new Pregunta(
                                                "¿Cómo reducir la contaminación generada por una web?",
                                                "Añadiendo más videos",
                                                "Optimizando imágenes y código",
                                                "Usando fondos negros",
                                                "Evitando usar HTML",
                                                2),

                                new Pregunta(
                                                "¿Cómo se denomina a la basura electrónica desechada?",
                                                "E-waste o RAEE",
                                                "Data smog",
                                                "Spam físico",
                                                "Green-tech",
                                                1),

                                new Pregunta(
                                                "¿Por qué un email con un archivo enorme contamina?",
                                                "Ralentiza los ordenadores",
                                                "Consume papel indirectamente",
                                                "Gasta energía en los servidores",
                                                "Desgasta la pantalla",
                                                3),

                                new Pregunta(
                                                "¿Qué es el 'Green Hosting' o alojamiento verde?",
                                                "Servidores pintados de verde",
                                                "Servidores que usan energía renovable",
                                                "Hosting para webs de botánica",
                                                "Servicios sin JavaScript",
                                                2),

                                new Pregunta(
                                                "¿Qué son los 'Datos Oscuros' o 'Dark Data'?",
                                                "Datos almacenados sin uso",
                                                "Páginas de la Dark Web",
                                                "Virus ocultos",
                                                "Código encriptado",
                                                1),

                                new Pregunta(
                                                "¿Qué mineral para baterías es polémico por su impacto ambiental?",
                                                "Cuarzo",
                                                "Cobalto",
                                                "Cobre",
                                                "Plomo",
                                                2),

                                new Pregunta(
                                                "¿Qué actividad digital consume más energía?",
                                                "Leer PDFs en la nube",
                                                "El streaming de video en 4K",
                                                "Enviar mensajes de texto",
                                                "Descargar canciones",
                                                2),

                                new Pregunta(
                                                "¿Qué busca principalmente el 'Green Web Design'?",
                                                "Reducir la carga de diseño",
                                                "Añadir imágenes de plantas",
                                                "Usar formatos BMP",
                                                "Que la web solo funcione de día",
                                                1),

                                new Pregunta(
                                                "¿Cuál es el gran problema ecológico del Bitcoin?",
                                                "Ruido en los servidores",
                                                "Uso de papel para recibos",
                                                "Su descomunal gasto eléctrico",
                                                "Toxicidad de las monedas",
                                                3),

                                new Pregunta(
                                                "¿Qué movimiento ecológico alarga la vida del hardware?",
                                                "El Overclocking",
                                                "La Obsolescencia Programada",
                                                "El Derecho a Reparar",
                                                "El reciclaje azul",
                                                3),

                                new Pregunta(
                                                "¿Cómo ahorrar energía en nuestra nube personal?",
                                                "Borrando correos y archivos inútiles",
                                                "Comprimiendo la memoria RAM",
                                                "Imprimiendo los emails",
                                                "Dejando el PC encendido",
                                                1),

                                new Pregunta(
                                                "¿Qué recursos físicos masivos requiere un Data Center?",
                                                "Solo espacio en metros cuadrados",
                                                "Electricidad y agua",
                                                "Oxígeno a presión",
                                                "Luz solar directa",
                                                2),

                                new Pregunta(
                                                "Si internet fuera un país, ¿dónde estaría en consumo eléctrico?",
                                                "En el Top 10 mundial",
                                                "Sería el último país",
                                                "No tendría impacto medible",
                                                "Fuera del Top 100",
                                                1),

                                new Pregunta(
                                                "¿Qué es la 'Obsolescencia programada' en la tecnología?",
                                                "Un software de calendario",
                                                "Aparatos para que dejen de funcionar",
                                                "Un bug en Windows",
                                                "Actualizaciones de malware",
                                                2)));
        }
}
