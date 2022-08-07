package io.zipcoder;
import java.util.Arrays;
import java.lang.Math;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int selUp = Arrays.asList(playList).indexOf(selection);
        int selDown = 0;
        int SD1 = 0;
        int SD2 = 0;
        for (int i = 0; i < playList.length; i++){
            if (playList[i] == selection)
                SD1 = i;
            for (int j = playList.length -1; j > 0; j--){
                if (playList[i] == selection)
                SD2 = j;
                if (SD1 < SD2){
                    selDown = SD1;
                }else{
                    selDown = SD2;
                }
            }
        }
        int up = selUp - startIndex;
        int down = startIndex + selDown;

        if (up < down) {
            return up;
        }
        return down;
    }
}
