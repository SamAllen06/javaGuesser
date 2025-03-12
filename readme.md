Java Guesser

make a class called Guesser
	in the initializer, make main
		set keepGoing to true
		start a while loop		
			response gets the result from Menu()
			if response == "0"
				print goodbye
				end while loop
			else if response == "1"
				call the humanGuesser() method
			else if response == "2"
				call the computerGuesser() method
			else
				print "Sorry, try again"

	create a menu() method
			print a menu with three options, 0: Quit, 1: Human Guesser, and 2: Computer Guesser
		return the response as a string

	create humanGuesser() method
		int guessNumber gets 0
		int answer gets a random number from 1-100
		print it for debug reasons
		start a while loop using keepGoing
			guessNumber += 1
			print "What's your guess?"
			if their response is greater than answer, print "Too high"
			else if their response is lower than answer, print "Too low"
			else if their response is equal to answer, print "Correct"!
				set keepGoing to false
				if guessNumber is less than 7, print "you did amazing!"
				if guessNumber == 7, print "You did fine"
				if guessNumber is greater than 7, print "Ah, you can get it in less guesses than that!"	
					

	create computerGuesser() method
		int lowEnd = 0
		int highEnd = 100
		print "Think of a number"
		start a while loop using keepGoing
			guess = (lowEnd + highEnd)/2
			print "Is it " + guess + "Too (H)igh, too (L)ow, or (C)orrect"
			if the user's response is "H" highEnd gets guess
			else if the user's response is "L" lowEnd gets guess
			else if the user's response is "c" print "I win", keepGoing gets false
			else print "Sorry, invalid response, let's try again"
			if lowEnd == highEnd, print "You either made a mistake or cheated. You're welcome to play again"
