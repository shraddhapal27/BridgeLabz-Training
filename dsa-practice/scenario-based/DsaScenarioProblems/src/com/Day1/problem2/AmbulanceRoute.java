package com.Day1.problem2;

class AmbulanceRoute {
    private UnitNode head = null;

    // Add a unit to circular list
    public void addUnit(String name, boolean available) {
        UnitNode newNode = new UnitNode(name, available);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        UnitNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Find nearest available unit
    public void findNearestAvailableUnit() {
        if (head == null) {
            System.out.println("No hospital units available.");
            return;
        }

        UnitNode temp = head;
        do {
            System.out.println("Checking: " + temp.unitName);
            if (temp.available) {
                System.out.println("🚑 Patient redirected to: " + temp.unitName);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("⚠️ No unit is currently available!");
    }

    // Remove unit under maintenance
    public void removeUnit(String unitName) {
        if (head == null) return;

        UnitNode curr = head, prev = null;

        do {
            if (curr.unitName.equals(unitName)) {

                // If only one node
                if (curr == head && curr.next == head) {
                    head = null;
                    return;
                }

                // If removing head
                if (curr == head) {
                    UnitNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println(unitName + " removed (under maintenance)");
                return;
            }

            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Display route
    public void displayUnits() {
        if (head == null) return;

        UnitNode temp = head;
        System.out.print("Hospital Route: ");
        do {
            System.out.print(temp.unitName + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to Emergency)");
    }
}
