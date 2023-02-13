public class Main {
    public static void main(String[] args) {


        Developer backend= new Backend();
        backend.coding();

        Developer fronted= new Fronted();
        fronted.coding();

        Developer devops= new Devops();
        devops.coding();

        Developer [] developers={backend,fronted,devops};

        for (Developer d:developers) {
            System.out.println(d);
        }

    }
}