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

