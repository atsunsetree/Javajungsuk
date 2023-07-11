package ch11;

import java.util.*;

public class ex10 {
    public static void main(String[] args) {
        Set set = new HashSet(); //문제발생
        int[][] board = new int[5][5];

        for(int i=0; set.size()<25; i++) {
            set.add((int)(Math.random()*30)+1+"");
        }

        //Iterator it = set.iterator()
        //추가
        ArrayList list = new ArrayList(set); //셔플 위해 리스트 생성
        Collections.shuffle(list);
        Iterator it = list.iterator(); //위에 set로 list 생성했기 때문에 바꿔줌

        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                board[i][j] = Integer.parseInt((String)it.next());
                System.out.print((board[i][j]<10 ? " " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
}
