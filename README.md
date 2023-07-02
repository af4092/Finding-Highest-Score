# Finding-Highest-Score
Java application which finds highest and lowest score with the name, it is built to run inside the docker container

- This is the simple program which takes the number of students, then asks for their name and scores until the number of students reached.
- Then displays the highest score with the name and lowest score with the student's name.
  - First of all after making the `highestscore.java` api, we then make it docker image with the following command(windows+gitbash):
    ```
    $ docker build -t score-api .
    ```
  - Then we can check for our created image:
    ```
    $ docker images
    ```
    
<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/227763698-fe497afd-f9f7-4ba2-97d0-4d8a1782d116.png" alt="Image">
</p>

  - Then we can run the image inside the docker container:
    
  ```
  $ winpty docker run -it score-api
  ```
 
<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/227763629-6050c72c-34a3-42ae-86ab-93c19a65953b.png" alt="Image">
</p>

## [Implementation](https://github.com/af4092/Finding-Highest-Score/blob/main/docker3/highestscore.java)

- Code represents a program that finds the highest scored student among a group of students. Here's how the code works:
  - The program starts by prompting the user to enter the number of students using the `Scanner` class.
  - It initializes variables to store the names and scores of the highest scored student and the second highest scored student. Initially, these variables are empty or set to 0.
  - A loop is executed `NumberOfStudents` times to input the names and scores of each student. Within the loop:
   - The program prompts the user to enter the name and score of the current student.
   - The program compares the current score with the highest score. If the current score is greater than the highest score, the variables storing the highest score and the highest scored student's name are updated. The previous highest score and its corresponding student are moved to the second highest score and student variables.
  - After all the students' names and scores are entered and compared, the program prints a line of dashes for formatting.
  - Finally, the program outputs the names and scores of the highest scored student and the second highest scored student.
