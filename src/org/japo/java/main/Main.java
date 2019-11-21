/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Variables
        boolean aprobado = false;
        double nota;

        //Bucle de comprobacion
        do {
            try {

                //Pedir dato
                System.out.println("El alumno ha APROBADO con ...: ");
                nota = SCN.nextDouble();

                //Comprobar la nota
                if (nota >= 5.0) {
                    aprobado = true;
                } else {
                    System.out.println("Esta nota no es válida");
                }

            } catch (Exception e) {

                //Mensaje de error
                System.out.println("Esto no es un número real");

            } finally {

                SCN.nextLine();
            }

        } while (!aprobado);
    }//main

}//class
