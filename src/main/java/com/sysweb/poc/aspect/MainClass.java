package com.sysweb.poc.aspect;

public class MainClass {
    public static void main(String[] args) {
        SecuredMethod method = new SecuredMethod();
        method.unlockedMethod();
        method.lockedMethod();
    }
}
