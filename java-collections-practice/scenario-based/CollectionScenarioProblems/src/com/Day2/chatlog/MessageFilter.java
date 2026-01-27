package com.Day2.chatlog;

interface MessageFilter<T> {
    boolean filter(T msg);
}