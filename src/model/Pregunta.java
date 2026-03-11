// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package model;

public class Pregunta {
    private String pregunta;
    private String opcion1;
    private String opcion2;
    private String opcion3;
    private String opcion4;
    private int correcta;

    public Pregunta(String var1, String var2, String var3, String var4, String var5, int var6) {
        this.pregunta = var1;
        this.opcion1 = var2;
        this.opcion2 = var3;
        this.opcion3 = var4;
        this.opcion4 = var5;
        this.correcta = var6;
    }

    public String getPregunta() {
        return this.pregunta;
    }

    public String getOpcion1() {
        return this.opcion1;
    }

    public String getOpcion2() {
        return this.opcion2;
    }

    public String getOpcion3() {
        return this.opcion3;
    }

    public String getOpcion4() {
        return this.opcion4;
    }

    public int getCorrecta() {
        return this.correcta;
    }
}
