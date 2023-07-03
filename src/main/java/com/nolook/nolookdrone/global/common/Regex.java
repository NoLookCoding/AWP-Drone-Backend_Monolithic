package com.nolook.nolookdrone.global.common;

public enum Regex {
    phoneRegex("^\\d{2,3}\\d{3,4}\\d{4}$"),
    userIdRegex("^[a-zA-Z0-9]*$"),
    passwordRegex("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{1,}$"),
    emailRegex("[0-9a-zA-Z]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$");

    private String regex;
    Regex(String regex) {
        this.regex = regex;
    }
    public String getRegex() {
        return regex;
    }

}
