package Caller;

class PeopleQueue extends Thread    {
    private String[] names;

    PeopleQueue(String... names) {
        this.names = names;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 3; i++) { // Service new client with delay for 0.5 sec
            System.out.println(PeopleQueue.currentThread());
            System.out.println("Облужен клиент: " + names[i]);
            try {
                sleep(500); // Waiting for 0.5 sec
            } catch (Exception e) {}
        }
    }
}

