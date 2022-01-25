실행 순서

for(int i=1; i <=100; ++i) {
            ++i;

1.  for(int i=1;

2. i <=100;

3. ++i

4. ++i;



for (int i=1; i <=100; ++i) {
int x =10; // 전역 변수, x는 지역변수
if(3 == 3) {
x=4;
int a =10;// 지역 변수


x는 4
위에서 아래로 읽는다.

-----------------------------------------------------


* 디버깅

디버깅을 하면 i의 값이 커지는 걸 확인할 수 있음 !



-------------------------------------------------------


문제 응용)

 // 문제응용 카운트가 30 일때 break;
    
    for(int i=1; i<=100; i++) {
    	if(i%2 == 0) {
    		   ++count;
    	}
    	if(count == 30) {
    		break;
    	}
    }

--------------------------------------------------------
1/12

java
변수

1. 프로그램을 만들기 위해서 코딩하기
2. 프로그램 데이터가 있으니까 변수라는 개념을 이용하여 데이터를 대입해야 됌.
3. int (데이터 타입) X(변수이름)
         = 정수형 데이터 ;

 변수를 많이 쓰면 자바 메모리가 찬다         

위에서 아래로 읽고, 왼쪽에서 오른쪽으로 대입

= 대입
== 같다

상황연산자 

비고 연산자 

public class Lol (
     public static void main(stringl angs)
) //if 만약에 //else(아니라면) 가정법
int x = S;
int y = S;
if(x == y) (// 만약에 맞다면)
{
system.out.println("x랑 y는 같다");
}else 
{system.out.println("x랑 y는 다르다");
}
if(x != y) {
    system.out.println("x랑 y는 다르다)};

중 가로를 찍으면 세미클론 안 적어도 됨
아닌 경우는 세미클론 찍어야 됨

ex)

package
public class Lol{
	//90점 초과 A, 80점 초과 B, 70점 초과 C, 70점 이하는 F
	// 조건, else if 풀어볼 것

	int score = 88; // B학점
	if(score >= 90) {
		System.out.println("당신의 학점은 !!! A!!!");
	}else if(score <= 90 && score > 80) {
		System.out.println"당신의 학점은 !!! B!!!");
		else if (seore <= 80 && score > 70) {	
			System.out.println9"당신의 학점은 !!! C!!!");
		}else {
			System.out.println"F당첨!!");
	}


    for(int i=1; i<=10; ++1) {
		System.out.println"hello worid");
	    }

실행 순서
1. int i=1 (초기문 or 선언문)
 

2. i<=10; (조건 식)

3. 코드들

4. ++1) (반복 작업식)



for(int i=0; i>10; ++i) {
  (코드들...)


int i=0 
i를 1씩 증가시켜 10 미만까지 반복하겠다.
for(int i=0; i<3; ++i){
    (코드들...)
}

i를 3이 될 때까지 (거짓 될 때까지)  증가시킴 , 우리 눈에는 0이지만 컴퓨터는 3으로 인식함

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
1~10 까지 짝수 산출
조건 for 사용

	
	package study;
	
	//1~10까지 짝수 산출
	// 조건 for 사용
	public class 반복문
	public static void main(string[] engs) {
		
	for(int i=1; i<=10; ++i) {
		int x = 10; /지역변수
		int y = 5;
		if((i%2) == 0) {
		System.out.println"짝수는 ===> "+1);
	    }
	
	}




	//1~10까지의 짝수 판별
		for(int num=1;num<=10;++num) {
			if (num%2==0) {
				System.out.println(num+" : 짝수입니다.");
			}else {
				System.out.println(num+" : 홀수입니다.");
			}
		}






2. 반복문
공통점 : 무언가를 반복해서 작업함.
차이점 : for문은 제한된 조건이 옴!
           while 무한으로 실행! break문을 걸어서 탈출!
2-1 for
2-2 while


----------------------------------------------------------
1/12

java
변수

1. 프로그램을 만들기 위해서 코딩하기
2. 프로그램 데이터가 있으니까 변수라는 개념을 이용하여 데이터를 대입해야 됌.
3. int (데이터 타입) X(변수이름)
         = 정수형 데이터 ;

 변수를 많이 쓰면 자바 메모리가 찬다         

위에서 아래로 읽고, 왼쪽에서 오른쪽으로 대입

= 대입
== 같다

상황연산자 

비고 연산자 

public class Lol (
     public static void main(stringl angs)
) //if 만약에 //else(아니라면) 가정법
int x = S;
int y = S;
if(x == y) (// 만약에 맞다면)
{
system.out.println("x랑 y는 같다");
}else 
{system.out.println("x랑 y는 다르다");
}
if(x != y) {
    system.out.println("x랑 y는 다르다)};

중 가로를 찍으면 세미클론 안 적어도 됨
아닌 경우는 세미클론 찍어야 됨
-----------
ex)

package
public class Lol{
	//90점 초과 A, 80점 초과 B, 70점 초과 C, 70점 이하는 F
	// 조건, else if 풀어볼 것

	int score = 88; // B학점
	if(score >= 90) {
		System.out.println("당신의 학점은 !!! A!!!");
	}else if(score <= 90 && score > 80) {
		System.out.println"당신의 학점은 !!! B!!!");
		else if (seore <= 80 && score > 70) {	
			System.out.println9"당신의 학점은 !!! C!!!");
		}else {
			System.out.println"F당첨!!");
	}


    for(int i=1; i<=10; ++1) {
		System.out.println"hello worid");
	    }

실행 순서
1. int i=1 (초기문 or 선언문)
 

2. i<=10; (조건 식)

3. 코드들

4. ++1) (반복 작업식)



for(int i=0; i>10; ++i) {
  (코드들...)


int i=0 
i를 1씩 증가시켜 10 미만까지 반복하겠다.
for(int i=0; i<3; ++i){
    (코드들...)
}

i를 3이 될 때까지 (거짓 될 때까지)  증가시킴 , 우리 눈에는 0이지만 컴퓨터는 3으로 인식함

-------------------------------------------------
1~10 까지 짝수 산출
조건 for 사용

	
	package study;
	
	//1~10까지 짝수 산출
	// 조건 for 사용
	public class 반복문
	public static void main(string[] engs) {
		
	for(int i=1; i<=10; ++i) {
		int x = 10; /지역변수
		int y = 5;
		if((i%2) == 0) {
		System.out.println"짝수는 ===> "+1);
	    }
	
	}




	//1~10까지의 짝수 판별
		for(int num=1;num<=10;++num) {
			if (num%2==0) {
				System.out.println(num+" : 짝수입니다.");
			}else {
				System.out.println(num+" : 홀수입니다.");
			}
		}
-------------------------------------------------------------

중 가로 안에 있는 것들은 지역변수
if 밖에 있는 것들 전역변수

☆ 전역 지역 설명
오래사는게 전역
전역보다 짧게 가는게 지역
단) 비교대상이 있어야 함!

ex)
{int 박서준 35

{int 아이유
                               }
{
박서준은 아이유보다 오래 산다
컴퓨터는 "  " 안 쓰고 {  } <- 중간가로 만 씀


디버깅 꼭 해야 됨

테스트 시간 (디버깅 시간)
개발 끝나면 벌레 버튼 눌러서 확인

--------------------------------------------------------
while 

while 무한으로 돈다.
while (true) {

if(3 == 3){
	break;
}
}

------------------------------------------------------
2. 반복문
공통점 : 무언가를 반복해서 작업함.
차이점 : for문은 제한된 조건이 옴!
           while 무한으로 실행! break문을 걸어서 탈출!
2-1 for
2-2 while



☆ 전역 지역 설명
오래사는게 전역
전역보다 짧게 가는게 지역
단) 비교대상이 있어야 함!

ex)
{int 박서준 35

{int 아이유
                               }
{
박서준은 아이유보다 오래 간다
컴퓨터는 "  " 안 쓰고 {  } <- 중간가로 만 씀

변수 이름은 소문자, 대문자를 입력
소문자 변수 : 값이 변경 가능하다는걸 의미
대문자 변수 : 값 변경 불가능 (상수값)

ex) String name = "철수"
대문자 변수는 값이 불가능 (상수값)
ex) final double PI = 3.14
ex) String NAME = "박서준"

