# CodeJam2016
Solutions for CodeJam2016 for women in Java

<b>Problem A. Cody's Jams</b> 
This contest is open for practice. You can try every problem as many times as you like, though we won't keep track of which problems you solve. Read the Quick-Start Guide to get started.
Small input
10 points	
Solve A-small
Large input
10 points	
Solve A-large
Problem

Cody, the owner of the legendary Cody's Jams store, is planning a huge jam sale. To make things simple, he has decided to sell every item in his store at a 25% discount — that is, each item's sale price is exactly 75% of its regular price. Since all of his regular prices happened to be integers divisible by four, his sale prices are conveniently also all integers.

To prepare for the sale, he placed an order to print new labels for all of his items at their sale prices. He also placed an order to print new labels for all of his items at their regular prices, to use once the sale is over.

Cody just came back from picking up his order. Unfortunately, the printer gave him both orders in one combined stack, sorted by price. Both the sale price and the regular price label for each item are present somewhere in the stack. However, both types of labels look the same, and since he does not remember the price of every item, he is not sure which labels are the sale price labels. Can you figure that out?

For instance, if the regular prices were 20, 80, and 100, the sale prices would be 15, 60, and 75, and the printer's stack would consist of the labels 15, 20, 60, 75, 80, and 100.

Input

The first line of the input gives the number of test cases, T. T test cases follow. Each test case consists of two lines. The first line contains a single integer N, the number of items in Cody's store. The second line contains 2N integers P1, P2, ..., P2N in non-decreasing order by the price printed on each label given by the printer.

Output

For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is a list of N integers: the labels containing sale prices, in non-decreasing order.

Limits

1 ≤ T ≤ 100.
1 ≤ Pi ≤ 109, for all i.
Pi ≤ Pi+1, for all i. (The prices are in non-decreasing order.)
It is guaranteed that a unique solution exists.
Small dataset

1 ≤ N ≤ 4.
Large dataset

1 ≤ N ≤ 100.
Sample


Input 
 	
Output 
 
2
3
15 20 60 75 80 100
4
9 9 12 12 12 15 16 20

Case #1: 15 60 75
Case #2: 9 9 12 15
Case #1 is the one described in the problem statement.

Notice in Case #2 that it is possible for multiple items to have the same price, and for an item to have a regular price that equals the sale price of another item.

---------------------------------------------
Problem B. Dance Around The Clock
This contest is open for practice. You can try every problem as many times as you like, though we won't keep track of which problems you solve. Read the Quick-Start Guide to get started.
Small input
10 points	
Solve B-small
Large input
15 points	
Solve B-large
Problem

The owner of a prestigious ballroom has painted a beautiful circular clock on the dance floor, and a group of D dancers numbered 1 through D are about to literally "dance around the clock". They are standing in a circle, with dancer 1 at the 12:00 position of the circle and the other dancers going clockwise around the circle in increasing numerical order. The number of dancers is even.

The dance will go on for N turns. On the i-th turn (counting starting from 1), the following will happen:

If i is odd, then the dancer currently at the 12:00 position will swap positions with the next dancer in clockwise order. Then, going past those two, the next pair of dancers in clockwise order will swap positions, and so on, all the way around the ring clockwise, until all dancers have participated in exactly one swap.
If i is even, then the dancer currently at the 12:00 position will swap positions with the next dancer in counterclockwise order. Then, going past those two, the next pair of dancers in counterclockwise order will swap positions, and so on, all the way around the ring counterclockwise, until all dancers have participated in a swap.
For example, this diagram shows the initial state and two turns of a dance with eight people.


Which two dancers will be next to dancer number K when the dance is over?

Input

The first line of the input gives the number of test cases, T. T test cases follow. Each consists of one line with three integers D, K, and N: the total number of dancers, the number of one of the dancers, and the number of turns the dance will go on for.

Output

For each test case, output one line containing Case #x: y z, where:

x is the test case number (starting from 1).
y is the number of the dancer who will be standing to dancer number K's left (that is, one step away in clockwise order) when the dance is over.
z is the number of the dancer who will be standing to dancer number K's right (that is, one step away in counterclockwise order) when the dance is over.
Limits

1 ≤ T ≤ 100.
D is even.
1 ≤ K ≤ D.
Small dataset

4 ≤ D ≤ 10.
1 ≤ N ≤ 10.
Large dataset

4 ≤ D ≤ 108.
1 ≤ N ≤ 108.
Sample


Input 
 	
Output 
 
3
8 3 1
8 4 2
4 1 8

Case #1: 6 4
Case #2: 1 7
Case #3: 2 4
For Cases #1 and #2, refer to the illustration above. In Case #1, after 1 turn, dancer 6 is to dancer 3's left, and dancer 4 is to dancer 3's right. In Case #2, after 2 turns, dancer 1 is to dancer 4's left, and dancer 7 is to dancer 4's right. Remember that you're looking from the dancer's perspective; it may help to think in terms of clockwise and counterclockwise instead of left and right.

In Case #3, after eight turns, the arrangement looks the same as the initial arrangement, with dancer 2 to dancer 1's left, and dancer 4 to dancer 1's right.

