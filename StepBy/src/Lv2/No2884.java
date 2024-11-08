package Lv2;

import java.util.Scanner;

/*
* 알람시계
* 상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.
  상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.
  이런 상근이를 불쌍하게 보던 창영이는 자신이 사용하는 방법을 추천해 주었다.
  바로 "45분 일찍 알람 설정하기"이다.
  이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다. 이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
  현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램
* */
public class No2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        // 특별한 case만 찾아서 처리
        // hour == 0 일 때, 23으로 바뀌어야함.
        // min < 45 때, 시간을 -1 해줘야함.

        if( min-45 >= 0) {
            min = min - 45;
        } else if( min-45 < 0) {
            hour = hour - 1;
            min = min + 15;
        }

        if( hour == -1) {
            hour = 23;
        }
        System.out.println(hour + " " + min);

        sc.close();

        }
    }
