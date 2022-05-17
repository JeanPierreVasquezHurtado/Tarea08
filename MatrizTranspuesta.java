package Tarea08;

import javax.swing.*;

public class MatrizTranspuesta {
    private int matriz [][];
    private int filaM;
    private int coluM;
    private int valoresM;


    private int maTranspuesta[][];
    private int filaMT;
    private int coluMT;


    public MatrizTranspuesta()
    {
        filaM = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas de la Matriz: "));
        coluM = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas de la Matriz "));
        this.matriz = new int[filaM][coluM];


        filaMT = coluM;
        coluMT = filaM;
        this.maTranspuesta= new int[filaMT][coluMT];
    }


    public void agregarValores()
    {
        for (int fila=0; fila < this.matriz.length; fila++)
        {
            for (int columna=0; columna < this.matriz[fila].length; columna++)
            {
                this.valoresM = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valores de la Matriz: "));

                this.matriz[fila][columna] = this.valoresM;
            }
        }
    }


    public void mostrarMatriz()
    {
        System.out.println("-------Matriz-------");
        for(int fila=0; fila < this.matriz.length; fila++)
        {

            for(int columna=0; columna < this.matriz[fila].length; columna++)
            {
                System.out.printf("%d ", this.matriz[fila][columna]);
            }

            System.out.println();
        }
    }


    public void transponerMatriz()
    {
        for (int i = 0; i<matriz.length;i++)
        {
            for (int j = 0; j < matriz[i].length;j++)
            {
                maTranspuesta[j][i] = matriz [i][j];
            }
        }


        System.out.println("---------Matriz Transpuesta---------");
        for(int fila=0; fila < this.maTranspuesta.length; fila++)
        {

            for(int columna=0; columna < this.maTranspuesta[fila].length; columna++)
            {
                System.out.printf("%d ", this.maTranspuesta[fila][columna]);
            }

            System.out.println();
        }
    }

}
