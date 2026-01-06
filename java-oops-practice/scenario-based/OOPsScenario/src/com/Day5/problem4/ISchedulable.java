package com.Day5.problem4;

interface ISchedulable {
    void schedule();
    void reschedule(String newDate);
    void cancel();
}
