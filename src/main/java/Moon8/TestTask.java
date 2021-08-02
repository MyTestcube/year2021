package Moon8;



import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestTask {
    public static class CallerTask implements Callable<String> {
        public String call() throws Exception{
            return "Hello";
        }
    }
    public static void main(String[] args) throws InterruptedException{
        //创建异步任务
        FutureTask<String> futureTask =new FutureTask<>(new CallerTask());
        //启动线程
        new Thread(futureTask).start();
        try{
            //等待任务执行完毕，并返回结果
            String result=futureTask.get();
            System.out.println(result);
        }catch (ExecutionException e){
            e.printStackTrace();
        }
    }

//    public static class RunableTask implements Runnable {
//        public void run(){
//            System.out.println("I am a child thread");
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException{
//        RunableTask task=new RunableTask();
//        new Thread(task).start();
//        new Thread(task).start();
//
//    }

}
