# 🚀 미션 - 자동차 경주 구현

# 📈 기능 목록

## 입력

- [X]  경주 할 자동차의 이름을 입력받는다.
- [X]  이름을 쉼표 기준으로 분리한다.
- [X]  사용자가 잘못된 값을 입력할 경우 Exception를 발생시키고 프로그램을 종료한다.
  - [X]  빈 문자열(null)이 입력된 경우
  - [X]  이름이 5자 보다 클 경우
  - [X]  이름이 중복된 경우
  - [X]  입력된 이름이 하나일 경우
  - [X]  공백(들) 혹은 ','로만 이루어진 문자열이 입력된 경우
  - [X]  이름에 특수문자가 들어간 경우 (다만, '_' 제외)
- [X]  시도할 횟수를 입력받는다.
- [X]  사용자가 잘못된 값을 입력할 경우 Exception를 발생시키고 프로그램을 종료한다.
  - [X]  빈 문자열(null)이 입력된 경우
  - [X]  숫자가 아닐 경우
  - [X]  0 이하의 값이 입력된 경우

## 경기진행

- [X]  입력 받은 횟수만큼 라운드을 반복한다.
- [X]  각 자동차마다
  - [X]  0~9 사이의 랜덤 값을 구한다.
  - [X]  4 이상인 경우 전진한다.
- [X]  각 라운드마다 결과를 출력한다.

## 경기종료

- [X]  게임이 끝난 후 가장 많이 전진한 위치를 구한다.
- [X]  최대 위치 값에 해당하는 우승한 자동차 목록을 구한다.
- [X]  우승자(들)를 출력한다.

---

# TODO

- [ ]  퍼블릭 메소드 별로 테스트 코드 작성
- [ ]  리뷰어 피드백 적용(밑에 줄줄 쓰며 투두 해결)

- [X]  메소드 이름 변경
- [X]  변수이름 변경
- [X]  클래스명 변경
- [X]  메소드 파라미터명 변경
- [X]  상수 클래스 선언 및 상수 이동
- [X]  racingCars 클래스 생성
- [X]  인덴트 1로 수정
- [X]  인풋 요청 서비스 클래스 분리
- [X]  우승자 선발 메카니즘 연구

- [x]  주요 로직 메서드는 getter보다 위에 있는게 좋은거 같아요
- [ ]  HashSet으로 size비교를 했는데 의도한대로 동작을 할까요??
- [ ]  Random을 항상 새로 호출해야할까요??
- [ ]  0은 상수화 시키는 것이 낫지 않을까요??
- [ ]  접근 제어자를 public으로 연 이유가 있을까요??
- [ ]  model이 view로 넘어와도 될까요??
- [ ]  display name이 있어서 이름을 t1 : 메서드 의미하는지 알려주는게 명확
- [ ]  변수 접근제어자가 public -> 어디에서나 값을 수정
- [ ]  가장 중요한 go에 대한 테스트가 없는거 같아요.
- [ ]  RacingCars 테스트 작성

- 
  리뷰를 잘 반영해 주셔서 이것을 2단계에 도전해 보죠 😎
  https://tecoble.techcourse.co.kr/post/2020-05-07-appropriate_method_for_test_by_parameter/
  https://tecoble.techcourse.co.kr/post/2020-05-17-appropriate_method_for_test_by_interface/



---

# 🚀 미션 - TDD 문자열 덧셈 계산기

# 📈 기능 목록

- [X]  구분자를 기준으로 구분한다

- 쉼표(,), 콜론(:)
  - 커스텀 구분자("//","\n") -> 사이에 문자 하나 옴

- [X]  파라미터가 숫자 이외의 값, 음수이면 예외처리

- [예외] 숫자아님
- [예외] 구분자 앞뒤에 아무것도 없을 때
- [예외] 숫자가 음수
- RuntimeException

- [X]  파라미터들을 더한 값을 리턴한다
- [X]  [요구사항] 빈 문자열 또는 null이 입력된 경우 0을 출력

---

# TODO

- [X]  예외처리 테스트코드 작성
