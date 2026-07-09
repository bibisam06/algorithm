# 코딩테스트 30일 데일리 플랜 (v2)

> 시작일: **2026년 7월 9일 (목)** → 종료일: **2026년 8월 7일 (금)**
> 하루 3~4시간 · Python 기준
> `P` = 프로그래머스, `LC` = LeetCode
> ⭐ = 반드시 두 번 푸는 문제 · *(여유되면)* = 시간 남을 때만

**하루 운영법**: `(여유되면)` 없는 문제 = 필수. Easy는 20분 컷, Medium은 30분 룰 적용.

---

## 1주차 — 기초 자료구조 (7/9 ~ 7/15)

### Day 1 · 7/9 (목) — 시간복잡도 + 배열

**LeetCode (Easy)**
- [ ] LC 1. Two Sum — **O(n²) 완탐 먼저 짜고, 그다음 해시로 O(n) 개선.** 오늘 개념의 체감판
- [ ] LC 217. Contains Duplicate — list `in` vs set `in` 실행시간 직접 비교
- [ ] LC 26. Remove Duplicates from Sorted Array — 투포인터 맛보기
- [ ] LC 283. Move Zeroes
- [ ] LC 121. Best Time to Buy and Sell Stock — "한 번 훑으며 최솟값 갱신" 패턴
- [ ] LC 88. Merge Sorted Array
- [ ] LC 977. Squares of a Sorted Array *(여유되면)*

**프로그래머스 (Lv.1)**
- [ ] 두 개 뽑아서 더하기
- [ ] 제일 작은 수 제거하기
- [ ] 음양 더하기
- [ ] 없는 숫자 더하기
- [ ] 나누어 떨어지는 숫자 배열

---

### Day 2 · 7/10 (금) — 문자열 기본기

> 파이썬 문자열 메서드에 손이 익는 게 목표.
> `split` / `join` / `strip` / `replace` / `ord`·`chr` / 슬라이싱 `[::-1]`

**LeetCode (Easy)**
- [ ] LC 344. Reverse String — 투포인터 맛보기
- [ ] LC 125. Valid Palindrome — 전처리 + 투포인터
- [ ] LC 387. First Unique Character in a String
- [ ] LC 14. Longest Common Prefix
- [ ] LC 49. Group Anagrams *(해시로 넘어가는 다리)*

**프로그래머스 (Lv.1)**
- [ ] 가운데 글자 가져오기
- [ ] 문자열 내 p와 y의 개수
- [ ] 문자열 내림차순으로 배치하기
- [ ] 시저 암호 — `ord`/`chr` 연습, 은근히 실수 나옴
- [ ] 이상한 문자 만들기 — 인덱스 관리 연습
- [ ] 문자열 다루기 기본

---

### Day 3 · 7/11 (토) — 해시 ①

**개념**: `dict` / `set` / `collections.Counter` / `defaultdict`
> "탐색을 O(n) → O(1)로 바꾸고 싶다" 싶으면 해시를 떠올린다.

**LeetCode**
- [ ] LC 242. Valid Anagram *(Day 1에서 이동 — 배열이 아니라 카운팅 문제)*
- [ ] LC 383. Ransom Note
- [ ] LC 349. Intersection of Two Arrays
- [ ] LC 202. Happy Number — `set`으로 사이클 감지

**프로그래머스**
- [ ] 폰켓몬 (Lv.1)
- [ ] 완주하지 못한 선수 (Lv.1)
- [ ] 전화번호 목록 (Lv.2)

---

### Day 4 · 7/12 (일) — 해시 ②

**프로그래머스**
- [ ] 의상 (Lv.2)
- [ ] 신고 결과 받기 (Lv.1, 카카오) — `dict of set` 활용
- [ ] 베스트앨범 (Lv.3) — 해시 + 정렬 복합, 오늘의 메인

**LeetCode**
- [ ] LC 3. Longest Substring Without Repeating Characters *(맛만 보고 Day 12에 재도전)*
- [ ] LC 560. Subarray Sum Equals K *(여유되면 — 누적합 + 해시)*
- [ ] LC 128. Longest Consecutive Sequence *(여유되면)*

---

### Day 5 · 7/13 (월) — 스택 ①

**개념**: 스택 = 리스트의 `append` / `pop`. "짝을 맞춘다", "직전 것을 되돌린다" 신호.

