package com.iesam.nissan.presentacion;

import com.iesam.nissan.domain.models.*;
import com.iesam.nissan.domain.usecase.AniadirAccesorioUseCase;
import com.iesam.nissan.domain.usecase.AniadirChasisUseCase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer num=null;
        String rueda1 = null,rueda2=null,rueda3=null,rueda4=null;
        String motor1=null,motor2=null,motor3=null,motor4=null;
        String cuadrodeMando1=null,cuadrodeMando2=null,cuadrodeMando3=null,cuadrodeMando4=null;

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
        do{
            ruedaA.setCodigoAccesorio("1");
            ruedaA.setMarca("Michelin");
            ruedaA.setModeloAccesorio("Alpin 6");
            ruedaA.setDiametro(185);
            System.out.println("Quieres modificar la rueda o dejar la que estaba");
            System.out.println("Si deseas crear una rueda nueva dale a 1");
            System.out.println("Si deseas continuar con la rueda acual dale a 2 "+ruedaA.getCodigoAccesorio()+":"+ruedaA.getMarca()+":"+ruedaA.getModeloAccesorio()+":"+ruedaA.getDiametro());
            num = sc.nextInt();
            if(num==1){
                System.out.println("Introduce la marca de la nueva rueda:");
                ruedaA.setMarca(sc.next());
                System.out.println("Introduce el modelo de la rueda:");
                ruedaA.setModeloAccesorio(sc.next());
                System.out.println("Introduce el diametro de la rueda:");
                ruedaA.setDiametro(sc.nextInt());
            } else if (num==2) {
                num=1;
            }
        }while (num!=1);



        AniadirAccesorioUseCase aniadirAccesorioUseCase = new AniadirAccesorioUseCase();
        //    aniadirAccesorioUseCase.execute(ruedaA);

        Rueda ruedaB = new Rueda();
        do{
            ruedaB.setCodigoAccesorio("2");
            ruedaB.setMarca("Firestone");
            ruedaB.setModeloAccesorio("WinterHawk");
            ruedaB.setDiametro(205);
        System.out.println("Quieres modificar la rueda o dejar la que estaba");
        System.out.println("Si deseas crear una rueda nueva dale a 1");
        System.out.println("Si deseas continuar con la rueda acual dale a 2 "+ruedaB.getCodigoAccesorio()+":"+ruedaB.getMarca()+":"+ruedaB.getModeloAccesorio()+":"+ruedaB.getDiametro());
        num = sc.nextInt();
        if(num==1){
            System.out.println("Introduce la marca de la nueva rueda:");
            ruedaB.setMarca(sc.next());
            System.out.println("Introduce el modelo de la rueda:");
            ruedaB.setModeloAccesorio(sc.next());
            System.out.println("Introduce el diametro de la rueda:");
            ruedaB.setDiametro(sc.nextInt());
        } else if (num==2) {
            num=1;
        }
    }while (num!=1);

         //  aniadirAccesorioUseCase.execute(ruedaB);

        Motor motorA = new Motor();
        do{
            motorA.setCodigoAccesorio("1");
            motorA.setModeloAccesorio("X6000");
            motorA.setCilindrada(2.0);
            motorA.setCaballos(120);
        System.out.println("Quieres modificar el motor o dejar la que estaba");
        System.out.println("Si deseas crear el motor nuevo dale a 1");
        System.out.println("Si deseas continuar con el motor acual dale a 2 "+motorA.getCodigoAccesorio()+":"+motorA.getModeloAccesorio()+":"+motorA.getCilindrada()+":"+motorA.getCaballos());
        num = sc.nextInt();
        if(num==1){
            System.out.println("Introduce el modelo del motor:");
            motorA.setModeloAccesorio(sc.next());
            System.out.println("Introduce la cilindrada del motor:");
            motorA.setCilindrada(sc.nextDouble());
            System.out.println("Introduce los caballos del motor:");
            motorA.setCaballos(sc.nextInt());
        } else if (num==2) {
            num=1;
        }
    }while (num!=1);
       //   aniadirAccesorioUseCase.execute(motorA);

        Motor motorB = new Motor();
        do{
            motorB.setCodigoAccesorio("2");
            motorB.setModeloAccesorio("X9000");
            motorB.setCilindrada(2.4);
            motorB.setCaballos(160);
        System.out.println("Quieres modificar el motor o dejar la que estaba");
        System.out.println("Si deseas crear el motor nuevo dale a 1");
        System.out.println("Si deseas continuar con el motor acual dale a 2 "+motorB.getCodigoAccesorio()+":"+motorB.getModeloAccesorio()+":"+motorB.getCilindrada()+":"+motorB.getCaballos());
        num = sc.nextInt();
        if(num==1){
            System.out.println("Introduce el modelo del motor:");
            motorB.setModeloAccesorio(sc.next());
            System.out.println("Introduce la cilindrada del motor:");
            motorB.setCilindrada(sc.nextDouble());
            System.out.println("Introduce los caballos del motor:");
            motorB.setCaballos(sc.nextInt());
        } else if (num==2) {
            num=1;
        }
    }while (num!=1);
       //   aniadirAccesorioUseCase.execute(motorB);

        CuadroDeMandos cuadroDeMandosA = new CuadroDeMandos();
            cuadroDeMandosA.setCodigoAccesorio("1");
            cuadroDeMandosA.setModeloAccesorio("LM2000");
            do{
        System.out.println("Quieres modificar el cuadro de mandos o dejar la que estaba");
        System.out.println("Si deseas crear un cuadro de mandos nuevo dale a 1");
        System.out.println("Si deseas continuar con el cuadro de mandos acual dale a 2 "+cuadroDeMandosA.getCodigoAccesorio()+":"+cuadroDeMandosA.getModeloAccesorio());
        num = sc.nextInt();
        if(num==1){

            System.out.println("Introduce el modelo del cuadro de mandos:");
            cuadroDeMandosA.setModeloAccesorio(sc.next());

        } else if (num==2) {
            num=1;
        }
    }while (num!=1);
           aniadirAccesorioUseCase.execute(cuadroDeMandosA);

        CuadroDeMandos cuadroDeMandosB = new CuadroDeMandos();
            cuadroDeMandosB.setCodigoAccesorio("1");
            cuadroDeMandosB.setModeloAccesorio("LM6000");
        do{
            System.out.println("Quieres modificar el cuadro de mandos o dejar la que estaba");
            System.out.println("Si deseas crear un cuadro de mandos nuevo dale a 1");
            System.out.println("Si deseas continuar con el cuadro de mandos acual dale a 2 "+cuadroDeMandosB.getCodigoAccesorio()+":"+cuadroDeMandosB.getModeloAccesorio());
            num = sc.nextInt();
            if(num==1){

                System.out.println("Introduce el modelo del cuadro de mandos:");
                cuadroDeMandosB.setModeloAccesorio(sc.next());

            } else if (num==2) {
                num=1;
            }
        }while (num!=1);
         //1
        // aniadirAccesorioUseCase.execute(cuadroDeMandosB);

        ///Crear el chasis 1
            System.out.println("Que compoenetes quieres que tenga el Chasis1");
            do{
                System.out.println("¿Que ruedas se van ha montar en este chasis?");
                System.out.println("Las ruedas son...");
                System.out.println("Presiona el numero 1 para elegir la siguiente rueda "+ruedaA.getCodigoAccesorio()+":"+ruedaA.getMarca()+":"+ruedaA.getModeloAccesorio()+":"+ruedaA.getDiametro());
                System.out.println("Presiona el numero 2 para elegir la siguiente rueda "+ruedaB.getCodigoAccesorio()+":"+ruedaB.getMarca()+":"+ruedaB.getModeloAccesorio()+":"+ruedaB.getDiametro());
                num = sc.nextInt();
                if(num==1){
                    rueda1= ruedaA.getCodigoAccesorio()+":"+ruedaA.getModeloAccesorio();
                    num=1;
                } else if (num==2) {
                    rueda1= ruedaB.getCodigoAccesorio()+":"+ruedaB.getModeloAccesorio();
                    num=1;
                }
            }while(num!=1);

        do{
            System.out.println("¿Que motor se van ha montar en este chasis?");
            System.out.println("Los motores son...");
            System.out.println("Presiona el numero 1 para elegir el siguiente motor "+motorA.getCodigoAccesorio()+":"+motorA.getModeloAccesorio()+":"+motorA.getCilindrada()+":"+motorA.getCaballos());
            System.out.println("Presiona el numero 2 para elegir el siguiente motor "+motorB.getCodigoAccesorio()+":"+motorB.getModeloAccesorio()+":"+motorB.getCilindrada()+":"+motorB.getCaballos());
            num = sc.nextInt();
            if(num==1){
                motor1= motorA.getCodigoAccesorio()+":"+motorA.getModeloAccesorio();
                num=1;
            } else if (num==2) {
                motor1= motorB.getCodigoAccesorio()+":"+motorB.getModeloAccesorio();
                num=1;
            }
        }while(num!=1);
        do{
            System.out.println("¿Que cuadro de mandos se van ha montar en este chasis?");
            System.out.println("Lcuadros de mando son son...");
            System.out.println("Presiona el numero 1 para elegir el siguiente cuadro de mandos "+cuadroDeMandosA.getCodigoAccesorio()+":"+cuadroDeMandosA.getModeloAccesorio());
            System.out.println("Presiona el numero 2 para elegir el siguiente cuadro de mandos "+cuadroDeMandosB.getCodigoAccesorio()+":"+cuadroDeMandosB.getModeloAccesorio());
            num = sc.nextInt();
            if(num==1){
                cuadrodeMando1= cuadroDeMandosA.getCodigoAccesorio()+":"+cuadroDeMandosA.getModeloAccesorio();
                num=1;
            } else if (num==2) {
                cuadrodeMando1= cuadroDeMandosB.getCodigoAccesorio()+":"+cuadroDeMandosB.getModeloAccesorio();
                num=1;
            }
        }while(num!=1);