name Infor : 코드 넘어갈때 대문자
1. if/else, for, while, 배열(반복문 친구)
2. 클래스, 메소드 **자바 특징
3. 제네릭 컬렉션 *****         




방법 1)
for(int i=9; i>0; --i) 반대로 사용 가능
방법 2)
int i=0;
for(i=0; i<0; ++i)
방법3)
int x=5;
for(int i=x; i<5; i++)

package apple;

public class 박서준{

	public static void main(String[] args) {

		//안녕 나는 아이유야!
		// 안녕
		int 나이 = 54; //sql에서는 = 이거는 같다. = 프로그래밍에서는 대입
		System.out.println(나이); //syso 입력 후  ctrl + space bar 단축키 사용
		//결과를 확인하려면 ctrl + f11 단축키 사용
		String 이름 = "아이유";
		System.out.println("너의 이름은 "+이름);
		
		int num = 1+ 1;
		
		
		
		
	}	
}





	public class 연습문제 {
		public static void main(String[] args) {
			//이중 for 문
			// 이중 for문 사용 x
			//변수 선언 X
			//println 출력할것
			for(int i=0; i<2; i++) {
				System.out.println("***점심 밥***");
				for(int j=0; j<5; j++) {
					System.out.println("저녁 밥");
				}
			}
		}



package dw;

public class Study {

	public static void main(String[] args) {
		int x =5;
		int y =6;
		
		if(x == y)// 맞다면

		{	
		 System.out.println("x랑 y는 같다");
		}else {
            System.out.println("x랑 y는 다르다");		
            
      
	}


		package dw;
		public class Lol{
			public static void main(string[] args) {
				// A학점 100 ~ 90
				// b학점 80 ~ 89
				// c학점 70 ~79
				// D학점 69 이하
				int myScore = 87; // C학점 
			if(myscore >= 90) {
				System.out.println("A학점입니다.");
			}
		if(myScore < 90 && myScore >= 80) 
		{
			System.out.println("b학점입니다.");
		}
		int age = 50;
			}
			
				}
			num = 0;
				system.out.println() 
				}
				}

public static void main(string[] args) {
	int x =10;
	int y =10;
	int num = 0;
	if (x == y) {
		num = x " y;
				 if(x != y) {
	num = 0;
				 }else {
	num = num * 2;
				 }else {
					 num += num;
				 }
				 num = num + 100;
				 System.out.orintl
					 System.out.
				 }
}


public class 상용구 프로그램
public static void main(string[] engs) {
	int num = 30;
	
	if (num == 20) {
		System.out.println("hello");
	}
	else if(num == 30) { //조건식을 한번 더 사용
		System.out.printin("hello worid");
	}else {
		
	}
	

	}
	}
}