------------------------------------------------------
Problem C. Polynesiaglot
This contest is open for practice. You can try every problem as many times as you like, though we won't keep track of which problems you solve. Read the Quick-Start Guide to get started.
Small input 1
5 points	
Solve C-small-1
Small input 2
10 points	
Solve C-small-2
Large input
10 points	
Solve C-large
Problem

Ursula is a big fan of constructing artificial languages. Today, she is starting to work on a language inspired by real Polynesian languages. The only rules she has established are:

All words consist of letters. Letters are either consonants or vowels.
Any consonant in a word must be immediately followed by a vowel.
For example, in a language in which a is the only vowel and h is the only consonant, a, aa, aha, aaha, and haha are valid words, whereas h, ahh, ahah, and ahha are not. Note that the rule about consonants disallows ending a word in a consonant as well as following a consonant with another consonant.

If Ursula's new language has C different consonants and V different vowels available to use, then how many different valid words of length L are there in her language? Since the output can be a really big number, we only ask you to output the remainder of dividing the result by the prime 109+7 (1000000007).

Solving this problem

This problem has 2 Small inputs and 1 Large input. You must solve the first Small input before you can attempt the second Small input. You will be able to retry either of the Small inputs (with a time penalty). You will be able to make a single attempt at the Large, as usual, only after solving both Small inputs.

Input

The first line of the input gives the number of test cases, T. T test cases follow. Each consists of one line with three integers C, V, and L.

Output

For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the number of different valid words of length L in the language, modulo the prime 109+7 (1000000007).

Limits

Small dataset 1

T = 15.
C = 1.
V = 1.
1 ≤ L ≤ 15.
Small dataset 2

1 ≤ T ≤ 100.
1 ≤ C ≤ 50.
1 ≤ V ≤ 50.
1 ≤ L ≤ 15.
Large dataset

1 ≤ T ≤ 100.
1 ≤ C ≤ 50.
1 ≤ V ≤ 50.
1 ≤ L ≤ 500.
Sample


Input 
 	
Output 
 
2
1 1 4
1 2 2

Case #1: 5
Case #2: 6

In Case #1, suppose that the only vowel is a and the only consonant is h. Then the possible valid words of length 4 are: aaaa, aaha, ahaa, haaa, haha.

In Case #2 (which would not appear in the Small dataset 1), suppose that the two vowels are a and e and the only consonant is h. Then the possible valid words of length 2 are: aa, ae, ea, ee, ha, he.

----------------------------------------------------------------------------

Problem D. Password Security
This contest is open for practice. You can try every problem as many times as you like, though we won't keep track of which problems you solve. Read the Quick-Start Guide to get started.
Small input 1
10 points	
Solve D-small-1
Small input 2
20 points	
Solve D-small-2
Problem

You just bought your young nephew Andrey a complete set of 26 English wooden alphabet letters from A to Z. Because the letters come in a long, linear package, they appear to spell out a 26-letter message.

You use N different passwords to log into your various online accounts, and you are concerned that this message might coincidentally include one or more of them. Can you find any arrangement of the 26 letters, such that no password appears in the message as a continuous substring?

Solving this problem

This problem has 2 Small inputs and no Large input. You must solve the first Small input before you can attempt the second Small input. You will be able to retry either of the Small inputs (with a time penalty).

Input

The first line of the input gives the number of test cases, T. T test cases follow. Each consists of one line with an integer N, and then another line with N different strings of uppercase English letters P1, P2, ..., PN, which are the passwords.

Output

For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is a permutation of the entire uppercase English alphabet that contains no password as a continuous substring, or the word IMPOSSIBLE if there is no such permutation.

Limits

1 ≤ T ≤ 100.
1 ≤ length of Pi ≤ 26, for all i. (Each password is between 1 and 26 letters long.)
Pi ≠ Pj for all i ≠ j. (All passwords are different.)
Small dataset 1

N = 1.
Small dataset 2

1 ≤ N ≤ 50.
Sample


Input 
 	
7
1
ABCDEFGHIJKLMNOPQRSTUVWXYZ
1
X
1
QQ
5
XYZ GCJ OMG LMAO JK
3
AB YZ NM
6
C PYTHON GO PERL RUBY JS
2
SUBDERMATOGLYPHIC UNCOPYRIGHTABLES



Output 
 
Case #1: QWERTYUIOPASDFGHJKLZXCVBNM
Case #2: IMPOSSIBLE
Case #3: ABCDEFGHIJKLMNOPQRSTUVWXYZ
Case #4: ABCDEFGHIKLMNOPQRSTUVWXYJZ
Case #5: ZYXWVUTSRQPOMNLKJIHGFEDCBA
Case #6: IMPOSSIBLE
Case #7: THEQUICKBROWNFXJMPSVLAZYDG

For each of the non-IMPOSSIBLE cases, the sample output shows only one possible answer. There are many valid answers for these inputs.

Note that only sample cases #1, #2, and #3 would appear in Small dataset 1. Any of the sample cases could appear in Small dataset 2.



