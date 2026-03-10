package controlador;

public class Pregunta {

    private String pregunta;

    private String opcion1;
    private String opcion2;
    private String opcion3;
    private String opcion4;

    private int correcta;

    public Pregunta(String pregunta, String opcion1, String opcion2, String opcion3, String opcion4, int correcta) {

        this.pregunta = pregunta;

        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcion4 = opcion4;

        this.correcta = correcta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getOpcion1() {
        return opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public String getOpcion4() {
        return opcion4;
    }

    public int getCorrecta() {
        return correcta;
    }
}