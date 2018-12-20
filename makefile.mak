JFLAGS =  -cp ".:/usr/share/java/*"
J = java
JC = javac
RM = rm -f
FILES = AccountManagement.java AnswerForBooking.java AnswerFromResponder.java Confirmation.java ContactInformation.java Feedback.java Invitation.java Learning.java Logging.java Login.java Match.java MatchMaker.java PaymentMethod.java Preferences.java Requester.java RequestToBookTime.java RequestToMatchPlayers.java Responder.java ResponseForInvitation.java TennisClub.java Tuple.java UsageStatistics.java User.java

all: 	files

clean: $(RM) Model/*.class

files: 
	$(JC) $(JFLAGS) $(FILES:%=Model/%)

	
