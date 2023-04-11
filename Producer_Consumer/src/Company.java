public class Company {
    // inside a company consider items are being produced and consumed
    int item;
    boolean flag = false;

    // method for item production
   synchronized public void produceItem(int item) throws Exception
    {
        if(flag)
        {
            wait();
        }

        this.item = item;
        System.out.println("Producing item : "+ this.item);
        flag = true;
        notify();
    }

    //method for item consumption
   synchronized public void consumeItem() throws Exception
    {
        if (!flag)
        {
            wait();
        }
        System.out.println("Consuming item : "+ this.item);
        flag = false;
        notify();

    }

}
