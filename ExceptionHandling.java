class ExceptionHandling
{
    public static void main(String[] args)
    {
       try {
        int result = 22/0;
       } catch (Exception e) {
           System.out.println("Error Occurred");
       }

       System.out.println("Execution Complete");
    } 
}