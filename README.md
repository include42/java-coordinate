## 차량에 따른 연료 주입 프로그램

### 기능 구현 목록

1. 자동차가 이동거리에 대하여 필요한 연료량을 반환할 수 있어야 한다.
2. 회사에 자동차를 추가할 수 있어야 한다. 
3. 차량 별로 주입하는 여료량을 확인할 수 있는 보고서를 생성해야한다.

---

## 좌표 계산기

### 기능 구현 목록 


1. 사용자가 좌표 정보를 입력하는 메뉴를 구성한다
2. 좌표는 (x,y)로 표시한다
3. 좌표는 "-"로 구분한다
4. x,y 좌표는 최대 24이며 정수이다 (0 <= x,y <= 24)
5. 예외 사항
    1. 입력 범위를 초과하면 다시 입력받는다 
    2. 같은 좌표를 중복해서 입력하면 다시 입력받는다
    3. 좌표가 아닌 문자, 공백, null이면 다시 입력받는다
    4. 
6. 정상적인 좌표를 입력하면 화면에 특수문자로 표시한다 
7. 도형
    1. 점
        1. 좌표 값을 한개 입력헀다면 점이다
        2. 점일때는 아무것도 계산하지 않는다
    2. 직선
        1. 좌표 값을 두개 입력했다면 그것은 직선이다
        2. 직선일 때 두 점 사이의 거리를 구한다 (실수형)
    3. 사각형 
        1. 네 점을 입력했을 때 사각형을 가정한다
        2. 사각형인 경우 넓이를 계산, 출력한다
        3. 예외 처리
            1. 직사각형이 아닐 때 다시 입력받는다
    4. 삼각형
        1. 세 점을 입력했을 때 삼각형을 가정한다
        2. 삼각형인 경우 넓이를 계산, 출력한다