package
public class Lol{
	//90점 초과 A, 80점 초과 B, 70점 초과 C, 70점 이하는 F
	// 조건, else if 풀어볼 것
	int score = 88; // B학점
	if(score >= 90) {
		System.out.println("당신의 학점은 !!! A!!!");
	}else if(score <= 90 && score > 80) {
		System.out.println"당신의 학점은 !!! B!!!");
		else if (seore <= 80 && score > 70) {	
			System.out.println9"당신의 학점은 !!! C!!!");
		}else {
			System.out.println"F당첨!!");
	}
		
		
		
	public class 
	public static void main(string[] engs) {
		//(if/else), (반목문)
		// 코드의 중복을 제거하고자 반복문 등장
	for(int i=1; i<=10; ++1) {
		System.out.println"i = ");
	    }
	
	}
	
	package study;
	
	//1~10까지 짝수 산출
	// 조건 for 사용
	public class 반복문
	public static void main(string[] engs) {
		
	for(int i=1; i<=10; ++i) {
		int x = 10; /지역변수
		int y = 5;
		if((i%2) == 0) {
		System.out.println"짝수는 ===> "+1);
	    }
	
	}
	
	
	package study;
	
	public class 반복문
	public static void main(string[] engs) {
	// 조건, for문과 if운율 사용해서 풀 것
	// 문제1. 1 ~ 10까지 중 짝수, 홀수 출력
	// 문제2. 1 ~ 10까지 중 짝수가 몇개인지 출력
	// 문제3. 1 ~ 10 총합은? 55?
	// 문제4. 변수는 딱 2번만 허용 (for 문안에 있는 i 변수 제외)
		
	for(int i=1; i<=10; ++i) {
		int x = 10; /지역변수
		int y = 5;
		if((i%2) == 0) {
		System.out.println"짝수는 ===> "+1);
	    }
	}

	-----------------------------------------------------------
	1/14
	
자바 (객체지향언어)
1. if/else, for, while, 배열 (공통)
2. 메소드, 클래스 (객체지향언어 특징)
3. 제네릭 컬렉션 (자바 특징)

string ==은 비교하고자 하는 두개의 대상의 주소(위치)값을  비교함.
(*call by Reference)
epuals 는 비교하고자 하는 두개의 대상의 값 자체를 비교.
(*call by value)
(문자 비교)


-------------------------------------------------------------------

1/17

1. 메소드 수업
메소드 (함수 or 기능) : 각 기능을 분리해서 개발해야 소프트웨어 품질 향상
ex) 로봇 팔, 다리
(응집도는 높고 결합도는 낮아야 좋은 소프트웨어)

2. mine : java에서 먼저 실행되는 기능(함수)
static 붙은 함수에는 static함수만 올 수 있다.

