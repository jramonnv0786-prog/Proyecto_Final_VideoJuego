package model;

import java.util.*;

public class BancoPreguntas {

        private static final Map<String, List<Pregunta>> banco = new HashMap<>();

        static {
                // -------------------------
                // ENTORNOS DE DESARROLLO
                // -------------------------
                banco.put("entornos", new ArrayList<>(List.of(
                                new Pregunta("¿Qué significa IDE?", "Entorno de Desarrollo Integrado",
                                                "Interfaz de Datos", "Base de Datos Interna", "Editor de Diseño", 1),
                                new Pregunta("¿Cuál es un ejemplo de IDE popular?", "Microsoft Word", "Eclipse",
                                                "Photoshop", "Excel", 2),
                                new Pregunta("¿Qué es Git?", "Un lenguaje de programación", "Un control de versiones",
                                                "Un IDE", "Un compilador", 2),
                                new Pregunta("¿Qué comando de Git se usa para subir cambios al repositorio remoto?",
                                                "git pull", "git push", "git commit", "git add", 2),
                                new Pregunta("¿Qué es un framework?", "Un tipo de hardware",
                                                "Herramientas para desarrollar software", "Un sistema operativo",
                                                "Un navegador web", 2),
                                new Pregunta("¿Cuál es un ejemplo de framework para Java?", "React", "Spring", "Django",
                                                "Laravel", 2),
                                new Pregunta("¿Qué es el testing unitario?", "Probar todo el software",
                                                "Probar componentes individuales", "Probar la interfaz",
                                                "Probar la base de datos", 2),
                                new Pregunta("¿Qué herramienta se usa comúnmente para testing en Java?", "JUnit",
                                                "Selenium", "Postman", "Jenkins", 1),
                                new Pregunta("¿Qué es Maven?", "Un IDE", "Gestor de proyectos y dependencias",
                                                "Un lenguaje de programación", "Un servidor web", 2),
                                new Pregunta("¿Qué archivo configura las dependencias en Maven?", "pom.xml",
                                                "build.gradle", "package.json", "requirements.txt", 1),
                                new Pregunta("¿Qué es Scrum?", "Un lenguaje de programación", "Una metodología ágil",
                                                "Un IDE", "Un framework", 2),
                                new Pregunta("¿Cuál es el rol del Scrum Master?", "Programar código",
                                                "Facilitar el proceso Scrum", "Diseñar la interfaz",
                                                "Gestionar la base de datos", 2),
                                new Pregunta("¿Qué es la integración continua?", "Una base de datos",
                                                "Integrar cambios frecuentemente", "Un lenguaje de scripting",
                                                "Un servidor de aplicaciones", 2),
                                new Pregunta("¿Qué herramienta se usa para integración continua?", "Git", "Jenkins",
                                                "Eclipse", "Maven", 2),
                                new Pregunta("¿Qué es Docker?", "Un IDE", "Plataforma basada en contenedores",
                                                "Un control de versiones", "Un framework web", 2))));

                // -------------------------
                // DIGITALIZACIÓN
                // -------------------------
                banco.put("digitalizacion", new ArrayList<>(List.of(
                                new Pregunta("¿Qué es la transformación digital?", "Pasar todos los archivos a PDF",
                                                "Integrar tecnología en todas las áreas de una empresa",
                                                "Comprar ordenadores nuevos", "Usar redes sociales para publicidad", 2),
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
                                new Pregunta("¿Qué tecnología usan las criptomonedas?", "Inteligencia Artificial",
                                                "Machine Learning", "Blockchain", "5G", 3),
                                new Pregunta("¿Qué protege redes y sistemas de ciberataques?", "Ciberseguridad",
                                                "Cybermarketing", "SEO", "Software Open Source", 1),
                                new Pregunta("¿Qué identidad virtual recopila nuestros rastros online?", "IP estática",
                                                "Huella digital", "Avatar", "Cookies", 2),
                                new Pregunta("¿Qué es el E-commerce?", "Enviar correos electrónicos comerciales",
                                                "Aprender economía por internet",
                                                "Compra y venta de productos o servicios a través de internet",
                                                "Bancos que solo tienen cajeros", 3),
                                new Pregunta("¿Qué significa SEO?", "Search Engine Optimization",
                                                "System Electronic Output", "Secure Enterprise Operations",
                                                "Software Execution Order", 1),
                                new Pregunta("¿Qué es la 'Brecha Digital'?", "Un virus que rompe el sistema operativo",
                                                "Desigualdad en el acceso y uso de las TIC",
                                                "Espacio entre dos monitores", "Avería física en un cable de red", 2),
                                new Pregunta("¿Qué tecnología simula la inteligencia humana?", "Realidad Virtual (VR)",
                                                "Inteligencia Artificial (IA)", "Internet de las Cosas (IoT)",
                                                "Realidad Aumentada (AR)", 2),
                                new Pregunta("¿Qué es el phishing?", "Un juego de pesca en línea",
                                                "Técnica para mejorar la velocidad de internet",
                                                "Suplantación de identidad para robar datos confidenciales",
                                                "Un tipo de filtro para fotografías", 3),
                                new Pregunta("¿Por qué destaca la Industria 4.0?", "Uso de energía de vapor",
                                                "Producción en cadena automatizada clásica",
                                                "Sistemas ciberfísicos, IoT e IA en la industria",
                                                "Invención de la bombilla", 3),
                                new Pregunta("¿Cuál es la mayor ventaja del teletrabajo?",
                                                "Exige comprar equipo más caro",
                                                "Flexibilidad geográfica y de horarios",
                                                "Reduce los sueldos a la mitad",
                                                "Elimina la necesidad de usar internet", 2),
                                new Pregunta("¿Qué tecnología superpone objetos virtuales al mundo real?",
                                                "Realidad Virtual (VR)",
                                                "Realidad Aumentada (AR)", "Metaverso", "Cloud Computing", 2))));

                // -------------------------
                // LENGUAJE DE MARCA
                // -------------------------
                banco.put("lenguaje de marca", new ArrayList<>(List.of(
                                new Pregunta("¿Qué significa HTML?", "Hyper Terminal Markup Language",
                                                "HyperText Markup Language",
                                                "High Transfer Machine Language", "Hyperlink Text Management Language",
                                                2),
                                new Pregunta("¿Cuál de estas etiquetas define el título de un documento HTML?",
                                                "<head>", "<meta>", "<title>", "<h1>", 3),
                                new Pregunta("¿Qué lenguaje se usa para dar estilo a las páginas web?", "HTML",
                                                "JavaScript", "XML", "CSS", 4),
                                new Pregunta("¿Qué significa XML?", "eXtensible Markup Language", "Extra Modern Link",
                                                "eXecutable Multiple Language", "X-Markup Language", 1),
                                new Pregunta("¿Cuál es la etiqueta correcta para insertar una imagen?",
                                                "<image src='img.jpg'>", "<img href='img.jpg'>", "<img src='img.jpg'>",
                                                "<pic src='img.jpg'>", 3),
                                new Pregunta("¿Qué etiqueta se usa para crear un enlace (hipervínculo)?", "<link>",
                                                "<a>", "<href>", "<url>", 2),
                                new Pregunta("En HTML5, ¿qué etiqueta se usa para reproducir contenido de video?",
                                                "<media>", "<movie>", "<video>", "<mp4>", 3),
                                new Pregunta("¿Qué significa JSON?", "Java Standard Output Network",
                                                "JavaScript Object Notation", "JavaScript Oriented Network",
                                                "Java Serialized Object Node", 2),
                                new Pregunta("¿Cuál es la estructura básica de una tabla?", "<table>, <tr>, <td>",
                                                "<table>, <row>, <cell>", "<tab>, <tr>, <td>",
                                                "<table>, <head>, <body>", 1),
                                new Pregunta("¿Qué atributo HTML se usa para definir estilos en línea?", "class",
                                                "font", "style", "styles", 3),
                                new Pregunta("Cuál de estos NO es un lenguaje de marcado?", "HTML", "XML", "Markdown",
                                                "Python", 4),
                                new Pregunta("¿Qué etiqueta HTML5 se usa para contenido principal?", "<main>",
                                                "<content>", "<section>", "<body>", 1),
                                new Pregunta("¿Qué lenguaje se usa para archivos de configuración simples?", "YAML",
                                                "C++", "Java", "PHP", 1),
                                new Pregunta("¿Qué versión de HTML introdujo elementos semánticos como <article> y <nav>?",
                                                "HTML 3.2", "HTML 4.01", "XHTML", "HTML5", 4),
                                new Pregunta("¿Qué atributo se usa en <img> para texto alternativo?", "title", "src",
                                                "alt", "description", 3))));

                // -------------------------
                // PROGRAMACIÓN
                // -------------------------
                banco.put("programacion", new ArrayList<>(List.of(
                                new Pregunta("¿Qué es una variable?", "Un valor fijo", "Un contenedor de datos",
                                                "Un tipo de bucle", "Una función", 2),
                                new Pregunta("¿Qué es un bucle for?", "Una condición", "Un ciclo que se repite",
                                                "Un tipo de variable", "Una función", 2),
                                new Pregunta("¿Qué es un array?", "Una función", "Un conjunto de datos del mismo tipo",
                                                "Un bucle", "Una variable especial", 2),
                                new Pregunta("¿Qué es recursión?", "Una función que se llama a sí misma",
                                                "Un bucle for", "Una variable global", "Un array", 1),
                                new Pregunta("¿Qué es un algoritmo?", "Un paso para ejecutar un programa",
                                                "Una estructura de datos", "Un lenguaje de programación", "Un IDE", 1),
                                new Pregunta("¿Qué lenguaje se usa para desarrollo web?", "Python", "Java",
                                                "JavaScript", "C++", 3),
                                new Pregunta("¿Qué es POO?", "Programación orientada a objetos", "Proceso operativo",
                                                "Propiedad de objeto", "Prueba de operación", 1),
                                new Pregunta("¿Qué es GitHub?", "Un compilador", "Un control de versiones remoto",
                                                "Un IDE", "Un lenguaje", 2),
                                new Pregunta("¿Qué es un constructor?", "Una función especial de una clase", "Un bucle",
                                                "Una variable", "Un array", 1),
                                new Pregunta("¿Qué es una interfaz?", "Una función", "Un contrato que define métodos",
                                                "Un IDE", "Un bucle", 2),
                                new Pregunta("¿Qué es encapsulación?", "Ocultar datos internos de una clase",
                                                "Un tipo de bucle", "Un array", "Un IDE", 1),
                                new Pregunta("¿Qué es herencia?", "Copiar un código",
                                                "Permitir reutilización de clases", "Crear un IDE", "Un array", 2),
                                new Pregunta("¿Qué es polimorfismo?",
                                                "Un método que cambia de comportamiento según contexto", "Una variable",
                                                "Un array", "Un IDE", 1),
                                new Pregunta("¿Qué es un IDE?", "Un compilador", "Un entorno de desarrollo",
                                                "Un lenguaje", "Un servidor", 2),
                                new Pregunta("¿Qué es debugging?", "Escribir código", "Probar y corregir errores",
                                                "Compilar", "Instalar", 2))));

                // -------------------------
                // SISTEMAS
                // -------------------------
                banco.put("sistemas", new ArrayList<>(List.of(
                                new Pregunta("¿Qué es un sistema operativo?", "Un programa que administra hardware",
                                                "Un lenguaje de programación", "Una base de datos", "Un compilador", 1),
                                new Pregunta("¿Qué es Linux?", "Un sistema operativo", "Un IDE", "Un lenguaje",
                                                "Un servidor web", 1),
                                new Pregunta("¿Qué es Windows?", "Un IDE", "Un sistema operativo", "Un lenguaje",
                                                "Una base de datos", 2),
                                new Pregunta("¿Qué es un kernel?", "Núcleo del sistema operativo", "Una variable",
                                                "Un array", "Un IDE", 1),
                                new Pregunta("¿Qué es la memoria RAM?", "Memoria de solo lectura",
                                                "Memoria volátil de acceso rápido",
                                                "Un disco duro", "Una variable", 2),
                                new Pregunta("¿Qué es un servidor?", "Un programa o máquina que provee servicios",
                                                "Un lenguaje", "Un IDE", "Una base de datos", 1),
                                new Pregunta("¿Qué es un proceso?", "Un programa en ejecución", "Un archivo",
                                                "Un bucle", "Una variable", 1),
                                new Pregunta("¿Qué es un driver?", "Controlador de hardware", "Una variable",
                                                "Un array", "Un IDE", 1),
                                new Pregunta("¿Qué es una base de datos?", "Un lenguaje", "Un compilador",
                                                "Colección organizada de datos", "Un IDE", 3),
                                new Pregunta("¿Qué es un firewall?", "Un antivirus",
                                                "Un programa para filtrar tráfico de red",
                                                "Un IDE", "Una variable", 2),
                                new Pregunta("¿Qué es virtualización?", "Crear máquinas virtuales", "Instalar Linux",
                                                "Actualizar Windows", "Programar en Java", 1),
                                new Pregunta("¿Qué es RAID?", "Redundant Array of Independent Disks", "Un lenguaje",
                                                "Un IDE", "Un servidor", 1),
                                new Pregunta("¿Qué es TCP/IP?", "Protocolo de red", "Un IDE", "Un lenguaje",
                                                "Una base de datos", 1),
                                new Pregunta("¿Qué es DNS?", "Direct Name Service", "Domain Name System",
                                                "Data Network Server", "Dynamic Name System", 2),
                                new Pregunta("¿Qué es un switch?", "Un tipo de software", "Un hardware de red",
                                                "Un lenguaje", "Un IDE", 2))));

                // -------------------------
                // SOSTENIBILIDAD
                // -------------------------
                banco.put("sostenibilidad", new ArrayList<>(List.of(
                                new Pregunta("¿Qué es la sostenibilidad?",
                                                "Uso racional de recursos para el presente y futuro",
                                                "Gastar recursos sin límite", "Invertir solo en tecnología",
                                                "Usar energía eléctrica", 1),
                                new Pregunta("¿Qué es la huella de carbono?", "Cantidad de CO2 emitida",
                                                "Un archivo de datos", "Un servidor web", "Un lenguaje", 1),
                                new Pregunta("¿Qué es reciclaje?", "Separar y procesar residuos para reusarlos",
                                                "Usar más plástico", "Eliminar residuos quemándolos",
                                                "Comprar nuevos materiales", 1),
                                new Pregunta("¿Qué es economía circular?", "Reutilización y reducción de recursos",
                                                "Comprar más productos", "Gastar energía innecesaria",
                                                "Un sistema operativo", 1),
                                new Pregunta("¿Qué son energías renovables?", "Fuentes de energía que se regeneran",
                                                "Combustibles fósiles", "Un tipo de IDE", "Una base de datos", 1),
                                new Pregunta("¿Qué es eficiencia energética?", "Uso eficiente de energía",
                                                "Mal uso de electricidad", "Instalar más luces", "Comprar energía", 1),
                                new Pregunta("¿Qué es cambio climático?", "Alteración del clima por actividad humana",
                                                "El cambio de estación", "Un lenguaje", "Un IDE", 1),
                                new Pregunta("¿Qué es movilidad sostenible?",
                                                "Transportes y vehículos amigables con el medio ambiente",
                                                "Solo coches eléctricos", "Solo transporte público",
                                                "Uso de combustibles fósiles", 1),
                                new Pregunta("¿Qué es responsabilidad social?",
                                                "Compromiso con la comunidad y el medio ambiente",
                                                "Solo beneficios económicos", "Ignorar leyes", "Invertir en tecnología",
                                                1),
                                new Pregunta("¿Qué es contaminación?", "Alteración del entorno natural con residuos",
                                                "Un idioma", "Un programa", "Un IDE", 1),
                                new Pregunta("¿Qué es biodiversidad?", "Variedad de seres vivos en un ecosistema",
                                                "Cantidad de árboles", "Cantidad de animales", "Solo humanos", 1),
                                new Pregunta("¿Qué es energías limpias?", "Energía que no contamina",
                                                "Combustibles fósiles", "Energía nuclear", "Carbón", 1),
                                new Pregunta("¿Qué es ecoeficiencia?",
                                                "Optimización de recursos y procesos con bajo impacto ambiental",
                                                "Gastar más energía", "Usar más plástico", "Comprar más materiales", 1),
                                new Pregunta("¿Qué es el desarrollo sostenible?",
                                                "Satisfacer necesidades presentes sin comprometer futuras",
                                                "Invertir en tecnología", "Ignorar recursos naturales",
                                                "Aumentar consumo energético", 1),
                                new Pregunta("¿Qué es huella hídrica?",
                                                "Cantidad de agua utilizada para producir bienes o servicios",
                                                "Cantidad de CO2", "Cantidad de basura", "Cantidad de energía", 1))));
        }

        // -------------------------
        // MÉTODOS GET
        // -------------------------
        public static List<Pregunta> getPreguntasPorCategoria(String categoria) {
                if (categoria == null)
                        return Collections.emptyList();
                String clave = categoria.trim().toLowerCase();
                return banco.getOrDefault(clave, Collections.emptyList());
        }

        public static List<Pregunta> getAllPreguntas() {
                List<Pregunta> todas = new ArrayList<>();
                banco.values().forEach(todas::addAll);
                return todas;
        }

        public static List<Pregunta> getPreguntasEntornos() {
                return getPreguntasPorCategoria("entornos");
        }

        public static List<Pregunta> getPreguntasDigitalizacion() {
                return getPreguntasPorCategoria("digitalizacion");
        }

        public static List<Pregunta> getPreguntasLenguajeDeMarca() {
                return getPreguntasPorCategoria("lenguaje de marca");
        }

        public static List<Pregunta> getPreguntasProgramacion() {
                return getPreguntasPorCategoria("programacion");
        }

        public static List<Pregunta> getPreguntasSistemas() {
                return getPreguntasPorCategoria("sistemas");
        }

        public static List<Pregunta> getPreguntasSostenibilidad() {
                return getPreguntasPorCategoria("sostenibilidad");
        }
}