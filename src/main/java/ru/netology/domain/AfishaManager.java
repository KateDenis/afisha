package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AfishaManager {
    private FilmItem[] items = new FilmItem[0];
    private int resultLength = 10;

    public void addFilm(FilmItem film){
        FilmItem[] tmp = new FilmItem[this.items.length + 1];
        System.arraycopy(this.items, 0,tmp, 0,this.items.length);
        tmp[this.items.length] = film;
        this.items = tmp;
    }

    public FilmItem[] getLastFilms (){
        int resultL = this.resultLength;
        if (this.items.length < this.resultLength) {
            resultL = this.items.length;
        }

        FilmItem[] result = new FilmItem[resultL];
        int maxIndex = this.items.length - 1;
        int j = 0;
        for (int i = maxIndex; i >= 0; i--) {
            result[j] = this.items[i];
            j++;
            if(j == resultL){
                break;
            }
        }
        return result;
    }
}
