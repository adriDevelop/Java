package org.avelcar.poo.clases.abstractas.form;

import org.avelcar.poo.clases.abstractas.form.elementos.ElementoForm;
import org.avelcar.poo.clases.abstractas.form.elementos.InputForm;
import org.avelcar.poo.clases.abstractas.form.elementos.SelectForm;
import org.avelcar.poo.clases.abstractas.form.elementos.TextAreaForm;
import org.avelcar.poo.clases.abstractas.form.elementos.select.Opcion;
import org.avelcar.poo.clases.abstractas.form.validador.*;

import java.util.ArrayList;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username", "text");
        username.addValidador(new RequeridoValidador());
        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6, 12));
        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());
        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        Opcion java = new Opcion("1","Java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2","Python"));
        lenguaje.addOpcion(new Opcion("3","JavaScript"));
        lenguaje.addOpcion(new Opcion("4","TypeScript"));
        lenguaje.addOpcion(new Opcion("5","PHP"));

        username.setValor("");
        password.setValor("a1b2c");
        email.setValor("velascoad@gmail.com");
        edad.setValor("23");
        experiencia.setValor("sin experiencia");
        java.setSelected(true);

        List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);

        for (ElementoForm e: elementos){
            System.out.println(e.dibujarHtml());
        }

        for (ElementoForm e: elementos){
            if (!e.esValido()){
                System.out.println(e.getErrores());
            }
        }

    }
}
