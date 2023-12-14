# The Mythical Man-Month

## Chapter 3. The Surgical Team

### The Problem

- 프로그래머들의 실력에 따라서 생산성은 크게 10배까지 차이가 날 수 있으며, 프로그램의 효율성도 5배까지 차이가 날 수 있다.
- 하지만 경험이 많은 프로그래머들로만 이루어진 작은 팀은 큰 프로젝트를 수행하기에 너무 오랜 시간을 필요로 할 수 있다.

### Mills's Proposal

- Harlan Mills는 큰 작업의 각 세그먼트들을 외과 팀처럼 조직된 팀이 다루는 방법을 제안했다.
- Surgeon, copilot, administrator 등의 역할을 정의하고, 이들이 수행해야할 역할을 설정하였다.

### How It Works

- 이러한 팀 구조에서는 surgeon과 copilot이 모든 코드의 디자인을 인식하고 있기 때문에 일관성을 유지할 수 있다.
- 또한, 의견 충돌이 발생할 경우에는 surgeon이 결정을 내릴 수 있기 때문에 의사 결정이 빠르다.

### Scaling Up

- 수 백명이 투입되는 큰 프로젝트라 하더라도, 위와 같은 팀 구조를 따라서 여러 팀을 만들면 surgeon들의 의견만 모아지면 되기 때문에 생산성이 높아진다.

