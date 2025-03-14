Guesser.class: Guesser.java
	javac Guesser.java

run: Guesser.class
	java Guesser

clean:
	rm *.class

debug: Guesser.class
	javac -g Guesser.java
	jdb Guesser
