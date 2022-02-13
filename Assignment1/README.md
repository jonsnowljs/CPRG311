# Sorting out Sorting

## INTRODUCTION
***

### What the program does.
This program consists of a Shape abstract class which is inherited by various shapes such as Cone, Cylinder, Prism etc. It has 6 Sorting algorithms implemented namely Bubble Sort, Selection Sort, Insertion Sort, Merge Sort, Quick Sort and Heap Sort. It can take in an array of different shapes and can be sorted in ascending order using both height of the shape as comparable method or volume or base area of the shape as comparator method.
Testing class consists of JUnit tests.

### Date
12 February, 2022

### Author
Jiasheng Lu, Hardish Chander, Desmond Yuen, Chinedu Alake



## REQUIREMENTS
***

	This program requires JDK1.8 installed on the computer.



## INSTRUCTIONS
***

### How to run the program

1. Open commandline in the folder where Sort.jar file is located.
2. It takes 3 arguments, one for File (-f or -F), one for Type of comparison(-t or -T) and one for Sorting algorithm(-s or -S). Valid inputs for this program can be:

	```console
	java -jar sort.jar -fpolyfor1.txt -Tv -Sb

	java -jar sort.jar -ta -sQ -fpolyfor3.txt

	java -jar sort.jar -tH -Fpolyfor5.txt –sB
	```

	where `-f` can be followed by the file name stored in data folder.
	`-t` can be followed by `v` for volume comparison, `h` for height comparison, `a` for base area comparison.
	`-s` can be followed by `b` for bubble sort, `s` for selection sort, `i` for insertion sort, `m` for merge sort, `q` for quick sort, and `z` for heap sort. All the arguments are case insensitive.

3. The program should read the file in and sort the given array of shapes in ascending order. It should also display the time taken to sort the array.

### How to setup your own shapes txt file

1. Make a text file in data folder inside Assignment1 and give it a name.
2. Enter the total number of shapes you want to compare as the first value in the text file.
3. Enter the name of a shape, valid shapes are (Cone, Cylinder, Pyramid, TriangularPrism, SquarePrism, PentagonalPrism, OctagonalPrism) followed by height and radius or side dimensions. Examples are as follows:
   
	```	
	Cylinder 12.1 6.8
	Cone 31456.952 8487.446
	PentagonalPrism 1533.335 18882.648
	```

4. Make sure to have the same number of shapes as the total number described in step 2.
5. Save the file.


## TESTS
***

Various JUnit tests can be performed with this program.
