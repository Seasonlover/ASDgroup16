package Model;

import java.util.*;

/**
 * 
 */
public class MatchMaker {

    /**
     * Default constructor
     */
    public MatchMaker() {
    }

    /**
     * 
     */
    private Learning learning;

    /**
     * 
     */
    private List<Match> match;

    /**
     * 
     */
    private List<Responder> respondersTennisClubs;















    /**
     * @param request 
     * @return
     */
    public AnswerForBooking requestClub(RequestToBookTime request) {
        // TODO implement here
        return null;
    }

    /**
     * @param playerRequest 
     * @param requester
     */
    public void sendInvitations(RequestToMatchPlayers playerRequest, Requester requester) {
        // TODO implement here
    }

    /**
     * @param response 
     * @param match
     */
    public void updateMatch(ResponseForInvitation response, Match match) {
        // TODO implement here
    }

    /**
     * @param match
     */
    public void completeMatch(Match match) {
        // TODO implement here
    }

}