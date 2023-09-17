# Clean Code

## Chapter 4. Comments

### Comments Do Not Make Up for Bad Code

- 코드로 충분히 설명하지 못한 부분을 주석으로 설명하려고 하기 보다 코드를 깔끔하게 만드는 것이 좋다.

### Explain Yourself in Code

- 대부분의 경우에 코드만으로 의도를 표현할 수 있다.

### Good Comments

- Legal Comments
  - 법적인 정보, 계약 조건, 표준 라이선스 등을 주석으로 남기는 것은 필요하고 타당하다.
- Informative Comments
  - 기본적인 정보를 주석으로 제공하는 것도 때로는 편리하다. 하지만 함수 이름에 정보를 담는 편이 더 좋다.
- Explanation of Intent
  - 코드를 작성한 결정의 의도를 설명하는 주석은 유익하다.
- Clarification
  - 인수나 반환 값이 라이브러리에 속한다면, 의미를 밝히기 위한 주석이 유용하다.
- Warning of Consequences
  - 다른 프로그래머에게 결과를 경고하기 위한 주석은 합리적이다.
- TODO Comments
  - 앞으로 미리 할 일을 `// TODO` 주석으로 적어두는 것은 협업에 용이하다.
- Amplification
  - 중요성을 강조하는 데에 이용될 수 있다.
- Javadocs in Public APIs
  - 잘 기술된 Javadocs는 다른 개발자들의 이해를 돕는다.

### Bad Comments

- Mumbling
  - 뜻을 알아내기 위해 결국 다른 코드를 찾아봐야 하는, 주절거림에 불과한 주석은 나쁜 주석이다.
- Redundant Comments
  - 주석이 코드보다 더 많은 정보를 제공하지 못하면 읽는 시간을 낭비시킬 뿐이다.
- Misleading Comments
  - 주석에 잘못된 정보가 담길 경우 디버깅이 어려워진다.
- Mandated Comments
  - 항상 주석을 달아야한다는 규칙은 코드의 가독성을 낮춘다.
- Journal Comments
  - 변경을 기록하는 일은 버전 관리 시스템이 할 일이다.
- Noise Comments
  - 너무나도 당연한 사실을 언급하는 주석은 필요 없다.
- Scary Noise
  - 역할이 없는 주석은 잡음에 불과하다.
- Don’t Use a Comment When You Can Use a Function or a Variable
  - 주석이 필요하지 않도록 코드를 개선하자.
- Position Markers
  - 배너 역할을 하는 주석이 유용한 경우는 드물다.
  - 배너는 매우 눈에 띄므로 반드시 필요할 때에만 사용하자.
- Closing Brace Comments
  - 닫는 괄호에 주석을 달아야겠다는 생각이 든다면, 중첩이 심해진 코드라는 뜻이니 함수를 줄이려 노력하자.
- Attributions and Bylines
  - 버전 관리 시스템에 기록하자.
- Commented-Out Code
  - 주석으로 처리된 코드는 다른 사람이 지우기 주저하게 만들며, 쓰이지 않는 코드가 쌓이게 만드는 주범이다.
- HTML Comments
  - HTML 주석은 에디터나 IDE에서도 읽기 힘들다.
  - HTML 태그를 삽입할 책임은 작성하자 아니라 도구에 있다.
- Nonlocal Information
  - 시스템의 전반적인 정보를 기술하지 않는 것이 좋다.
- Too Much Information
  - 주제와 관련없는 정보를 장황하게 서술하는 것은 필요하지 않다.
- Inobvious Connection
  - 주석과 코드의 관계가 명확하지 않으면 주석을 다는 의미가 없다.
- Function Headers
  - 긴 주석으로 설명해야 하는 함수보다 짧고 한 가지만 수행하는 함수가 더 좋다.
- Javadocs in Nonpublic Code
  - 공개하지 않을 코드라면 Javadocs는 코드만 산만하게 만들 뿐이다.

## Chapter 7. Error Handling

### Use Exceptions Rather Than Return Codes

- 오류 코드를 반환하기보다 예외를 발생시키는 편이 호출자 코드를 더 깔끔하게 만든다.
- 즉, 비즈니스 로직과 예외를 처리하는 로직을 분리할 수 있다.

### Write Your Try-Catch-Finally Statement First

- 예외가 발생할 코드를 작성할 때에는 먼저 try-catch-finally 블록을 작성하여 프로그램의 상태를 일관성 있게 유지할 수 있도록 해야 한다.
- 호출자가 기대하는 상태를 유지하기 쉬워진다.

### Use Unchecked Exceptions

- 확인된 예외는 호출 체인의 모든 함수의 시그니처를 수정해야하는 비용을 동반한다.
- 즉, 모든 함수가 하위 함수에서 발생시키는 예외의 종류를 알아야하기 때문에 캡슐화가 깨진다.

### Provide Context with Exceptions

- 예외에 전후 상황을 담아서 함께 던지는 것이 코드의 의도를 파악하는데 도움이 된다.

### Define Exception Classes in Terms of a Caller’s Needs

- 예를 들어, 외부 라이브러리 호출에서 발생할 수 있는 오류를 종류별로 핸들링하기 보다 하나로 묶어서 핸들링하는 것이 좋다.
- 왜냐하면 이 상황에서 우리가 예외를 잡을 구간은 어차피 하나이기 때문이다.
- 또한, 다른 API의 설계에 발목 잡히지 않는다.

### Define the Normal Flow

- 예외에 따른 중단이 코드를 장황하게 만든다면, 특수 사례 패턴을 통해 더 간결하게 만들 수 있다.

### Don’t Return Null

- `null`을 반환하는 코드는 작성해야할 코드를 증가시킬 뿐만 아니라 호출자에게 책임을 맡긴다.
- 외부 라이브러리가 `null`을 반환한다면 감싸서 예외를 던지거나 특수 사례 객체를 반환하자.

### Don’t Pass Null

- `null`을 인수로 받을 수 있도록 설계된 언어가 아니라면 `null`의 전달은 최대한 피해야한다.
