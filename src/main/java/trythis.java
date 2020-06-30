public class trythis {
    public  void asd(){
        try{
            System.out.print("1");
            int i =1/0;
        }catch (RuntimeException x){
            System.out.print("2");
            return;
        }catch(Exception x){
            System.out.print("3");
            return;
        }finally{
            System.out.print("4");
        }
        System.out.print("5");
    }

    public static void main(String[] args) {
        trythis t =new trythis();
        t.asd();
    }
}


