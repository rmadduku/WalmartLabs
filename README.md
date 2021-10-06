Problem Statement:
Design and write a seat assignment program to maximize both customer satisfaction and customer safety. For the purpose of public safety, assume that a buffer of three seats and/or one row is required.

Getting Started:

Download the code using the Github link, unzip it and navigate to the src folder, and have Java 1.8+ installed.

1.) Run the following command:
	javac Main.java
2.) Create a input file to your liking

3.) Run the folloiwng command:
	java Main "input file_name"


Assumptions:

The solution is designed for a 10 x 20 sized theather, but can easily be changed.
The solution assumes that row A is the closest to the screen, whereas row J is the farthest.
The solution assumes that if a customer does not get a seat in their preferred row, they will take the next backmost row.
The solution assumes the input passes basic sanity checks, like being in the given format, and not given negative, or overcapacity seat numbers and rows.
