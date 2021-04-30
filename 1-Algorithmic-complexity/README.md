- Nothing to implement
- There are a lot of videos here. Just watch enough until you understand it. You can always come back and review
- If some lectures are too mathy, you can jump down to the bottom and watch the discrete mathematics videos to get the background knowledge
- [ ] [Harvard CS50 - Asymptotic Notation (video)](https://www.youtube.com/watch?v=iOq5kSKqeR4)
- [ ] [Big O Notations (general quick tutorial) (video)](https://www.youtube.com/watch?v=V6mKVRU1evU)
- [ ] [Big O Notation (and Omega and Theta) - best mathematical explanation (video)](https://www.youtube.com/watch?v=ei-A_wy5Yxw&index=2&list=PL1BaGV1cIH4UhkL8a9bJGG356covJ76qN)
- [ ] Skiena:
    - [video](https://www.youtube.com/watch?v=gSyDMtdPNpU&index=2&list=PLOtl7M3yp-DV69F32zdK7YJcNXpTunF2b)
    - [slides](https://archive.org/details/lecture2_202008)
- [ ] [A Gentle Introduction to Algorithm Complexity Analysis](http://discrete.gr/complexity/)
- [ ] [Orders of Growth (video)](https://www.coursera.org/lecture/algorithmic-thinking-1/orders-of-growth-6PKkX)
- [ ] [Asymptotics (video)](https://www.coursera.org/lecture/algorithmic-thinking-1/asymptotics-bXAtM)
- [ ] [UC Berkeley Big O (video)](https://archive.org/details/ucberkeley_webcast_VIS4YDpuP98)
- [ ] [UC Berkeley Big Omega (video)](https://archive.org/details/ucberkeley_webcast_ca3e7UVmeUc)
- [ ] [Amortized Analysis (video)](https://www.youtube.com/watch?v=B3SpQZaAZP4&index=10&list=PL1BaGV1cIH4UhkL8a9bJGG356covJ76qN)
- [ ] [Illustrating "Big O" (video)](https://www.coursera.org/lecture/algorithmic-thinking-1/illustrating-big-o-YVqzv)
- [ ] TopCoder (includes recurrence relations and master theorem):
    - [Computational Complexity: Section 1](https://www.topcoder.com/community/competitive-programming/tutorials/computational-complexity-section-1/)
    - [Computational Complexity: Section 2](https://www.topcoder.com/community/competitive-programming/tutorials/computational-complexity-section-2/)
- [ ] [Cheat sheet](http://bigocheatsheet.com/)

# Time Complexity

Time and space complexity depends on lots of things like hardware, operating system, processors, etc. However, we don't consider any of these factors while analyzing the algorithm. We will only consider the execution time of an algorithm.

# Space complexity

Space complexity of an algorithm quantifies the amount of space or memory taken by an algorithm to run as a function of the length of the input.

# Order of Growth

Order of growth is how the time of execution depends on the length of the input.

# O-notation:

To denote asymptotic upper bound, we use O-notation. For a given function g(n), we denote by O(g(n))
(pronounced “big-oh of g of n”) the set of functions:

O(g(n))={ f(n): there exist positive constants c and n1 such that 0 ≤ f(n) ≤ c ∗ g(n) for all n ≥ n1}

# Ω-notation:

To denote asymptotic lower bound, we use Ω-notation. For a given function g(n), we denote by Ω(g(n))
(pronounced “big-omega of g of n”) the set of functions:

Ω(g(n))= { f(n) : there exist positive constants cand n0such that 0 ≤ c∗g(n) ≤ f(n) for all n≥n0}

# Θ-notation:

To denote asymptotic tight bound, we use Θ-notation. For a given function g(n), we denote by Θ(g(n))
(pronounced “big-theta of g of n”) the set of functions:

Θ(g(n))={ f(n): there exist positive constants c1,c2and n0 such that 0≤c1∗g(n)≤f(n)≤c2∗g(n)for all n>n0}

