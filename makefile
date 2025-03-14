Guesser.class: Guesser.java
	javac Guesser.java

run: Guesser.class
	java Guesser

clean:
	rm *.class

debug: Guesser.class
	jdb -g Guesser
