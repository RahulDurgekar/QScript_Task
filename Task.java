package qs;

class Task {
    private String name;
    private boolean isCompleted;
    private String completedBy;

    public Task(String name) {
        this.name = name;
        this.isCompleted = false;
        this.completedBy = "";
    }

    public void markCompleted(String user) {
        this.isCompleted = true;
        this.completedBy = user;
    }

    public void displayTask() {
        if (isCompleted) {
            System.out.println(name + " - Completed by " + completedBy);
        } else {
            System.out.println(name);
        }
    }
}

