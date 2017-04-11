> ![](media/image1.png)**Class vs. Instance**
>
> **Objective**
>
> In this challenge, we're going to learn about the difference between a
> class and an instance; because this is an Object Oriented concept,
> it's only enabled in certain languages. Check out the
> [Tutorial](https://www.hackerrank.com/challenges/30-class-vs-instance/tutorial)
> tab for learning materials and an instructional video!
>
> **Task**
>
> ![](media/image7.png)Write a Person class with an instance variable, ,
> and a constructor that takes an integer, ![](media/image8.png), as a
> parameter. The constructor must assign to ![](media/image9.png) after
> confirming the argument passed as ![](media/image10.png) is not
> negative; if a negative argument is passed as ![](media/image11.png),
> the constructor should set ![](media/image12.png) to and print Age is
> not valid, setting age to 0. . In addition, you must write the
> following instance methods:
>
> 1\. yearPasses() should increase the ![](media/image13.png) instance
> variable by .
>
> 2\. amIOld() should perform the following conditional actions: If
> ![](media/image14.png) ![](media/image15.png), print You are young. .
>
> If ![](media/image16.png) ![](media/image17.png) and
> ![](media/image18.png) ![](media/image19.png), print You are a
> teenager. . Otherwise, print You are old. .
>
> To help you learn by example and complete this challenge, much of the
> code is provided for you, but you'll be writing everything in the
> future. The code that creates each instance of your Person class is in
> the main method. Don't worry if you don't understand it all quite yet!
>
> **Note:** Do not remove or alter the stub code in the editor.
>
> **Input Format**
>
> Input is handled for you by the stub code in the editor.
>
> The first line contains an integer, (the number of test cases), and
> the subsequent lines each contain an integer denoting the
> ![](media/image20.png) of a Person instance.
>
> **Constraints**
>
> ![](media/image21.png)
>
> ![](media/image22.png)
>
> **Output Format**
>
> Complete the method definitions provided in the editor so they meet
> the specifications outlined above; the code to test your work is
> already in the editor. If your methods are implemented correctly, each
> test case will print or lines (depending on whether or not a valid
> ![](media/image23.png) was passed to the constructor).
>
> **Sample Input**
>
> 4
>
> -1
>
> ![](media/image24.png)10
>
> 16
>
> 18
>
> **Sample Output**
>
> ![](media/image25.png)Age is not valid, setting age to 0.
>
> You are young. You are young.
>
> You are young.
>
> You are a teenager.
>
> ![](media/image26.png)You are a teenager. You are old.
>
> You are old. You are old.
>
> **Explanation**
>
> Test Case 0:
>
> ![](media/image27.png)![](media/image29.png)Because , our code must
> set to and print the "Age is not valid..." message followed by the
> young message. Three years pass and , so we print the young message
> again.
>
> Test Case 1:
>
> ![](media/image31.png)Because , our code should print that the person
> is young. Three years pass and
>
> ![](media/image35.png) , so we print that the person is now a
> teenager.
>
> Test Case 2:
>
> ![](media/image36.png)Because ![](media/image39.png), our code should
> print that the person is a teenager. Three years pass and , so we
> print that the person is old.
>
> Test Case 3: ![](media/image40.png)
>
> ![](media/image41.png)Because , our code should print that the person
> is old. Three years pass and the person is still old at , so we print
> the old message again.
>
> **The extra line at the end of the output is supposed to be there and
> is trimmed before being compared against the test case's expected
> output. If you're failing this challenge, check your logic and review
> your print statements for spelling errors.**
