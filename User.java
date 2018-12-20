package Model;

import java.util.*;

/**
 * 
 */
public abstract class User {

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */
    private int userId;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private int userAge;

    /**
     * 
     */
    private int userSkillLevel;

    /**
     * 
     */
    private List<Match> matches;

    /**
     * 
     */
    private PaymentMethod payment;

    /**
     * 
     */
    private Preferences preferences;








    /**
     * @param uid 
     * @param psd 
     * @return
     */
    public synchronized Boolean loginUser(int uid, String psd) {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void deleteUser() {
        // TODO implement here
    }

    /**
     * @param oldpsd 
     * @param newpsd 
     * @return
     */
    public Boolean resetPassword(String oldpsd, String newpsd) {
        // TODO implement here
        return null;
    }

    /**
     * @param toUserId
     */
    public void writeFeedback(int toUserId) {
        // TODO implement here
    }

}