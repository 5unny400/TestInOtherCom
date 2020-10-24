package MultiThread;

public class TestDemo01 {
    Object object = null;
    public TestDemo01(Object object){
        this.object = object;
    }
    public void start(){
        thread.setName("A");
        thread.setName("A");
        thread.setName("A");
    }

    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {

        }
    });




    public static void main(String[] args) {
        System.out.println("sxy");
    }
}