3. 접근지정자 (객제지향 언어는 대부분 평균 4개의 접근지정자가 있음)
*pubilc,
 private,
 protected
디폴트 접근지정자

4. 문법
<접근지정자>        <리턴타입>              <메소드 이름>       <인자값>
 pubilc          int, gitSum(int x)                         피라키터 값

( 1. 인자값  2.파라미터 값 )
*인자값에는 최대 3개까지만 오자.

pubilc int getSum(int x) {
	//리턴타입이 int형이면
	//int형 데이터를 반환(return) 해야 함.
	return sum;
	}

1. 리턴타입
** 앞에 대문자는 클래스타입이다 
메소드의 최종 결과값을 반환
리턴 타입에는 데이터타입(int, double, float, long...) 8개와 클래스타입 1개
총 9개가 위치.
리턴 타입이 없을 때는 void로 표현

2. 인자값 (파라미터 값)
메소드의 최종 결과값을 반환
리턴 타입에는 데이터타입 (int, double, float, long...) 8개와 클래스타입 1개
총 9개가 위치.
인자값이 없을 때는 () 빈 괄호
***인자값 (파라미터 값)은 3개 이하로 작성.

3.접근지정자
1.public : 다른 클래스에서 호출 가능
2. private : 내부 클래스에서만 호출 가능
3. protected :
4.default

if로만 return을 하면
무조건 return을 마지막 줄에 한번 더 입력해야함.
(컴퓨터는 그 조건이 틀렸을지 모른다고 가정함)
**if else로 하면
둘중 하나는 무조건 실형하기 때문에 
return을 마지막 줄에 입력안함. 

public      int     동사  int
private    double       double
protected  String       String
default    ....


☆ // x는 중가로 안에서만, 성립되면 0,성립안되면 숫자가 내려옴
-------------------------------------------------------------

1/18

☆무조건 저장하기 !! (ctrl S)

Class 만들 때 첫글자 무조건 대문자

9개의 데이터타입과 리턴할게 없으면 void

데이터베이스랑 java랑 연동

ex)
select
ename,
empno
from emp
where
empno = <번호>
 번호칸에 피라미터 

☆☆ 메소드 오버로딩(over loading) ☆☆
이름이 같은 여러개의 메소드를 중복 선언하여 사용의 편리성을 제공
1. 조건 : 이름이 동일해야함.
2. 인자의 대수가 달라야 함.
3.인자의 타입이 달라야 함.
4.동일한 클래스 파일 안에 있어야 함.

 결론 : 메소드는 파라미터가 중요 

 ** 개수를 늘리거나 줄이거나 데이터 타입을 다르게 한다. ** 

 @ 클래스

 java : 객체지향언어 
 
 객체 : 고유한 특성을 가짐
        객체들이 모여서 하나의 프로그램을 완성
ex) 마우스, 키보드, 모니터, 본체
  -> 컴퓨터를 하다.

ex) 마우스라는 class를 만들었다고 했을 때
    오른쪽 클릭, 왼쪽 클릭, 스크롤 등..
    마우스만의 객체를 만듦

	class를 객체라고 봄
	
분리해서 만들어야 함

☆☆ 객체지향언어 특징 ☆☆
1. 캡슐화
내부를 마치 캡슐처럼 보호

클래스가 메소드를 담고있다. (캡슐 안에 가루 담아있는거)

2.상속
클래스를 부모와 자식으로 두고 부모의 기능을 물려받음




3. 다용성
같은 이름의 메소드가 다르게 구현
(메소스 *오버로딩, *오버 라이딩)

public class는 해당 파일에 한번 만 

new를 써야 클래스를 호출한거 !!

메소드에 접근지정자를 private로 선언하면
외부 클래스에서 호출 시 해당 메소드를 호출할 수 없다.

※ 앞에 대문자 있으면 클래스타입 !! ※

java main 함수에는
 static 함수와 new 선언으로 만든 클래스 메소드가 올 수 있다.



DW 코딩 규칙
1. 메소드에 리턴값이 있으면 우선 변수로 받는다.
2. 선언한 변수가 행동이 일어나서 결과값이 생길 때
ex) int x =10; int y=10;
    int sum = x + y; //sum으로 데이터를 받는다.
3. 선언한 변수가 정말 필요한지 고민 (재활용이 가능한지?)
4. 지역변수에서만 활용할 건지 전역변수로 활용할 건지 고민
### 메소드 분리하는 방법

1. 함수가 어려우면 메인함수에 코딩
2. 메인함수 결과가 나오면 함수로 분리할 것
3. 고민해서 문제 풀기
----------------------------------------------------

