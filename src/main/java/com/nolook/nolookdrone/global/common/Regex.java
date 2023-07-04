package com.nolook.nolookdrone.global.common;

public enum Regex {
    PHONE_REGEX("^\\d{2,3}\\d{3,4}\\d{4}$"),
    USER_ID_REGEX("^[a-zA-Z0-9]*$"),
    USER_PASSWORD_REGEX("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{1,}$"),
    EMAIL_REGEX("[0-9a-zA-Z]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$");

    private String regex;
    Regex(String regex) {
        this.regex = regex;
    }
    public String getRegex() {
        return regex;
    }

}
