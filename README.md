# sum_is_palindrome
Reverse and Add given number repeatedly to get a Palindrome number
Write a program that takes number and gives the resulting palindrome (if one exists). If it took more than 1, 000 iterations (additions) or yield a palindrome that is greater than 4, 294, 967, 295, assume that no palindrome exist for the given number.

Examples: 

Input: N = 195
Output: 9339

Input: N = 265
Output: 45254


Input: N = 196
Output: No palindrome exist

/* n=195
 * rev=591
 * sum=n+rev=786=n
 * rev=687
 * sum=n+rev=1473=n
 * rev=3741
 * sum=n+rev=5214=n
 * rev=4125
 * sum=n+rev=9889=n
 * rev=9889
 * hence palidrome exists
 */
