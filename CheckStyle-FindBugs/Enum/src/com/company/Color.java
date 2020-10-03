package com.company;

/**
 * Record of enum colors.
 */
enum Color {
    /**
     * @param ANSI_RED -red color code
     */
    ANSI_RED("\u001B[31m"),


    /**
     * @param ANSI_GREEN -green color code
     */
    ANSI_GREEN("\u001B[32m"),


    /**
     * @param ANSI_YELLOW -red color code
     */
    ANSI_YELLOW("\u001B[33m"),


    /**
     * @param ANSI_BLUE -blue color code
     */
    ANSI_BLUE("\u001B[34m"),


    /**
     * @param ANSI_PURPLE -purple color code
     */
    ANSI_PURPLE("\u001B[35m"),


    /**
     * @param ANSI_CYAN -cyan color code
     */
    ANSI_CYAN("\u001B[36m"),


    /**
     * @param ANSI_YELLOW - -red color code
     */
    ANSI_WHITE("\u001B[37m");


    /**
     * @param color - String for return code from ansi color
     */
    private String color;

    Color(final String variable) {
        this.color = variable;
    }

    public String getColor() {
        return color;
    }
}