**LeetCode**
- [ ] LC 20. Valid Parentheses
- [ ] LC 1047. Remove All Adjacent Duplicates In String
- [ ] LC 844. Backspace String Compare
- [ ] LC 232. Implement Queue using Stacks

**프로그래머스**
- [ ] 같은 숫자는 싫어 (Lv.1)
- [ ] 크레인 인형뽑기 게임 (Lv.1, 카카오)
- [ ] 올바른 괄호 (Lv.2)

---

### Day 6 · 7/14 (화) — 스택 ② (모노토닉 스택)

> 오늘이 1주차 최고 난이도. **"오른쪽에서 나보다 큰/작은 첫 번째 값"** 패턴을 익힌다.

**LeetCode**
- [ ] LC 155. Min Stack
- [ ] LC 150. Evaluate Reverse Polish Notation
- [ ] LC 496. Next Greater Element I — 모노토닉 스택 입문
- [ ] LC 739. Daily Temperatures ⭐ — 여기서 한 번 막힌다. 30분 룰 적용
- [ ] LC 84. Largest Rectangle in Histogram *(여유되면 — Hard)*

**프로그래머스**
- [ ] 주식가격 (Lv.2)

---

### Day 7 · 7/15 (수) — 큐 / 덱 + 1주차 복습

**개념**: `from collections import deque` — 큐를 `list.pop(0)`으로 짜면 시간초과. Day 1 표 복기.

**프로그래머스**
- [ ] 기능개발 (Lv.2)
- [ ] 프로세스 (Lv.2)
- [ ] 다리를 지나는 트럭 (Lv.2)
- [ ] 프린터 (Lv.2) *(여유되면)*

**LeetCode**
- [ ] LC 933. Number of Recent Calls

**복습 (필수)**
- [ ] LC 739 Daily Temperatures 백지에서 다시 구현
- [ ] 오답노트 1주차분 통독

---

## 2주차 — 정렬 / 이분탐색 / 투포인터 / 힙 / 그리디 (7/16 ~ 7/22)

### Day 8 · 7/16 (목) — 정렬 ①

**개념**: `sorted(key=lambda x: ...)`, 다중 기준 `key=lambda x: (-x[1], x[0])`, `functools.cmp_to_key`

**프로그래머스**
- [ ] 문자열 내 마음대로 정렬하기 (Lv.1)
- [ ] K번째수 (Lv.1)
- [ ] 가장 큰 수 (Lv.2) — `cmp_to_key`의 존재 이유
- [ ] 실패율 (Lv.1, 카카오) — 다중 기준 정렬

**LeetCode**
- [ ] LC 179. Largest Number *(위 "가장 큰 수"와 동일 문제 — 영어로 다시)*
- [ ] LC 148. Sort List *(여유되면)*

---

### Day 9 · 7/17 (금) — 정렬 ② (구간/스위핑)

**LeetCode**
- [ ] LC 75. Sort Colors — 더치 국기 문제
- [ ] LC 56. Merge Intervals ⭐ — 구간 문제의 원형
- [ ] LC 57. Insert Interval
- [ ] LC 435. Non-overlapping Intervals *(그리디로 넘어가는 다리)*

**프로그래머스**
- [ ] H-Index (Lv.2)
- [ ] 문자열 내 마음대로... 남았으면 마저

---

### Day 10 · 7/18 (토) — 이분탐색 ①

**개념**: `while lo < hi` vs `lo <= hi` 템플릿 하나를 정해서 **평생 그것만 쓴다.** `bisect_left` / `bisect_right`도 확인.

**LeetCode**
- [ ] LC 704. Binary Search
- [ ] LC 35. Search Insert Position
- [ ] LC 278. First Bad Version
- [ ] LC 74. Search a 2D Matrix
- [ ] LC 153. Find Minimum in Rotated Sorted Array
- [ ] LC 33. Search in Rotated Sorted Array

---

### Day 11 · 7/19 (일) — 이분탐색 ② (파라메트릭 서치)

> **핵심**: 값을 찾는 게 아니라 *조건을 만족하는 최소/최대*를 찾는다.
> `def possible(x): ...` 판별 함수를 먼저 짜고, 그 위에 이분탐색을 얹는다.

**프로그래머스**
- [ ] 입국심사 (Lv.3) ⭐ — 파라메트릭 서치 대표 문제
- [ ] 예산 (Lv.4) *(생각보다 쉬움)*
- [ ] 징검다리 (Lv.4) *(여유되면)*

