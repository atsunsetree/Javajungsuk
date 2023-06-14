package ch06;

//다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
//weapon, armor: 다른 변수와 달리 공격력과 방어력은 게임의 공정성을 위해 모두 같은값을 가져야하므로
//weaponUp, armorUp: static변수를 따르기 때문에

public class ex09 {
}

class Marine {
    int x=0, y=0; // Marine의 위치좌표(x,y)
    int hp = 60; // 현재 체력
    int weapon = 6; // 공격력
    int armor = 0; // 방어력

    void weaponUp() {
        weapon++;
    }

    void armorUp() {
        armor++;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}