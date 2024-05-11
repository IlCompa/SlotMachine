/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Classe che simula una slot machine con metodi per renderla funzionante anche senza un interfaccia grafica
 * @author ricca
 */
public class Motore {

    private int[] estrazione;
    private int jackpot;
    private int somma;

    /**
     * Costruttore classe Motore, inizializza le variabili necessarie
     */
    public Motore() {
        estrazione = new int[3];
        jackpot = 100;
        somma = 50;
    }

    /**
     * Metodo di get per il jackpot attuale 
     * @return int jackpot
     */
    public int getJackpot() {
        return jackpot;
    }

    /**
     * Metodo di get per la somma attuale del giocatore
     * @return int somma
     */
    public int getSomma() {
        return somma;
    }

    /**
     * Metodo per generare un numero intero compreso tra un massimo ed un minimo (compresi)
     * @param min minimo
     * @param max massimo
     * @return int numero generato
     */
    private int getRandomNumber(int min, int max) {
        max++;
        return (int) ((Math.random() * (max - min)) + min);
    }

    /**
     * Metodo per estrarre i tre numeri casuali e modificare i soldi di conseguenza
     */
    public void estrai() {
        estrazione[0] = getRandomNumber(0, 5);
        estrazione[1] = getRandomNumber(0, 5);
        estrazione[2] = getRandomNumber(0, 5);
        if (somma > 0) {
            somma--;
        }
        jackpot++;
        if (vintoComb()) {
            if (!vintoJackpot()) {
                somma += 10;
            } else {
                somma += jackpot;
            }
        }
    }

    /**
     * Metodo per resettare il jackpot al valore iniziale
     */
    public void resetJackpot() {
        this.jackpot = 100;
    }

    /**
     * Metodo di set per la sommma 
     * @param somma nuova somma del giocatore
     */
    public void setSomma(int somma) {
        this.somma = somma;
    }
    
    /**
     * Metodo per sapere il nuemro estratto sulla ruota di indice i
     * @param i indice della ruota di cui voglio sapere il numero estratto
     * @return int numero estratto
     */
    public int getComb(int i) {
        return estrazione[i];
    }

    /**
     * Metodo per sapere se i tre nuemri generati sono uguali
     * @return true se sono tutti uguali, false se non sono uguali
     */
    public boolean vintoComb() {
        if (estrazione[0] != estrazione[1]) {
            return false;
        } else {
            return estrazione[1] == estrazione[2];
        }
    }

    /**
     * Metodo per sapere se i numeri estratti sono uguali e corrispondono al jackpot
     * @return true se sono uguali e corrispondono al jackpot, false se non sono uguali o non corrispondono al jackpot
     */
    public boolean vintoJackpot() {
        if (vintoComb()) {
            if (estrazione[0] == 5) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo to string per ritornare tutte le informazioni in una stringa 
     * @return stringa contenete tutte le informazioni utili
     */
    @Override
    public String toString() {
        return "Comb: " + vintoComb() + "\tJackpot: " + vintoJackpot() + "\nSomma: " + getSomma() + "\tJackpot: " + getJackpot() + "\n";
    }

    
}