**LeetCode**
- [ ] LC 875. Koko Eating Bananas ⭐
- [ ] LC 1011. Capacity To Ship Packages Within D Days
- [ ] LC 410. Split Array Largest Sum *(여유되면 — Hard)*

---

### Day 12 · 7/20 (월) — 투포인터 / 슬라이딩 윈도우

> 슬라이딩 윈도우는 투포인터의 변형. Day 4에서 맛본 LC 3번을 오늘 제대로 끝낸다.

**LeetCode**
- [ ] LC 167. Two Sum II
- [ ] LC 11. Container With Most Water
- [ ] LC 15. 3Sum ⭐ — 정렬 + 투포인터, 중복 제거가 관건
- [ ] LC 3. Longest Substring Without Repeating Characters ⭐ *(재도전)*
- [ ] LC 209. Minimum Size Subarray Sum
- [ ] LC 424. Longest Repeating Character Replacement *(여유되면)*

**프로그래머스**
- [ ] 보석 쇼핑 (Lv.3, 카카오) — 슬라이딩 윈도우 실전

---

### Day 13 · 7/21 (화) — 힙 (우선순위 큐)

**개념**: `heapq`는 최소힙만 지원 → 최대힙은 부호 뒤집기 `heappush(h, -x)`. 튜플 넣으면 첫 원소 기준.

**LeetCode**
- [ ] LC 1046. Last Stone Weight
- [ ] LC 215. Kth Largest Element in an Array
- [ ] LC 347. Top K Frequent Elements
- [ ] LC 703. Kth Largest Element in a Stream
- [ ] LC 23. Merge k Sorted Lists *(여유되면 — Hard)*

**프로그래머스**
- [ ] 더 맵게 (Lv.2)
- [ ] 이중우선순위큐 (Lv.3)
- [ ] 디스크 컨트롤러 (Lv.3) *(여유되면 — 난이도 높음)*

---

### Day 14 · 7/22 (수) — 그리디 + 2주차 복습

> 그리디는 **"이 선택이 왜 최적인지" 근거를 30초 안에 말할 수 있을 때만** 쓴다. 아니면 DP를 의심.

**프로그래머스**
- [ ] 체육복 (Lv.1)
- [ ] 큰 수 만들기 (Lv.2) ⭐ — 스택 + 그리디
- [ ] 구명보트 (Lv.2)
- [ ] 조이스틱 (Lv.2) *(여유되면 — 그리디 함정 문제)*

**LeetCode**
- [ ] LC 55. Jump Game
- [ ] LC 45. Jump Game II
- [ ] LC 122. Best Time to Buy and Sell Stock II

**복습 (필수)**
- [ ] 입국심사 / Koko Eating Bananas 백지 재구현
- [ ] 이분탐색 템플릿 손코딩 3회

---

## 3주차 — 완전탐색 / DFS·BFS / 백트래킹 / 최단경로 (7/23 ~ 7/29)

> **합격선을 가르는 구간.** 여기에 가장 많은 시간을 쓸 것.
> 2차원 격자 탐색 템플릿(`dx, dy = [-1,1,0,0], [0,0,-1,1]`)은 손이 기억할 때까지 반복.

### Day 15 · 7/23 (목) — 완전탐색 ①

**개념**: `from itertools import permutations, combinations, product`

**프로그래머스**
- [ ] 최소직사각형 (Lv.1)
- [ ] 모의고사 (Lv.1)
- [ ] 로또의 최고 순위와 최저 순위 (Lv.1, 카카오)
- [ ] 소수 찾기 (Lv.2) — permutations + 에라토스테네스

**LeetCode**
- [ ] LC 17. Letter Combinations of a Phone Number *(재귀 맛보기)*

---

### Day 16 · 7/24 (금) — 완전탐색 ② / 재귀

> 재귀 3요소: **① 종료 조건 ② 상태 전이 ③ 되돌리기(pop)**

**프로그래머스**
- [ ] 카펫 (Lv.2)
- [ ] 타겟 넘버 (Lv.2) ⭐ — DFS 입문, 재귀의 첫 벽
- [ ] 피로도 (Lv.2)
- [ ] 전력망을 둘로 나누기 (Lv.2) *(여유되면)*

**LeetCode**
- [ ] LC 77. Combinations
- [ ] LC 22. Generate Parentheses

---

### Day 17 · 7/25 (토) — DFS (격자 / 연결 요소)

