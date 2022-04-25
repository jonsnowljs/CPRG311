# Binary Search Trees and Serialization

## INTRODUCTION

### What the program does.
This program takes a user input for a text file and generates a Binary Tree of word objects which are serialized in a file called repository.ser. Users have 3 options for printing information. Users can print all the words stored along with the list of files in which the words occur, they can print all the words along with list of files and numbers of the lines in which the word occur or they can print all the words along with the list of files, number of lines and frequency of the occurence of the words.

### Date
24 April, 2022

### Author
Jiasheng Lu, Hardish Chander, Desmond Yuen, Chinedu Alake



## REQUIREMENTS


This program requires JDK1.8 installed on the computer.



## INSTRUCTIONS

### How to run the program

1. Copy the input text file in data folder.
2. Open commandline in the folder where WordTracker.jar file is located.
3. The program takes 3 arguments. argument 1 is for the input file location, argument 2 is for the type of processing of the words (explained further in step 5) and argument 3 is for output file location.
4. The input format is as follows:
	
	java -jar WordTracker.jar <input.txt> -pf/-pl/-po [-f <output.txt>]

5. For the type of processing, users have 3 options as listed

	-pf: prints all the words in alphabetic order along with list of files in which the words occur.
	-pl: prints all the words in alphabetic order along with list of files and numbers of the lines in which the words occur.
	-po: prints all the words in alphabetic order along with list of files, numbers of the lines and frequencey of the occurrence of the words.

6. Valid inputs for the program are

	java -jar WordTracker.jar data/inputfile1.txt -pf -f data/outputfile1.txt
	java -jar WordTracker.jar data/inputfile2.txt -pl -f data/outputfile2.txt
	java -jar WordTracker.jar data/inputfile3.txt -po -f data/outputfile3.txt

	use -f before output file location.

## TESTS

Various JUnit tests can be performed with this program.
