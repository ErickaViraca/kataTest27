package org.fundacionjala.kataEvaporator;

import java.util.StringTokenizer;

/**
 * Created by erickaviraca on 10/27/2016.
 */
class SpinWords {

    private static final String DELIM = " ";

    /**
     * Separates each word of the text.
     *
     * @param welcome text to be evaluated.
     * @return the text with the respected words reverted.
     */
    String spinWords(String welcome) {
        StringTokenizer text = new StringTokenizer(welcome, DELIM);
        String res = "";
        while (text.hasMoreTokens()) {
            String s = text.nextToken();
            res += DELIM + evaluateAndReverse(s);
        }
        return res.trim();
    }

    /**
     * Evaluates a word.
     *
     * @param s the word of the text to be evaluate.
     * @return the word reverted or not depending if it comply the rule.
     */
    private String evaluateAndReverse(String s) {
        StringBuilder builder = new StringBuilder(s);
        return(s.length() >= 5)?builder.reverse().toString():s;
    }

}
