# Finding-Highest-Score
Java application which finds highest and lowest score with the name, it is built to run inside the docker container
This is the simple program which takes the number of students, then asks for their name and scores until the number of students reached. Then displays the highest score with the name and lowest score with the student's name. 
1) first of all after making the highestscore.java api, we then make it docker image with the following command(windows+gitbash):
  $docker build -t score-api .
2)then we can check for our created image:
  $docker images
  
<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/227763698-fe497afd-f9f7-4ba2-97d0-4d8a1782d116.png" alt="Image">
</p>

3) then we can run the image inside the docker container:
  $winpty docker run -it score-api
   
<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/227763629-6050c72c-34a3-42ae-86ab-93c19a65953b.png" alt="Image">
</p>

