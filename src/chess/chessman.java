/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

import javax.swing.JButton;

/**
 *
 * @author Admin
 */
public class chessman {
    float val;
    JButton boardSquare;
    public chessman(int i,int j,float value,JButton boardSquares) {
        val=value;
        boardSquare=boardSquares;
        if (value == 1) {
        boardSquares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/white_pawn.png")));
    } else if (value == 2) {
        boardSquares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/white_bishop.png")));
    } else if (value == 3) {
        boardSquares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/white_knight.png")));
    } else if (value == 4) {
        boardSquares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/white_rook.png")));
    } else if (value == 6) {
        boardSquares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/white_king.png")));
    } else if (value == 5) {
        boardSquares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/white_queen.png")));
    } else if (value == -1) {
        boardSquares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/black_pawn.png")));
    } else if (value == -2) {
        boardSquares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/black_bishop.png")));
    } else if (value == -3) {
        boardSquares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/black_knight.png")));
    } else if (value == -4) {
        boardSquares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/black_rook.png")));
    } else if (value == -6) {
        boardSquares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/black_king.png")));
    } else if (value == -5) {
        boardSquares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/black_queen.png")));
    }
    else if(value==0){boardSquares.setIcon(null);}
    }
}
