package com.hjt.maven_study.account.persist;

public interface AccountPersistService
{
    Account createAccount(Account account)
    	throws AccountPersistException;

    Account readAccount(String id)
    	throws AccountPersistException;

    Account updateAccount(Account account)
    	throws AccountPersistException;

    void deleteAccount(String id)
    	throws AccountPersistException;
}
