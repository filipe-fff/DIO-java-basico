package edu.filipe.javaBasico.metodos.aula019;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SmartTv {
    private boolean ligada;
    private int canal;
    private int volume;

    public SmartTv()
    {
       this.setLigada(false);
       this.setCanal(1);
       this.setVolume(5);
    }
    public void status()
    {
        // linha da tabela
        char[] lt = new char[20];
        Arrays.fill(lt, '-');
        String linhaTabela = new String(lt);

        // linha do volume
        char[] lv = new char[this.getVolume()];
        Arrays.fill(lv, '|');
        String linhaVolume = new String(lv);

        System.out.println(linhaTabela);
        System.out.println("A Tv está ligada? " + (this.isLigada()? "Sim" : "Não"));
        System.out.println("Canal : " + getCanal());
        System.out.printf("Volume : %d %s\n", this.getVolume(), linhaVolume);
        System.out.println(linhaTabela);
    }
    public void ligarTv()
    {
        if(!this.isLigada())
            this.setLigada(true);
        else
            System.out.println("A Tv já está ligada.");
    }
    public void desligarTv()
    {
        if(this.isLigada())
        {
            this.setLigada(false);
        } else {
            System.out.println("A Tv já está desligada.");
        }
    }
    public void mudarCanal( int canal )
    {
        if( this.isLigada() ) {
            if (1 <= canal && canal <= 10)
                this.setCanal(canal);
            else
                System.out.println(" Canal inexistente, escolha um canal entre 1 a 10.");
        } else
            System.out.println("O canal não pode ser mudado com Tv desligada.");
    }
    public void aumentarCanal()
    {
        if( this.isLigada() )
        {
            if(this.getCanal() < 10)
                this.setCanal(this.getCanal()+1);
            else
                System.out.println("O canal já está no limite máximo.");
        } else
            System.out.println("Não pode aumentar o canal com a Tv desligada.");
    }
    public void diminuirCanal()
    {
        if(this.isLigada())
        {
            if( 1 < this.getCanal())
                this.setCanal(this.getCanal()-1);
            else
                System.out.println("O canal já está no limite mínimo.");
        } else
            System.out.println("Não pode diminuir o canal com a Tv desligada");
    }
    public void aumentarVolume()
    {
        if(this.isLigada())
        {
            if(this.getVolume() < 10)
                this.setVolume(this.getVolume()+1);
            else
                System.out.println("O volume já está no máximo");
        } else
            System.out.println("Não pode aumentar volume com a Tv desligada.");
    }
    public void diminuirVolume()
    {
        if(this.isLigada())
        {
            if( 0 < this.getVolume())
                this.setVolume(this.getVolume()-1);
            else
                System.out.println("O volume já está no mínimo.");
        } else
            System.out.print("Não pode diminuir volume com a Tv desligada.");
    }

    private boolean isLigada()
    {
        return this.ligada;
    }
    private int getCanal()
    {
        return this.canal;
    }
    private int getVolume()
    {
        return this.volume;
    }
    private void setLigada( boolean ligada )
    {
        this.ligada = ligada;
    }
    private void setCanal( int canal )
    {
        this.canal = canal;
    }
    private void setVolume( int volume )
    {
        this.volume = volume;
    }
}