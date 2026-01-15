package com.Day1.problem3;

import java.util.Stack;

class TabManager {
    private Stack<BrowserTab> closedTabs = new Stack<>();

    // Close a tab
    public void closeTab(BrowserTab tab) {
        closedTabs.push(tab);
        System.out.println("Tab closed");
    }

    // Restore last closed tab
    public BrowserTab reopenTab() {
        if (!closedTabs.isEmpty()) {
            System.out.println("🔄 Reopened last closed tab");
            return closedTabs.pop();
        }
        System.out.println("No closed tabs to restore");
        return null;
    }
}

