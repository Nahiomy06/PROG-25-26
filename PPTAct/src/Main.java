import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <Explicarle> void main(String[] args) {
        //Piedra Papel o Tijeras
        //(int)(Math.random() * 2) da un num del 0 al 2


//         Explicarle al jugador cómo se juega.
//         Generar la jugada aleatoria del ordenador.
//         Pedir al jugador su jugada mediante una letra (P para piedra, L para papel, T para tijeras,
//        o S para salir terminando la partida):
//         Decidir quién ha ganado.


        Scanner sc = new Scanner(System.in);
        String option = "c";


        do {
            System.out.println("Eliga Piedra, Papel o Tijeras (P para piedra, L para papel, T para tijeras) o S si quiere cerrar el juego: ");
            option = sc.nextLine().toUpperCase();
            int I = (int) Math.floor(Math.random() * 3);

            switch (option) {
                case "P":
                    int optionP = 0;
                    if (I != optionP) {
                        if (I == 0) {
                            //piedra
                            System.out.println("Piedra");
                            if (optionP == 2) {
                                System.out.println("Has ganado!!");
                            } else {
                                System.out.println("Has Perdido ;_;");
                            }
                        }
                        if (I == 1) {
                                //Papel
                                System.out.println("Papel");
                                if (optionP == 0) {
                                    System.out.println("Has ganado!!");

                                } else {
                                    System.out.println("Has Perdido ;_;");
                                }
                        }
                        if (I == 2) {

                             //Tijera
                            System.out.println("Tijeras");
                            if (optionP == 1) {
                                System.out.println("Has ganado!!");

                            } else {
                                    System.out.println("Has Perdido ;_;");
                                }
                        }

                        } else {
                            System.out.println("Es un empate!");
                        }
                        break;
                case "L":
                    int optionL = 0;
                    if (I != optionL) {
                        if (I == 0) {

                            //piedra
                            System.out.println("Piedra");
                            if (optionL == 2) {
                                System.out.println("Has ganado!!");
                            } else {
                                System.out.println("Has Perdido ;_;");
                            }
                        }
                        if (I == 1) {

                            //Papel
                            System.out.println("Papel");
                            if (optionL == 0) {
                                System.out.println("Has ganado!!");

                            } else {
                                System.out.println("Has Perdido ;_;");
                            }
                        }
                        if (I == 2) {

                            //Tijera
                            System.out.println("Tijeras");
                            if (optionL == 1) {
                                System.out.println("Has ganado!!");

                            } else {
                                System.out.println("Has Perdido ;_;");
                            }
                        }

                    } else {
                        System.out.println("Es un empate!");
                    }
                    break;
                case "T":
                    int optionT = 0;
                    if (I != optionT) {
                        if (I == 0) {
                            //piedra
                            System.out.println("Piedra");
                            if (optionT == 2) {
                                System.out.println("Has ganado!!");
                            } else {
                                System.out.println("Has Perdido ;_;");
                            }
                        }
                        if (I == 1) {
                            //Papel
                            System.out.println("Papel");
                            if (optionT == 0) {
                                System.out.println("Has ganado!!");

                            } else {
                                System.out.println("Has Perdido ;_;");
                            }
                        }
                        if (I == 2) {

                            //Tijera
                            System.out.println("Tijeras");
                            if (optionT == 1) {
                                System.out.println("Has ganado!!");

                            } else {
                                System.out.println("Has Perdido ;_;");
                            }
                        }

                    } else {
                        System.out.println("Es un empate!");
                    }
                    break;
                case "S":
                    System.out.println("El juego se cerrara:");
                    break;
                default:
                    System.out.println("Por favor elija una opcion correcta");
            }


            } while (!option.equals("S"));


        }

    }
