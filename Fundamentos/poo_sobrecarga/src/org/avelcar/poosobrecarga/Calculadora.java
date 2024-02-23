package org.avelcar.poosobrecarga;

public class Calculadora {

    public static int sumar(int a, int b){
        return a + b;
    }

    public static int sumar(int... argumentos){
        int resultado = 0;
        for(int arg:argumentos){
            resultado += arg;
        }
        return resultado;
    }

    public static float sumar(float a, float b){
        return a + b;
    }

    public static float sumar(int i, float j){
        return i + j;
    }

    public static float sumar(float i, int j){
        return i + j;
    }

    public static double sumar(double a, double b){
        return a + b;
    }

    public static int sumar(String a, String b){
        int resultado;
        try{
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch(NumberFormatException e){
            resultado = 0;
        }
        return resultado;
    }
}
