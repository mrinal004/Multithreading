public class ConsumerThread extends Thread{

    Company company;

    ConsumerThread(Company company)
    {
        this.company = company;
    }

    @Override
    public void run() {
       while (true){
           try {
               this.company.consumeItem();
           } catch (Exception e) {
               throw new RuntimeException(e);
           }
           try{Thread.sleep(2000);} catch (Exception e){}
        }


    }
}

