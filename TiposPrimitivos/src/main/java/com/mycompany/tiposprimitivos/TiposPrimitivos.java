/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposprimitivos;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class TiposPrimitivos {
   public static void main (String[] args) { 
    /**feito no lab 111 primeiro programa Java por mim*/
    // Declaração de variáveis primitivas 
    byte idade = 25; // Suporta dois números, número pequenos (-128 1270
    short ano = 2025; // Suporta 5 casas ou mais, Guarda valores maiores, número pouco maiores(-32.768 a 32.767)
    int populacaoCidade = 500000; // Número inteiros,
    long populacaoMundial = 8000000000L; // precisa 'L' para valores longos
    
    float altura = 1.75f; //Número com casa decimal sem virgula precisa ter ponto e o é 'f' é para entender que é float, precisa do 'f'
    double peso = 72.5; // Número com casa decimal sem virgula precisa ter ponto

            
    char inicial = 'J'; // Guarda um único caractere precisa do aspas entre o caractere
    boolean ativo = true; // Armazena verdadeiro ou falso
    
    //valores exibidos
    System.out.println("Idade: " + idade);
    System.out.println("ano: " + ano);
    System.out.println("População da cidade: " + populacaoCidade);
    System.out.println("População mundial: " + populacaoMundial);
    System.out.println("Altura: " + altura + "m");
    System.out.println("Peso: " + peso + "kg");
    System.out.println("Incial do nome: " + inicial);
    System.out.println("Está ativo" + ativo);
   }
}
   
   