**LeetCode**
- [ ] LC 733. Flood Fill — 격자 DFS 최소 형태
- [ ] LC 200. Number of Islands ⭐ — 이 문제 하나가 격자 탐색의 전부
- [ ] LC 695. Max Area of Island
- [ ] LC 547. Number of Provinces
- [ ] LC 130. Surrounded Regions *(여유되면)*

**프로그래머스**
- [ ] 네트워크 (Lv.3) — 연결 요소 세기

---

### Day 18 · 7/26 (일) — BFS (최단거리)

> **BFS = 최단거리, DFS = 모든 경로.** 이 구분만 확실히 하면 3주차의 절반은 끝.
> "몇 칸 만에?" "최소 몇 번?" → 무조건 BFS.

**프로그래머스**
- [ ] 게임 맵 최단거리 (Lv.2) ⭐

**LeetCode**
- [ ] LC 994. Rotting Oranges — 멀티소스 BFS
- [ ] LC 1091. Shortest Path in Binary Matrix
- [ ] LC 542. 01 Matrix
- [ ] LC 102. Binary Tree Level Order Traversal *(트리 BFS)*

---

### Day 19 · 7/27 (월) — 그래프 응용

**LeetCode**
- [ ] LC 133. Clone Graph
- [ ] LC 207. Course Schedule — 위상정렬 / 사이클 판별
- [ ] LC 210. Course Schedule II
- [ ] LC 127. Word Ladder *(아래 "단어 변환"과 같은 문제)*

**프로그래머스**
- [ ] 단어 변환 (Lv.3) — BFS 상태 전이
- [ ] 가장 먼 노드 (Lv.3)

---

### Day 20 · 7/28 (화) — 백트래킹

> Day 16 재귀 3요소를 그대로 확장. 시작 인덱스(`start`)를 넘기느냐, 방문 배열을 쓰느냐로 조합/순열이 갈린다.

**LeetCode**
- [ ] LC 78. Subsets
- [ ] LC 46. Permutations
- [ ] LC 39. Combination Sum
- [ ] LC 90. Subsets II — 중복 제거
- [ ] LC 79. Word Search ⭐ — 백트래킹 + 격자
- [ ] LC 131. Palindrome Partitioning *(여유되면)*

**프로그래머스**
- [ ] N-Queen (Lv.3) *(여유되면 — 백트래킹의 고전)*

---

### Day 21 · 7/29 (수) — 최단경로 + 3주차 복습

**개념**: 다익스트라 = BFS + 우선순위 큐(2주차 힙). **가중치가 있으면 BFS가 아니라 다익스트라.**

**LeetCode**
- [ ] LC 743. Network Delay Time
- [ ] LC 787. Cheapest Flights Within K Stops *(여유되면)*

**프로그래머스**
- [ ] 배달 (Lv.2) — 다익스트라 입문
- [ ] 순위 (Lv.3) — 플로이드-워셜
- [ ] 여행경로 (Lv.3) — DFS + 백트래킹

**복습 (필수)**
- [ ] Number of Islands / 게임 맵 최단거리 백지 재구현
- [ ] BFS·DFS 템플릿 손코딩 3회

---

## 4주차 — DP + 구현 + 실전 (7/30 ~ 8/7)

> DP는 코딩 전에 **주석으로 먼저 세 줄**을 적는다:
> `① 상태 정의 dp[i] = ... ② 점화식 ③ 초기값`
> 이걸 못 적으면 코드도 못 짠다. 손이 아니라 종이가 먼저다.

### Day 22 · 7/30 (목) — DP ① 1차원 기초

**LeetCode**
- [ ] LC 509. Fibonacci Number — 재귀 → 메모이제이션 → 타뷸레이션, **세 버전 다 짜볼 것**
- [ ] LC 70. Climbing Stairs
- [ ] LC 746. Min Cost Climbing Stairs
- [ ] LC 198. House Robber ⭐
- [ ] LC 213. House Robber II — 원형

**프로그래머스**
- [ ] 피보나치 수 (Lv.2)
- [ ] 멀리 뛰기 (Lv.2)

---

### Day 23 · 7/31 (금) — DP ② 배낭 / 경로

**LeetCode**
- [ ] LC 322. Coin Change ⭐ — 4주차 최중요
- [ ] LC 518. Coin Change II — 순서 차이가 답을 바꾼다
- [ ] LC 279. Perfect Squares
- [ ] LC 62. Unique Paths
- [ ] LC 63. Unique Paths II

