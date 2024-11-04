# AnimalSanctuaryProject

## Overview
	This is a simple program that simulates an animal
	sanctuary where the user can add animals to enclosures,
	name each animal, check what animals are where, and 
	have an attendant do rounds to feed the animals. It 
	runs on a constant loop until the program is exited 
	on purpose by the user.

## Technologies Used
	- Java
	- Eclipse
	- Sublime
	- Git/GitHub
	- MacOS Terminal

## Lessons Learned
	I went into this project a bit nervous as I knew
	I would be tasked with using arrays and iterating
	through them. This is a concept I had been struggling
	to grasp up to this point so it felt quite daunting. 
	But I utilized the for each auto complete feature 
	offered by Eclipse IDE and made quick work of a 
	few of them. Before I knew it, I had completed almost all
	of them and had some working logic. I even started to 
	grasp the standard for() loop much better and was able
	to use it different and approiate spots where I needed
	to use the index number in my logic.

	I was feeling great!

	Then I got to the user input portion where I
	had to build a menu, and gather input from the user.
	Creating a switch to take each "case" the user input
	started easy enough, but I quickly realized that I 
	would have create a sub menu in one of the case 
	scenarios. I ended up creating  a second switch inside
	the first switch to decipher that input. I'm sure 
	there was more simple apporach to this but this is 
	the solution I thought of. With my case switch and 
	imbedded case switch sorted, I began testing. 

	My switch logic was working great, and even giving
	the appropiate error if a number outside the case switch
	was input. However, if the user typed in anything 
	other than a number, the whole program crashed! The program
	didn't know how to handle input other than an integer. But after 
	some research and some re-thinking, it dawned on me that 
	I could use a String input instead of an integer for my switch 
	case in order to catch all keyboard inputs from the user. That 
	way, if they did not type in a number of available options exactly,
	(1, 2, 3, 4), the program would run the default error 
	message and start the loop again! Even if they typed words or 
	special characters. Now that I think about it I probably could
	have used if, else if statements instead of the second switch,
	but oh well! I like my solution, and it works!

	WooHoo!

	Very fun little project that taught me a ton about arrays,
	looping, method calling from outside classes and data types! 


