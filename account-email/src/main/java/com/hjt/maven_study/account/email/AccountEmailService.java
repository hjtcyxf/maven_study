package com.hjt.maven_study.account.email;

public interface AccountEmailService
{
    void sendMail(String to, String subject, String htmlText)
        throws AccountEmailException;
}