///Crear el chasis 2
        System.out.println("Que compoenetes quieres que tenga el Chasis1");
        do{
            System.out.println("¿Que ruedas se van ha montar en este chasis?");
            System.out.println("Las ruedas son...");
            System.out.println("Presiona el numero 1 para elegir la siguiente rueda "+ruedaA.getCodigoAccesorio()+":"+ruedaA.getMarca()+":"+ruedaA.getModeloAccesorio()+":"+ruedaA.getDiametro());
            System.out.println("Presiona el numero 2 para elegir la siguiente rueda "+ruedaB.getCodigoAccesorio()+":"+ruedaB.getMarca()+":"+ruedaB.getModeloAccesorio()+":"+ruedaB.getDiametro());
            num = sc.nextInt();
            if(num==1){
                rueda2= ruedaA.getCodigoAccesorio()+":"+ruedaA.getModeloAccesorio();
                num=1;
            } else if (num==2) {
                rueda2= ruedaB.getCodigoAccesorio()+":"+ruedaB.getModeloAccesorio();
                num=1;
            }
        }while(num!=1);

        do{
            System.out.println("¿Que motor se van ha montar en este chasis?");
            System.out.println("Los motores son...");
            System.out.println("Presiona el numero 1 para elegir el siguiente motor "+motorA.getCodigoAccesorio()+":"+motorA.getModeloAccesorio()+":"+motorA.getCilindrada()+":"+motorA.getCaballos());
            System.out.println("Presiona el numero 2 para elegir el siguiente motor "+motorB.getCodigoAccesorio()+":"+motorB.getModeloAccesorio()+":"+motorB.getCilindrada()+":"+motorB.getCaballos());
            num = sc.nextInt();
            if(num==1){
                motor2= motorA.getCodigoAccesorio()+":"+motorA.getModeloAccesorio();
                num=1;
            } else if (num==2) {
                motor2= motorB.getCodigoAccesorio()+":"+motorB.getModeloAccesorio();
                num=1;
            }
        }while(num!=1);
        do{
            System.out.println("¿Que cuadro de mandos se van ha montar en este chasis?");
            System.out.println("Lcuadros de mando son son...");
            System.out.println("Presiona el numero 1 para elegir el siguiente cuadro de mandos "+cuadroDeMandosA.getCodigoAccesorio()+":"+cuadroDeMandosA.getModeloAccesorio());
            System.out.println("Presiona el numero 2 para elegir el siguiente cuadro de mandos "+cuadroDeMandosB.getCodigoAccesorio()+":"+cuadroDeMandosB.getModeloAccesorio());
            num = sc.nextInt();
            if(num==1){
                cuadrodeMando2= cuadroDeMandosA.getCodigoAccesorio()+":"+cuadroDeMandosA.getModeloAccesorio();
                num=1;
            } else if (num==2) {
                cuadrodeMando2= cuadroDeMandosB.getCodigoAccesorio()+":"+cuadroDeMandosB.getModeloAccesorio();
                num=1;
            }
        }while(num!=1);

        ///Crear el chasis 3
        System.out.println("Que compoenetes quieres que tenga el Chasis1");
        do{
            System.out.println("¿Que ruedas se van ha montar en este chasis?");
            System.out.println("Las ruedas son...");
            System.out.println("Presiona el numero 1 para elegir la siguiente rueda "+ruedaA.getCodigoAccesorio()+":"+ruedaA.getMarca()+":"+ruedaA.getModeloAccesorio()+":"+ruedaA.getDiametro());
            System.out.println("Presiona el numero 2 para elegir la siguiente rueda "+ruedaB.getCodigoAccesorio()+":"+ruedaB.getMarca()+":"+ruedaB.getModeloAccesorio()+":"+ruedaB.getDiametro());
            num = sc.nextInt();
            if(num==1){
                rueda3= ruedaA.getCodigoAccesorio()+":"+ruedaA.getModeloAccesorio();
                num=1;
            } else if (num==2) {
                rueda3= ruedaB.getCodigoAccesorio()+":"+ruedaB.getModeloAccesorio();
                num=1;
            }
        }while(num!=1);

        do{
            System.out.println("¿Que motor se van ha montar en este chasis?");
            System.out.println("Los motores son...");
            System.out.println("Presiona el numero 1 para elegir el siguiente motor "+motorA.getCodigoAccesorio()+":"+motorA.getModeloAccesorio()+":"+motorA.getCilindrada()+":"+motorA.getCaballos());
            System.out.println("Presiona el numero 2 para elegir el siguiente motor "+motorB.getCodigoAccesorio()+":"+motorB.getModeloAccesorio()+":"+motorB.getCilindrada()+":"+motorB.getCaballos());
            num = sc.nextInt();
            if(num==1){
                motor3= motorA.getCodigoAccesorio()+":"+motorA.getModeloAccesorio();
                num=1;
            } else if (num==2) {
                motor3= motorB.getCodigoAccesorio()+":"+motorB.getModeloAccesorio();
                num=1;
            }
        }while(num!=1);
        do{
            System.out.println("¿Que cuadro de mandos se van ha montar en este chasis?");
            System.out.println("Lcuadros de mando son son...");
            System.out.println("Presiona el numero 1 para elegir el siguiente cuadro de mandos "+cuadroDeMandosA.getCodigoAccesorio()+":"+cuadroDeMandosA.getModeloAccesorio());
            System.out.println("Presiona el numero 2 para elegir el siguiente cuadro de mandos "+cuadroDeMandosB.getCodigoAccesorio()+":"+cuadroDeMandosB.getModeloAccesorio());
            num = sc.nextInt();
            if(num==1){
                cuadrodeMando3= cuadroDeMandosA.getCodigoAccesorio()+":"+cuadroDeMandosA.getModeloAccesorio();
                num=1;
            } else if (num==2) {
                cuadrodeMando3= cuadroDeMandosB.getCodigoAccesorio()+":"+cuadroDeMandosB.getModeloAccesorio();
                num=1;
            }
        }while(num!=1);

        ///Crear el chasis 4
        System.out.println("Que compoenetes quieres que tenga el Chasis1");
        do{
            System.out.println("¿Que ruedas se van ha montar en este chasis?");
            System.out.println("Las ruedas son...");
            System.out.println("Presiona el numero 1 para elegir la siguiente rueda "+ruedaA.getCodigoAccesorio()+":"+ruedaA.getMarca()+":"+ruedaA.getModeloAccesorio()+":"+ruedaA.getDiametro());
            System.out.println("Presiona el numero 2 para elegir la siguiente rueda "+ruedaB.getCodigoAccesorio()+":"+ruedaB.getMarca()+":"+ruedaB.getModeloAccesorio()+":"+ruedaB.getDiametro());
            num = sc.nextInt();
            if(num==1){
                rueda4= ruedaA.getCodigoAccesorio()+":"+ruedaA.getModeloAccesorio();
                num=1;
            } else if (num==2) {
                rueda4= ruedaB.getCodigoAccesorio()+":"+ruedaB.getModeloAccesorio();
                num=1;
            }
        }while(num!=1);

        do{
            System.out.println("¿Que motor se van ha montar en este chasis?");
            System.out.println("Los motores son...");
            System.out.println("Presiona el numero 1 para elegir el siguiente motor "+motorA.getCodigoAccesorio()+":"+motorA.getModeloAccesorio()+":"+motorA.getCilindrada()+":"+motorA.getCaballos());
            System.out.println("Presiona el numero 2 para elegir el siguiente motor "+motorB.getCodigoAccesorio()+":"+motorB.getModeloAccesorio()+":"+motorB.getCilindrada()+":"+motorB.getCaballos());
            num = sc.nextInt();
            if(num==1){
                motor4= motorA.getCodigoAccesorio()+":"+motorA.getModeloAccesorio();
                num=1;
            } else if (num==2) {
                motor4= motorB.getCodigoAccesorio()+":"+motorB.getModeloAccesorio();
                num=1;
            }
        }while(num!=1);
        do{
            System.out.println("¿Que cuadro de mandos se van ha montar en este chasis?");
            System.out.println("Lcuadros de mando son son...");
            System.out.println("Presiona el numero 1 para elegir el siguiente cuadro de mandos "+cuadroDeMandosA.getCodigoAccesorio()+":"+cuadroDeMandosA.getModeloAccesorio());
            System.out.println("Presiona el numero 2 para elegir el siguiente cuadro de mandos "+cuadroDeMandosB.getCodigoAccesorio()+":"+cuadroDeMandosB.getModeloAccesorio());
            num = sc.nextInt();
            if(num==1){
                cuadrodeMando4= cuadroDeMandosA.getCodigoAccesorio()+":"+cuadroDeMandosA.getModeloAccesorio();
                num=1;
            } else if (num==2) {
                cuadrodeMando4= cuadroDeMandosB.getCodigoAccesorio()+":"+cuadroDeMandosB.getModeloAccesorio();
                num=1;
            }
        }while(num!=1);


        System.out.println("MENU");
        System.out.println("----");

        System.out.println("- Chasis " + chasis1.getCodBastidor() +": Lleva montado Rueda " + rueda1 + ", Motor "
                + motor1 + " y Cuadro de Mando" + cuadrodeMando1);

        System.out.println("- Chasis " + chasis2.getCodBastidor() + ": Lleva montado Rueda" + rueda2 + ", Motor "
                + motor2 + " y Cuadro de Mando" + cuadrodeMando2);

        System.out.println("- Chasis " + chasis3.getCodBastidor() + ": Lleva montado Rueda " + rueda3 + ", Motor "
                + motor3 + " y Cuadro de Mando" + cuadrodeMando3);

        System.out.println("- Chasis " + chasis4.getCodBastidor() + ": Lleva montado Rueda " + rueda4 + ", Motor "
                + motor4 + " y Cuadro de Mando" + cuadrodeMando4);


    }
}