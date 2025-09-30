# Kotlin 튜토리얼

이 저장소는 Kotlin 언어의 다양한 문법과 기능을 예제 코드로 학습할 수 있도록 구성된 튜토리얼 프로젝트입니다.

## 프로젝트 구조

-   `src/main/kotlin/base/` : Kotlin의 기본 문법, 클래스, 상속, 함수, 변수 등 핵심 개념 예제
-   `src/main/kotlin/ext/` : 확장 함수, 고차 함수, 코루틴, 데이터 클래스, 컬렉션 등 심화 주제 예제
-   `build.gradle.kts`, `settings.gradle.kts` : Gradle 기반 빌드 설정 파일

## 주요 예제 목록

-   변수 선언 및 타입 추론
-   조건문과 반복문
-   클래스와 상속, 인터페이스
-   함수 및 고차 함수
-   컬렉션(List, Set, Map) 활용
-   확장 함수, infix, data class
-   코루틴 및 비동기 처리
-   널 안정성(Null Safety)

## 실행 방법

1. 저장소를 클론합니다.
2. Gradle을 이용해 빌드 및 실행합니다.

```bash
./gradlew build
./gradlew run
```

또는 각 예제 파일을 IDE(IntelliJ 등)에서 직접 실행할 수 있습니다.

## 참고 자료

-   [Kotlin 공식 문서](https://kotlinlang.org/docs/home.html)
-   [Kotlin Playground](https://play.kotlinlang.org/)

---

문의 및 피드백은 이슈로 남겨주세요.