1/19

변수 사용하는 이유 : 한번 만든 변수를 재활용 하려고 만듦 
                          한번 선언하는게 X , 계속 쓸려고 



몫 값 : / (슬래시)
나머지값 : % (퍼센트)

if else
변수에 대입한 데이터가 참인지 거짓인지 구별할 때 사용

if (비교조건){

}

** 조건이 같으면 덮어씌우는 값 실행
         같지않으면 실행 X

for : 반복하는 작업이 있을 때 사용.
(매크로같은 기능)

++ (증강연산자 , 1씩 증가)
--( 1씩 감소)

int a = 10;
int a[] = {10,20};

배열하고 for문은 같이 씀

--------------------------
1/21

깃허브
1. 저장소가 1개 이상은 있음.
상황예시) 
DW 아카데미에서 오늘 배운 내용 add & commit하고 push
집에서 노트북으로 오늘 배운 내용을 동기화 하려고 함

한번도 깃허브애 업로드한 저장소를 다운받은적이 없음
1. clone -> add &commit -> push
다운(clone)받은 적이 있다면
1.pull -> add & commit 

1. 순서 까먹음 
2.commit,push 에러

tofrom 체크

개발자 구직사이트는 깃허브 연동을 만듦

깃허브에 java 파일 올려보기



*********************************************
디버깅(추적) : 콩 찍기  
디버깅 실행 키 : F11
디버깅 하면 코드 실행하고 오류난 부분을 볼 수 있음

1. 변수를 막 만든다
2. 디버깅을 한다
   변수가 없는 데아터는 디버깅 때 무시함
3. 변수를 제거한다 (불필요한, 중복되는)

-----------------------------------------------------

1/24

1. 클래스는 필드변수(전역변수)와 메소드로 구성
2. 필드변수 앞에는 접근지정자,
Public, private, protected, default public
3. 자바에서 클래스는 객체(==object)다.
4. 객체는 고유한 특성과 행동을 가짐
ex) 학교

1. 학생 수
2. 교직원 수
3, 반 수(3반)

행동
1. 수업을 듣다.
2.선생님한테 혼나다.
3. 교장 연설을 듣다.

   객체를 하는 이유 
** 1. 업무 분담
   2. 일 효율성

   클래스도 데이터 타입
   new를 사용해야 학교 클래스 안에 있는 필드변수와 메소드 사용 가능

class Pizza{
	public String 피자종류;// 필드변수
	pubilc void 피자를 먹다(){// 메소드
                this.피자종류 = "치즈피자"
				}

*******생성자
Pizza p = new Pizza();


보일로 플레이트 코드
: 노가다작업을 쉽게해줌.


** 
1. 실무에서 필드변수 초기화 잘안함
2. set, get 함수 이용해서 필드변수 초기화
3. set, get 함수가 있는 클래스에는 절대 다른 함수를 정의하지 않는다.
   (getSum 같은거 절대 금지)
4. 클래스 이름 뒤에 VO(Value object)를 붙이자
   클래스 이름 뒤에 DTO(Date Transfer Object)를 붙이기

UML (Unified Modeling Language)
통합 모델링 언어.
즉, 모델을 만드는 표준 언어
소프트웨어 초기 스케치 작업

사용하는 이유
1. 다른사람들과 의사소통 또는 설계 논의
2. 전체 시스템 파악
3. 유지보수를 위한 설계의 back - and 문서

_________________________________________________________

1/25

1. 생성자는 함수다. (위에 코드 가능)
2. 리턴이 없음 (viod 없음)
3.함수 이름은 클래스 이름과 동일
4. 기본 생성자 (디폴트 생성자) 존재.
5. 생성자 사용 이유
=> 필드 변수 값을 대입하기 위해서

변수 옆에 this 붙으면 무조선 전역변수
 name은 전역젼수여서 생성자에서도 사용 가능

Pizza p = new pizza();
 클래스를 외부에서 호출하려면 강제로 생성자를 사용해야 함
 강제 - 필드변수 값을 대입 해줌 (목적)

 사용 빈도 수 낮음
 get, set 만들어서 대입.

 클래스는 2가지로 나뉨 : 필드변수와 메소드로 구성

 Pizza p  
 (p 안에 담다/ p 가방)

 가방안에 필드변수와  메소드가 있음.

 파라미터로 new 로 불러온 클래스를 넣었기때문에 클래스 리턴이 가능했던거

 ** 메소드로 클래스 리턴 가능 

 ** 메소드 파라키터에 클래스타입이 있다면 new 이용해서 클래스를 불러온 후 파라미터에 넣어야 함