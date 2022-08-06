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
        for (int i = 0; i < playList.length; i++){
            for (int j = playList.length -1; j > 0; j--){
                if (i < j){
                    selDown = i;
                }else{
                    selDown = j;
                }
            }
        }
        int up = selUp - startIndex;
        int down = startIndex + selDown;
        System.out.println(up);
        System.out.println(down);

        if (up < down) {
            return up;
        }
        return down;
    }
}
