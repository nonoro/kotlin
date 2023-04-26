## Lec 18. 코틀린에서 컬렉션을 함수형으로 다루는 방법

### 1. 필터와 맵
### 2. 다양한 컬렉션 처리 기능
### 3. List를 Map으로
### 4. 중첩된 컬렉션처리

---

## 1. 필터와 맵
- filter / filterIndexed / map / mapIndexed / mapNotNull
- filter: 사과만 주세요!
- filterIndexed: 사과랑 인덱스도 같이주세요
- map: 사과의 가격들을 알려주세요
- mapIndexed: map에서 인덱스가 필요한 경우
- mapNotNull: Mapping의 결과가 null이 아닌 것만 가져오고 싶은 경우
- 

## 2. 다양한 컬렉션 처리 기능
- all / none / any / count / sortedBy / sortedBtDescending / distinctBy / first / firstOrNull / last / lastOrNull
- all: 조건을 모두 만족하면 true 그렇지 않으면 false
- none: 조건을 모두 불만족하면 true 그렇지 않으면 false
- any: 조건을 하나라도 만족하면 true 그렇지 않으면 false
- count: 개수를 센다(List의 size와 같은 기능)
- sortedBy: (오름차순) 정렬을 한다
- sortedByDescending: (내림차순) 정렬을 한다
- distinctBy: 변형된 값을 기준으로 중복을 제거한다.
- first: 첫번째 값을 가져온다(무조건 null이 아니어야함)
- firstOrNull: 첫번째 값 또는 null을 가져온다
- last: 마지막 값을 가져온다(무조건 null이 아니어야함)
- lastOrNull: 첫번째 값 또는 null을 가져온다

## 3. List를 Map으로 (코틀린은 인수로 함수가 들어갈 수 있고 함수가 마지막 인수로 들어가거나 유일한 인수로 함수가 들어가면 () 대신 {}로 바꿀 수 있다.)
- 과일이름(key) -> List<과일>(value) 로 이루어진 Map이 필요해요!
  - groupBy { fruit -> fruit.name }: groupBy의 인수가 하나인 경우 key값만 정해주면 자동으로 value에는 List<Fruit> 가 들어감
- id(key) -> 과일(value) 로 이루어진 Map이 필요해요!
  - associateBy { fruit -> fruit.id }: associateBy의 인수가 하나인 경우 key값만 정해주면 자동으로 value에는 Fruit가 들어감
    - 주로 id를 통해 뭔가를 매핑해야할때 즉 중복되지 않는 키를 가지고 map을 만들때 사용한다
- 과일이름(key) -> List<출고가>(value) 로 이루어진 Map이 필요해요!
  - groupBy를 사용하며(key에 대한 인수, value에 대한 인수): 인수가 2개인 경우 value에 들어갈 List값을 따로 지정해줄 수 있다
- id(key) -> 출고가(value) 로 이루어진 Map이 필요해요!
  - associateBy(key, value): 인수가 2개인 경우 value에 들어갈 List값을 따로 지정해 줄 수 있다.
  - 함수형 파라미터를 두개 받는다면 
  - ( { fruit -> fruit.id} ) {fruit -> fruit.factoryPrice} 이렇게 할 수 잇지만 
  - ( { fruit -> fruit.id}, {fruit -> fruit.factoryPrice} ) 이렇게 소괄호 안에 둘 다 넣어서 받는게 convention이다
- Map에 대해서도 앞선 기능들을 대부분 사용할 수 있다.

## 4. 중첩된 컬렉션 처리
- List<List<Fruit> 이 상황에서 출고가와 현재가가 동일한 과일을 고르기
  - flatMap을 사용하여 List<List>를 단일 List로 바꿀 수 있다
- List<List<Fruit>>를 List<Fruit>로 그냥 바꿔주세요
  - flatten(): 중첩돼 있는 컬렉션이 중첩 해체 돼서 모두 평탄화된 List<Fruit>로 바뀜  

--- 

## 총 정리
- filter / filterIndexed / map / mapIndexed / mapNotNull
- all / none / any / count / sortedBy / sortedBtDescending / distinctBy / first / firstOrNull / last / lastOrNull
- groupBy / associatedBy
- flatMap / flatten
