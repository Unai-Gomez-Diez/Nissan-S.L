package com.iesam.nissan.presentacion;

import com.iesam.nissan.domain.models.*;
import com.iesam.nissan.domain.usecase.AniadirAccesorioUseCase;
import com.iesam.nissan.domain.usecase.AniadirChasisUseCase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Chasis chasis1 = new Chasis();
        System.out.println("Introduce los siguientes datos sobre el chasis1:");
            System.out.println("Introduce el codigo de bastidor:");
            chasis1.setCodBastidor(sc.next());
            System.out.println("Introduce el modelo de chasis:");
            chasis1.setModeloChasis(sc.next());
            System.out.println("Introduce la marca de chasis:");
            chasis1.setMarcaChasis(sc.next());

        AniadirChasisUseCase aniadirChasisUseCase = new AniadirChasisUseCase();
            aniadirChasisUseCase.execute(chasis1);

        Chasis chasis2 = new Chasis();
        System.out.println("Introduce los siguientes datos sobre el chasis2:");
            System.out.println("Introduce el codigo de bastidor:");
            chasis2.setCodBastidor(sc.next());
            System.out.println("Introduce el modelo de chasis:");
            chasis2.setModeloChasis(sc.next());
            System.out.println("Introduce la marca de chasis:");
            chasis2.setMarcaChasis(sc.next());

            aniadirChasisUseCase.execute(chasis2);

        Chasis chasis3 = new Chasis();
        System.out.println("Introduce los siguientes datos sobre el chasis3:");
            System.out.println("Introduce el codigo de bastidor:");
            chasis3.setCodBastidor(sc.next());
            System.out.println("Introduce el modelo de chasis:");
            chasis3.setModeloChasis(sc.next());
            System.out.println("Introduce la marca de chasis:");
            chasis3.setMarcaChasis(sc.next());

            aniadirChasisUseCase.execute(chasis3);

        Chasis chasis4 = new Chasis();
        System.out.println("Introduce los siguientes datos sobre el chasis4:");
            System.out.println("Introduce el codigo de bastidor:");
            chasis4.setCodBastidor(sc.next());
            System.out.println("Introduce el modelo de chasis:");
            chasis4.setModeloChasis(sc.next());
            System.out.println("Introduce la marca de chasis:");
            chasis4.setMarcaChasis(sc.next());

            aniadirChasisUseCase.execute(chasis4);

        Rueda ruedaA = new Rueda();
            ruedaA.setCodigoAccesorio("1");
            ruedaA.setMarca("Michelin");
            ruedaA.setModeloAccesorio("Alpin 6");
            ruedaA.setDiametro(185);

        AniadirAccesorioUseCase aniadirAccesorioUseCase = new AniadirAccesorioUseCase();
        //    aniadirAccesorioUseCase.execute(ruedaA);

        Rueda ruedaB = new Rueda();
            ruedaB.setCodigoAccesorio("2");
            ruedaB.setMarca("Firestone");
            ruedaB.setModeloAccesorio("WinterHawk");
            ruedaB.setDiametro(205);

         //  aniadirAccesorioUseCase.execute(ruedaB);

        Motor motorA = new Motor();
            motorA.setCodigoAccesorio("1");
            motorA.setModeloAccesorio("X6000");
            motorA.setCilindrada(2.0);
            motorA.setCaballos(120);

       //   aniadirAccesorioUseCase.execute(motorA);

        Motor motorB = new Motor();
            motorB.setCodigoAccesorio("2");
            motorB.setModeloAccesorio("X9000");
            motorB.setCilindrada(2.4);
            motorB.setCaballos(160);

       //   aniadirAccesorioUseCase.execute(motorB);

        CuadroDeMandos cuadroDeMandosA = new CuadroDeMandos();
            cuadroDeMandosA.setCodigoAccesorio("1");
            cuadroDeMandosA.setModeloAccesorio("LM2000");

           aniadirAccesorioUseCase.execute(cuadroDeMandosA);

        CuadroDeMandos cuadroDeMandosB = new CuadroDeMandos();
            cuadroDeMandosB.setCodigoAccesorio("1");
            cuadroDeMandosB.setModeloAccesorio("LM6000");

         //1
        // aniadirAccesorioUseCase.execute(cuadroDeMandosB);

            System.out.println("Que compoenetes quieres que tenga el Chasis1");
            System.out.println("¿Que ruedas se van ha montar en este chasis?");
            System.out.println("Las ruedas son...");
            System.out.println("Presiona el numero 1 para elegir la siguiente rueda "+ruedaA.getCodigoAccesorio()+":"+ruedaA.getMarca()+":"+ruedaA.getModeloAccesorio()+":"+ruedaA.getDiametro());
            System.out.println("Presiona el numero 2 para elegir la siguiente rueda "+ruedaB.getCodigoAccesorio()+":"+ruedaB.getMarca()+":"+ruedaB.getModeloAccesorio()+":"+ruedaB.getDiametro());
            Integer num = sc.nextInt();
            if(num==1){

        }
        System.out.println("MENU");
        System.out.println("----");

        System.out.println("- Chasis " + chasis1.getCodBastidor() +": Lleva montado Rueda " + ruedaA.getCodigoAccesorio() + ", Motor "
                + motorB.getCodigoAccesorio() + " y Cuadro de Mando" + cuadroDeMandosA.getCodigoAccesorio());

        System.out.println("- Chasis " + chasis2.getCodBastidor() + ": Lleva montado Rueda" + ruedaB.getCodigoAccesorio() + ", Motor "
                + motorB.getCodigoAccesorio() + " y Cuadro de Mando" + cuadroDeMandosB.getCodigoAccesorio());

        System.out.println("- Chasis " + chasis3.getCodBastidor() + ": Lleva montado Rueda " + ruedaA.getCodigoAccesorio() + ", Motor "
                + motorA.getCodigoAccesorio() + " y Cuadro de Mando" + cuadroDeMandosA.getCodigoAccesorio());

        System.out.println("- Chasis " + chasis4.getCodBastidor() + ": Lleva montado Rueda " + ruedaA.getCodigoAccesorio() + ", Motor "
                + motorA.getCodigoAccesorio() + " y Cuadro de Mando" + cuadroDeMandosB.getCodigoAccesorio());



    }
}