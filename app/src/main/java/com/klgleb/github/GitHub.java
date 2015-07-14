package com.klgleb.github;

import com.klgleb.github.model.GitHubOwner;

/**
 * Singleton that stores the authorization data.
 * <p/>
 * Created by klgleb on 10.07.15.
 */
public class GitHub {
    private static GitHub ourInstance = new GitHub();

    private String mUserLogin;
    private String mUserPassword;
    private boolean mIsInit = false;

    private GitHubOwner mOwner;

    private GitHub() {
    }

    public static GitHub getInstance() {
        return ourInstance;
    }

    public void init(String login, String pass) {
        mUserLogin = login;
        mUserPassword = pass;

        mIsInit = true;
    }

    public String getUserLogin() {
        return mUserLogin;
    }

    public String getUserPassword() {
        return mUserPassword;
    }

    public boolean isLogin() {
        return mIsInit;
    }

    public GitHubOwner getOwner() {
        return mOwner;
    }

    public void setOwner(GitHubOwner mOwner) {
        this.mOwner = mOwner;
    }

    public void logout() {
        mUserLogin = null;
        mUserPassword = null;
        mOwner = null;
        mIsInit = false;
    }
}
