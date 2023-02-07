# codeup_basic_100

코딩테스트를 위한 java, python 연습장입니다.

# 잘 몰랐던 것들

<br/>


## 유니코드 출력

**Problem 1008**

유니코드는 char 타입으로 `'\유니코드'` 와 같이 작성한다. ex) `'\u250C'`

<br/>

---

<br/>

## 실수 출력시 소수점 갯수

**Problem 1015**

실수를 출력할 때 소수점 갯수를 제한하는 방법이 여러가지 있다.

```java
import java.text.DecimalFormat; // import 필요

double d = 1.545122;
DecimalFormat frmt = new DecimalFormat();
frmt.setMaximumFractionDigits(2);
System.out.println(frmt.format(d)); // 1.55
```

```java
double d = 1.545122;
String fmt = String.format("%.2f", d); // String의 format method사용
System.out.println(fmt); // 1.55
```

```java
double d = 1.545122;
DecimalFormat frmt = new DecimalFormat("#.##");
System.out.println(frmt.format(d)); // 1.55
```

```java
double d = 1.545122;
System.out.printf("%.2f", d); // prinf 사용 1.55
```

등의 방법이 있다.

<br/>

---

<br/>

## String.split("[.]")

**Problem 1019**

문자열을 다룰 때 가장 많이 사용하는 String method 중 하나인 split에 대해 잘 몰랐던 점이 있다.

보통 입력된 자료들을 나눌때

```java
String str = "a b c d";
String[] arr1 = str.split(" ");
```

와 같은 식으로 사용하는데, 매개변수로 들어가는 `" "` 가 정규식 형태였다.

그래서 `.` 은 임의의 한 문자로 인식이 되어 원하는데로 문자열이 나누어지지 않는다.

```java
String str = "a.b.c.d";
String[] arr = str.split(".");
System.out.println(arr.length); // 0
for (String s : arr) { // 배열이 비어있어 foreach 타지 않음
  System.out.println(s);
}
```

### 해결방법

```java
String str = "a.b.c.d";
String[] arr = str.split("[.]"); // 문자의 집합이나 범위를 나타내는 []를 사용하여 .을 문자로 인식시킴
System.out.println(arr.length); // 4
for (String s : arr) { // 배열이 비어있어 foreach 타지 않음
  System.out.print(s + " "); // a b c d
}
```

```java
String str = "a.b.c.d";
String[] arr = str.split("\\."); // \을 붙여 정규식 escape 처리를 하고, java 문자열에서도 \로 escape 처리
System.out.println(arr.length); // 4
for (String s : arr) { // 배열이 비어있어 foreach 타지 않음
  System.out.print(s + " "); // a b c d
}
```
