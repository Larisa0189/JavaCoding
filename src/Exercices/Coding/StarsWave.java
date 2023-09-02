package Exercices.Coding;

import java.util.Scanner;

public class StarsWave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lungime = scanner.nextInt();
        char[][] tabel = new char[4][lungime];
        //am facut tabelul gol
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < lungime; j++) {
                tabel[i][j] = ' ';
            }
        }

        //bagam stelutele
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < lungime; j++) {

                if (i == 0 && j == 0) {
                    //prima linie

                    int x = 0;
                    do {
                        tabel[i][j] = '*';
                        if (x % 2 == 0) {
                            j += 7;
                            x++;
                        } else {
                            j += 1;
                            x++;
                        }
                    } while (j < lungime);


                } else if (i == 1 && j == 1) {
                    //a doua linie

                    int x = 0;
                    do {
                        tabel[i][j] = '*';
                        if (x % 2 == 0) {
                            j += 5;
                            x++;
                        } else {
                            j += 3;
                            x++;
                        }
                    } while (j < lungime);

                } else if (i == 2 && j == 2) {
                    //a treia linie

                    int x = 0;
                    do {
                        tabel[i][j] = '*';
                        if (x % 2 == 0) {
                            j += 3;
                            x++;
                        } else {
                            j += 5;
                            x++;
                        }
                    } while (j < lungime);

                } else if (i == 3 && j == 3) {
                    //a patra linie

                    int x = 0;
                    do {
                        tabel[i][j] = '*';
                        if (x % 2 == 0) {
                            j += 1;
                            x++;
                        } else {
                            j += 7;
                            x++;
                        }
                    } while (j < lungime);

                } else {
                    tabel[i][j] = ' ';
                }
            }
        }


        //afisam tabelul
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < lungime; j++) {
                System.out.print(tabel[i][j]);
            }
            System.out.println();
        }


    }
}