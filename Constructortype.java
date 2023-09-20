public class Constructortype {
    String mname,mdirector;
    float mtrate;

    public Constructortype(){
        mname = null;
        mdirector = null;
        mtrate = 0.0f;
    }

    public Constructortype(String name,String director,float trate){
        this.mname = name;
        this.mdirector = director;
        this.mtrate = trate;
    }

    public Constructortype(Constructortype obj){
        this.mname = obj.mname;
        this.mdirector = obj.mdirector;
        this.mtrate = obj.mtrate;
    }

    public void show(){
        System.out.println("Name : " + this.mname);
        System.out.println("Director : " + this.mdirector);
        System.out.println("Ticket Rate : " + this.mtrate);
    }

    public void change(float mtrate ){
        // mtrate = mtrate + 70;
        this.mtrate = mtrate + 100;
    }
    public static void main(String[] args) {
        Constructortype c1 = new Constructortype();
        // c1.show();

        Constructortype c2 = new Constructortype("SPKK","KA",450.0f);
        c2.show();

        // Constructortype c3 = new Constructortype(c2);     // pass by value
        Constructortype c3 = new Constructortype(); 
        c3 = c2;     // pass by reference, but java does not support pass by reference in method arguments
        c3.show();

        System.out.println("------------------");
        c2.mdirector = "Avnish";
        // c3.mdirector = "BHaradava";
        c2 = null;
        // c2.show();
        c3.show();

        // Constructortype c4 = new Constructortype("DDLJ","Avnish",50.0f);
        // c4.show();
        // c4.change(100);
        // c4.show();
    }
}