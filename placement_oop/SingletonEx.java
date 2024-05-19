public class SingletonEx {
    
    int a;

    private SingletonEx() {
        System.out.println("private cons");
    }

    static SingletonEx instance;

    public static SingletonEx getInstance() {
        if(instance==null){
            instance = new SingletonEx();
        }
        return instance;
    }
}
