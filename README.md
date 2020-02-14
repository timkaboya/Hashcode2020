# Google Hashcode 2020 Problem Attempt #

This is an attempt at the sample problem for Google Hashcode 2020. https://codingcompetitions.withgoogle.com/hashcode/about

### What is Hash Code?

Google’s team-based programming competition, Hash Code, allows you to share your skills and connect with other coders as you work together to solve a problem modeled off a real Google engineering challenge! In small teams of two to four, coders all over the world will tackle the first problem through an Online Qualification Round. Though this round is hosted online, teams can come together to compete side-by-side in locally coordinated Hash Code hubs. The top teams from this round are invited to join us at an international Google office for our annual Hash Code Final Round.


### Introduction 

You are organizing a Hash Code hub and want to order pizza for paicipants. Luckily, there is a nearby pizzeria with really good pizza.    

The pizzeria has dierent types of pizza, and to keep the food oering interesting, we can only order at most one pizza of each type.    
 Founately, there are many types of pizza to choose from!   
Each type of pizza has a specied size: the size is the number of pizza slices in it.   
Based on the number of paicipants, you estimated a maximum number of slices that you want to order – in order to reduce waste, 
the goal is to order as many pizza slices as possible, but not more than the maximum number.     

### Input

Each input data set is provided in a plain text le containing exclusively ASCII characters with lines terminated with a single '\n' character (UNIX-style line endings). When a single line contains multiple elements, they are separated by single spaces.
The rst line of the data set contains the following data:    
● an integer M (1 ≤ M ≤ 109) – the maximum number of pizza slices to order .  
● an integer N (1 ≤ N ≤ 105) – the number of dierent types of pizza     
The second line contains N integers: the number of slices in each type of pizza, in non-decreasing order:    

### Task 

To condense the essence of the question, this is the problem >>>
 Problem: Given an array of integers, [a], find the the indexes that give you the closest sum to X
 
### Output:  

File format
 The output should contain two lines:    
 ● The rst line should contain a single integer K (0 ≤ K ≤ N) – the number of
 dierent types of pizza to order.    
 ● The second line should contain K numbers – the types of pizza to order (the
 types of pizza are numbered from 0 to N-1 in the order they are listed in the input).   
 The total number of slices in the ordered pizzas must be less than or equal to M.     
 
### Solution

Solution in code is the dumb approach of adding pizzas from the highest to the lowest.    
This still gives a high scoring solution for the given datasets .  
    
TODO: Improve Greedy solution to add ordering based on how interesting .  
the transition can be. (Some common sets, and some not so common) .   

### Limitation

The greedy approach doesnt give you the best solution and 

4500 50
7 12 12 13 14 28 29 29 30 32 32 34 41 45 46 56 61 61 62 63 65 68 76 77 77 92 93 94 97 103 113 114 114 120 135 145 145 149 156 157 160 169 172 179 184 185 189 194 195 195
sum:7, 19, 31, 44, 58, ..., 4599
index: 0 - 49
4500 slices maximum
50 pizzas

// pseudo code

// best greedy or dumb/stupid algorithm that would solve this

// init sum value to zero

// loop from start to end
    // add curr value to sum
    // if (sum > max slices)
        // get previous position 
       
       
        
        
        
