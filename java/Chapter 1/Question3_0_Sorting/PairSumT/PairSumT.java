package Question3_0_Sorting.PairSumT;

/**
 * Created by SiyuanZeng's on 8/23/2016.
 */
public class PairSumT {
//    2 Sum Problem : Given an integer array and a number T, find all unique pairs of (a, b) whose sum is equal to T

    /*
    *
    *
    *  given an array of n integers and a target sum T. The goal is to determine whether or not there are two numbers x,y in A with x+y=T.

Example : Suppose we have an int array = {5, 3, 7, 0, 1, 4, 2} and T = 5. The unique pairs that sum up to 5 are (5, 0) (3, 2) and (1, 4).

There are three approaches to solve this problem - 1) brute force, 2) sort the array and use binary and search, and 3) Using the hashtable.
Please scroll down, if you are only interested in the best approach i.e. approach 3 using hashtables.

Approach 1 : Brute force method
The first approach is to use brute force which gives time complexity of O(n^2) and space complexity of O(n). We basically just have to loop through the array and for each number we add it to each of other numbers and see if they sum up to 5. If so, we print out the pair. Here is the code for brute force approach:
?
1
2
3
4
5
6
7
8
9
10
11
void findPairOfSum(int arrayOfNum[], int arraySize, int sum)
{
  for (int i = 0; i < arraySize; i++)
  {
    for (int j = i; j < arraySize; j++)
    {
      if (arrayOfNum[i] + arrayOfNum[j] == sum)
        cout << "(" << arrayOfNum[i] << ", " << arrayOfNum[j] << ")" << endl;
    }
  }
}
The second approach is to use a hash table to store the difference between sum and each of the elements in the array. Then as we loop through the array, check each element against the hash table. If the element presents, then print out the key value pair. For example, if we hash the example array we'll have this hash table:
Key   Value
5        5 - 5 = 0
3        5 - 3 = 2
7        5 - 7 = -2
0        5 - 0 = 5
1        5 - 1 = 4
4        5 - 4 = 1
2        5 - 3 = 2

This approach will have the time complexity of O(n) and space complexity of O(n). Thus, chose your method wisely, depending on your need (speed or space efficiency).

2nd Approach - Use sorted array
A better way would be to sort the array. This takes O(n log n)
Then for each x in array A, use binary search to look for T-x. This will take O(nlogn).
So, overall search is  O(n log n)

Hers is how the pseudo code will look:
?
1
2
3
4
5
6
7
8
9
arr = {};//some array
sortedArr = sort(arr);
for( i = 0;i < arr.length - 1; i++)
{
   x = arr[i];
   bool found = binarySearch(sortedArr, T-x);//Search for T-x in sorted Arrary
   if(found)
    print "pair", x, T-x;
}

Approach 2b - Using sorting but using variant of binary search
Assuming array sorted in ascending order. Now we take first and last element, and sum them up. If sum is equal to T, we have found the pair, but if sum is greater than T, we reduce right pointer by 1, or increment left pointer otherwise.

?
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
arr = {};//some array
sortedArr = sort(arr);
left = start;
right= arr.length;
while(left < right)
{
   x = arr[left];
   y = arr[right];
   sum = x+y;
   if(sum == T)
      found=true;
   if(sum > T)
      right--;
   if(sum < T)
      left++;

   if(found)
    print "pair", x, T-x;
}

3rd and Best - Use hash table
I have already mentioned in problem in the application of hash table here.
The best way would be to insert every element into a hash table (without sorting). This takes O(n) as constant time insertion.
Then for every x, we can just look up its complement, T-x, which is O(1).
Overall it takes will be O(n).

Here is how the pseudocode will look.
?
1
2
3
4
5
6
7
8
9
10
11
12
13
14
Let arr be the given array.
And T be the given sum

for (i=0 i<arr.length - 1 ;i++)
{
  hash(arr[i]) = i  // key is the element and value is its index.
}

for (i=0 i<arr.length - 1; i++)
{
  if (hash(T - arr[i]) != i ) // if T - ele exists and is different we found a pair
    print "pair i , hash(T - arr[i]) has sum T"

}


    * */




}
