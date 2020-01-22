package com.github.reinaldomjr.example.aspect;

public class SecuredMethod {
    @Secured(true)
    public void lockedMethod() {
        System.out.println("LOCKED");
    }

    @Secured(false)
    public void unlockedMethod() {
        System.out.println("UNLOCKED");
    }
}
