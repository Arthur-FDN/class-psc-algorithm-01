import java.util.Scanner;

public class EX_REYLE
{
    int Alegria, Tristeza, exercicio;
    Double A1, A2, A3, nota;
    
     public void main(String[] args)
     {
        int Amizade;
        Scanner escreve = new Scanner(System.in);
        System.out.println("Quantas amizades você fez?");
        Amizade = escreve.nextInt();

        if(Amizade > 0 ){
            Alegria += (Amizade* 10);
        }
        else{
            Tristeza +=30;
        }
        System.out.println("Qual foi a nota que voce tirou nas provas A1, A2, A3?");
        A1 = escreve.nextDouble();
        A2 = escreve.nextDouble();
        A3 = escreve.nextDouble();
        nota= ((A1+A2+A3)/3);

        if(nota>=7){
            Alegria +=50;
        }
        else{
            Tristeza +=50;
        }
        System.out.println("Quanto dos 10 exercicios de algoritio você fez?");
        exercicio = escreve.nextInt();

        if (exercicio==0){
            Tristeza += (10*10);
        }
        else if(exercicio == 10){
            Alegria += (10*10);
        }
        else if (exercicio>0){
            Alegria +=(exercicio*10);
            Tristeza +=((10-exercicio)*10);
        }
        System.out.println(Alegria+"|"+ Tristeza);
        if (Alegria>Tristeza){
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        }
        else if (Tristeza>Alegria){
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }
        escreve.close();
        

    }
}