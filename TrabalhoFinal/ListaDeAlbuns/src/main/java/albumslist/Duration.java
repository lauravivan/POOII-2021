/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumslist;

/**
 *
 * @author laura
 */
public class Duration {
    private int minutes;
    private int seconds;
    
    public Duration(int minutes, int seconds) throws Exception {
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) throws Exception {
        if (minutes >= 1 && minutes <= 150) {
            this.minutes = minutes;
        } else {
            throw new Exception("Informe um valor válido para os minutos!");
        }
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) throws Exception {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            throw new Exception("Informe um valor válido para os segundos!");
        }
    }   
}
