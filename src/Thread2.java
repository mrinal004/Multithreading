public class Thread2 implements Runnable{
    @Override
    public void run()
    {
        for (int i = 100; i >= 90; i--) {
            System.out.println("Thread2 running "+ i);
            try
            {
                Thread.sleep(2000);
            }
            catch(Exception e){}
        }
    }
}