**프로그래머스**
- [ ] 등굣길 (Lv.3) — Unique Paths II와 동일 구조

---

### Day 24 · 8/1 (토) — DP ③ 부분수열 / 구간

**LeetCode**
- [ ] LC 53. Maximum Subarray
- [ ] LC 152. Maximum Product Subarray
- [ ] LC 300. Longest Increasing Subsequence ⭐
- [ ] LC 139. Word Break
- [ ] LC 416. Partition Equal Subset Sum *(여유되면)*

**프로그래머스**
- [ ] 정수 삼각형 (Lv.3)

---

### Day 25 · 8/2 (일) — DP ④ 2차원

**LeetCode**
- [ ] LC 64. Minimum Path Sum
- [ ] LC 1143. Longest Common Subsequence ⭐
- [ ] LC 72. Edit Distance *(여유되면 — LCS 확장)*
- [ ] LC 5. Longest Palindromic Substring *(여유되면)*

**프로그래머스**
- [ ] 도둑질 (Lv.4) — House Robber II 응용
- [ ] N으로 표현 (Lv.3) *(여유되면)*

---

### Day 26 · 8/3 (월) — 구현 ① (카카오 기출)

> 구현은 아이디어가 아니라 **꼼꼼함**. 문제를 두 번 읽고, 예외 케이스를 먼저 종이에 적는다.

**프로그래머스**
- [ ] 신규 아이디 추천 (Lv.1)
- [ ] 숫자 문자열과 영단어 (Lv.1)
- [ ] 키패드 누르기 (Lv.1)
- [ ] 오픈채팅방 (Lv.2)
- [ ] 문자열 압축 (Lv.2)

---

### Day 27 · 8/4 (화) — 구현 ② (시뮬레이션)

**프로그래머스**
- [ ] 튜플 (Lv.2, 카카오)
- [ ] 주차 요금 계산 (Lv.2, 카카오)
- [ ] [1차] 캐시 (Lv.2, 카카오)
- [ ] 방문 길이 (Lv.2, 카카오) *(여유되면)*

**LeetCode**
- [ ] LC 54. Spiral Matrix
- [ ] LC 48. Rotate Image
- [ ] LC 289. Game of Life *(여유되면)*

---

### Day 28 · 8/5 (수) — 실전 모의고사 ①
- 타이머 **2시간**, 카카오 기출 1세트(4~5문제) 또는 LC Virtual Contest
- 끝난 뒤 오답노트 작성. **채점보다 오답노트가 본체.**

### Day 29 · 8/6 (목) — 실전 모의고사 ②
- 동일 방식, 다른 세트
- Day 28에서 틀린 문제 백지 재구현

### Day 30 · 8/7 (금) — 실전 모의고사 ③ + 전체 리뷰
- ⭐ 표시 문제 전체(약 14문제) 백지에서 다시 짜기
- 오답노트 통독
- 자주 쓰는 템플릿 정리: 이분탐색 / BFS 격자 / DFS 백트래킹 / 다익스트라

---

## 매일 지키는 규칙

1. **30분 룰** — 30분 고민 후 안 풀리면 답을 본다. 대신 **다음 날 백지에서 다시 짠다.** 이 재작성이 실력의 90%.
2. **오답노트 3줄** — `막힌 지점 / 핵심 아이디어 / 시간복잡도`
3. **양보다 반복** — ⭐ 문제 14개를 세 번 푸는 게, 새 문제 100개보다 낫다.

---

## 조정 가이드

- **하루 못 했을 때**: 밀리지 말고 그날 `(여유되면)` 문제부터 버린다. 필수만 챙기면 진도는 유지된다.
- **문제가 너무 많다 싶으면**: 각 날짜에서 LeetCode 3개 + 프로그래머스 2개만. 그것도 하루치로 충분하다.
- **3주차가 어렵다면**: 4주차 DP를 하루 줄이고 3주차에 하루 더 준다. DP보다 그래프의 출제 빈도가 높다.

| 목표 | 강화할 부분 |
|---|---|
| 카카오 | Day 26~27 구현 파트를 3일로 확장 |
| 네카라쿠배 | 3주차(그래프) + 카카오 구현 기출 |
| 외국계 | LeetCode DP · 그래프 · 트리 집중, 프로그래머스 비중 축소 |
